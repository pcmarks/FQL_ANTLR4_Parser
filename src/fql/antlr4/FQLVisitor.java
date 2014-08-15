// Generated from C:/Users/pcmarks/Documents/IdeaProjects/antlr4_1\FQL.g4 by ANTLR 4.4.1-dev
package fql.antlr4;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code FullQueryExp_Pi}
	 * labeled alternative in {@link FQLParser#fullQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullQueryExp_Pi(@NotNull FQLParser.FullQueryExp_PiContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#instanceConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceConstructor(@NotNull FQLParser.InstanceConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_Const}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_Const(@NotNull FQLParser.TransExp_ConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstExp_FullEval}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstExp_FullEval(@NotNull FQLParser.InstExp_FullEvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#arrow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrow(@NotNull FQLParser.ArrowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstExp_Kernel}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstExp_Kernel(@NotNull FQLParser.InstExp_KernelContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#mappingDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMappingDeclaration(@NotNull FQLParser.MappingDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#instancePi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstancePi(@NotNull FQLParser.InstancePiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_Return}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_Return(@NotNull FQLParser.TransExp_ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_Id}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_Id(@NotNull FQLParser.TransExp_IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#fullQueryZZZ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullQueryZZZ(@NotNull FQLParser.FullQueryZZZContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#productType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductType(@NotNull FQLParser.ProductTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#transConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransConst(@NotNull FQLParser.TransConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_Delta}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_Delta(@NotNull FQLParser.TransExp_DeltaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_Pi}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_Pi(@NotNull FQLParser.TransExp_PiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_Case}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_Case(@NotNull FQLParser.TransExp_CaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#instanceConstArrowString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceConstArrowString(@NotNull FQLParser.InstanceConstArrowStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#exponentType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentType(@NotNull FQLParser.ExponentTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#instanceConstXXX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceConstXXX(@NotNull FQLParser.InstanceConstXXXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstExp_Eval}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstExp_Eval(@NotNull FQLParser.InstExp_EvalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SigExp_One}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigExp_One(@NotNull FQLParser.SigExp_OneContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#transConstNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransConstNode(@NotNull FQLParser.TransConstNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapExp_Case}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExp_Case(@NotNull FQLParser.MapExp_CaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_TransEval}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_TransEval(@NotNull FQLParser.TransExp_TransEvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#fullQueryDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullQueryDeclaration(@NotNull FQLParser.FullQueryDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstExp_FullSigma}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstExp_FullSigma(@NotNull FQLParser.InstExp_FullSigmaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapExp_Curry}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExp_Curry(@NotNull FQLParser.MapExp_CurryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(@NotNull FQLParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#mappingConstNodes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMappingConstNodes(@NotNull FQLParser.MappingConstNodesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstExp_Times}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstExp_Times(@NotNull FQLParser.InstExp_TimesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_Or}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_Or(@NotNull FQLParser.TransExp_OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FullQueryExp_Delta}
	 * labeled alternative in {@link FQLParser#fullQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullQueryExp_Delta(@NotNull FQLParser.FullQueryExp_DeltaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#instanceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceDeclaration(@NotNull FQLParser.InstanceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#plusType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusType(@NotNull FQLParser.PlusTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#unionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionType(@NotNull FQLParser.UnionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#instanceSigma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceSigma(@NotNull FQLParser.InstanceSigmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#instanceConstArrow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceConstArrow(@NotNull FQLParser.InstanceConstArrowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_Fst}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_Fst(@NotNull FQLParser.TransExp_FstContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#transDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransDeclaration(@NotNull FQLParser.TransDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#schemaDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaDeclaration(@NotNull FQLParser.SchemaDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapExp_Const}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExp_Const(@NotNull FQLParser.MapExp_ConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SigExp_Zero}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigExp_Zero(@NotNull FQLParser.SigExp_ZeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstExp_Plus}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstExp_Plus(@NotNull FQLParser.InstExp_PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstExp_Zero}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstExp_Zero(@NotNull FQLParser.InstExp_ZeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(@NotNull FQLParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_TransIso}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_TransIso(@NotNull FQLParser.TransExp_TransIsoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_Inl}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_Inl(@NotNull FQLParser.TransExp_InlContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#queryDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryDeclaration(@NotNull FQLParser.QueryDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapExp_Iso}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExp_Iso(@NotNull FQLParser.MapExp_IsoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QueryExp_Comp}
	 * labeled alternative in {@link FQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExp_Comp(@NotNull FQLParser.QueryExp_CompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SigExp_Exp}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigExp_Exp(@NotNull FQLParser.SigExp_ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstExp_Delta}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstExp_Delta(@NotNull FQLParser.InstExp_DeltaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#schemaComponentsArrows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaComponentsArrows(@NotNull FQLParser.SchemaComponentsArrowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#fullQueryYYY}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullQueryYYY(@NotNull FQLParser.FullQueryYYYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapExp_Apply}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExp_Apply(@NotNull FQLParser.MapExp_ApplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#instanceConstNodes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceConstNodes(@NotNull FQLParser.InstanceConstNodesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#instanceEval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceEval(@NotNull FQLParser.InstanceEvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#mappingConstArrows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMappingConstArrows(@NotNull FQLParser.MappingConstArrowsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_Not}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_Not(@NotNull FQLParser.TransExp_NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapExp_Snd}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExp_Snd(@NotNull FQLParser.MapExp_SndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapExp_Fst}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExp_Fst(@NotNull FQLParser.MapExp_FstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapExp_Void}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExp_Void(@NotNull FQLParser.MapExp_VoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SigExp_Plus}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigExp_Plus(@NotNull FQLParser.SigExp_PlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#schemaConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaConst(@NotNull FQLParser.SchemaConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_Var}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_Var(@NotNull FQLParser.TransExp_VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#fullQueryXXX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullQueryXXX(@NotNull FQLParser.FullQueryXXXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_Squash}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_Squash(@NotNull FQLParser.TransExp_SquashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_Snd}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_Snd(@NotNull FQLParser.TransExp_SndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapExp_Comp}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExp_Comp(@NotNull FQLParser.MapExp_CompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SigExp_Var}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigExp_Var(@NotNull FQLParser.SigExp_VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FullQueryExp_Comp}
	 * labeled alternative in {@link FQLParser#fullQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullQueryExp_Comp(@NotNull FQLParser.FullQueryExp_CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull FQLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_FF}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_FF(@NotNull FQLParser.TransExp_FFContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#instanceConstAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceConstAttributes(@NotNull FQLParser.InstanceConstAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FullQueryExp_Match}
	 * labeled alternative in {@link FQLParser#fullQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullQueryExp_Match(@NotNull FQLParser.FullQueryExp_MatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull FQLParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstExp_}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstExp_(@NotNull FQLParser.InstExp_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#queryZZZ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryZZZ(@NotNull FQLParser.QueryZZZContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#instanceRelationalize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceRelationalize(@NotNull FQLParser.InstanceRelationalizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapExp_Opposite}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExp_Opposite(@NotNull FQLParser.MapExp_OppositeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#mappingConstAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMappingConstAttributes(@NotNull FQLParser.MappingConstAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#instanceConstArrows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceConstArrows(@NotNull FQLParser.InstanceConstArrowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#instanceFullEval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceFullEval(@NotNull FQLParser.InstanceFullEvalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_External}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_External(@NotNull FQLParser.TransExp_ExternalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstExp_Two}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstExp_Two(@NotNull FQLParser.InstExp_TwoContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#queryMtch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryMtch(@NotNull FQLParser.QueryMtchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstExp_One}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstExp_One(@NotNull FQLParser.InstExp_OneContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#schemaComponentsEquations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaComponentsEquations(@NotNull FQLParser.SchemaComponentsEquationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#instanceFullSigma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceFullSigma(@NotNull FQLParser.InstanceFullSigmaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_TT}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_TT(@NotNull FQLParser.TransExp_TTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SigExp_Union}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigExp_Union(@NotNull FQLParser.SigExp_UnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#fullQueryMatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullQueryMatch(@NotNull FQLParser.FullQueryMatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstExp_Const}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstExp_Const(@NotNull FQLParser.InstExp_ConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_Inr}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_Inr(@NotNull FQLParser.TransExp_InrContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull FQLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QueryExp_Const}
	 * labeled alternative in {@link FQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExp_Const(@NotNull FQLParser.QueryExp_ConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#schemaComponentsNodes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaComponentsNodes(@NotNull FQLParser.SchemaComponentsNodesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#instanceConstArrowStrings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceConstArrowStrings(@NotNull FQLParser.InstanceConstArrowStringsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SigExp_Times}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigExp_Times(@NotNull FQLParser.SigExp_TimesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_Sigma}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_Sigma(@NotNull FQLParser.TransExp_SigmaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstExp_Relationalize}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstExp_Relationalize(@NotNull FQLParser.InstExp_RelationalizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapExp_Var}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExp_Var(@NotNull FQLParser.MapExp_VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#queryYYY}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryYYY(@NotNull FQLParser.QueryYYYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapExp_Prod}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExp_Prod(@NotNull FQLParser.MapExp_ProdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#opposite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpposite(@NotNull FQLParser.OppositeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#mappingXXX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMappingXXX(@NotNull FQLParser.MappingXXXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_Comp}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_Comp(@NotNull FQLParser.TransExp_CompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SigExp_Const}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigExp_Const(@NotNull FQLParser.SigExp_ConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapExp_Inr}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExp_Inr(@NotNull FQLParser.MapExp_InrContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#instanceDelta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceDelta(@NotNull FQLParser.InstanceDeltaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#mappingArrow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMappingArrow(@NotNull FQLParser.MappingArrowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FullQueryExp_Sigma}
	 * labeled alternative in {@link FQLParser#fullQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullQueryExp_Sigma(@NotNull FQLParser.FullQueryExp_SigmaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapExp_Inl}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExp_Inl(@NotNull FQLParser.MapExp_InlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstExp_Pi}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstExp_Pi(@NotNull FQLParser.InstExp_PiContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#mappingNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMappingNode(@NotNull FQLParser.MappingNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_Implies}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_Implies(@NotNull FQLParser.TransExp_ImpliesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstExp_External}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstExp_External(@NotNull FQLParser.InstExp_ExternalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(@NotNull FQLParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_Bool}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_Bool(@NotNull FQLParser.TransExp_BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_And}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_And(@NotNull FQLParser.TransExp_AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_FullSigma}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_FullSigma(@NotNull FQLParser.TransExp_FullSigmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#schemaXXX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaXXX(@NotNull FQLParser.SchemaXXXContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#schemaComponents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaComponents(@NotNull FQLParser.SchemaComponentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapExp_TT}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExp_TT(@NotNull FQLParser.MapExp_TTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_TransCurry}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_TransCurry(@NotNull FQLParser.TransExp_TransCurryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#instanceExternal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceExternal(@NotNull FQLParser.InstanceExternalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#transConstP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransConstP(@NotNull FQLParser.TransConstPContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#transConstXXX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransConstXXX(@NotNull FQLParser.TransConstXXXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapExp_Sub}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExp_Sub(@NotNull FQLParser.MapExp_SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#mappingConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMappingConstructor(@NotNull FQLParser.MappingConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QueryExp_Var}
	 * labeled alternative in {@link FQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExp_Var(@NotNull FQLParser.QueryExp_VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#transConstPTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransConstPTerm(@NotNull FQLParser.TransConstPTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_Prod}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_Prod(@NotNull FQLParser.TransExp_ProdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QueryExp_Mtch}
	 * labeled alternative in {@link FQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExp_Mtch(@NotNull FQLParser.QueryExp_MtchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_UnChi}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_UnChi(@NotNull FQLParser.TransExp_UnChiContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#queryComp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryComp(@NotNull FQLParser.QueryCompContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#dropDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDeclaration(@NotNull FQLParser.DropDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#queryP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryP(@NotNull FQLParser.QueryPContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#schemaComponentsAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaComponentsAttributes(@NotNull FQLParser.SchemaComponentsAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_Coreturn}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_Coreturn(@NotNull FQLParser.TransExp_CoreturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_Chi}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_Chi(@NotNull FQLParser.TransExp_ChiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstExp_Exp}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstExp_Exp(@NotNull FQLParser.InstExp_ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#queryXXX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryXXX(@NotNull FQLParser.QueryXXXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapExp_Id}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExp_Id(@NotNull FQLParser.MapExp_IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#instanceConstNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceConstNode(@NotNull FQLParser.InstanceConstNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstExp_Sigma}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstExp_Sigma(@NotNull FQLParser.InstExp_SigmaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SigExp_Opposite}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigExp_Opposite(@NotNull FQLParser.SigExp_OppositeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FullQueryExp_Var}
	 * labeled alternative in {@link FQLParser#fullQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullQueryExp_Var(@NotNull FQLParser.FullQueryExp_VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#queryP1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryP1(@NotNull FQLParser.QueryP1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code TransExp_Relationalize}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransExp_Relationalize(@NotNull FQLParser.TransExp_RelationalizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#queryP2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryP2(@NotNull FQLParser.QueryP2Context ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#mappingConstXXX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMappingConstXXX(@NotNull FQLParser.MappingConstXXXContext ctx);
	/**
	 * Visit a parse tree produced by {@link FQLParser#queryP3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryP3(@NotNull FQLParser.QueryP3Context ctx);
}