package fql.antlr4;

import fql.Pair;
import fql.Triple;
import fql.decl.*;
import fql.decl.FQLProgram.NewDecl;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.Nullable;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.codehaus.jparsec.error.Location;
import org.codehaus.jparsec.error.ParseErrorDetails;
import org.codehaus.jparsec.error.ParserException;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * Created by pcmarks on 8/7/14.
 */
public class FQL_ANTLR4_Parser extends FQLBaseListener {

    public LinkedList<NewDecl> ret = new LinkedList<NewDecl>();
    public List<NewDecl> getRet() {
        return ret;
    }

    public FQL_ANTLR4_Parser() {
    }

    /**
     * This method is a replacement for the program() method of FQLParser.
     * It accepts an FQL string and produces an FQLProgram containing parsed
     * declarations. Any errors a thrown up to the caller (CodeEditor).
     *
     * @param s     A String containing an FQL program
     * @return      An FQLProgram that contains a list of parsed declarations
     *
     * @throws IOException
     */
    public static FQLProgram program(String s) throws IOException {
        /*
        Establish the string as an input stream for the Lexer
        Produce a stream of lexical tokens
         */
        InputStream is = new ByteArrayInputStream(s.getBytes());
        ANTLRInputStream input = new ANTLRInputStream(is);
        FQLLexer lexer  = new FQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        /*
        Feed the lexical token stream into the Parser
        Substitute the standard parse error handling with a local one.
        Register a parser listener then walk the tree.
        Any parsing errors are caught by our FQLParserListener, repackaged
        as JParse ParserExceptions and throw to the caller (CodeEditor).
         */
        FQLParser parser = new FQLParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new FQLParserErrorListener());
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        FQL_ANTLR4_Parser transformer = new FQL_ANTLR4_Parser();
        walker.walk(transformer, tree);
        /*
        A list of parsed declarations is produced by the parser (transformer);
        this needs to be returned, wrapped in an FQLProgram, to the CodeEditor
        for validation.
         */
        return new FQLProgram(transformer.getRet());

    }

    /**
     * A ANTLR4 error listener that catches parsing errors, repackages
     * them as JParse ParserExceptions and throws this to the caller.
     * TODO: Can more information be extracted for ParserException, etc.?
     */
    public static class FQLParserErrorListener extends BaseErrorListener {
        @Override
        public void syntaxError(@NotNull Recognizer<?, ?> recognizer,
                                @Nullable Object offendingSymbol,
                                int line, int charPositionInLine,
                                @NotNull String msg,
                                @Nullable RecognitionException e) {
            Location location = new Location(line, charPositionInLine);
            FQLParseErrorDetails details = new FQLParseErrorDetails(msg);
            ParserException parserException = new ParserException(details, null, location);
            throw parserException;
        }
    }

    /**
     * A bare-bones implementation of the JParsec parse error exception. It is used
     * to create a JParsec ParserException.
     *
     */
    private static class FQLParseErrorDetails implements ParseErrorDetails {

        private String message;

        @Override
        public int getIndex() {
            return 0;
        }

        @Override
        public String getEncountered() {
            return null;
        }

        @Override
        public List<String> getExpected() {
            return null;
        }

        @Override
        public String getUnexpected() {
            return null;
        }

        @Override
        public String getFailureMessage() {
            return message;
        }

        public FQLParseErrorDetails(String message) {
            this.message = message;
        }
    }

    /**
     * A main method for testing.
     * @param args      0= file name
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // write your code here
        String inputFile = null;
        if (args.length > 0) {
            inputFile = args[0];
        }
        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);
        FQLLexer lexer  = new FQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FQLParser parser = new FQLParser(tokens);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        FQL_ANTLR4_Parser transformer = new FQL_ANTLR4_Parser();
        walker.walk(transformer, tree);
        String s = "transform t3 = {nodes;} : I -> I\ntransform t4 = {nodes a -> {(1,2), (3,4)};} : I -> I";
        s = "schema C = {nodes; attributes; arrows; ;}";
        FQLProgram result = FQL_ANTLR4_Parser.program(s);
    }
    ///////////////////////////////////////////////////////////////////////////////////
    // INTERMEDIATE VALUE STACKS
    ///////////////////////////////////////////////////////////////////////////////////

    private Stack<SigExp>       sigExpStack = new Stack();
    private Stack<InstExp>      instExpStack = new Stack<>();
    private Stack<TransExp>     transExpStack = new Stack<>();
    private Stack<QueryExp>     queryExpStack = new Stack<>();
    private Stack<MapExp>       mapExpStack = new Stack<>();
    private Stack<FullQueryExp> fullQueryExpStack = new Stack<>();

    ///////////////////////////////////////////////////////////////////////////////////
    // PARSE THE SCHEMA DECLARATIONS
    ///////////////////////////////////////////////////////////////////////////////////

    @Override
    public void enterSchemaDeclaration(@NotNull FQLParser.SchemaDeclarationContext ctx) {
        sigExpStack.empty();
        super.enterSchemaDeclaration(ctx);
    }

    @Override
    public void exitSchemaDeclaration(@NotNull FQLParser.SchemaDeclarationContext ctx) {
        String name = ctx.Identifier().getText();
        if (!sigExpStack.isEmpty()) {
            ret.add(NewDecl.sigDecl(name,
                    ctx.getParent().getStart().getStartIndex(),
                    sigExpStack.pop()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }


    @Override
    public void exitSigExp_Var(@NotNull FQLParser.SigExp_VarContext ctx) {
        sigExpStack.push(new SigExp.Var(
                ctx.Identifier().getText()));
    }

    @Override
    public void exitSigExp_Zero(@NotNull FQLParser.SigExp_ZeroContext ctx) {
        sigExpStack.push(new SigExp.Zero());
    }

    @Override
    public void exitSigExp_One(@NotNull FQLParser.SigExp_OneContext ctx) {
        HashSet<String> identifiers = new HashSet<String>();
        for (TerminalNode identifier : ctx.schemaXXX().Identifier()) {
            identifiers.add(identifier.getText());
        }
        sigExpStack.push(new SigExp.One(identifiers));
    }

    @Override
    public void exitSigExp_Plus(@NotNull FQLParser.SigExp_PlusContext ctx) {
        if (sigExpStack.size() >= 2) {
            SigExp b = sigExpStack.pop();
            SigExp a = sigExpStack.pop();
            sigExpStack.push(new SigExp.Plus(
                    a,
                    b
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitSigExp_Times(@NotNull FQLParser.SigExp_TimesContext ctx) {
        if (sigExpStack.size() >= 2) {
            SigExp b = sigExpStack.pop();
            SigExp a = sigExpStack.pop();
            sigExpStack.push(new SigExp.Times(
                    a,
                    b
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitSigExp_Exp(@NotNull FQLParser.SigExp_ExpContext ctx) {
        if (sigExpStack.size() >= 2) {
            SigExp b = sigExpStack.pop();
            SigExp a = sigExpStack.pop();
            sigExpStack.push(new SigExp.Exp(
                    a,
                    b
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitSigExp_Union(@NotNull FQLParser.SigExp_UnionContext ctx) {
        if (sigExpStack.size() >= 2) {
            SigExp b = sigExpStack.pop();
            SigExp a = sigExpStack.pop();
            sigExpStack.push(new SigExp.Union(
                    a,
                    b
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitSigExp_Opposite(@NotNull FQLParser.SigExp_OppositeContext ctx) {
        if (sigExpStack.size() >= 1) {
            sigExpStack.push(new SigExp.Opposite(
                    sigExpStack.pop()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitSigExp_Const(@NotNull FQLParser.SigExp_ConstContext ctx) {
        List<String> nodes = new LinkedList<>();
        List<Triple<String, String, String>> attrs = new LinkedList<>();
        List<Triple<String, String, String>> arrows = new LinkedList<>();
        List<Pair<List<String>, List<String>>> eqs = new LinkedList<>();
        //TODO: Copy code from FQLParser.toSchemaConst or somehow just call it.
        List<TerminalNode> constNodes = ctx.schemaConst().schemaComponents().schemaComponentsNodes().Identifier();
        List<FQLParser.ArrowContext> constArrows =
                ctx.schemaConst().schemaComponents().schemaComponentsAttributes().arrow();
        List<FQLParser.ArrowContext> constAttributes =
                ctx.schemaConst().schemaComponents().schemaComponentsArrows().arrow();
        List<FQLParser.EquationContext> constEquations =
                ctx.schemaConst().schemaComponents().schemaComponentsEquations().equation();

        for (TerminalNode node : constNodes) {
            nodes.add(node.getText());
        }
        if (constAttributes.size() != 0 && constAttributes.get(0).Identifier(0).getText().equals("ASWRITTEN")) {
            for (TerminalNode node : constNodes) {
                attrs.add(new Triple<>(node.getText() + "_att", node.getText(), "string"));
            }
        } else {
            for (FQLParser.ArrowContext attr : constAttributes) {
                arrows.add(new Triple(attr.Identifier(0).getText(),
                        attr.Identifier(1).getText(),
                        attr.Identifier(2).getText()));
            }
        }
        for (FQLParser.ArrowContext arrow : constArrows) {
            attrs.add(new Triple(arrow.Identifier(0).getText(),
                    arrow.Identifier(1).getText(),
                    arrow.Identifier(2).getText()));
        }
        for (FQLParser.EquationContext equation : constEquations) {
            List<String>a = parsePath(equation.path(0));
            List<String>b = parsePath(equation.path(1));
            eqs.add(new Pair(a, b));
        }
        sigExpStack.push(new SigExp.Const(nodes, attrs, arrows, eqs));
    }

    public List<String> parsePath(FQLParser.PathContext ctx) {
        List<String> pathParts = new LinkedList<>();
        for (TerminalNode identifier : ctx.Identifier()) {
            pathParts.add(identifier.getText());
        }
        return pathParts;
    }
    
    ///////////////////////////////////////////////////////////////////////////////////
    // PARSE THE INSTANCE DECLARATIONS
    ///////////////////////////////////////////////////////////////////////////////////

    @Override
    public void enterInstanceDeclaration(@NotNull FQLParser.InstanceDeclarationContext ctx) {
        instExpStack.empty();
    }

    @Override
    public void exitInstanceDeclaration(@NotNull FQLParser.InstanceDeclarationContext ctx) {
        String name = ctx.Identifier().getText();
        if (instExpStack.size() > 0) {
            ret.add(NewDecl.instDecl(name,
                    ctx.getParent().getStart().getStartIndex(),
                    instExpStack.pop()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitInstExp_Kernel(@NotNull FQLParser.InstExp_KernelContext ctx) {
        instExpStack.push(new InstExp.Kernel(
                ctx.Identifier().getText()));
    }

    @Override
    public void exitInstExp_Two(@NotNull FQLParser.InstExp_TwoContext ctx) {
        if (!sigExpStack.isEmpty()) {
            instExpStack.push(new InstExp.Two(
                    sigExpStack.pop()));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitInstExp_Zero(@NotNull FQLParser.InstExp_ZeroContext ctx) {
        if (!sigExpStack.isEmpty()) {
            instExpStack.push(new InstExp.Zero(
                    sigExpStack.pop()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitInstExp_One(@NotNull FQLParser.InstExp_OneContext ctx) {
        if (!sigExpStack.isEmpty()) {
            instExpStack.push(new InstExp.One(
                    sigExpStack.pop()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitInstExp_Plus(@NotNull FQLParser.InstExp_PlusContext ctx) {
        // The grammar specifies that the two arguments to Plus are instances;
        // however they are treated as strings.
        instExpStack.push(new InstExp.Plus(
                ctx.instance(0).getText(),
                ctx.instance(1).getText()
        ));
    }

    @Override
    public void exitInstExp_Times(@NotNull FQLParser.InstExp_TimesContext ctx) {
        // The grammar specifies that the two arguments to Times are instances;
        // however they are treated as strings.
        instExpStack.push(new InstExp.Times(
                ctx.instance(0).getText(),
                ctx.instance(1).getText()
        ));
    }

    @Override
    public void exitInstExp_Exp(@NotNull FQLParser.InstExp_ExpContext ctx) {
        // The grammar specifies that the two arguments to Exp are instances;
        // however they are treated as strings.
        instExpStack.push(new InstExp.Exp(
                ctx.instance(0).getText(),
                ctx.instance(1).getText()
        ));
    }

    @Override
    public void exitInstExp_Const(@NotNull FQLParser.InstExp_ConstContext ctx) {
        List<Pair<String, List<Pair<Object, Object>>>> nodesX = new LinkedList<>();
        List<Pair<String, List<Pair<Object, Object>>>> attrsX = new LinkedList<>();
        List<Pair<String, List<Pair<Object, Object>>>> arrowsX = new LinkedList<>();

        List<FQLParser.InstanceConstXXXContext> nodesCtx =
                ctx.instanceConstructor().instanceConstXXX();
        for (FQLParser.InstanceConstXXXContext constXXXctx : nodesCtx) {
            for (FQLParser.InstanceConstNodeContext nodeCtx : constXXXctx.instanceConstNodes().instanceConstNode()) {
                String name = nodeCtx.Identifier().getText();
                List<Pair<Object, Object>> values = new LinkedList<>();
                for ( FQLParser.ValueContext value : nodeCtx.value()) {
                    values.add(new Pair(value.getText(), value.getText()));
                }
                nodesX.add(new Pair(name, values));
            }
            if (constXXXctx.instanceConstAttributes().getChild(1).getText().equals("ASWRITTEN")) {
                for (Pair<String, List<Pair<Object, Object>>> nodeX : nodesX) {
                    attrsX.add(new Pair<>(nodeX.first + "_att", nodeX.second));
                }
            } else {
                for (FQLParser.InstanceConstArrowContext attrCtx : constXXXctx.instanceConstAttributes().instanceConstArrow()) {
                    String name = attrCtx.Identifier().getText();
                    List<Pair<Object, Object>> values = new LinkedList<>();
                    FQLParser.InstanceConstArrowStringsContext icaCtx = attrCtx.instanceConstArrowStrings();
                    for (FQLParser.InstanceConstArrowStringContext iasCtx : icaCtx.instanceConstArrowString()) {
                        values.add(new Pair(iasCtx.value(0).getText(), iasCtx.value(1).getText()));
                    }
                    attrsX.add(new Pair(name, values));
                }
            }
            for (FQLParser.InstanceConstArrowContext arrowCtx : constXXXctx.instanceConstArrows().instanceConstArrow()) {
                String name = arrowCtx.Identifier().getText();
                List<Pair<Object, Object>> values = new LinkedList<>();
                FQLParser.InstanceConstArrowStringsContext icaCtx = arrowCtx.instanceConstArrowStrings();
                for ( FQLParser.InstanceConstArrowStringContext iasCtx : icaCtx.instanceConstArrowString()) {
                    values.add(new Pair(iasCtx.value(0).getText(), iasCtx.value(1).getText()));
                }
                arrowsX.add(new Pair(name, values));
            }
        }
        if (sigExpStack.size() > 0) {
            instExpStack.push(new InstExp.Const(
                            nodesX,
                            attrsX,
                            arrowsX,
                            sigExpStack.pop())
            );
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitInstExp_Delta(@NotNull FQLParser.InstExp_DeltaContext ctx) {
        // The rhs instance is not on the instance stack - Use it's token as a string
        if (mapExpStack.size() > 0) {
            instExpStack.push(new InstExp.Delta(
                    mapExpStack.pop(),
                    ctx.instanceDelta().instance().getText()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitInstExp_Sigma(@NotNull FQLParser.InstExp_SigmaContext ctx) {
        // The rhs instance is not on the instance stack - Use it's token as a string
        if (mapExpStack.size() > 0) {
            instExpStack.push(new InstExp.Sigma(
                    mapExpStack.pop(),
                    ctx.instanceSigma().instance().getText()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitInstExp_Pi(@NotNull FQLParser.InstExp_PiContext ctx) {
        // The rhs instance is not on the instance stack - Use it's token as a string
        if (mapExpStack.size() > 0) {
            instExpStack.push(new InstExp.Pi(
                    mapExpStack.pop(),
                    ctx.instancePi().instance().getText()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitInstExp_FullSigma(@NotNull FQLParser.InstExp_FullSigmaContext ctx) {
        // The rhs instance is not on the instance stack - Use it's token as a string
        if (mapExpStack.size() > 0) {
            instExpStack.push(new InstExp.FullSigma(
                    mapExpStack.pop(),
                    ctx.instanceFullSigma().getChild(2).getText()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitInstExp_External(@NotNull FQLParser.InstExp_ExternalContext ctx) {
        if (sigExpStack.size() > 0) {
            instExpStack.push(new InstExp.External(
                    sigExpStack.pop(),
                    ctx.instanceExternal().Identifier().getText()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitInstExp_Relationalize(@NotNull FQLParser.InstExp_RelationalizeContext ctx) {
        instExpStack.push(new InstExp.Relationalize(
                ctx.instanceRelationalize().Identifier().getText()));
    }

    @Override
    public void exitInstExp_Eval(@NotNull FQLParser.InstExp_EvalContext ctx) {
        // The rhs instance is not on the instance stack - Use it's token as a string
        if (queryExpStack.size() > 0) {
            instExpStack.push(new InstExp.Eval(
                    queryExpStack.pop(),
                    ctx.instanceEval().instance().getText()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitInstExp_FullEval(@NotNull FQLParser.InstExp_FullEvalContext ctx) {
        // The rhs instance is not on the instance stack - Use it's token as a string
        if (fullQueryExpStack.size() > 0) {
            instExpStack.push(new InstExp.FullEval(
                    fullQueryExpStack.pop(),
                    ctx.instanceFullEval().instance().getText()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////
    // PARSE THE TRANSFORM DECLARATIONS
    ///////////////////////////////////////////////////////////////////////////////////


    @Override
    public void enterTransDeclaration(@NotNull FQLParser.TransDeclarationContext ctx) {
        transExpStack.empty();
    }

    @Override
    public void exitTransDeclaration(@NotNull FQLParser.TransDeclarationContext ctx) {
        String name = ctx.Identifier().getText();
        if (transExpStack.size() > 0) {
            ret.add(NewDecl.transDecl(name,
                    ctx.getParent().getStart().getStartIndex(),
                    transExpStack.pop()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitTransExp_External(@NotNull FQLParser.TransExp_ExternalContext ctx) {
        transExpStack.push(new TransExp.External(
                ctx.Identifier(0).getText(),      // src
                ctx.Identifier(1).getText(),      // dst
                ctx.Identifier(2).getText()       // name
        ));
    }

    @Override
    public void exitTransExp_Chi(@NotNull FQLParser.TransExp_ChiContext ctx) {
        transExpStack.push(new TransExp.Chi(
                ctx.Identifier(0).getText(),      // obj
                ctx.Identifier(1).getText()       // dst
        ));
    }

    @Override
    public void exitTransExp_UnChi(@NotNull FQLParser.TransExp_UnChiContext ctx) {
        transExpStack.push(new TransExp.UnChi(
                ctx.Identifier().getText()
        ));
    }

    @Override
    public void exitTransExp_TT(@NotNull FQLParser.TransExp_TTContext ctx) {
        transExpStack.push(new TransExp.TT(
                ctx.Identifier(0).getText(),
                ctx.Identifier(1).getText()
        ));
    }

    @Override
    public void exitTransExp_FF(@NotNull FQLParser.TransExp_FFContext ctx) {
        transExpStack.push(new TransExp.FF(
                ctx.Identifier(0).getText(),
                ctx.Identifier(1).getText()
        ));
    }

    @Override
    public void exitTransExp_TransCurry(@NotNull FQLParser.TransExp_TransCurryContext ctx) {
        transExpStack.push(new TransExp.TransCurry(
                ctx.Identifier(0).getText(),
                ctx.Identifier(1).getText()
        ));
    }

    @Override
    public void exitTransExp_Fst(@NotNull FQLParser.TransExp_FstContext ctx) {
        transExpStack.push(new TransExp.Fst(
                ctx.Identifier().getText()
        ));
    }

    @Override
    public void exitTransExp_Not(@NotNull FQLParser.TransExp_NotContext ctx) {
        transExpStack.push(new TransExp.Not(
                ctx.Identifier().getText()
        ));
    }

    @Override
    public void exitTransExp_And(@NotNull FQLParser.TransExp_AndContext ctx) {
        transExpStack.push(new TransExp.And(
                ctx.Identifier().getText()
        ));
    }

    @Override
    public void exitTransExp_Or(@NotNull FQLParser.TransExp_OrContext ctx) {
        transExpStack.push(new TransExp.Or(
                ctx.Identifier().getText()
        ));
    }

    @Override
    public void exitTransExp_Implies(@NotNull FQLParser.TransExp_ImpliesContext ctx) {
        transExpStack.push(new TransExp.Implies(
                ctx.Identifier().getText()
        ));
    }

    @Override
    public void exitTransExp_Return(@NotNull FQLParser.TransExp_ReturnContext ctx) {
        transExpStack.push(new TransExp.Return(
                ctx.Identifier().getText()
        ));
    }

    @Override
    public void exitTransExp_Coreturn(@NotNull FQLParser.TransExp_CoreturnContext ctx) {
        transExpStack.push(new TransExp.Coreturn(
                ctx.Identifier().getText()
        ));
    }

    @Override
    public void exitTransExp_Snd(@NotNull FQLParser.TransExp_SndContext ctx) {
        transExpStack.push(new TransExp.Snd(
                ctx.Identifier().getText()
        ));
    }

    @Override
    public void exitTransExp_TransEval(@NotNull FQLParser.TransExp_TransEvalContext ctx) {
        transExpStack.push(new TransExp.TransEval(
                ctx.Identifier().getText()
        ));
    }

    @Override
    public void exitTransExp_Bool(@NotNull FQLParser.TransExp_BoolContext ctx) {
        if (ctx.getChild(2).getText().equals("true")) {
            transExpStack.push(new TransExp.Bool(
                    true,
                    ctx.Identifier(1).getText(), //dst
                    ctx.Identifier(0).getText()  //obj
            ));
        } else {
            transExpStack.push(new TransExp.Bool(
                    false,
                    ctx.Identifier(1).getText(), //dst
                    ctx.Identifier(0).getText()  //obj
            ));
        }
    }

    @Override
    public void exitTransExp_Inl(@NotNull FQLParser.TransExp_InlContext ctx) {
        transExpStack.push(new TransExp.Inl(
                ctx.Identifier().getText()
        ));
    }

    @Override
    public void exitTransExp_Inr(@NotNull FQLParser.TransExp_InrContext ctx) {
        transExpStack.push(new TransExp.Inr(
                ctx.Identifier().getText()
        ));
    }

    @Override
    public void exitTransExp_TransIso(@NotNull FQLParser.TransExp_TransIsoContext ctx) {
        String type = ctx.getChild(0).getText();
        if (type.equals("iso1")) {
            transExpStack.push(new TransExp.TransIso(
                    true,
                    ctx.Identifier(0).getText(),
                    ctx.Identifier(1).getText()
            ));
        } else if (type.equals("iso2")) {
            transExpStack.push(new TransExp.TransIso(
                    false,
                    ctx.Identifier(0).getText(),
                    ctx.Identifier(1).getText()
            ));
        }
    }

    @Override
    public void exitTransExp_Squash(@NotNull FQLParser.TransExp_SquashContext ctx) {
        transExpStack.push(new TransExp.Squash(
                ctx.Identifier().getText()
        ));
    }

    @Override
    public void exitTransExp_Delta(@NotNull FQLParser.TransExp_DeltaContext ctx) {
        if (transExpStack.size() > 0) {
            transExpStack.push(new TransExp.Delta(
                    transExpStack.pop(),
                    ctx.Identifier(0).getText(),
                    ctx.Identifier(1).getText()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitTransExp_Sigma(@NotNull FQLParser.TransExp_SigmaContext ctx) {
        if (transExpStack.size() > 0) {
            transExpStack.push(new TransExp.Sigma(
                    transExpStack.pop(),
                    ctx.Identifier(0).getText(),
                    ctx.Identifier(1).getText()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitTransExp_FullSigma(@NotNull FQLParser.TransExp_FullSigmaContext ctx) {
        // Note that third argument is treated as text unlike small sigma where it is a transform
        transExpStack.push(new TransExp.FullSigma(
                ctx.Identifier(2).getText(),    // name
                ctx.Identifier(0).getText(),    // src
                ctx.Identifier(1).getText()     // dst
        ));
    }

    @Override
    public void exitTransExp_Pi(@NotNull FQLParser.TransExp_PiContext ctx) {
        if (transExpStack.size() > 0) {
            transExpStack.push(new TransExp.Pi(
                    transExpStack.pop(),
                    ctx.Identifier(0).getText(),
                    ctx.Identifier(1).getText()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitTransExp_Relationalize(@NotNull FQLParser.TransExp_RelationalizeContext ctx) {
        if (transExpStack.size() > 0) {
            transExpStack.push(new TransExp.Relationalize(
                    transExpStack.pop(),
                    ctx.Identifier(0).getText(),
                    ctx.Identifier(1).getText()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitTransExp_Id(@NotNull FQLParser.TransExp_IdContext ctx) {
        transExpStack.push(new TransExp.Id(
                ctx.Identifier().getText()
        ));
    }

    @Override
    public void exitTransExp_Comp(@NotNull FQLParser.TransExp_CompContext ctx) {
        if (transExpStack.size() > 1) {
            TransExp r = transExpStack.pop();
            TransExp l = transExpStack.pop();
            transExpStack.push(new TransExp.Comp(
                    l,
                    r
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitTransExp_Case(@NotNull FQLParser.TransExp_CaseContext ctx) {
        if (transExpStack.size() > 1) {
            TransExp r = transExpStack.pop();
            TransExp l = transExpStack.pop();
            transExpStack.push(new TransExp.Case(
                    ctx.Identifier().getText(),
                    l,
                    r
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitTransExp_Prod(@NotNull FQLParser.TransExp_ProdContext ctx) {
        if (transExpStack.size() > 1) {
            TransExp r = transExpStack.pop();
            TransExp l = transExpStack.pop();
            transExpStack.push(new TransExp.Prod(
                    ctx.Identifier().getText(),
                    l,
                    r
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitTransExp_Var(@NotNull FQLParser.TransExp_VarContext ctx) {
        transExpStack.push(new TransExp.Var(
                ctx.Identifier().getText()
        ));
    }

    @Override
    public void exitTransExp_Const(@NotNull FQLParser.TransExp_ConstContext ctx) {
        List<Pair<String, List<Pair<Object, Object>>>> objects = new LinkedList<>();
        FQLParser.TransConstContext tcCtx = ctx.transConst();
        String t1 = tcCtx.Identifier(0).getText();
        String t2 = tcCtx.Identifier(1).getText();
        FQLParser.TransConstXXXContext tcXXXCtx = tcCtx.transConstXXX();
        for (FQLParser.TransConstNodeContext tcnCtx : tcXXXCtx.transConstNode()) {
            String p = tcnCtx.Identifier().getText();
            List<Pair<Object, Object>> l = new LinkedList<>();
            for ( FQLParser.TransConstPTermContext tcptCtx : tcnCtx.transConstP().transConstPTerm()) {
                l.add(new Pair(tcptCtx.value(0).getText(), tcptCtx.value(1).getText()));
            }
            objects.add(new Pair(p, l));
        }
        transExpStack.push(new TransExp.Const(
                objects,
                t1,
                t2
        ));
    }

    ///////////////////////////////////////////////////////////////////////////////////
    // PARSE THE MAPPING DECLARATIONS
    ///////////////////////////////////////////////////////////////////////////////////


    @Override
    public void enterMappingDeclaration(@NotNull FQLParser.MappingDeclarationContext ctx) {
        mapExpStack.empty();
    }

    @Override
    public void exitMappingDeclaration(@NotNull FQLParser.MappingDeclarationContext ctx) {
        String name = ctx.Identifier().getText();
        if (mapExpStack.size() > 0) {
            ret.add(NewDecl.mapDecl(name,
                    ctx.getParent().getStart().getStartIndex(),
                    mapExpStack.pop()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitMapExp_TT(@NotNull FQLParser.MapExp_TTContext ctx) {
        Set<String> attrs = new HashSet<>();
        for (TerminalNode attr : ctx.mappingXXX().Identifier()) {
            attrs.add(attr.getText());
        }
        if (sigExpStack.size() > 0) {
            mapExpStack.push(new MapExp.TT(
                    sigExpStack.pop(),
                    attrs
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitMapExp_Void(@NotNull FQLParser.MapExp_VoidContext ctx) {
        if (sigExpStack.size() > 0) {
            mapExpStack.push(new MapExp.FF(
                    sigExpStack.pop()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitMapExp_Iso(@NotNull FQLParser.MapExp_IsoContext ctx) {
        if (sigExpStack.size() > 1) {
            SigExp r = sigExpStack.pop();
            SigExp l = sigExpStack.pop();
            if (ctx.getChild(0).getText().equals("iso1")) {
                mapExpStack.push(new MapExp.Iso(
                        true,
                        l,
                        r
                ));
            } else {
                mapExpStack.push(new MapExp.Iso(
                        false,
                        l,
                        r
                ));
            }
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitMapExp_Fst(@NotNull FQLParser.MapExp_FstContext ctx) {
        if (sigExpStack.size() > 1) {
            SigExp t = sigExpStack.pop();
            SigExp s = sigExpStack.pop();
            mapExpStack.push(new MapExp.Fst(
                    s,
                    t
            ));
        }
    }

    @Override
    public void exitMapExp_Snd(@NotNull FQLParser.MapExp_SndContext ctx) {
        if (sigExpStack.size() > 1) {
            SigExp t = sigExpStack.pop();
            SigExp s = sigExpStack.pop();
            mapExpStack.push(new MapExp.Snd(
                    s,
                    t
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitMapExp_Inl(@NotNull FQLParser.MapExp_InlContext ctx) {
        if (sigExpStack.size() > 1) {
            SigExp t = sigExpStack.pop();
            SigExp s = sigExpStack.pop();
            mapExpStack.push(new MapExp.Inl(
                    s,
                    t
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitMapExp_Inr(@NotNull FQLParser.MapExp_InrContext ctx) {
        if (sigExpStack.size() > 1) {
            SigExp t = sigExpStack.pop();
            SigExp s = sigExpStack.pop();
            mapExpStack.push(new MapExp.Inr(
                    s,
                    t
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitMapExp_Apply(@NotNull FQLParser.MapExp_ApplyContext ctx) {
        if (sigExpStack.size() > 1) {
            SigExp t = sigExpStack.pop();
            SigExp s = sigExpStack.pop();
            mapExpStack.push(new MapExp.Apply(
                    s,
                    t
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitMapExp_Opposite(@NotNull FQLParser.MapExp_OppositeContext ctx) {
        if (mapExpStack.size() > 0) {
            mapExpStack.push(new MapExp.Opposite(
                    mapExpStack.pop()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitMapExp_Curry(@NotNull FQLParser.MapExp_CurryContext ctx) {
        if (mapExpStack.size() > 0) {
            mapExpStack.push(new MapExp.Curry(
                    mapExpStack.pop()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitMapExp_Id(@NotNull FQLParser.MapExp_IdContext ctx) {
        if (sigExpStack.size() > 0) {
            mapExpStack.push(new MapExp.Id(
                    sigExpStack.pop()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitMapExp_Sub(@NotNull FQLParser.MapExp_SubContext ctx) {
        if (sigExpStack.size() > 1) {
            SigExp t = sigExpStack.pop();
            SigExp s = sigExpStack.pop();
            mapExpStack.push(new MapExp.Sub(
                    s,
                    t
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitMapExp_Comp(@NotNull FQLParser.MapExp_CompContext ctx) {
        if (mapExpStack.size() > 1) {
            MapExp r = mapExpStack.pop();
            MapExp l = mapExpStack.pop();
            mapExpStack.push(new MapExp.Comp(
                    l,
                    r
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitMapExp_Case(@NotNull FQLParser.MapExp_CaseContext ctx) {
        if (mapExpStack.size() > 1) {
            MapExp r = mapExpStack.pop();
            MapExp l = mapExpStack.pop();
            mapExpStack.push(new MapExp.Case(
                    l,
                    r
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitMapExp_Prod(@NotNull FQLParser.MapExp_ProdContext ctx) {
        if (mapExpStack.size() > 1) {
            MapExp r = mapExpStack.pop();
            MapExp l = mapExpStack.pop();
            mapExpStack.push(new MapExp.Prod(
                    l,
                    r
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitMapExp_Var(@NotNull FQLParser.MapExp_VarContext ctx) {
        mapExpStack.push(new MapExp.Var(
                ctx.Identifier().getText()
        ));
    }

    @Override
    public void exitMapExp_Const(@NotNull FQLParser.MapExp_ConstContext ctx) {
        if (sigExpStack.size() > 1) {
            List<Pair<String, String>> objs = new LinkedList<>();
            List<Pair<String, String>> attrs = new LinkedList<>();
            List<Pair<String, List<String>>> arrows = new LinkedList<>();
            FQLParser.MappingConstructorContext mcCtx = ctx.mappingConstructor();
            FQLParser.MappingConstXXXContext mcXXXCtx = mcCtx.mappingConstXXX();
            for (FQLParser.MappingNodeContext nodeCtx : mcXXXCtx.mappingConstNodes().mappingNode()) {
                objs.add(new Pair(nodeCtx.Identifier(0).getText(),nodeCtx.Identifier(1).getText()));
            }
            for (FQLParser.MappingNodeContext nodeCtx : mcXXXCtx.mappingConstAttributes().mappingNode()) {
                attrs.add(new Pair(nodeCtx.Identifier(0).getText(), nodeCtx.Identifier(1).getText()));
            }
            for (FQLParser.MappingArrowContext mappingArrowCtx : mcXXXCtx.mappingConstArrows().mappingArrow()) {
                List<String> path = parsePath(mappingArrowCtx.path());
                arrows.add(new Pair(
                        mappingArrowCtx.Identifier().getText(),
                        path));
            }
            SigExp dst = sigExpStack.pop();
            SigExp src = sigExpStack.pop();
            mapExpStack.push(new MapExp.Const(
                    objs,
                    attrs,
                    arrows,
                    src,
                    dst
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////
    // PARSE THE ENUM DECLARATIONS
    ///////////////////////////////////////////////////////////////////////////////////

    @Override
    public void exitEnumDeclaration(@NotNull FQLParser.EnumDeclarationContext ctx) {
        String name = ctx.Identifier().getText();
        List<String>values = new LinkedList<>();
        for (FQLParser.ValueContext vctx : ctx.value()){
            values.add(vctx.getText());
        }
        ret.add(NewDecl.typeDecl(
                name,
                values,
                ctx.getParent().getStart().getStartIndex()
        ));
    }

    ///////////////////////////////////////////////////////////////////////////////////
    // PARSE THE FULLQUERY DECLARATIONS
    ///////////////////////////////////////////////////////////////////////////////////
    @Override
    public void enterFullQueryDeclaration(@NotNull FQLParser.FullQueryDeclarationContext ctx) {
        fullQueryExpStack.empty();
    }

    @Override
    public void exitFullQueryDeclaration(@NotNull FQLParser.FullQueryDeclarationContext ctx) {
        String name = ctx.Identifier().getText();
        if (fullQueryExpStack.size() > 0) {
            ret.add(NewDecl.fullQuery(name,
                    fullQueryExpStack.pop(),
                    ctx.getParent().getStart().getStartIndex()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitFullQueryExp_Delta(@NotNull FQLParser.FullQueryExp_DeltaContext ctx) {
        if (mapExpStack.size() > 0) {
            fullQueryExpStack.push(new FullQueryExp.Delta(
                    mapExpStack.pop()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitFullQueryExp_Pi(@NotNull FQLParser.FullQueryExp_PiContext ctx) {
        if (mapExpStack.size() > 0) {
            fullQueryExpStack.push(new FullQueryExp.Pi(
                    mapExpStack.pop()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitFullQueryExp_Sigma(@NotNull FQLParser.FullQueryExp_SigmaContext ctx) {
        if (mapExpStack.size() > 0) {
            fullQueryExpStack.push(new FullQueryExp.Sigma(
                    mapExpStack.pop()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitFullQueryExp_Var(@NotNull FQLParser.FullQueryExp_VarContext ctx) {
        fullQueryExpStack.push(new FullQueryExp.Var(
                ctx.Identifier().getText()
        ));
    }

    @Override
    public void exitFullQueryExp_Comp(@NotNull FQLParser.FullQueryExp_CompContext ctx) {
        if (fullQueryExpStack.size() > 1) {
            FullQueryExp r = fullQueryExpStack.pop();
            FullQueryExp l = fullQueryExpStack.pop();
            fullQueryExpStack.push(new FullQueryExp.Comp(
                    l,
                    r
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitFullQueryExp_Match(@NotNull FQLParser.FullQueryExp_MatchContext ctx) {
        if (sigExpStack.size() > 1) {
            Set<Pair<String, String>> xxx = new HashSet<>();
            for (FQLParser.FullQueryYYYContext yyyCtx : ctx.fullQueryMatch().fullQueryXXX().fullQueryYYY()) {
                xxx.add(new Pair(yyyCtx.fullQueryZZZ().Identifier(0).getText(),
                        yyyCtx.fullQueryZZZ().Identifier(1).getText()));
            };
            SigExp dst = sigExpStack.pop();
            SigExp src = sigExpStack.pop();
            String type = ctx.fullQueryMatch().getChild(4).getText();
            if (type.length() <= 4) {
                type = "";
            } else {
                type = type.substring(1, type.length() - 1);
            }
            fullQueryExpStack.push(new FullQueryExp.Match(
                    xxx, src, dst, type
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////
    // PARSE THE QUERY DECLARATIONS
    ///////////////////////////////////////////////////////////////////////////////////
    @Override
    public void enterQueryDeclaration(@NotNull FQLParser.QueryDeclarationContext ctx) {
        queryExpStack.empty();
    }

    @Override
    public void exitQueryDeclaration(@NotNull FQLParser.QueryDeclarationContext ctx) {
        String name = ctx.Identifier().getText();
        if (queryExpStack.size() > 0) {
            ret.add(NewDecl.queryDecl(name,
                    ctx.getParent().getStart().getStartIndex(),
                    queryExpStack.pop()
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitQueryExp_Const(@NotNull FQLParser.QueryExp_ConstContext ctx) {
        if (mapExpStack.size() > 2) {
            // reverse order pops!!
            MapExp sigma = mapExpStack.pop();
            MapExp pi = mapExpStack.pop();
            MapExp delta = mapExpStack.pop();
            queryExpStack.push(new QueryExp.Const(
                    delta,
                    pi,
                    sigma
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitQueryExp_Comp(@NotNull FQLParser.QueryExp_CompContext ctx) {
        if (queryExpStack.size() > 1) {
            QueryExp r = queryExpStack.pop();
            QueryExp l = queryExpStack.pop();
            queryExpStack.push(new QueryExp.Comp(
                    l,
                    r
            ));
        } else {
            throw new RuntimeException("Stack out of whack.");
        }
    }

    @Override
    public void exitQueryExp_Var(@NotNull FQLParser.QueryExp_VarContext ctx) {
        queryExpStack.push((new QueryExp.Var(
                ctx.Identifier().getText())
        ));
    }

    //TODO: No semantics found for the Query Match statement??

    ///////////////////////////////////////////////////////////////////////////////////
    // PARSE THE DROP DECLARATION
    ///////////////////////////////////////////////////////////////////////////////////

    @Override
    public void exitDropDeclaration(@NotNull FQLParser.DropDeclarationContext ctx) {
        List<String> ids = new LinkedList<>();
        for (TerminalNode node : ctx.Identifier()) {
            ids.add(node.getText());
        }
        ret.add(NewDecl.dropDecl(ids));
    }
}

