// Generated from C:/Users/pcmarks/Documents/IdeaProjects/antlr4_1\FQL.g4 by ANTLR 4.4.1-dev
package fql.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4.1-dev", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__59=1, T__58=2, T__57=3, T__56=4, T__55=5, T__54=6, T__53=7, T__52=8, 
		T__51=9, T__50=10, T__49=11, T__48=12, T__47=13, T__46=14, T__45=15, T__44=16, 
		T__43=17, T__42=18, T__41=19, T__40=20, T__39=21, T__38=22, T__37=23, 
		T__36=24, T__35=25, T__34=26, T__33=27, T__32=28, T__31=29, T__30=30, 
		T__29=31, T__28=32, T__27=33, T__26=34, T__25=35, T__24=36, T__23=37, 
		T__22=38, T__21=39, T__20=40, T__19=41, T__18=42, T__17=43, T__16=44, 
		T__15=45, T__14=46, T__13=47, T__12=48, T__11=49, T__10=50, T__9=51, T__8=52, 
		T__7=53, T__6=54, T__5=55, T__4=56, T__3=57, T__2=58, T__1=59, T__0=60, 
		STRING=61, NUMBER=62, Identifier=63, IdLetter=64, IdLetterOrDigit=65, 
		WS=66, COMMENT=67, LINE_COMMENT=68;
	public static final String[] tokenNames = {
		"<INVALID>", "'schema'", "'kernel'", "'inl'", "'equations'", "'implies'", 
		"'*'", "'or'", "'SIGMA'", "'external'", "'false'", "'iso2'", "'id'", "'relationalize'", 
		"'}'", "'fst'", "'char'", "'->'", "'union'", "'mapping'", "')'", "'arrows'", 
		"'unit'", "'iso1'", "'='", "'drop'", "'snd'", "'transform'", "'subschema'", 
		"'EVAL'", "'sigma'", "'enum'", "'query'", "','", "'('", "':'", "'not'", 
		"'match'", "'coreturn'", "'void'", "'{'", "'and'", "'prop'", "'ASWRITTEN'", 
		"'delta'", "'true'", "'attributes'", "'eval'", "'^'", "'.'", "'+'", "'opposite'", 
		"'return'", "';'", "'curry'", "'nodes'", "'QUERY'", "'pi'", "'inr'", "'then'", 
		"'instance'", "STRING", "NUMBER", "Identifier", "IdLetter", "IdLetterOrDigit", 
		"WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_schemaDeclaration = 2, RULE_schema = 3, 
		RULE_schemaXXX = 4, RULE_plusType = 5, RULE_productType = 6, RULE_exponentType = 7, 
		RULE_unionType = 8, RULE_schemaConst = 9, RULE_schemaComponents = 10, 
		RULE_schemaComponentsNodes = 11, RULE_schemaComponentsAttributes = 12, 
		RULE_schemaComponentsArrows = 13, RULE_arrow = 14, RULE_schemaComponentsEquations = 15, 
		RULE_equation = 16, RULE_opposite = 17, RULE_instanceDeclaration = 18, 
		RULE_instance = 19, RULE_instanceConstructor = 20, RULE_instanceConstXXX = 21, 
		RULE_instanceConstNodes = 22, RULE_instanceConstNode = 23, RULE_instanceConstAttributes = 24, 
		RULE_instanceConstArrows = 25, RULE_instanceConstArrow = 26, RULE_instanceConstArrowStrings = 27, 
		RULE_instanceConstArrowString = 28, RULE_instanceDelta = 29, RULE_instanceSigma = 30, 
		RULE_instancePi = 31, RULE_instanceFullSigma = 32, RULE_instanceExternal = 33, 
		RULE_instanceRelationalize = 34, RULE_instanceEval = 35, RULE_instanceFullEval = 36, 
		RULE_queryDeclaration = 37, RULE_query = 38, RULE_queryP = 39, RULE_queryP1 = 40, 
		RULE_queryP2 = 41, RULE_queryP3 = 42, RULE_queryComp = 43, RULE_queryMtch = 44, 
		RULE_queryXXX = 45, RULE_queryYYY = 46, RULE_queryZZZ = 47, RULE_fullQueryDeclaration = 48, 
		RULE_fullQuery = 49, RULE_fullQueryMatch = 50, RULE_fullQueryXXX = 51, 
		RULE_fullQueryYYY = 52, RULE_fullQueryZZZ = 53, RULE_mappingDeclaration = 54, 
		RULE_mapping = 55, RULE_mappingXXX = 56, RULE_mappingConstructor = 57, 
		RULE_mappingConstXXX = 58, RULE_mappingConstNodes = 59, RULE_mappingConstAttributes = 60, 
		RULE_mappingConstArrows = 61, RULE_mappingNode = 62, RULE_mappingArrow = 63, 
		RULE_enumDeclaration = 64, RULE_transDeclaration = 65, RULE_transform = 66, 
		RULE_transConst = 67, RULE_transConstXXX = 68, RULE_transConstNode = 69, 
		RULE_transConstP = 70, RULE_transConstPTerm = 71, RULE_dropDeclaration = 72, 
		RULE_path = 73, RULE_value = 74;
	public static final String[] ruleNames = {
		"program", "declaration", "schemaDeclaration", "schema", "schemaXXX", 
		"plusType", "productType", "exponentType", "unionType", "schemaConst", 
		"schemaComponents", "schemaComponentsNodes", "schemaComponentsAttributes", 
		"schemaComponentsArrows", "arrow", "schemaComponentsEquations", "equation", 
		"opposite", "instanceDeclaration", "instance", "instanceConstructor", 
		"instanceConstXXX", "instanceConstNodes", "instanceConstNode", "instanceConstAttributes", 
		"instanceConstArrows", "instanceConstArrow", "instanceConstArrowStrings", 
		"instanceConstArrowString", "instanceDelta", "instanceSigma", "instancePi", 
		"instanceFullSigma", "instanceExternal", "instanceRelationalize", "instanceEval", 
		"instanceFullEval", "queryDeclaration", "query", "queryP", "queryP1", 
		"queryP2", "queryP3", "queryComp", "queryMtch", "queryXXX", "queryYYY", 
		"queryZZZ", "fullQueryDeclaration", "fullQuery", "fullQueryMatch", "fullQueryXXX", 
		"fullQueryYYY", "fullQueryZZZ", "mappingDeclaration", "mapping", "mappingXXX", 
		"mappingConstructor", "mappingConstXXX", "mappingConstNodes", "mappingConstAttributes", 
		"mappingConstArrows", "mappingNode", "mappingArrow", "enumDeclaration", 
		"transDeclaration", "transform", "transConst", "transConstXXX", "transConstNode", 
		"transConstP", "transConstPTerm", "dropDeclaration", "path", "value"
	};

	@Override
	public String getGrammarFileName() { return "FQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150); declaration();
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__59) | (1L << T__41) | (1L << T__35) | (1L << T__33) | (1L << T__29) | (1L << T__28) | (1L << T__4) | (1L << T__0))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public MappingDeclarationContext mappingDeclaration() {
			return getRuleContext(MappingDeclarationContext.class,0);
		}
		public QueryDeclarationContext queryDeclaration() {
			return getRuleContext(QueryDeclarationContext.class,0);
		}
		public SchemaDeclarationContext schemaDeclaration() {
			return getRuleContext(SchemaDeclarationContext.class,0);
		}
		public DropDeclarationContext dropDeclaration() {
			return getRuleContext(DropDeclarationContext.class,0);
		}
		public InstanceDeclarationContext instanceDeclaration() {
			return getRuleContext(InstanceDeclarationContext.class,0);
		}
		public TransDeclarationContext transDeclaration() {
			return getRuleContext(TransDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public FullQueryDeclarationContext fullQueryDeclaration() {
			return getRuleContext(FullQueryDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(163);
			switch (_input.LA(1)) {
			case T__59:
				enterOuterAlt(_localctx, 1);
				{
				setState(155); schemaDeclaration();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(156); instanceDeclaration();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 3);
				{
				setState(157); mappingDeclaration();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 4);
				{
				setState(158); enumDeclaration();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(159); fullQueryDeclaration();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 6);
				{
				setState(160); queryDeclaration();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 7);
				{
				setState(161); transDeclaration();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 8);
				{
				setState(162); dropDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public SchemaDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSchemaDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSchemaDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSchemaDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaDeclarationContext schemaDeclaration() throws RecognitionException {
		SchemaDeclarationContext _localctx = new SchemaDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_schemaDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); match(T__59);
			setState(166); match(Identifier);
			setState(167); match(T__36);
			setState(168); schema();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaContext extends ParserRuleContext {
		public SchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema; }
	 
		public SchemaContext() { }
		public void copyFrom(SchemaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SigExp_ZeroContext extends SchemaContext {
		public SigExp_ZeroContext(SchemaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSigExp_Zero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSigExp_Zero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSigExp_Zero(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SigExp_UnionContext extends SchemaContext {
		public UnionTypeContext unionType() {
			return getRuleContext(UnionTypeContext.class,0);
		}
		public SigExp_UnionContext(SchemaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSigExp_Union(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSigExp_Union(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSigExp_Union(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SigExp_OneContext extends SchemaContext {
		public SchemaXXXContext schemaXXX() {
			return getRuleContext(SchemaXXXContext.class,0);
		}
		public SigExp_OneContext(SchemaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSigExp_One(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSigExp_One(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSigExp_One(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SigExp_VarContext extends SchemaContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public SigExp_VarContext(SchemaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSigExp_Var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSigExp_Var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSigExp_Var(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SigExp_ConstContext extends SchemaContext {
		public SchemaConstContext schemaConst() {
			return getRuleContext(SchemaConstContext.class,0);
		}
		public SigExp_ConstContext(SchemaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSigExp_Const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSigExp_Const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSigExp_Const(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SigExp_OppositeContext extends SchemaContext {
		public OppositeContext opposite() {
			return getRuleContext(OppositeContext.class,0);
		}
		public SigExp_OppositeContext(SchemaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSigExp_Opposite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSigExp_Opposite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSigExp_Opposite(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SigExp_PlusContext extends SchemaContext {
		public PlusTypeContext plusType() {
			return getRuleContext(PlusTypeContext.class,0);
		}
		public SigExp_PlusContext(SchemaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSigExp_Plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSigExp_Plus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSigExp_Plus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SigExp_TimesContext extends SchemaContext {
		public ProductTypeContext productType() {
			return getRuleContext(ProductTypeContext.class,0);
		}
		public SigExp_TimesContext(SchemaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSigExp_Times(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSigExp_Times(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSigExp_Times(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SigExp_ExpContext extends SchemaContext {
		public ExponentTypeContext exponentType() {
			return getRuleContext(ExponentTypeContext.class,0);
		}
		public SigExp_ExpContext(SchemaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSigExp_Exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSigExp_Exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSigExp_Exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaContext schema() throws RecognitionException {
		SchemaContext _localctx = new SchemaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_schema);
		try {
			setState(180);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new SigExp_ZeroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170); match(T__21);
				}
				break;
			case 2:
				_localctx = new SigExp_OneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(171); match(T__38);
				setState(172); schemaXXX();
				}
				break;
			case 3:
				_localctx = new SigExp_OppositeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(173); opposite();
				}
				break;
			case 4:
				_localctx = new SigExp_PlusContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(174); plusType();
				}
				break;
			case 5:
				_localctx = new SigExp_TimesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(175); productType();
				}
				break;
			case 6:
				_localctx = new SigExp_ExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(176); exponentType();
				}
				break;
			case 7:
				_localctx = new SigExp_UnionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(177); unionType();
				}
				break;
			case 8:
				_localctx = new SigExp_VarContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(178); match(Identifier);
				}
				break;
			case 9:
				_localctx = new SigExp_ConstContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(179); schemaConst();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaXXXContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(FQLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(FQLParser.Identifier); }
		public SchemaXXXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaXXX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSchemaXXX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSchemaXXX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSchemaXXX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaXXXContext schemaXXX() throws RecognitionException {
		SchemaXXXContext _localctx = new SchemaXXXContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_schemaXXX);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); match(T__20);
			setState(184);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(183); match(Identifier);
				}
			}

			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(186); match(T__27);
				setState(187); match(Identifier);
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193); match(T__46);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlusTypeContext extends ParserRuleContext {
		public SchemaContext schema(int i) {
			return getRuleContext(SchemaContext.class,i);
		}
		public List<SchemaContext> schema() {
			return getRuleContexts(SchemaContext.class);
		}
		public PlusTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterPlusType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitPlusType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitPlusType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusTypeContext plusType() throws RecognitionException {
		PlusTypeContext _localctx = new PlusTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_plusType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); match(T__26);
			setState(196); schema();
			setState(197); match(T__10);
			setState(198); schema();
			setState(199); match(T__40);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProductTypeContext extends ParserRuleContext {
		public SchemaContext schema(int i) {
			return getRuleContext(SchemaContext.class,i);
		}
		public List<SchemaContext> schema() {
			return getRuleContexts(SchemaContext.class);
		}
		public ProductTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterProductType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitProductType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitProductType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductTypeContext productType() throws RecognitionException {
		ProductTypeContext _localctx = new ProductTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_productType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); match(T__26);
			setState(202); schema();
			setState(203); match(T__54);
			setState(204); schema();
			setState(205); match(T__40);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExponentTypeContext extends ParserRuleContext {
		public SchemaContext schema(int i) {
			return getRuleContext(SchemaContext.class,i);
		}
		public List<SchemaContext> schema() {
			return getRuleContexts(SchemaContext.class);
		}
		public ExponentTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponentType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterExponentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitExponentType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitExponentType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExponentTypeContext exponentType() throws RecognitionException {
		ExponentTypeContext _localctx = new ExponentTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exponentType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); match(T__26);
			setState(208); schema();
			setState(209); match(T__12);
			setState(210); schema();
			setState(211); match(T__40);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionTypeContext extends ParserRuleContext {
		public SchemaContext schema(int i) {
			return getRuleContext(SchemaContext.class,i);
		}
		public List<SchemaContext> schema() {
			return getRuleContexts(SchemaContext.class);
		}
		public UnionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterUnionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitUnionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitUnionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionTypeContext unionType() throws RecognitionException {
		UnionTypeContext _localctx = new UnionTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); match(T__26);
			setState(214); schema();
			setState(215); match(T__42);
			setState(216); schema();
			setState(217); match(T__40);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaConstContext extends ParserRuleContext {
		public SchemaComponentsContext schemaComponents() {
			return getRuleContext(SchemaComponentsContext.class,0);
		}
		public SchemaConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSchemaConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSchemaConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSchemaConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaConstContext schemaConst() throws RecognitionException {
		SchemaConstContext _localctx = new SchemaConstContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_schemaConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); match(T__20);
			setState(220); schemaComponents();
			setState(221); match(T__46);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaComponentsContext extends ParserRuleContext {
		public SchemaComponentsNodesContext schemaComponentsNodes() {
			return getRuleContext(SchemaComponentsNodesContext.class,0);
		}
		public SchemaComponentsArrowsContext schemaComponentsArrows() {
			return getRuleContext(SchemaComponentsArrowsContext.class,0);
		}
		public SchemaComponentsEquationsContext schemaComponentsEquations() {
			return getRuleContext(SchemaComponentsEquationsContext.class,0);
		}
		public SchemaComponentsAttributesContext schemaComponentsAttributes() {
			return getRuleContext(SchemaComponentsAttributesContext.class,0);
		}
		public SchemaComponentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaComponents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSchemaComponents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSchemaComponents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSchemaComponents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaComponentsContext schemaComponents() throws RecognitionException {
		SchemaComponentsContext _localctx = new SchemaComponentsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_schemaComponents);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); schemaComponentsNodes();
			setState(224); schemaComponentsAttributes();
			setState(225); schemaComponentsArrows();
			setState(226); schemaComponentsEquations();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaComponentsNodesContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(FQLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(FQLParser.Identifier); }
		public SchemaComponentsNodesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaComponentsNodes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSchemaComponentsNodes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSchemaComponentsNodes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSchemaComponentsNodes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaComponentsNodesContext schemaComponentsNodes() throws RecognitionException {
		SchemaComponentsNodesContext _localctx = new SchemaComponentsNodesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_schemaComponentsNodes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); match(T__5);
			setState(230);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(229); match(Identifier);
				}
			}

			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(232); match(T__27);
				setState(233); match(Identifier);
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239); match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaComponentsAttributesContext extends ParserRuleContext {
		public ArrowContext arrow(int i) {
			return getRuleContext(ArrowContext.class,i);
		}
		public List<ArrowContext> arrow() {
			return getRuleContexts(ArrowContext.class);
		}
		public SchemaComponentsAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaComponentsAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSchemaComponentsAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSchemaComponentsAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSchemaComponentsAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaComponentsAttributesContext schemaComponentsAttributes() throws RecognitionException {
		SchemaComponentsAttributesContext _localctx = new SchemaComponentsAttributesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_schemaComponentsAttributes);
		int _la;
		try {
			setState(258);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241); match(T__14);
				setState(243);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(242); arrow();
					}
				}

				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(245); match(T__27);
					setState(246); arrow();
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(252); match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253); match(T__14);
				setState(255);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(254); match(T__17);
					}
				}

				setState(257); match(T__7);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaComponentsArrowsContext extends ParserRuleContext {
		public ArrowContext arrow(int i) {
			return getRuleContext(ArrowContext.class,i);
		}
		public List<ArrowContext> arrow() {
			return getRuleContexts(ArrowContext.class);
		}
		public SchemaComponentsArrowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaComponentsArrows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSchemaComponentsArrows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSchemaComponentsArrows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSchemaComponentsArrows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaComponentsArrowsContext schemaComponentsArrows() throws RecognitionException {
		SchemaComponentsArrowsContext _localctx = new SchemaComponentsArrowsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_schemaComponentsArrows);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260); match(T__39);
			setState(262);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(261); arrow();
				}
			}

			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(264); match(T__27);
				setState(265); arrow();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271); match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrowContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(FQLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(FQLParser.Identifier); }
		public ArrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitArrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitArrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowContext arrow() throws RecognitionException {
		ArrowContext _localctx = new ArrowContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); match(Identifier);
			setState(274); match(T__25);
			setState(275); match(Identifier);
			setState(276); match(T__43);
			setState(277); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaComponentsEquationsContext extends ParserRuleContext {
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public SchemaComponentsEquationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaComponentsEquations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterSchemaComponentsEquations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitSchemaComponentsEquations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitSchemaComponentsEquations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaComponentsEquationsContext schemaComponentsEquations() throws RecognitionException {
		SchemaComponentsEquationsContext _localctx = new SchemaComponentsEquationsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_schemaComponentsEquations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279); match(T__56);
			setState(281);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(280); equation();
				}
			}

			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(283); match(T__27);
				setState(284); equation();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290); match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EquationContext extends ParserRuleContext {
		public List<PathContext> path() {
			return getRuleContexts(PathContext.class);
		}
		public PathContext path(int i) {
			return getRuleContext(PathContext.class,i);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitEquation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitEquation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_equation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292); path();
			setState(293); match(T__36);
			setState(294); path();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OppositeContext extends ParserRuleContext {
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public OppositeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opposite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterOpposite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitOpposite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitOpposite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OppositeContext opposite() throws RecognitionException {
		OppositeContext _localctx = new OppositeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_opposite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); match(T__9);
			setState(297); schema();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public InstanceContext instance() {
			return getRuleContext(InstanceContext.class,0);
		}
		public InstanceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstanceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstanceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstanceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceDeclarationContext instanceDeclaration() throws RecognitionException {
		InstanceDeclarationContext _localctx = new InstanceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_instanceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299); match(T__0);
			setState(300); match(Identifier);
			setState(301); match(T__36);
			setState(302); instance();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceContext extends ParserRuleContext {
		public InstanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance; }
	 
		public InstanceContext() { }
		public void copyFrom(InstanceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InstExp_Context extends InstanceContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public InstExp_Context(InstanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstExp_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstExp_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstExp_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstExp_FullEvalContext extends InstanceContext {
		public InstanceFullEvalContext instanceFullEval() {
			return getRuleContext(InstanceFullEvalContext.class,0);
		}
		public InstExp_FullEvalContext(InstanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstExp_FullEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstExp_FullEval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstExp_FullEval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstExp_DeltaContext extends InstanceContext {
		public InstanceDeltaContext instanceDelta() {
			return getRuleContext(InstanceDeltaContext.class,0);
		}
		public InstExp_DeltaContext(InstanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstExp_Delta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstExp_Delta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstExp_Delta(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstExp_KernelContext extends InstanceContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public InstExp_KernelContext(InstanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstExp_Kernel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstExp_Kernel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstExp_Kernel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstExp_TwoContext extends InstanceContext {
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public InstExp_TwoContext(InstanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstExp_Two(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstExp_Two(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstExp_Two(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstExp_OneContext extends InstanceContext {
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public InstExp_OneContext(InstanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstExp_One(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstExp_One(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstExp_One(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstExp_PiContext extends InstanceContext {
		public InstancePiContext instancePi() {
			return getRuleContext(InstancePiContext.class,0);
		}
		public InstExp_PiContext(InstanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstExp_Pi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstExp_Pi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstExp_Pi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstExp_ZeroContext extends InstanceContext {
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public InstExp_ZeroContext(InstanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstExp_Zero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstExp_Zero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstExp_Zero(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstExp_PlusContext extends InstanceContext {
		public InstanceContext instance(int i) {
			return getRuleContext(InstanceContext.class,i);
		}
		public List<InstanceContext> instance() {
			return getRuleContexts(InstanceContext.class);
		}
		public InstExp_PlusContext(InstanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstExp_Plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstExp_Plus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstExp_Plus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstExp_ConstContext extends InstanceContext {
		public InstanceConstructorContext instanceConstructor() {
			return getRuleContext(InstanceConstructorContext.class,0);
		}
		public InstExp_ConstContext(InstanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstExp_Const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstExp_Const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstExp_Const(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstExp_ExpContext extends InstanceContext {
		public InstanceContext instance(int i) {
			return getRuleContext(InstanceContext.class,i);
		}
		public List<InstanceContext> instance() {
			return getRuleContexts(InstanceContext.class);
		}
		public InstExp_ExpContext(InstanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstExp_Exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstExp_Exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstExp_Exp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstExp_ExternalContext extends InstanceContext {
		public InstanceExternalContext instanceExternal() {
			return getRuleContext(InstanceExternalContext.class,0);
		}
		public InstExp_ExternalContext(InstanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstExp_External(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstExp_External(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstExp_External(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstExp_FullSigmaContext extends InstanceContext {
		public InstanceFullSigmaContext instanceFullSigma() {
			return getRuleContext(InstanceFullSigmaContext.class,0);
		}
		public InstExp_FullSigmaContext(InstanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstExp_FullSigma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstExp_FullSigma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstExp_FullSigma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstExp_SigmaContext extends InstanceContext {
		public InstanceSigmaContext instanceSigma() {
			return getRuleContext(InstanceSigmaContext.class,0);
		}
		public InstExp_SigmaContext(InstanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstExp_Sigma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstExp_Sigma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstExp_Sigma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstExp_EvalContext extends InstanceContext {
		public InstanceEvalContext instanceEval() {
			return getRuleContext(InstanceEvalContext.class,0);
		}
		public InstExp_EvalContext(InstanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstExp_Eval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstExp_Eval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstExp_Eval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstExp_TimesContext extends InstanceContext {
		public InstanceContext instance(int i) {
			return getRuleContext(InstanceContext.class,i);
		}
		public List<InstanceContext> instance() {
			return getRuleContexts(InstanceContext.class);
		}
		public InstExp_TimesContext(InstanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstExp_Times(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstExp_Times(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstExp_Times(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstExp_RelationalizeContext extends InstanceContext {
		public InstanceRelationalizeContext instanceRelationalize() {
			return getRuleContext(InstanceRelationalizeContext.class,0);
		}
		public InstExp_RelationalizeContext(InstanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstExp_Relationalize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstExp_Relationalize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstExp_Relationalize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceContext instance() throws RecognitionException {
		InstanceContext _localctx = new InstanceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_instance);
		try {
			setState(340);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new InstExp_KernelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(304); match(T__58);
				setState(305); match(Identifier);
				}
				break;
			case 2:
				_localctx = new InstExp_TwoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(306); match(T__18);
				setState(307); schema();
				}
				break;
			case 3:
				_localctx = new InstExp_ZeroContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(308); match(T__21);
				setState(309); schema();
				}
				break;
			case 4:
				_localctx = new InstExp_OneContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(310); match(T__38);
				setState(311); schema();
				}
				break;
			case 5:
				_localctx = new InstExp_PlusContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(312); match(T__26);
				setState(313); instance();
				setState(314); match(T__10);
				setState(315); instance();
				setState(316); match(T__40);
				}
				break;
			case 6:
				_localctx = new InstExp_TimesContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(318); match(T__26);
				setState(319); instance();
				setState(320); match(T__54);
				setState(321); instance();
				setState(322); match(T__40);
				}
				break;
			case 7:
				_localctx = new InstExp_ExpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(324); match(T__26);
				setState(325); instance();
				setState(326); match(T__12);
				setState(327); instance();
				setState(328); match(T__40);
				}
				break;
			case 8:
				_localctx = new InstExp_Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(330); match(Identifier);
				}
				break;
			case 9:
				_localctx = new InstExp_ConstContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(331); instanceConstructor();
				}
				break;
			case 10:
				_localctx = new InstExp_DeltaContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(332); instanceDelta();
				}
				break;
			case 11:
				_localctx = new InstExp_SigmaContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(333); instanceSigma();
				}
				break;
			case 12:
				_localctx = new InstExp_PiContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(334); instancePi();
				}
				break;
			case 13:
				_localctx = new InstExp_FullSigmaContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(335); instanceFullSigma();
				}
				break;
			case 14:
				_localctx = new InstExp_ExternalContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(336); instanceExternal();
				}
				break;
			case 15:
				_localctx = new InstExp_RelationalizeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(337); instanceRelationalize();
				}
				break;
			case 16:
				_localctx = new InstExp_EvalContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(338); instanceEval();
				}
				break;
			case 17:
				_localctx = new InstExp_FullEvalContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(339); instanceFullEval();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceConstructorContext extends ParserRuleContext {
		public InstanceConstXXXContext instanceConstXXX(int i) {
			return getRuleContext(InstanceConstXXXContext.class,i);
		}
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public List<InstanceConstXXXContext> instanceConstXXX() {
			return getRuleContexts(InstanceConstXXXContext.class);
		}
		public InstanceConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstanceConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstanceConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstanceConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceConstructorContext instanceConstructor() throws RecognitionException {
		InstanceConstructorContext _localctx = new InstanceConstructorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_instanceConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342); match(T__20);
			setState(344);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(343); instanceConstXXX();
				}
			}

			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(346); match(T__7);
				setState(347); instanceConstXXX();
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353); match(T__46);
			setState(354); match(T__25);
			setState(355); schema();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceConstXXXContext extends ParserRuleContext {
		public InstanceConstAttributesContext instanceConstAttributes() {
			return getRuleContext(InstanceConstAttributesContext.class,0);
		}
		public InstanceConstNodesContext instanceConstNodes() {
			return getRuleContext(InstanceConstNodesContext.class,0);
		}
		public InstanceConstArrowsContext instanceConstArrows() {
			return getRuleContext(InstanceConstArrowsContext.class,0);
		}
		public InstanceConstXXXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceConstXXX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstanceConstXXX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstanceConstXXX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstanceConstXXX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceConstXXXContext instanceConstXXX() throws RecognitionException {
		InstanceConstXXXContext _localctx = new InstanceConstXXXContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_instanceConstXXX);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357); instanceConstNodes();
			setState(358); instanceConstAttributes();
			setState(359); instanceConstArrows();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceConstNodesContext extends ParserRuleContext {
		public InstanceConstNodeContext instanceConstNode(int i) {
			return getRuleContext(InstanceConstNodeContext.class,i);
		}
		public List<InstanceConstNodeContext> instanceConstNode() {
			return getRuleContexts(InstanceConstNodeContext.class);
		}
		public InstanceConstNodesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceConstNodes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstanceConstNodes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstanceConstNodes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstanceConstNodes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceConstNodesContext instanceConstNodes() throws RecognitionException {
		InstanceConstNodesContext _localctx = new InstanceConstNodesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_instanceConstNodes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361); match(T__5);
			setState(363);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(362); instanceConstNode();
				}
			}

			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(365); match(T__27);
				setState(366); instanceConstNode();
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372); match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceConstNodeContext extends ParserRuleContext {
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public InstanceConstNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceConstNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstanceConstNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstanceConstNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstanceConstNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceConstNodeContext instanceConstNode() throws RecognitionException {
		InstanceConstNodeContext _localctx = new InstanceConstNodeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_instanceConstNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374); match(Identifier);
			setState(375); match(T__43);
			setState(376); match(T__20);
			setState(378);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << Identifier))) != 0)) {
				{
				setState(377); value();
				}
			}

			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(380); match(T__27);
				setState(381); value();
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(387); match(T__46);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceConstAttributesContext extends ParserRuleContext {
		public List<InstanceConstArrowContext> instanceConstArrow() {
			return getRuleContexts(InstanceConstArrowContext.class);
		}
		public InstanceConstArrowContext instanceConstArrow(int i) {
			return getRuleContext(InstanceConstArrowContext.class,i);
		}
		public InstanceConstAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceConstAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstanceConstAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstanceConstAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstanceConstAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceConstAttributesContext instanceConstAttributes() throws RecognitionException {
		InstanceConstAttributesContext _localctx = new InstanceConstAttributesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_instanceConstAttributes);
		int _la;
		try {
			setState(404);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(389); match(T__14);
				setState(391);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(390); instanceConstArrow();
					}
				}

				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(393); match(T__27);
					setState(394); instanceConstArrow();
					}
					}
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(400); match(T__7);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(401); match(T__14);
				setState(402); match(T__17);
				setState(403); match(T__7);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceConstArrowsContext extends ParserRuleContext {
		public List<InstanceConstArrowContext> instanceConstArrow() {
			return getRuleContexts(InstanceConstArrowContext.class);
		}
		public InstanceConstArrowContext instanceConstArrow(int i) {
			return getRuleContext(InstanceConstArrowContext.class,i);
		}
		public InstanceConstArrowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceConstArrows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstanceConstArrows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstanceConstArrows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstanceConstArrows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceConstArrowsContext instanceConstArrows() throws RecognitionException {
		InstanceConstArrowsContext _localctx = new InstanceConstArrowsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_instanceConstArrows);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406); match(T__39);
			setState(408);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(407); instanceConstArrow();
				}
			}

			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(410); match(T__27);
				setState(411); instanceConstArrow();
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417); match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceConstArrowContext extends ParserRuleContext {
		public InstanceConstArrowStringsContext instanceConstArrowStrings() {
			return getRuleContext(InstanceConstArrowStringsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public InstanceConstArrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceConstArrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstanceConstArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstanceConstArrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstanceConstArrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceConstArrowContext instanceConstArrow() throws RecognitionException {
		InstanceConstArrowContext _localctx = new InstanceConstArrowContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_instanceConstArrow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419); match(Identifier);
			setState(420); match(T__43);
			setState(421); match(T__20);
			setState(422); instanceConstArrowStrings();
			setState(423); match(T__46);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceConstArrowStringsContext extends ParserRuleContext {
		public InstanceConstArrowStringContext instanceConstArrowString(int i) {
			return getRuleContext(InstanceConstArrowStringContext.class,i);
		}
		public List<InstanceConstArrowStringContext> instanceConstArrowString() {
			return getRuleContexts(InstanceConstArrowStringContext.class);
		}
		public InstanceConstArrowStringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceConstArrowStrings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstanceConstArrowStrings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstanceConstArrowStrings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstanceConstArrowStrings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceConstArrowStringsContext instanceConstArrowStrings() throws RecognitionException {
		InstanceConstArrowStringsContext _localctx = new InstanceConstArrowStringsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_instanceConstArrowStrings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(425); instanceConstArrowString();
				}
			}

			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(428); match(T__27);
				setState(429); instanceConstArrowString();
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceConstArrowStringContext extends ParserRuleContext {
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public InstanceConstArrowStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceConstArrowString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstanceConstArrowString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstanceConstArrowString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstanceConstArrowString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceConstArrowStringContext instanceConstArrowString() throws RecognitionException {
		InstanceConstArrowStringContext _localctx = new InstanceConstArrowStringContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_instanceConstArrowString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); match(T__26);
			setState(436); value();
			setState(437); match(T__27);
			setState(438); value();
			setState(439); match(T__40);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceDeltaContext extends ParserRuleContext {
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public InstanceContext instance() {
			return getRuleContext(InstanceContext.class,0);
		}
		public InstanceDeltaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceDelta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstanceDelta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstanceDelta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstanceDelta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceDeltaContext instanceDelta() throws RecognitionException {
		InstanceDeltaContext _localctx = new InstanceDeltaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_instanceDelta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441); match(T__16);
			setState(442); mapping();
			setState(443); instance();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceSigmaContext extends ParserRuleContext {
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public InstanceContext instance() {
			return getRuleContext(InstanceContext.class,0);
		}
		public InstanceSigmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceSigma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstanceSigma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstanceSigma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstanceSigma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceSigmaContext instanceSigma() throws RecognitionException {
		InstanceSigmaContext _localctx = new InstanceSigmaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_instanceSigma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445); match(T__30);
			setState(446); mapping();
			setState(447); instance();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstancePiContext extends ParserRuleContext {
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public InstanceContext instance() {
			return getRuleContext(InstanceContext.class,0);
		}
		public InstancePiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instancePi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstancePi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstancePi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstancePi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstancePiContext instancePi() throws RecognitionException {
		InstancePiContext _localctx = new InstancePiContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_instancePi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449); match(T__3);
			setState(450); mapping();
			setState(451); instance();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceFullSigmaContext extends ParserRuleContext {
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public InstanceContext instance() {
			return getRuleContext(InstanceContext.class,0);
		}
		public InstanceFullSigmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceFullSigma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstanceFullSigma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstanceFullSigma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstanceFullSigma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceFullSigmaContext instanceFullSigma() throws RecognitionException {
		InstanceFullSigmaContext _localctx = new InstanceFullSigmaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_instanceFullSigma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453); match(T__52);
			setState(454); mapping();
			setState(455); instance();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceExternalContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public InstanceExternalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceExternal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstanceExternal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstanceExternal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstanceExternal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceExternalContext instanceExternal() throws RecognitionException {
		InstanceExternalContext _localctx = new InstanceExternalContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_instanceExternal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457); match(T__51);
			setState(458); schema();
			setState(459); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceRelationalizeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public InstanceRelationalizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceRelationalize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstanceRelationalize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstanceRelationalize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstanceRelationalize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceRelationalizeContext instanceRelationalize() throws RecognitionException {
		InstanceRelationalizeContext _localctx = new InstanceRelationalizeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_instanceRelationalize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461); match(T__47);
			setState(462); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceEvalContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public InstanceContext instance() {
			return getRuleContext(InstanceContext.class,0);
		}
		public InstanceEvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceEval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstanceEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstanceEval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstanceEval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceEvalContext instanceEval() throws RecognitionException {
		InstanceEvalContext _localctx = new InstanceEvalContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_instanceEval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464); match(T__13);
			setState(465); query();
			setState(466); instance();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceFullEvalContext extends ParserRuleContext {
		public FullQueryContext fullQuery() {
			return getRuleContext(FullQueryContext.class,0);
		}
		public InstanceContext instance() {
			return getRuleContext(InstanceContext.class,0);
		}
		public InstanceFullEvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceFullEval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterInstanceFullEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitInstanceFullEval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitInstanceFullEval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceFullEvalContext instanceFullEval() throws RecognitionException {
		InstanceFullEvalContext _localctx = new InstanceFullEvalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_instanceFullEval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468); match(T__31);
			setState(469); fullQuery();
			setState(470); instance();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public QueryDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterQueryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitQueryDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitQueryDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryDeclarationContext queryDeclaration() throws RecognitionException {
		QueryDeclarationContext _localctx = new QueryDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_queryDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472); match(T__28);
			setState(473); match(Identifier);
			setState(474); match(T__36);
			setState(475); query();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	 
		public QueryContext() { }
		public void copyFrom(QueryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryExp_MtchContext extends QueryContext {
		public QueryMtchContext queryMtch() {
			return getRuleContext(QueryMtchContext.class,0);
		}
		public QueryExp_MtchContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterQueryExp_Mtch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitQueryExp_Mtch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitQueryExp_Mtch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryExp_ConstContext extends QueryContext {
		public QueryPContext queryP() {
			return getRuleContext(QueryPContext.class,0);
		}
		public QueryExp_ConstContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterQueryExp_Const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitQueryExp_Const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitQueryExp_Const(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryExp_VarContext extends QueryContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public QueryExp_VarContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterQueryExp_Var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitQueryExp_Var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitQueryExp_Var(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryExp_CompContext extends QueryContext {
		public QueryCompContext queryComp() {
			return getRuleContext(QueryCompContext.class,0);
		}
		public QueryExp_CompContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterQueryExp_Comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitQueryExp_Comp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitQueryExp_Comp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_query);
		try {
			setState(481);
			switch (_input.LA(1)) {
			case T__16:
				_localctx = new QueryExp_ConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(477); queryP();
				}
				break;
			case T__26:
				_localctx = new QueryExp_CompContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(478); queryComp();
				}
				break;
			case Identifier:
				_localctx = new QueryExp_VarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(479); match(Identifier);
				}
				break;
			case T__23:
				_localctx = new QueryExp_MtchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(480); queryMtch();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryPContext extends ParserRuleContext {
		public QueryP1Context queryP1() {
			return getRuleContext(QueryP1Context.class,0);
		}
		public QueryP2Context queryP2() {
			return getRuleContext(QueryP2Context.class,0);
		}
		public QueryP3Context queryP3() {
			return getRuleContext(QueryP3Context.class,0);
		}
		public QueryPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterQueryP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitQueryP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitQueryP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPContext queryP() throws RecognitionException {
		QueryPContext _localctx = new QueryPContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_queryP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483); queryP1();
			setState(484); queryP2();
			setState(485); queryP3();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryP1Context extends ParserRuleContext {
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public QueryP1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryP1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterQueryP1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitQueryP1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitQueryP1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryP1Context queryP1() throws RecognitionException {
		QueryP1Context _localctx = new QueryP1Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_queryP1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487); match(T__16);
			setState(488); mapping();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryP2Context extends ParserRuleContext {
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public QueryP2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryP2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterQueryP2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitQueryP2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitQueryP2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryP2Context queryP2() throws RecognitionException {
		QueryP2Context _localctx = new QueryP2Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_queryP2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490); match(T__3);
			setState(491); mapping();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryP3Context extends ParserRuleContext {
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public QueryP3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryP3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterQueryP3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitQueryP3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitQueryP3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryP3Context queryP3() throws RecognitionException {
		QueryP3Context _localctx = new QueryP3Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_queryP3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493); match(T__30);
			setState(494); mapping();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryCompContext extends ParserRuleContext {
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryComp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterQueryComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitQueryComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitQueryComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryCompContext queryComp() throws RecognitionException {
		QueryCompContext _localctx = new QueryCompContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_queryComp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496); match(T__26);
			setState(497); query();
			setState(498); match(T__1);
			setState(499); query();
			setState(500); match(T__40);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryMtchContext extends ParserRuleContext {
		public QueryXXXContext queryXXX() {
			return getRuleContext(QueryXXXContext.class,0);
		}
		public SchemaContext schema(int i) {
			return getRuleContext(SchemaContext.class,i);
		}
		public List<SchemaContext> schema() {
			return getRuleContexts(SchemaContext.class);
		}
		public TerminalNode STRING() { return getToken(FQLParser.STRING, 0); }
		public QueryMtchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryMtch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterQueryMtch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitQueryMtch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitQueryMtch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryMtchContext queryMtch() throws RecognitionException {
		QueryMtchContext _localctx = new QueryMtchContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_queryMtch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502); match(T__23);
			setState(503); queryXXX();
			setState(504); schema();
			setState(505); schema();
			setState(506); match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryXXXContext extends ParserRuleContext {
		public QueryYYYContext queryYYY(int i) {
			return getRuleContext(QueryYYYContext.class,i);
		}
		public List<QueryYYYContext> queryYYY() {
			return getRuleContexts(QueryYYYContext.class);
		}
		public QueryXXXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryXXX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterQueryXXX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitQueryXXX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitQueryXXX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryXXXContext queryXXX() throws RecognitionException {
		QueryXXXContext _localctx = new QueryXXXContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_queryXXX);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508); match(T__20);
			setState(510);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(509); queryYYY();
				}
			}

			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(512); match(T__27);
				setState(513); queryYYY();
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(519); match(T__46);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryYYYContext extends ParserRuleContext {
		public QueryZZZContext queryZZZ() {
			return getRuleContext(QueryZZZContext.class,0);
		}
		public QueryYYYContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryYYY; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterQueryYYY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitQueryYYY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitQueryYYY(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryYYYContext queryYYY() throws RecognitionException {
		QueryYYYContext _localctx = new QueryYYYContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_queryYYY);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521); match(T__26);
			setState(522); queryZZZ();
			setState(523); match(T__40);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryZZZContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(FQLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(FQLParser.Identifier); }
		public QueryZZZContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryZZZ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterQueryZZZ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitQueryZZZ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitQueryZZZ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryZZZContext queryZZZ() throws RecognitionException {
		QueryZZZContext _localctx = new QueryZZZContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_queryZZZ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525); match(Identifier);
			setState(526); match(T__27);
			setState(527); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullQueryDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public FullQueryContext fullQuery() {
			return getRuleContext(FullQueryContext.class,0);
		}
		public FullQueryDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullQueryDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterFullQueryDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitFullQueryDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitFullQueryDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullQueryDeclarationContext fullQueryDeclaration() throws RecognitionException {
		FullQueryDeclarationContext _localctx = new FullQueryDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_fullQueryDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529); match(T__4);
			setState(530); match(Identifier);
			setState(531); match(T__36);
			setState(532); fullQuery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullQueryContext extends ParserRuleContext {
		public FullQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullQuery; }
	 
		public FullQueryContext() { }
		public void copyFrom(FullQueryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FullQueryExp_MatchContext extends FullQueryContext {
		public FullQueryMatchContext fullQueryMatch() {
			return getRuleContext(FullQueryMatchContext.class,0);
		}
		public FullQueryExp_MatchContext(FullQueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterFullQueryExp_Match(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitFullQueryExp_Match(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitFullQueryExp_Match(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FullQueryExp_PiContext extends FullQueryContext {
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public FullQueryExp_PiContext(FullQueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterFullQueryExp_Pi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitFullQueryExp_Pi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitFullQueryExp_Pi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FullQueryExp_CompContext extends FullQueryContext {
		public List<FullQueryContext> fullQuery() {
			return getRuleContexts(FullQueryContext.class);
		}
		public FullQueryContext fullQuery(int i) {
			return getRuleContext(FullQueryContext.class,i);
		}
		public FullQueryExp_CompContext(FullQueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterFullQueryExp_Comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitFullQueryExp_Comp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitFullQueryExp_Comp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FullQueryExp_VarContext extends FullQueryContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public FullQueryExp_VarContext(FullQueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterFullQueryExp_Var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitFullQueryExp_Var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitFullQueryExp_Var(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FullQueryExp_SigmaContext extends FullQueryContext {
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public FullQueryExp_SigmaContext(FullQueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterFullQueryExp_Sigma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitFullQueryExp_Sigma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitFullQueryExp_Sigma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FullQueryExp_DeltaContext extends FullQueryContext {
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public FullQueryExp_DeltaContext(FullQueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterFullQueryExp_Delta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitFullQueryExp_Delta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitFullQueryExp_Delta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullQueryContext fullQuery() throws RecognitionException {
		FullQueryContext _localctx = new FullQueryContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_fullQuery);
		try {
			setState(548);
			switch (_input.LA(1)) {
			case T__16:
				_localctx = new FullQueryExp_DeltaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(534); match(T__16);
				setState(535); mapping();
				}
				break;
			case T__3:
				_localctx = new FullQueryExp_PiContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(536); match(T__3);
				setState(537); mapping();
				}
				break;
			case T__52:
				_localctx = new FullQueryExp_SigmaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(538); match(T__52);
				setState(539); mapping();
				}
				break;
			case T__26:
				_localctx = new FullQueryExp_CompContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(540); match(T__26);
				setState(541); fullQuery();
				setState(542); match(T__1);
				setState(543); fullQuery();
				setState(544); match(T__40);
				}
				break;
			case Identifier:
				_localctx = new FullQueryExp_VarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(546); match(Identifier);
				}
				break;
			case T__23:
				_localctx = new FullQueryExp_MatchContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(547); fullQueryMatch();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullQueryMatchContext extends ParserRuleContext {
		public SchemaContext schema(int i) {
			return getRuleContext(SchemaContext.class,i);
		}
		public List<SchemaContext> schema() {
			return getRuleContexts(SchemaContext.class);
		}
		public FullQueryXXXContext fullQueryXXX() {
			return getRuleContext(FullQueryXXXContext.class,0);
		}
		public TerminalNode STRING() { return getToken(FQLParser.STRING, 0); }
		public FullQueryMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullQueryMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterFullQueryMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitFullQueryMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitFullQueryMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullQueryMatchContext fullQueryMatch() throws RecognitionException {
		FullQueryMatchContext _localctx = new FullQueryMatchContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_fullQueryMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550); match(T__23);
			setState(551); fullQueryXXX();
			setState(552); schema();
			setState(553); schema();
			setState(554); match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullQueryXXXContext extends ParserRuleContext {
		public FullQueryYYYContext fullQueryYYY(int i) {
			return getRuleContext(FullQueryYYYContext.class,i);
		}
		public List<FullQueryYYYContext> fullQueryYYY() {
			return getRuleContexts(FullQueryYYYContext.class);
		}
		public FullQueryXXXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullQueryXXX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterFullQueryXXX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitFullQueryXXX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitFullQueryXXX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullQueryXXXContext fullQueryXXX() throws RecognitionException {
		FullQueryXXXContext _localctx = new FullQueryXXXContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_fullQueryXXX);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556); match(T__20);
			setState(558);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(557); fullQueryYYY();
				}
			}

			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(560); match(T__27);
				setState(561); fullQueryYYY();
				}
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(567); match(T__46);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullQueryYYYContext extends ParserRuleContext {
		public FullQueryZZZContext fullQueryZZZ() {
			return getRuleContext(FullQueryZZZContext.class,0);
		}
		public FullQueryYYYContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullQueryYYY; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterFullQueryYYY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitFullQueryYYY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitFullQueryYYY(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullQueryYYYContext fullQueryYYY() throws RecognitionException {
		FullQueryYYYContext _localctx = new FullQueryYYYContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_fullQueryYYY);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569); match(T__26);
			setState(570); fullQueryZZZ();
			setState(571); match(T__40);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullQueryZZZContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(FQLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(FQLParser.Identifier); }
		public FullQueryZZZContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullQueryZZZ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterFullQueryZZZ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitFullQueryZZZ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitFullQueryZZZ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullQueryZZZContext fullQueryZZZ() throws RecognitionException {
		FullQueryZZZContext _localctx = new FullQueryZZZContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_fullQueryZZZ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573); match(Identifier);
			setState(574); match(T__27);
			setState(575); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingDeclarationContext extends ParserRuleContext {
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public MappingDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMappingDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMappingDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMappingDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingDeclarationContext mappingDeclaration() throws RecognitionException {
		MappingDeclarationContext _localctx = new MappingDeclarationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_mappingDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577); match(T__41);
			setState(578); match(Identifier);
			setState(579); match(T__36);
			setState(580); mapping();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingContext extends ParserRuleContext {
		public MappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping; }
	 
		public MappingContext() { }
		public void copyFrom(MappingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MapExp_TTContext extends MappingContext {
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public MappingXXXContext mappingXXX() {
			return getRuleContext(MappingXXXContext.class,0);
		}
		public MapExp_TTContext(MappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMapExp_TT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMapExp_TT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMapExp_TT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapExp_ProdContext extends MappingContext {
		public List<MappingContext> mapping() {
			return getRuleContexts(MappingContext.class);
		}
		public MappingContext mapping(int i) {
			return getRuleContext(MappingContext.class,i);
		}
		public MapExp_ProdContext(MappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMapExp_Prod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMapExp_Prod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMapExp_Prod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapExp_ApplyContext extends MappingContext {
		public SchemaContext schema(int i) {
			return getRuleContext(SchemaContext.class,i);
		}
		public List<SchemaContext> schema() {
			return getRuleContexts(SchemaContext.class);
		}
		public MapExp_ApplyContext(MappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMapExp_Apply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMapExp_Apply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMapExp_Apply(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapExp_InrContext extends MappingContext {
		public SchemaContext schema(int i) {
			return getRuleContext(SchemaContext.class,i);
		}
		public List<SchemaContext> schema() {
			return getRuleContexts(SchemaContext.class);
		}
		public MapExp_InrContext(MappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMapExp_Inr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMapExp_Inr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMapExp_Inr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapExp_SubContext extends MappingContext {
		public SchemaContext schema(int i) {
			return getRuleContext(SchemaContext.class,i);
		}
		public List<SchemaContext> schema() {
			return getRuleContexts(SchemaContext.class);
		}
		public MapExp_SubContext(MappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMapExp_Sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMapExp_Sub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMapExp_Sub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapExp_SndContext extends MappingContext {
		public SchemaContext schema(int i) {
			return getRuleContext(SchemaContext.class,i);
		}
		public List<SchemaContext> schema() {
			return getRuleContexts(SchemaContext.class);
		}
		public MapExp_SndContext(MappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMapExp_Snd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMapExp_Snd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMapExp_Snd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapExp_OppositeContext extends MappingContext {
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public MapExp_OppositeContext(MappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMapExp_Opposite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMapExp_Opposite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMapExp_Opposite(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapExp_ConstContext extends MappingContext {
		public MappingConstructorContext mappingConstructor() {
			return getRuleContext(MappingConstructorContext.class,0);
		}
		public MapExp_ConstContext(MappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMapExp_Const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMapExp_Const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMapExp_Const(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapExp_FstContext extends MappingContext {
		public SchemaContext schema(int i) {
			return getRuleContext(SchemaContext.class,i);
		}
		public List<SchemaContext> schema() {
			return getRuleContexts(SchemaContext.class);
		}
		public MapExp_FstContext(MappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMapExp_Fst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMapExp_Fst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMapExp_Fst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapExp_CaseContext extends MappingContext {
		public List<MappingContext> mapping() {
			return getRuleContexts(MappingContext.class);
		}
		public MappingContext mapping(int i) {
			return getRuleContext(MappingContext.class,i);
		}
		public MapExp_CaseContext(MappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMapExp_Case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMapExp_Case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMapExp_Case(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapExp_InlContext extends MappingContext {
		public SchemaContext schema(int i) {
			return getRuleContext(SchemaContext.class,i);
		}
		public List<SchemaContext> schema() {
			return getRuleContexts(SchemaContext.class);
		}
		public MapExp_InlContext(MappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMapExp_Inl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMapExp_Inl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMapExp_Inl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapExp_VoidContext extends MappingContext {
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public MapExp_VoidContext(MappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMapExp_Void(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMapExp_Void(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMapExp_Void(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapExp_CompContext extends MappingContext {
		public List<MappingContext> mapping() {
			return getRuleContexts(MappingContext.class);
		}
		public MappingContext mapping(int i) {
			return getRuleContext(MappingContext.class,i);
		}
		public MapExp_CompContext(MappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMapExp_Comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMapExp_Comp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMapExp_Comp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapExp_IdContext extends MappingContext {
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public MapExp_IdContext(MappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMapExp_Id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMapExp_Id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMapExp_Id(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapExp_CurryContext extends MappingContext {
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public MapExp_CurryContext(MappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMapExp_Curry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMapExp_Curry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMapExp_Curry(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapExp_IsoContext extends MappingContext {
		public SchemaContext schema(int i) {
			return getRuleContext(SchemaContext.class,i);
		}
		public List<SchemaContext> schema() {
			return getRuleContexts(SchemaContext.class);
		}
		public MapExp_IsoContext(MappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMapExp_Iso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMapExp_Iso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMapExp_Iso(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapExp_VarContext extends MappingContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public MapExp_VarContext(MappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMapExp_Var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMapExp_Var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMapExp_Var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingContext mapping() throws RecognitionException {
		MappingContext _localctx = new MappingContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_mapping);
		try {
			setState(646);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new MapExp_TTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(582); match(T__38);
				setState(583); mappingXXX();
				setState(584); schema();
				}
				break;
			case 2:
				_localctx = new MapExp_VoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(586); match(T__21);
				setState(587); schema();
				}
				break;
			case 3:
				_localctx = new MapExp_IsoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(588); match(T__37);
				setState(589); schema();
				setState(590); schema();
				}
				break;
			case 4:
				_localctx = new MapExp_IsoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(592); match(T__49);
				setState(593); schema();
				setState(594); schema();
				}
				break;
			case 5:
				_localctx = new MapExp_FstContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(596); match(T__45);
				setState(597); schema();
				setState(598); schema();
				}
				break;
			case 6:
				_localctx = new MapExp_SndContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(600); match(T__34);
				setState(601); schema();
				setState(602); schema();
				}
				break;
			case 7:
				_localctx = new MapExp_InlContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(604); match(T__57);
				setState(605); schema();
				setState(606); schema();
				}
				break;
			case 8:
				_localctx = new MapExp_InrContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(608); match(T__2);
				setState(609); schema();
				setState(610); schema();
				}
				break;
			case 9:
				_localctx = new MapExp_ApplyContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(612); match(T__13);
				setState(613); schema();
				setState(614); schema();
				}
				break;
			case 10:
				_localctx = new MapExp_OppositeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(616); match(T__9);
				setState(617); mapping();
				}
				break;
			case 11:
				_localctx = new MapExp_CurryContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(618); match(T__6);
				setState(619); mapping();
				}
				break;
			case 12:
				_localctx = new MapExp_IdContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(620); match(T__48);
				setState(621); schema();
				}
				break;
			case 13:
				_localctx = new MapExp_SubContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(622); match(T__32);
				setState(623); schema();
				setState(624); schema();
				}
				break;
			case 14:
				_localctx = new MapExp_CompContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(626); match(T__26);
				setState(627); mapping();
				setState(628); match(T__1);
				setState(629); mapping();
				setState(630); match(T__40);
				}
				break;
			case 15:
				_localctx = new MapExp_CaseContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(632); match(T__26);
				setState(633); mapping();
				setState(634); match(T__10);
				setState(635); mapping();
				setState(636); match(T__40);
				}
				break;
			case 16:
				_localctx = new MapExp_ProdContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(638); match(T__26);
				setState(639); mapping();
				setState(640); match(T__54);
				setState(641); mapping();
				setState(642); match(T__40);
				}
				break;
			case 17:
				_localctx = new MapExp_VarContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(644); match(Identifier);
				}
				break;
			case 18:
				_localctx = new MapExp_ConstContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(645); mappingConstructor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingXXXContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(FQLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(FQLParser.Identifier); }
		public MappingXXXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingXXX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMappingXXX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMappingXXX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMappingXXX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingXXXContext mappingXXX() throws RecognitionException {
		MappingXXXContext _localctx = new MappingXXXContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_mappingXXX);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648); match(T__20);
			setState(650);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(649); match(Identifier);
				}
			}

			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(652); match(T__27);
				setState(653); match(Identifier);
				}
				}
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(659); match(T__46);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingConstructorContext extends ParserRuleContext {
		public SchemaContext schema(int i) {
			return getRuleContext(SchemaContext.class,i);
		}
		public MappingConstXXXContext mappingConstXXX() {
			return getRuleContext(MappingConstXXXContext.class,0);
		}
		public List<SchemaContext> schema() {
			return getRuleContexts(SchemaContext.class);
		}
		public MappingConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMappingConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMappingConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMappingConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingConstructorContext mappingConstructor() throws RecognitionException {
		MappingConstructorContext _localctx = new MappingConstructorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_mappingConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661); match(T__20);
			setState(662); mappingConstXXX();
			setState(663); match(T__46);
			setState(664); match(T__25);
			setState(665); schema();
			setState(666); match(T__43);
			setState(667); schema();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingConstXXXContext extends ParserRuleContext {
		public MappingConstArrowsContext mappingConstArrows() {
			return getRuleContext(MappingConstArrowsContext.class,0);
		}
		public MappingConstNodesContext mappingConstNodes() {
			return getRuleContext(MappingConstNodesContext.class,0);
		}
		public MappingConstAttributesContext mappingConstAttributes() {
			return getRuleContext(MappingConstAttributesContext.class,0);
		}
		public MappingConstXXXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingConstXXX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMappingConstXXX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMappingConstXXX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMappingConstXXX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingConstXXXContext mappingConstXXX() throws RecognitionException {
		MappingConstXXXContext _localctx = new MappingConstXXXContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_mappingConstXXX);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669); mappingConstNodes();
			setState(670); mappingConstAttributes();
			setState(671); mappingConstArrows();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingConstNodesContext extends ParserRuleContext {
		public List<MappingNodeContext> mappingNode() {
			return getRuleContexts(MappingNodeContext.class);
		}
		public MappingNodeContext mappingNode(int i) {
			return getRuleContext(MappingNodeContext.class,i);
		}
		public MappingConstNodesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingConstNodes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMappingConstNodes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMappingConstNodes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMappingConstNodes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingConstNodesContext mappingConstNodes() throws RecognitionException {
		MappingConstNodesContext _localctx = new MappingConstNodesContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_mappingConstNodes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673); match(T__5);
			setState(675);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(674); mappingNode();
				}
			}

			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(677); match(T__27);
				setState(678); mappingNode();
				}
				}
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(684); match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingConstAttributesContext extends ParserRuleContext {
		public List<MappingNodeContext> mappingNode() {
			return getRuleContexts(MappingNodeContext.class);
		}
		public MappingNodeContext mappingNode(int i) {
			return getRuleContext(MappingNodeContext.class,i);
		}
		public MappingConstAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingConstAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMappingConstAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMappingConstAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMappingConstAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingConstAttributesContext mappingConstAttributes() throws RecognitionException {
		MappingConstAttributesContext _localctx = new MappingConstAttributesContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_mappingConstAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686); match(T__14);
			setState(688);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(687); mappingNode();
				}
			}

			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(690); match(T__27);
				setState(691); mappingNode();
				}
				}
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(697); match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingConstArrowsContext extends ParserRuleContext {
		public MappingArrowContext mappingArrow(int i) {
			return getRuleContext(MappingArrowContext.class,i);
		}
		public List<MappingArrowContext> mappingArrow() {
			return getRuleContexts(MappingArrowContext.class);
		}
		public MappingConstArrowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingConstArrows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMappingConstArrows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMappingConstArrows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMappingConstArrows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingConstArrowsContext mappingConstArrows() throws RecognitionException {
		MappingConstArrowsContext _localctx = new MappingConstArrowsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_mappingConstArrows);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699); match(T__39);
			setState(701);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(700); mappingArrow();
				}
			}

			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(703); match(T__27);
				setState(704); mappingArrow();
				}
				}
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(710); match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingNodeContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(FQLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(FQLParser.Identifier); }
		public MappingNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMappingNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMappingNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMappingNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingNodeContext mappingNode() throws RecognitionException {
		MappingNodeContext _localctx = new MappingNodeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_mappingNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712); match(Identifier);
			setState(713); match(T__43);
			setState(714); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingArrowContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public MappingArrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingArrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterMappingArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitMappingArrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitMappingArrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingArrowContext mappingArrow() throws RecognitionException {
		MappingArrowContext _localctx = new MappingArrowContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_mappingArrow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716); match(Identifier);
			setState(717); match(T__43);
			setState(718); path();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720); match(T__29);
			setState(721); match(Identifier);
			setState(722); match(T__36);
			setState(723); match(T__20);
			setState(724); value();
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(725); match(T__27);
				setState(726); value();
				}
				}
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(732); match(T__46);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public TransDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransDeclarationContext transDeclaration() throws RecognitionException {
		TransDeclarationContext _localctx = new TransDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_transDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734); match(T__33);
			setState(735); match(Identifier);
			setState(736); match(T__36);
			setState(737); transform();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformContext extends ParserRuleContext {
		public TransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transform; }
	 
		public TransformContext() { }
		public void copyFrom(TransformContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TransExp_ConstContext extends TransformContext {
		public TransConstContext transConst() {
			return getRuleContext(TransConstContext.class,0);
		}
		public TransExp_ConstContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_Const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_Const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_Const(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_SquashContext extends TransformContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public TransExp_SquashContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_Squash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_Squash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_Squash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_CompContext extends TransformContext {
		public TransformContext transform(int i) {
			return getRuleContext(TransformContext.class,i);
		}
		public List<TransformContext> transform() {
			return getRuleContexts(TransformContext.class);
		}
		public TransExp_CompContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_Comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_Comp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_Comp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_FstContext extends TransformContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public TransExp_FstContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_Fst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_Fst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_Fst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_IdContext extends TransformContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public TransExp_IdContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_Id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_Id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_Id(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_ReturnContext extends TransformContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public TransExp_ReturnContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_Return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_Return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_Return(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_SndContext extends TransformContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public TransExp_SndContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_Snd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_Snd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_Snd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_DeltaContext extends TransformContext {
		public TerminalNode Identifier(int i) {
			return getToken(FQLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(FQLParser.Identifier); }
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public TransExp_DeltaContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_Delta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_Delta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_Delta(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_ImpliesContext extends TransformContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public TransExp_ImpliesContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_Implies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_Implies(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_Implies(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_PiContext extends TransformContext {
		public TerminalNode Identifier(int i) {
			return getToken(FQLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(FQLParser.Identifier); }
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public TransExp_PiContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_Pi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_Pi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_Pi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_CaseContext extends TransformContext {
		public TransformContext transform(int i) {
			return getRuleContext(TransformContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public List<TransformContext> transform() {
			return getRuleContexts(TransformContext.class);
		}
		public TransExp_CaseContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_Case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_Case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_Case(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_TransIsoContext extends TransformContext {
		public TerminalNode Identifier(int i) {
			return getToken(FQLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(FQLParser.Identifier); }
		public TransExp_TransIsoContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_TransIso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_TransIso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_TransIso(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_InlContext extends TransformContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public TransExp_InlContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_Inl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_Inl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_Inl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_BoolContext extends TransformContext {
		public TerminalNode Identifier(int i) {
			return getToken(FQLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(FQLParser.Identifier); }
		public TransExp_BoolContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_Bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_Bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_Bool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_AndContext extends TransformContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public TransExp_AndContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_And(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_And(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_And(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_FFContext extends TransformContext {
		public TerminalNode Identifier(int i) {
			return getToken(FQLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(FQLParser.Identifier); }
		public TransExp_FFContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_FF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_FF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_FF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_FullSigmaContext extends TransformContext {
		public TerminalNode Identifier(int i) {
			return getToken(FQLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(FQLParser.Identifier); }
		public TransExp_FullSigmaContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_FullSigma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_FullSigma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_FullSigma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_TransCurryContext extends TransformContext {
		public TerminalNode Identifier(int i) {
			return getToken(FQLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(FQLParser.Identifier); }
		public TransExp_TransCurryContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_TransCurry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_TransCurry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_TransCurry(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_NotContext extends TransformContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public TransExp_NotContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_Not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_Not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_Not(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_ProdContext extends TransformContext {
		public TransformContext transform(int i) {
			return getRuleContext(TransformContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public List<TransformContext> transform() {
			return getRuleContexts(TransformContext.class);
		}
		public TransExp_ProdContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_Prod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_Prod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_Prod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_ExternalContext extends TransformContext {
		public TerminalNode Identifier(int i) {
			return getToken(FQLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(FQLParser.Identifier); }
		public TransExp_ExternalContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_External(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_External(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_External(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_TTContext extends TransformContext {
		public TerminalNode Identifier(int i) {
			return getToken(FQLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(FQLParser.Identifier); }
		public TransExp_TTContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_TT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_TT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_TT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_UnChiContext extends TransformContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public TransExp_UnChiContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_UnChi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_UnChi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_UnChi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_TransEvalContext extends TransformContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public TransExp_TransEvalContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_TransEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_TransEval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_TransEval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_ChiContext extends TransformContext {
		public TerminalNode Identifier(int i) {
			return getToken(FQLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(FQLParser.Identifier); }
		public TransExp_ChiContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_Chi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_Chi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_Chi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_CoreturnContext extends TransformContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public TransExp_CoreturnContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_Coreturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_Coreturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_Coreturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_InrContext extends TransformContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public TransExp_InrContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_Inr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_Inr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_Inr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_VarContext extends TransformContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public TransExp_VarContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_Var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_Var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_Var(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_RelationalizeContext extends TransformContext {
		public TerminalNode Identifier(int i) {
			return getToken(FQLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(FQLParser.Identifier); }
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public TransExp_RelationalizeContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_Relationalize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_Relationalize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_Relationalize(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_SigmaContext extends TransformContext {
		public TerminalNode Identifier(int i) {
			return getToken(FQLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(FQLParser.Identifier); }
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public TransExp_SigmaContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_Sigma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_Sigma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_Sigma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransExp_OrContext extends TransformContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public TransExp_OrContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransExp_Or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransExp_Or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransExp_Or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformContext transform() throws RecognitionException {
		TransformContext _localctx = new TransformContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_transform);
		try {
			setState(858);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new TransExp_ExternalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(739); match(T__51);
				setState(740); match(Identifier);
				setState(741); match(Identifier);
				setState(742); match(Identifier);
				}
				break;
			case 2:
				_localctx = new TransExp_ChiContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(743); match(Identifier);
				setState(744); match(T__11);
				setState(745); match(T__44);
				setState(746); match(Identifier);
				}
				break;
			case 3:
				_localctx = new TransExp_UnChiContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(747); match(Identifier);
				setState(748); match(T__11);
				setState(749); match(T__58);
				}
				break;
			case 4:
				_localctx = new TransExp_TTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(750); match(Identifier);
				setState(751); match(T__11);
				setState(752); match(T__38);
				setState(753); match(Identifier);
				}
				break;
			case 5:
				_localctx = new TransExp_FFContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(754); match(Identifier);
				setState(755); match(T__11);
				setState(756); match(T__21);
				setState(757); match(Identifier);
				}
				break;
			case 6:
				_localctx = new TransExp_TransCurryContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(758); match(Identifier);
				setState(759); match(T__11);
				setState(760); match(T__6);
				setState(761); match(Identifier);
				}
				break;
			case 7:
				_localctx = new TransExp_FstContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(762); match(Identifier);
				setState(763); match(T__11);
				setState(764); match(T__45);
				}
				break;
			case 8:
				_localctx = new TransExp_NotContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(765); match(Identifier);
				setState(766); match(T__11);
				setState(767); match(T__24);
				}
				break;
			case 9:
				_localctx = new TransExp_AndContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(768); match(Identifier);
				setState(769); match(T__11);
				setState(770); match(T__19);
				}
				break;
			case 10:
				_localctx = new TransExp_OrContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(771); match(Identifier);
				setState(772); match(T__11);
				setState(773); match(T__53);
				}
				break;
			case 11:
				_localctx = new TransExp_ImpliesContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(774); match(Identifier);
				setState(775); match(T__11);
				setState(776); match(T__55);
				}
				break;
			case 12:
				_localctx = new TransExp_ReturnContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(777); match(Identifier);
				setState(778); match(T__11);
				setState(779); match(T__8);
				}
				break;
			case 13:
				_localctx = new TransExp_CoreturnContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(780); match(Identifier);
				setState(781); match(T__11);
				setState(782); match(T__22);
				}
				break;
			case 14:
				_localctx = new TransExp_SndContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(783); match(Identifier);
				setState(784); match(T__11);
				setState(785); match(T__34);
				}
				break;
			case 15:
				_localctx = new TransExp_TransEvalContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(786); match(Identifier);
				setState(787); match(T__11);
				setState(788); match(T__13);
				}
				break;
			case 16:
				_localctx = new TransExp_BoolContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(789); match(Identifier);
				setState(790); match(T__11);
				setState(791); match(T__15);
				setState(792); match(Identifier);
				}
				break;
			case 17:
				_localctx = new TransExp_BoolContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(793); match(Identifier);
				setState(794); match(T__11);
				setState(795); match(T__50);
				setState(796); match(Identifier);
				}
				break;
			case 18:
				_localctx = new TransExp_InlContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(797); match(Identifier);
				setState(798); match(T__11);
				setState(799); match(T__57);
				}
				break;
			case 19:
				_localctx = new TransExp_InrContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(800); match(Identifier);
				setState(801); match(T__11);
				setState(802); match(T__2);
				}
				break;
			case 20:
				_localctx = new TransExp_TransIsoContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(803); match(T__37);
				setState(804); match(Identifier);
				setState(805); match(Identifier);
				}
				break;
			case 21:
				_localctx = new TransExp_TransIsoContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(806); match(T__49);
				setState(807); match(Identifier);
				setState(808); match(Identifier);
				}
				break;
			case 22:
				_localctx = new TransExp_SquashContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(809); match(Identifier);
				setState(810); match(T__11);
				setState(811); match(T__47);
				}
				break;
			case 23:
				_localctx = new TransExp_DeltaContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(812); match(T__16);
				setState(813); match(Identifier);
				setState(814); match(Identifier);
				setState(815); transform();
				}
				break;
			case 24:
				_localctx = new TransExp_SigmaContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(816); match(T__30);
				setState(817); match(Identifier);
				setState(818); match(Identifier);
				setState(819); transform();
				}
				break;
			case 25:
				_localctx = new TransExp_FullSigmaContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(820); match(T__52);
				setState(821); match(Identifier);
				setState(822); match(Identifier);
				setState(823); match(Identifier);
				}
				break;
			case 26:
				_localctx = new TransExp_PiContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(824); match(T__3);
				setState(825); match(Identifier);
				setState(826); match(Identifier);
				setState(827); transform();
				}
				break;
			case 27:
				_localctx = new TransExp_RelationalizeContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(828); match(T__47);
				setState(829); match(Identifier);
				setState(830); match(Identifier);
				setState(831); transform();
				}
				break;
			case 28:
				_localctx = new TransExp_IdContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(832); match(T__48);
				setState(833); match(Identifier);
				}
				break;
			case 29:
				_localctx = new TransExp_CompContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(834); match(T__26);
				setState(835); transform();
				setState(836); match(T__1);
				setState(837); transform();
				setState(838); match(T__40);
				}
				break;
			case 30:
				_localctx = new TransExp_CaseContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(840); match(Identifier);
				setState(841); match(T__11);
				setState(842); match(T__26);
				setState(843); transform();
				setState(844); match(T__10);
				setState(845); transform();
				setState(846); match(T__40);
				}
				break;
			case 31:
				_localctx = new TransExp_ProdContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(848); match(Identifier);
				setState(849); match(T__11);
				setState(850); match(T__26);
				setState(851); transform();
				setState(852); match(T__54);
				setState(853); transform();
				setState(854); match(T__40);
				}
				break;
			case 32:
				_localctx = new TransExp_VarContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(856); match(Identifier);
				}
				break;
			case 33:
				_localctx = new TransExp_ConstContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(857); transConst();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransConstContext extends ParserRuleContext {
		public TransConstXXXContext transConstXXX() {
			return getRuleContext(TransConstXXXContext.class,0);
		}
		public TerminalNode Identifier(int i) {
			return getToken(FQLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(FQLParser.Identifier); }
		public TransConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransConstContext transConst() throws RecognitionException {
		TransConstContext _localctx = new TransConstContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_transConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860); match(T__20);
			setState(861); transConstXXX();
			setState(862); match(T__46);
			setState(863); match(T__25);
			setState(864); match(Identifier);
			setState(865); match(T__43);
			setState(866); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransConstXXXContext extends ParserRuleContext {
		public TransConstNodeContext transConstNode(int i) {
			return getRuleContext(TransConstNodeContext.class,i);
		}
		public List<TransConstNodeContext> transConstNode() {
			return getRuleContexts(TransConstNodeContext.class);
		}
		public TransConstXXXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transConstXXX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransConstXXX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransConstXXX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransConstXXX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransConstXXXContext transConstXXX() throws RecognitionException {
		TransConstXXXContext _localctx = new TransConstXXXContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_transConstXXX);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868); match(T__5);
			setState(870);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(869); transConstNode();
				}
			}

			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(872); match(T__27);
				setState(873); transConstNode();
				}
				}
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(879); match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransConstNodeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public TransConstPContext transConstP() {
			return getRuleContext(TransConstPContext.class,0);
		}
		public TransConstNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transConstNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransConstNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransConstNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransConstNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransConstNodeContext transConstNode() throws RecognitionException {
		TransConstNodeContext _localctx = new TransConstNodeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_transConstNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881); match(Identifier);
			setState(882); match(T__43);
			setState(883); match(T__20);
			setState(884); transConstP();
			setState(885); match(T__46);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransConstPContext extends ParserRuleContext {
		public List<TransConstPTermContext> transConstPTerm() {
			return getRuleContexts(TransConstPTermContext.class);
		}
		public TransConstPTermContext transConstPTerm(int i) {
			return getRuleContext(TransConstPTermContext.class,i);
		}
		public TransConstPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transConstP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransConstP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransConstP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransConstP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransConstPContext transConstP() throws RecognitionException {
		TransConstPContext _localctx = new TransConstPContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_transConstP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(887); transConstPTerm();
				}
			}

			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(890); match(T__27);
				setState(891); transConstPTerm();
				}
				}
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransConstPTermContext extends ParserRuleContext {
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public TransConstPTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transConstPTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterTransConstPTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitTransConstPTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitTransConstPTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransConstPTermContext transConstPTerm() throws RecognitionException {
		TransConstPTermContext _localctx = new TransConstPTermContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_transConstPTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897); match(T__26);
			setState(898); value();
			setState(899); match(T__27);
			setState(900); value();
			setState(901); match(T__40);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(FQLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(FQLParser.Identifier); }
		public DropDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterDropDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitDropDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitDropDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropDeclarationContext dropDeclaration() throws RecognitionException {
		DropDeclarationContext _localctx = new DropDeclarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_dropDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903); match(T__35);
			setState(905); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(904); match(Identifier);
				}
				}
				setState(907); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(FQLParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(FQLParser.Identifier); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909); match(Identifier);
			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(910); match(T__11);
				setState(911); match(Identifier);
				}
				}
				setState(916);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(FQLParser.Identifier, 0); }
		public TerminalNode NUMBER() { return getToken(FQLParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(FQLParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FQLListener ) ((FQLListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FQLVisitor ) return ((FQLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << Identifier))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3F\u039a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\6\2\u009a\n\2\r\2\16\2\u009b\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3\u00a6\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5\u00b7\n\5\3\6\3\6\5\6\u00bb\n\6\3\6\3\6\7\6\u00bf"+
		"\n\6\f\6\16\6\u00c2\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u00e9\n\r\3\r\3\r\7\r\u00ed\n"+
		"\r\f\r\16\r\u00f0\13\r\3\r\3\r\3\16\3\16\5\16\u00f6\n\16\3\16\3\16\7\16"+
		"\u00fa\n\16\f\16\16\16\u00fd\13\16\3\16\3\16\3\16\5\16\u0102\n\16\3\16"+
		"\5\16\u0105\n\16\3\17\3\17\5\17\u0109\n\17\3\17\3\17\7\17\u010d\n\17\f"+
		"\17\16\17\u0110\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\5\21\u011c\n\21\3\21\3\21\7\21\u0120\n\21\f\21\16\21\u0123\13\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0157\n\25\3\26\3\26\5\26\u015b"+
		"\n\26\3\26\3\26\7\26\u015f\n\26\f\26\16\26\u0162\13\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u016e\n\30\3\30\3\30\7\30\u0172"+
		"\n\30\f\30\16\30\u0175\13\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u017d"+
		"\n\31\3\31\3\31\7\31\u0181\n\31\f\31\16\31\u0184\13\31\3\31\3\31\3\32"+
		"\3\32\5\32\u018a\n\32\3\32\3\32\7\32\u018e\n\32\f\32\16\32\u0191\13\32"+
		"\3\32\3\32\3\32\3\32\5\32\u0197\n\32\3\33\3\33\5\33\u019b\n\33\3\33\3"+
		"\33\7\33\u019f\n\33\f\33\16\33\u01a2\13\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\5\35\u01ad\n\35\3\35\3\35\7\35\u01b1\n\35\f\35\16\35"+
		"\u01b4\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3"+
		" \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\5(\u01e4\n(\3)\3)\3)\3)\3*\3*"+
		"\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\5/\u0201"+
		"\n/\3/\3/\7/\u0205\n/\f/\16/\u0208\13/\3/\3/\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0227\n\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\5\65\u0231\n\65\3\65\3\65\7\65\u0235\n\65\f"+
		"\65\16\65\u0238\13\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\38\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\59\u0289\n9\3:\3:\5:\u028d\n:\3:\3:\7:\u0291\n:\f:\16:\u0294\13:\3:\3"+
		":\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3=\3=\5=\u02a6\n=\3=\3=\7=\u02aa"+
		"\n=\f=\16=\u02ad\13=\3=\3=\3>\3>\5>\u02b3\n>\3>\3>\7>\u02b7\n>\f>\16>"+
		"\u02ba\13>\3>\3>\3?\3?\5?\u02c0\n?\3?\3?\7?\u02c4\n?\f?\16?\u02c7\13?"+
		"\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\7B\u02da\nB\fB\16"+
		"B\u02dd\13B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u035d\nD\3E\3E\3E\3E\3"+
		"E\3E\3E\3E\3F\3F\5F\u0369\nF\3F\3F\7F\u036d\nF\fF\16F\u0370\13F\3F\3F"+
		"\3G\3G\3G\3G\3G\3G\3H\5H\u037b\nH\3H\3H\7H\u037f\nH\fH\16H\u0382\13H\3"+
		"I\3I\3I\3I\3I\3I\3J\3J\6J\u038c\nJ\rJ\16J\u038d\3K\3K\3K\7K\u0393\nK\f"+
		"K\16K\u0396\13K\3L\3L\3L\2\2M\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\2\3\3\2?"+
		"A\u03d3\2\u0099\3\2\2\2\4\u00a5\3\2\2\2\6\u00a7\3\2\2\2\b\u00b6\3\2\2"+
		"\2\n\u00b8\3\2\2\2\f\u00c5\3\2\2\2\16\u00cb\3\2\2\2\20\u00d1\3\2\2\2\22"+
		"\u00d7\3\2\2\2\24\u00dd\3\2\2\2\26\u00e1\3\2\2\2\30\u00e6\3\2\2\2\32\u0104"+
		"\3\2\2\2\34\u0106\3\2\2\2\36\u0113\3\2\2\2 \u0119\3\2\2\2\"\u0126\3\2"+
		"\2\2$\u012a\3\2\2\2&\u012d\3\2\2\2(\u0156\3\2\2\2*\u0158\3\2\2\2,\u0167"+
		"\3\2\2\2.\u016b\3\2\2\2\60\u0178\3\2\2\2\62\u0196\3\2\2\2\64\u0198\3\2"+
		"\2\2\66\u01a5\3\2\2\28\u01ac\3\2\2\2:\u01b5\3\2\2\2<\u01bb\3\2\2\2>\u01bf"+
		"\3\2\2\2@\u01c3\3\2\2\2B\u01c7\3\2\2\2D\u01cb\3\2\2\2F\u01cf\3\2\2\2H"+
		"\u01d2\3\2\2\2J\u01d6\3\2\2\2L\u01da\3\2\2\2N\u01e3\3\2\2\2P\u01e5\3\2"+
		"\2\2R\u01e9\3\2\2\2T\u01ec\3\2\2\2V\u01ef\3\2\2\2X\u01f2\3\2\2\2Z\u01f8"+
		"\3\2\2\2\\\u01fe\3\2\2\2^\u020b\3\2\2\2`\u020f\3\2\2\2b\u0213\3\2\2\2"+
		"d\u0226\3\2\2\2f\u0228\3\2\2\2h\u022e\3\2\2\2j\u023b\3\2\2\2l\u023f\3"+
		"\2\2\2n\u0243\3\2\2\2p\u0288\3\2\2\2r\u028a\3\2\2\2t\u0297\3\2\2\2v\u029f"+
		"\3\2\2\2x\u02a3\3\2\2\2z\u02b0\3\2\2\2|\u02bd\3\2\2\2~\u02ca\3\2\2\2\u0080"+
		"\u02ce\3\2\2\2\u0082\u02d2\3\2\2\2\u0084\u02e0\3\2\2\2\u0086\u035c\3\2"+
		"\2\2\u0088\u035e\3\2\2\2\u008a\u0366\3\2\2\2\u008c\u0373\3\2\2\2\u008e"+
		"\u037a\3\2\2\2\u0090\u0383\3\2\2\2\u0092\u0389\3\2\2\2\u0094\u038f\3\2"+
		"\2\2\u0096\u0397\3\2\2\2\u0098\u009a\5\4\3\2\u0099\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\3\3\2\2\2"+
		"\u009d\u00a6\5\6\4\2\u009e\u00a6\5&\24\2\u009f\u00a6\5n8\2\u00a0\u00a6"+
		"\5\u0082B\2\u00a1\u00a6\5b\62\2\u00a2\u00a6\5L\'\2\u00a3\u00a6\5\u0084"+
		"C\2\u00a4\u00a6\5\u0092J\2\u00a5\u009d\3\2\2\2\u00a5\u009e\3\2\2\2\u00a5"+
		"\u009f\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a2\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\5\3\2\2\2\u00a7\u00a8"+
		"\7\3\2\2\u00a8\u00a9\7A\2\2\u00a9\u00aa\7\32\2\2\u00aa\u00ab\5\b\5\2\u00ab"+
		"\7\3\2\2\2\u00ac\u00b7\7)\2\2\u00ad\u00ae\7\30\2\2\u00ae\u00b7\5\n\6\2"+
		"\u00af\u00b7\5$\23\2\u00b0\u00b7\5\f\7\2\u00b1\u00b7\5\16\b\2\u00b2\u00b7"+
		"\5\20\t\2\u00b3\u00b7\5\22\n\2\u00b4\u00b7\7A\2\2\u00b5\u00b7\5\24\13"+
		"\2\u00b6\u00ac\3\2\2\2\u00b6\u00ad\3\2\2\2\u00b6\u00af\3\2\2\2\u00b6\u00b0"+
		"\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\t\3\2\2\2\u00b8\u00ba\7*\2\2"+
		"\u00b9\u00bb\7A\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c0"+
		"\3\2\2\2\u00bc\u00bd\7#\2\2\u00bd\u00bf\7A\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\20\2\2\u00c4\13\3\2\2\2\u00c5\u00c6"+
		"\7$\2\2\u00c6\u00c7\5\b\5\2\u00c7\u00c8\7\64\2\2\u00c8\u00c9\5\b\5\2\u00c9"+
		"\u00ca\7\26\2\2\u00ca\r\3\2\2\2\u00cb\u00cc\7$\2\2\u00cc\u00cd\5\b\5\2"+
		"\u00cd\u00ce\7\b\2\2\u00ce\u00cf\5\b\5\2\u00cf\u00d0\7\26\2\2\u00d0\17"+
		"\3\2\2\2\u00d1\u00d2\7$\2\2\u00d2\u00d3\5\b\5\2\u00d3\u00d4\7\62\2\2\u00d4"+
		"\u00d5\5\b\5\2\u00d5\u00d6\7\26\2\2\u00d6\21\3\2\2\2\u00d7\u00d8\7$\2"+
		"\2\u00d8\u00d9\5\b\5\2\u00d9\u00da\7\24\2\2\u00da\u00db\5\b\5\2\u00db"+
		"\u00dc\7\26\2\2\u00dc\23\3\2\2\2\u00dd\u00de\7*\2\2\u00de\u00df\5\26\f"+
		"\2\u00df\u00e0\7\20\2\2\u00e0\25\3\2\2\2\u00e1\u00e2\5\30\r\2\u00e2\u00e3"+
		"\5\32\16\2\u00e3\u00e4\5\34\17\2\u00e4\u00e5\5 \21\2\u00e5\27\3\2\2\2"+
		"\u00e6\u00e8\79\2\2\u00e7\u00e9\7A\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00ee\3\2\2\2\u00ea\u00eb\7#\2\2\u00eb\u00ed\7A\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\67\2\2\u00f2"+
		"\31\3\2\2\2\u00f3\u00f5\7\60\2\2\u00f4\u00f6\5\36\20\2\u00f5\u00f4\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fb\3\2\2\2\u00f7\u00f8\7#\2\2\u00f8"+
		"\u00fa\5\36\20\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3"+
		"\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe"+
		"\u0105\7\67\2\2\u00ff\u0101\7\60\2\2\u0100\u0102\7-\2\2\u0101\u0100\3"+
		"\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\7\67\2\2\u0104"+
		"\u00f3\3\2\2\2\u0104\u00ff\3\2\2\2\u0105\33\3\2\2\2\u0106\u0108\7\27\2"+
		"\2\u0107\u0109\5\36\20\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010e\3\2\2\2\u010a\u010b\7#\2\2\u010b\u010d\5\36\20\2\u010c\u010a\3"+
		"\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7\67\2\2\u0112\35\3\2\2"+
		"\2\u0113\u0114\7A\2\2\u0114\u0115\7%\2\2\u0115\u0116\7A\2\2\u0116\u0117"+
		"\7\23\2\2\u0117\u0118\7A\2\2\u0118\37\3\2\2\2\u0119\u011b\7\6\2\2\u011a"+
		"\u011c\5\"\22\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0121\3"+
		"\2\2\2\u011d\u011e\7#\2\2\u011e\u0120\5\"\22\2\u011f\u011d\3\2\2\2\u0120"+
		"\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7\67\2\2\u0125!\3\2\2\2\u0126\u0127"+
		"\5\u0094K\2\u0127\u0128\7\32\2\2\u0128\u0129\5\u0094K\2\u0129#\3\2\2\2"+
		"\u012a\u012b\7\65\2\2\u012b\u012c\5\b\5\2\u012c%\3\2\2\2\u012d\u012e\7"+
		">\2\2\u012e\u012f\7A\2\2\u012f\u0130\7\32\2\2\u0130\u0131\5(\25\2\u0131"+
		"\'\3\2\2\2\u0132\u0133\7\4\2\2\u0133\u0157\7A\2\2\u0134\u0135\7,\2\2\u0135"+
		"\u0157\5\b\5\2\u0136\u0137\7)\2\2\u0137\u0157\5\b\5\2\u0138\u0139\7\30"+
		"\2\2\u0139\u0157\5\b\5\2\u013a\u013b\7$\2\2\u013b\u013c\5(\25\2\u013c"+
		"\u013d\7\64\2\2\u013d\u013e\5(\25\2\u013e\u013f\7\26\2\2\u013f\u0157\3"+
		"\2\2\2\u0140\u0141\7$\2\2\u0141\u0142\5(\25\2\u0142\u0143\7\b\2\2\u0143"+
		"\u0144\5(\25\2\u0144\u0145\7\26\2\2\u0145\u0157\3\2\2\2\u0146\u0147\7"+
		"$\2\2\u0147\u0148\5(\25\2\u0148\u0149\7\62\2\2\u0149\u014a\5(\25\2\u014a"+
		"\u014b\7\26\2\2\u014b\u0157\3\2\2\2\u014c\u0157\7A\2\2\u014d\u0157\5*"+
		"\26\2\u014e\u0157\5<\37\2\u014f\u0157\5> \2\u0150\u0157\5@!\2\u0151\u0157"+
		"\5B\"\2\u0152\u0157\5D#\2\u0153\u0157\5F$\2\u0154\u0157\5H%\2\u0155\u0157"+
		"\5J&\2\u0156\u0132\3\2\2\2\u0156\u0134\3\2\2\2\u0156\u0136\3\2\2\2\u0156"+
		"\u0138\3\2\2\2\u0156\u013a\3\2\2\2\u0156\u0140\3\2\2\2\u0156\u0146\3\2"+
		"\2\2\u0156\u014c\3\2\2\2\u0156\u014d\3\2\2\2\u0156\u014e\3\2\2\2\u0156"+
		"\u014f\3\2\2\2\u0156\u0150\3\2\2\2\u0156\u0151\3\2\2\2\u0156\u0152\3\2"+
		"\2\2\u0156\u0153\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157"+
		")\3\2\2\2\u0158\u015a\7*\2\2\u0159\u015b\5,\27\2\u015a\u0159\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u0160\3\2\2\2\u015c\u015d\7\67\2\2\u015d\u015f\5"+
		",\27\2\u015e\u015c\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\7\20"+
		"\2\2\u0164\u0165\7%\2\2\u0165\u0166\5\b\5\2\u0166+\3\2\2\2\u0167\u0168"+
		"\5.\30\2\u0168\u0169\5\62\32\2\u0169\u016a\5\64\33\2\u016a-\3\2\2\2\u016b"+
		"\u016d\79\2\2\u016c\u016e\5\60\31\2\u016d\u016c\3\2\2\2\u016d\u016e\3"+
		"\2\2\2\u016e\u0173\3\2\2\2\u016f\u0170\7#\2\2\u0170\u0172\5\60\31\2\u0171"+
		"\u016f\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2"+
		"\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0177\7\67\2\2\u0177"+
		"/\3\2\2\2\u0178\u0179\7A\2\2\u0179\u017a\7\23\2\2\u017a\u017c\7*\2\2\u017b"+
		"\u017d\5\u0096L\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0182"+
		"\3\2\2\2\u017e\u017f\7#\2\2\u017f\u0181\5\u0096L\2\u0180\u017e\3\2\2\2"+
		"\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185"+
		"\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186\7\20\2\2\u0186\61\3\2\2\2\u0187"+
		"\u0189\7\60\2\2\u0188\u018a\5\66\34\2\u0189\u0188\3\2\2\2\u0189\u018a"+
		"\3\2\2\2\u018a\u018f\3\2\2\2\u018b\u018c\7#\2\2\u018c\u018e\5\66\34\2"+
		"\u018d\u018b\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0197\7\67\2\2"+
		"\u0193\u0194\7\60\2\2\u0194\u0195\7-\2\2\u0195\u0197\7\67\2\2\u0196\u0187"+
		"\3\2\2\2\u0196\u0193\3\2\2\2\u0197\63\3\2\2\2\u0198\u019a\7\27\2\2\u0199"+
		"\u019b\5\66\34\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u01a0\3"+
		"\2\2\2\u019c\u019d\7#\2\2\u019d\u019f\5\66\34\2\u019e\u019c\3\2\2\2\u019f"+
		"\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2"+
		"\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a4\7\67\2\2\u01a4\65\3\2\2\2\u01a5\u01a6"+
		"\7A\2\2\u01a6\u01a7\7\23\2\2\u01a7\u01a8\7*\2\2\u01a8\u01a9\58\35\2\u01a9"+
		"\u01aa\7\20\2\2\u01aa\67\3\2\2\2\u01ab\u01ad\5:\36\2\u01ac\u01ab\3\2\2"+
		"\2\u01ac\u01ad\3\2\2\2\u01ad\u01b2\3\2\2\2\u01ae\u01af\7#\2\2\u01af\u01b1"+
		"\5:\36\2\u01b0\u01ae\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b39\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\7$\2\2\u01b6"+
		"\u01b7\5\u0096L\2\u01b7\u01b8\7#\2\2\u01b8\u01b9\5\u0096L\2\u01b9\u01ba"+
		"\7\26\2\2\u01ba;\3\2\2\2\u01bb\u01bc\7.\2\2\u01bc\u01bd\5p9\2\u01bd\u01be"+
		"\5(\25\2\u01be=\3\2\2\2\u01bf\u01c0\7 \2\2\u01c0\u01c1\5p9\2\u01c1\u01c2"+
		"\5(\25\2\u01c2?\3\2\2\2\u01c3\u01c4\7;\2\2\u01c4\u01c5\5p9\2\u01c5\u01c6"+
		"\5(\25\2\u01c6A\3\2\2\2\u01c7\u01c8\7\n\2\2\u01c8\u01c9\5p9\2\u01c9\u01ca"+
		"\5(\25\2\u01caC\3\2\2\2\u01cb\u01cc\7\13\2\2\u01cc\u01cd\5\b\5\2\u01cd"+
		"\u01ce\7A\2\2\u01ceE\3\2\2\2\u01cf\u01d0\7\17\2\2\u01d0\u01d1\7A\2\2\u01d1"+
		"G\3\2\2\2\u01d2\u01d3\7\61\2\2\u01d3\u01d4\5N(\2\u01d4\u01d5\5(\25\2\u01d5"+
		"I\3\2\2\2\u01d6\u01d7\7\37\2\2\u01d7\u01d8\5d\63\2\u01d8\u01d9\5(\25\2"+
		"\u01d9K\3\2\2\2\u01da\u01db\7\"\2\2\u01db\u01dc\7A\2\2\u01dc\u01dd\7\32"+
		"\2\2\u01dd\u01de\5N(\2\u01deM\3\2\2\2\u01df\u01e4\5P)\2\u01e0\u01e4\5"+
		"X-\2\u01e1\u01e4\7A\2\2\u01e2\u01e4\5Z.\2\u01e3\u01df\3\2\2\2\u01e3\u01e0"+
		"\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4O\3\2\2\2\u01e5"+
		"\u01e6\5R*\2\u01e6\u01e7\5T+\2\u01e7\u01e8\5V,\2\u01e8Q\3\2\2\2\u01e9"+
		"\u01ea\7.\2\2\u01ea\u01eb\5p9\2\u01ebS\3\2\2\2\u01ec\u01ed\7;\2\2\u01ed"+
		"\u01ee\5p9\2\u01eeU\3\2\2\2\u01ef\u01f0\7 \2\2\u01f0\u01f1\5p9\2\u01f1"+
		"W\3\2\2\2\u01f2\u01f3\7$\2\2\u01f3\u01f4\5N(\2\u01f4\u01f5\7=\2\2\u01f5"+
		"\u01f6\5N(\2\u01f6\u01f7\7\26\2\2\u01f7Y\3\2\2\2\u01f8\u01f9\7\'\2\2\u01f9"+
		"\u01fa\5\\/\2\u01fa\u01fb\5\b\5\2\u01fb\u01fc\5\b\5\2\u01fc\u01fd\7?\2"+
		"\2\u01fd[\3\2\2\2\u01fe\u0200\7*\2\2\u01ff\u0201\5^\60\2\u0200\u01ff\3"+
		"\2\2\2\u0200\u0201\3\2\2\2\u0201\u0206\3\2\2\2\u0202\u0203\7#\2\2\u0203"+
		"\u0205\5^\60\2\u0204\u0202\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2"+
		"\2\2\u0206\u0207\3\2\2\2\u0207\u0209\3\2\2\2\u0208\u0206\3\2\2\2\u0209"+
		"\u020a\7\20\2\2\u020a]\3\2\2\2\u020b\u020c\7$\2\2\u020c\u020d\5`\61\2"+
		"\u020d\u020e\7\26\2\2\u020e_\3\2\2\2\u020f\u0210\7A\2\2\u0210\u0211\7"+
		"#\2\2\u0211\u0212\7A\2\2\u0212a\3\2\2\2\u0213\u0214\7:\2\2\u0214\u0215"+
		"\7A\2\2\u0215\u0216\7\32\2\2\u0216\u0217\5d\63\2\u0217c\3\2\2\2\u0218"+
		"\u0219\7.\2\2\u0219\u0227\5p9\2\u021a\u021b\7;\2\2\u021b\u0227\5p9\2\u021c"+
		"\u021d\7\n\2\2\u021d\u0227\5p9\2\u021e\u021f\7$\2\2\u021f\u0220\5d\63"+
		"\2\u0220\u0221\7=\2\2\u0221\u0222\5d\63\2\u0222\u0223\7\26\2\2\u0223\u0227"+
		"\3\2\2\2\u0224\u0227\7A\2\2\u0225\u0227\5f\64\2\u0226\u0218\3\2\2\2\u0226"+
		"\u021a\3\2\2\2\u0226\u021c\3\2\2\2\u0226\u021e\3\2\2\2\u0226\u0224\3\2"+
		"\2\2\u0226\u0225\3\2\2\2\u0227e\3\2\2\2\u0228\u0229\7\'\2\2\u0229\u022a"+
		"\5h\65\2\u022a\u022b\5\b\5\2\u022b\u022c\5\b\5\2\u022c\u022d\7?\2\2\u022d"+
		"g\3\2\2\2\u022e\u0230\7*\2\2\u022f\u0231\5j\66\2\u0230\u022f\3\2\2\2\u0230"+
		"\u0231\3\2\2\2\u0231\u0236\3\2\2\2\u0232\u0233\7#\2\2\u0233\u0235\5j\66"+
		"\2\u0234\u0232\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237"+
		"\3\2\2\2\u0237\u0239\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023a\7\20\2\2"+
		"\u023ai\3\2\2\2\u023b\u023c\7$\2\2\u023c\u023d\5l\67\2\u023d\u023e\7\26"+
		"\2\2\u023ek\3\2\2\2\u023f\u0240\7A\2\2\u0240\u0241\7#\2\2\u0241\u0242"+
		"\7A\2\2\u0242m\3\2\2\2\u0243\u0244\7\25\2\2\u0244\u0245\7A\2\2\u0245\u0246"+
		"\7\32\2\2\u0246\u0247\5p9\2\u0247o\3\2\2\2\u0248\u0249\7\30\2\2\u0249"+
		"\u024a\5r:\2\u024a\u024b\5\b\5\2\u024b\u0289\3\2\2\2\u024c\u024d\7)\2"+
		"\2\u024d\u0289\5\b\5\2\u024e\u024f\7\31\2\2\u024f\u0250\5\b\5\2\u0250"+
		"\u0251\5\b\5\2\u0251\u0289\3\2\2\2\u0252\u0253\7\r\2\2\u0253\u0254\5\b"+
		"\5\2\u0254\u0255\5\b\5\2\u0255\u0289\3\2\2\2\u0256\u0257\7\21\2\2\u0257"+
		"\u0258\5\b\5\2\u0258\u0259\5\b\5\2\u0259\u0289\3\2\2\2\u025a\u025b\7\34"+
		"\2\2\u025b\u025c\5\b\5\2\u025c\u025d\5\b\5\2\u025d\u0289\3\2\2\2\u025e"+
		"\u025f\7\5\2\2\u025f\u0260\5\b\5\2\u0260\u0261\5\b\5\2\u0261\u0289\3\2"+
		"\2\2\u0262\u0263\7<\2\2\u0263\u0264\5\b\5\2\u0264\u0265\5\b\5\2\u0265"+
		"\u0289\3\2\2\2\u0266\u0267\7\61\2\2\u0267\u0268\5\b\5\2\u0268\u0269\5"+
		"\b\5\2\u0269\u0289\3\2\2\2\u026a\u026b\7\65\2\2\u026b\u0289\5p9\2\u026c"+
		"\u026d\78\2\2\u026d\u0289\5p9\2\u026e\u026f\7\16\2\2\u026f\u0289\5\b\5"+
		"\2\u0270\u0271\7\36\2\2\u0271\u0272\5\b\5\2\u0272\u0273\5\b\5\2\u0273"+
		"\u0289\3\2\2\2\u0274\u0275\7$\2\2\u0275\u0276\5p9\2\u0276\u0277\7=\2\2"+
		"\u0277\u0278\5p9\2\u0278\u0279\7\26\2\2\u0279\u0289\3\2\2\2\u027a\u027b"+
		"\7$\2\2\u027b\u027c\5p9\2\u027c\u027d\7\64\2\2\u027d\u027e\5p9\2\u027e"+
		"\u027f\7\26\2\2\u027f\u0289\3\2\2\2\u0280\u0281\7$\2\2\u0281\u0282\5p"+
		"9\2\u0282\u0283\7\b\2\2\u0283\u0284\5p9\2\u0284\u0285\7\26\2\2\u0285\u0289"+
		"\3\2\2\2\u0286\u0289\7A\2\2\u0287\u0289\5t;\2\u0288\u0248\3\2\2\2\u0288"+
		"\u024c\3\2\2\2\u0288\u024e\3\2\2\2\u0288\u0252\3\2\2\2\u0288\u0256\3\2"+
		"\2\2\u0288\u025a\3\2\2\2\u0288\u025e\3\2\2\2\u0288\u0262\3\2\2\2\u0288"+
		"\u0266\3\2\2\2\u0288\u026a\3\2\2\2\u0288\u026c\3\2\2\2\u0288\u026e\3\2"+
		"\2\2\u0288\u0270\3\2\2\2\u0288\u0274\3\2\2\2\u0288\u027a\3\2\2\2\u0288"+
		"\u0280\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0287\3\2\2\2\u0289q\3\2\2\2"+
		"\u028a\u028c\7*\2\2\u028b\u028d\7A\2\2\u028c\u028b\3\2\2\2\u028c\u028d"+
		"\3\2\2\2\u028d\u0292\3\2\2\2\u028e\u028f\7#\2\2\u028f\u0291\7A\2\2\u0290"+
		"\u028e\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2"+
		"\2\2\u0293\u0295\3\2\2\2\u0294\u0292\3\2\2\2\u0295\u0296\7\20\2\2\u0296"+
		"s\3\2\2\2\u0297\u0298\7*\2\2\u0298\u0299\5v<\2\u0299\u029a\7\20\2\2\u029a"+
		"\u029b\7%\2\2\u029b\u029c\5\b\5\2\u029c\u029d\7\23\2\2\u029d\u029e\5\b"+
		"\5\2\u029eu\3\2\2\2\u029f\u02a0\5x=\2\u02a0\u02a1\5z>\2\u02a1\u02a2\5"+
		"|?\2\u02a2w\3\2\2\2\u02a3\u02a5\79\2\2\u02a4\u02a6\5~@\2\u02a5\u02a4\3"+
		"\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02ab\3\2\2\2\u02a7\u02a8\7#\2\2\u02a8"+
		"\u02aa\5~@\2\u02a9\u02a7\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2"+
		"\2\u02ab\u02ac\3\2\2\2\u02ac\u02ae\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02af"+
		"\7\67\2\2\u02afy\3\2\2\2\u02b0\u02b2\7\60\2\2\u02b1\u02b3\5~@\2\u02b2"+
		"\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b8\3\2\2\2\u02b4\u02b5\7#"+
		"\2\2\u02b5\u02b7\5~@\2\u02b6\u02b4\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6"+
		"\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb"+
		"\u02bc\7\67\2\2\u02bc{\3\2\2\2\u02bd\u02bf\7\27\2\2\u02be\u02c0\5\u0080"+
		"A\2\u02bf\u02be\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c5\3\2\2\2\u02c1"+
		"\u02c2\7#\2\2\u02c2\u02c4\5\u0080A\2\u02c3\u02c1\3\2\2\2\u02c4\u02c7\3"+
		"\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c8\3\2\2\2\u02c7"+
		"\u02c5\3\2\2\2\u02c8\u02c9\7\67\2\2\u02c9}\3\2\2\2\u02ca\u02cb\7A\2\2"+
		"\u02cb\u02cc\7\23\2\2\u02cc\u02cd\7A\2\2\u02cd\177\3\2\2\2\u02ce\u02cf"+
		"\7A\2\2\u02cf\u02d0\7\23\2\2\u02d0\u02d1\5\u0094K\2\u02d1\u0081\3\2\2"+
		"\2\u02d2\u02d3\7!\2\2\u02d3\u02d4\7A\2\2\u02d4\u02d5\7\32\2\2\u02d5\u02d6"+
		"\7*\2\2\u02d6\u02db\5\u0096L\2\u02d7\u02d8\7#\2\2\u02d8\u02da\5\u0096"+
		"L\2\u02d9\u02d7\3\2\2\2\u02da\u02dd\3\2\2\2\u02db\u02d9\3\2\2\2\u02db"+
		"\u02dc\3\2\2\2\u02dc\u02de\3\2\2\2\u02dd\u02db\3\2\2\2\u02de\u02df\7\20"+
		"\2\2\u02df\u0083\3\2\2\2\u02e0\u02e1\7\35\2\2\u02e1\u02e2\7A\2\2\u02e2"+
		"\u02e3\7\32\2\2\u02e3\u02e4\5\u0086D\2\u02e4\u0085\3\2\2\2\u02e5\u02e6"+
		"\7\13\2\2\u02e6\u02e7\7A\2\2\u02e7\u02e8\7A\2\2\u02e8\u035d\7A\2\2\u02e9"+
		"\u02ea\7A\2\2\u02ea\u02eb\7\63\2\2\u02eb\u02ec\7\22\2\2\u02ec\u035d\7"+
		"A\2\2\u02ed\u02ee\7A\2\2\u02ee\u02ef\7\63\2\2\u02ef\u035d\7\4\2\2\u02f0"+
		"\u02f1\7A\2\2\u02f1\u02f2\7\63\2\2\u02f2\u02f3\7\30\2\2\u02f3\u035d\7"+
		"A\2\2\u02f4\u02f5\7A\2\2\u02f5\u02f6\7\63\2\2\u02f6\u02f7\7)\2\2\u02f7"+
		"\u035d\7A\2\2\u02f8\u02f9\7A\2\2\u02f9\u02fa\7\63\2\2\u02fa\u02fb\78\2"+
		"\2\u02fb\u035d\7A\2\2\u02fc\u02fd\7A\2\2\u02fd\u02fe\7\63\2\2\u02fe\u035d"+
		"\7\21\2\2\u02ff\u0300\7A\2\2\u0300\u0301\7\63\2\2\u0301\u035d\7&\2\2\u0302"+
		"\u0303\7A\2\2\u0303\u0304\7\63\2\2\u0304\u035d\7+\2\2\u0305\u0306\7A\2"+
		"\2\u0306\u0307\7\63\2\2\u0307\u035d\7\t\2\2\u0308\u0309\7A\2\2\u0309\u030a"+
		"\7\63\2\2\u030a\u035d\7\7\2\2\u030b\u030c\7A\2\2\u030c\u030d\7\63\2\2"+
		"\u030d\u035d\7\66\2\2\u030e\u030f\7A\2\2\u030f\u0310\7\63\2\2\u0310\u035d"+
		"\7(\2\2\u0311\u0312\7A\2\2\u0312\u0313\7\63\2\2\u0313\u035d\7\34\2\2\u0314"+
		"\u0315\7A\2\2\u0315\u0316\7\63\2\2\u0316\u035d\7\61\2\2\u0317\u0318\7"+
		"A\2\2\u0318\u0319\7\63\2\2\u0319\u031a\7/\2\2\u031a\u035d\7A\2\2\u031b"+
		"\u031c\7A\2\2\u031c\u031d\7\63\2\2\u031d\u031e\7\f\2\2\u031e\u035d\7A"+
		"\2\2\u031f\u0320\7A\2\2\u0320\u0321\7\63\2\2\u0321\u035d\7\5\2\2\u0322"+
		"\u0323\7A\2\2\u0323\u0324\7\63\2\2\u0324\u035d\7<\2\2\u0325\u0326\7\31"+
		"\2\2\u0326\u0327\7A\2\2\u0327\u035d\7A\2\2\u0328\u0329\7\r\2\2\u0329\u032a"+
		"\7A\2\2\u032a\u035d\7A\2\2\u032b\u032c\7A\2\2\u032c\u032d\7\63\2\2\u032d"+
		"\u035d\7\17\2\2\u032e\u032f\7.\2\2\u032f\u0330\7A\2\2\u0330\u0331\7A\2"+
		"\2\u0331\u035d\5\u0086D\2\u0332\u0333\7 \2\2\u0333\u0334\7A\2\2\u0334"+
		"\u0335\7A\2\2\u0335\u035d\5\u0086D\2\u0336\u0337\7\n\2\2\u0337\u0338\7"+
		"A\2\2\u0338\u0339\7A\2\2\u0339\u035d\7A\2\2\u033a\u033b\7;\2\2\u033b\u033c"+
		"\7A\2\2\u033c\u033d\7A\2\2\u033d\u035d\5\u0086D\2\u033e\u033f\7\17\2\2"+
		"\u033f\u0340\7A\2\2\u0340\u0341\7A\2\2\u0341\u035d\5\u0086D\2\u0342\u0343"+
		"\7\16\2\2\u0343\u035d\7A\2\2\u0344\u0345\7$\2\2\u0345\u0346\5\u0086D\2"+
		"\u0346\u0347\7=\2\2\u0347\u0348\5\u0086D\2\u0348\u0349\7\26\2\2\u0349"+
		"\u035d\3\2\2\2\u034a\u034b\7A\2\2\u034b\u034c\7\63\2\2\u034c\u034d\7$"+
		"\2\2\u034d\u034e\5\u0086D\2\u034e\u034f\7\64\2\2\u034f\u0350\5\u0086D"+
		"\2\u0350\u0351\7\26\2\2\u0351\u035d\3\2\2\2\u0352\u0353\7A\2\2\u0353\u0354"+
		"\7\63\2\2\u0354\u0355\7$\2\2\u0355\u0356\5\u0086D\2\u0356\u0357\7\b\2"+
		"\2\u0357\u0358\5\u0086D\2\u0358\u0359\7\26\2\2\u0359\u035d\3\2\2\2\u035a"+
		"\u035d\7A\2\2\u035b\u035d\5\u0088E\2\u035c\u02e5\3\2\2\2\u035c\u02e9\3"+
		"\2\2\2\u035c\u02ed\3\2\2\2\u035c\u02f0\3\2\2\2\u035c\u02f4\3\2\2\2\u035c"+
		"\u02f8\3\2\2\2\u035c\u02fc\3\2\2\2\u035c\u02ff\3\2\2\2\u035c\u0302\3\2"+
		"\2\2\u035c\u0305\3\2\2\2\u035c\u0308\3\2\2\2\u035c\u030b\3\2\2\2\u035c"+
		"\u030e\3\2\2\2\u035c\u0311\3\2\2\2\u035c\u0314\3\2\2\2\u035c\u0317\3\2"+
		"\2\2\u035c\u031b\3\2\2\2\u035c\u031f\3\2\2\2\u035c\u0322\3\2\2\2\u035c"+
		"\u0325\3\2\2\2\u035c\u0328\3\2\2\2\u035c\u032b\3\2\2\2\u035c\u032e\3\2"+
		"\2\2\u035c\u0332\3\2\2\2\u035c\u0336\3\2\2\2\u035c\u033a\3\2\2\2\u035c"+
		"\u033e\3\2\2\2\u035c\u0342\3\2\2\2\u035c\u0344\3\2\2\2\u035c\u034a\3\2"+
		"\2\2\u035c\u0352\3\2\2\2\u035c\u035a\3\2\2\2\u035c\u035b\3\2\2\2\u035d"+
		"\u0087\3\2\2\2\u035e\u035f\7*\2\2\u035f\u0360\5\u008aF\2\u0360\u0361\7"+
		"\20\2\2\u0361\u0362\7%\2\2\u0362\u0363\7A\2\2\u0363\u0364\7\23\2\2\u0364"+
		"\u0365\7A\2\2\u0365\u0089\3\2\2\2\u0366\u0368\79\2\2\u0367\u0369\5\u008c"+
		"G\2\u0368\u0367\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036e\3\2\2\2\u036a"+
		"\u036b\7#\2\2\u036b\u036d\5\u008cG\2\u036c\u036a\3\2\2\2\u036d\u0370\3"+
		"\2\2\2\u036e\u036c\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0371\3\2\2\2\u0370"+
		"\u036e\3\2\2\2\u0371\u0372\7\67\2\2\u0372\u008b\3\2\2\2\u0373\u0374\7"+
		"A\2\2\u0374\u0375\7\23\2\2\u0375\u0376\7*\2\2\u0376\u0377\5\u008eH\2\u0377"+
		"\u0378\7\20\2\2\u0378\u008d\3\2\2\2\u0379\u037b\5\u0090I\2\u037a\u0379"+
		"\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u0380\3\2\2\2\u037c\u037d\7#\2\2\u037d"+
		"\u037f\5\u0090I\2\u037e\u037c\3\2\2\2\u037f\u0382\3\2\2\2\u0380\u037e"+
		"\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u008f\3\2\2\2\u0382\u0380\3\2\2\2\u0383"+
		"\u0384\7$\2\2\u0384\u0385\5\u0096L\2\u0385\u0386\7#\2\2\u0386\u0387\5"+
		"\u0096L\2\u0387\u0388\7\26\2\2\u0388\u0091\3\2\2\2\u0389\u038b\7\33\2"+
		"\2\u038a\u038c\7A\2\2\u038b\u038a\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038b"+
		"\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0093\3\2\2\2\u038f\u0394\7A\2\2\u0390"+
		"\u0391\7\63\2\2\u0391\u0393\7A\2\2\u0392\u0390\3\2\2\2\u0393\u0396\3\2"+
		"\2\2\u0394\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0095\3\2\2\2\u0396"+
		"\u0394\3\2\2\2\u0397\u0398\t\2\2\2\u0398\u0097\3\2\2\2\66\u009b\u00a5"+
		"\u00b6\u00ba\u00c0\u00e8\u00ee\u00f5\u00fb\u0101\u0104\u0108\u010e\u011b"+
		"\u0121\u0156\u015a\u0160\u016d\u0173\u017c\u0182\u0189\u018f\u0196\u019a"+
		"\u01a0\u01ac\u01b2\u01e3\u0200\u0206\u0226\u0230\u0236\u0288\u028c\u0292"+
		"\u02a5\u02ab\u02b2\u02b8\u02bf\u02c5\u02db\u035c\u0368\u036e\u037a\u0380"+
		"\u038d\u0394";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}