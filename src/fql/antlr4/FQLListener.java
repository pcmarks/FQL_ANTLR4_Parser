// Generated from C:/Users/pcmarks/Documents/IdeaProjects/antlr4_1\FQL.g4 by ANTLR 4.4.1-dev
package fql.antlr4;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FQLParser}.
 */
public interface FQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code FullQueryExp_Pi}
	 * labeled alternative in {@link FQLParser#fullQuery}.
	 * @param ctx the parse tree
	 */
	void enterFullQueryExp_Pi(@NotNull FQLParser.FullQueryExp_PiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FullQueryExp_Pi}
	 * labeled alternative in {@link FQLParser#fullQuery}.
	 * @param ctx the parse tree
	 */
	void exitFullQueryExp_Pi(@NotNull FQLParser.FullQueryExp_PiContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#instanceConstructor}.
	 * @param ctx the parse tree
	 */
	void enterInstanceConstructor(@NotNull FQLParser.InstanceConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#instanceConstructor}.
	 * @param ctx the parse tree
	 */
	void exitInstanceConstructor(@NotNull FQLParser.InstanceConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_Const}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_Const(@NotNull FQLParser.TransExp_ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_Const}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_Const(@NotNull FQLParser.TransExp_ConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstExp_FullEval}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void enterInstExp_FullEval(@NotNull FQLParser.InstExp_FullEvalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstExp_FullEval}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void exitInstExp_FullEval(@NotNull FQLParser.InstExp_FullEvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#arrow}.
	 * @param ctx the parse tree
	 */
	void enterArrow(@NotNull FQLParser.ArrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#arrow}.
	 * @param ctx the parse tree
	 */
	void exitArrow(@NotNull FQLParser.ArrowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstExp_Kernel}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void enterInstExp_Kernel(@NotNull FQLParser.InstExp_KernelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstExp_Kernel}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void exitInstExp_Kernel(@NotNull FQLParser.InstExp_KernelContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#mappingDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMappingDeclaration(@NotNull FQLParser.MappingDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#mappingDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMappingDeclaration(@NotNull FQLParser.MappingDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#instancePi}.
	 * @param ctx the parse tree
	 */
	void enterInstancePi(@NotNull FQLParser.InstancePiContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#instancePi}.
	 * @param ctx the parse tree
	 */
	void exitInstancePi(@NotNull FQLParser.InstancePiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_Return}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_Return(@NotNull FQLParser.TransExp_ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_Return}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_Return(@NotNull FQLParser.TransExp_ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_Id}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_Id(@NotNull FQLParser.TransExp_IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_Id}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_Id(@NotNull FQLParser.TransExp_IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#fullQueryZZZ}.
	 * @param ctx the parse tree
	 */
	void enterFullQueryZZZ(@NotNull FQLParser.FullQueryZZZContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#fullQueryZZZ}.
	 * @param ctx the parse tree
	 */
	void exitFullQueryZZZ(@NotNull FQLParser.FullQueryZZZContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#productType}.
	 * @param ctx the parse tree
	 */
	void enterProductType(@NotNull FQLParser.ProductTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#productType}.
	 * @param ctx the parse tree
	 */
	void exitProductType(@NotNull FQLParser.ProductTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#transConst}.
	 * @param ctx the parse tree
	 */
	void enterTransConst(@NotNull FQLParser.TransConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#transConst}.
	 * @param ctx the parse tree
	 */
	void exitTransConst(@NotNull FQLParser.TransConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_Delta}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_Delta(@NotNull FQLParser.TransExp_DeltaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_Delta}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_Delta(@NotNull FQLParser.TransExp_DeltaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_Pi}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_Pi(@NotNull FQLParser.TransExp_PiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_Pi}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_Pi(@NotNull FQLParser.TransExp_PiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_Case}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_Case(@NotNull FQLParser.TransExp_CaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_Case}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_Case(@NotNull FQLParser.TransExp_CaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#instanceConstArrowString}.
	 * @param ctx the parse tree
	 */
	void enterInstanceConstArrowString(@NotNull FQLParser.InstanceConstArrowStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#instanceConstArrowString}.
	 * @param ctx the parse tree
	 */
	void exitInstanceConstArrowString(@NotNull FQLParser.InstanceConstArrowStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#exponentType}.
	 * @param ctx the parse tree
	 */
	void enterExponentType(@NotNull FQLParser.ExponentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#exponentType}.
	 * @param ctx the parse tree
	 */
	void exitExponentType(@NotNull FQLParser.ExponentTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#instanceConstXXX}.
	 * @param ctx the parse tree
	 */
	void enterInstanceConstXXX(@NotNull FQLParser.InstanceConstXXXContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#instanceConstXXX}.
	 * @param ctx the parse tree
	 */
	void exitInstanceConstXXX(@NotNull FQLParser.InstanceConstXXXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstExp_Eval}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void enterInstExp_Eval(@NotNull FQLParser.InstExp_EvalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstExp_Eval}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void exitInstExp_Eval(@NotNull FQLParser.InstExp_EvalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SigExp_One}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void enterSigExp_One(@NotNull FQLParser.SigExp_OneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SigExp_One}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void exitSigExp_One(@NotNull FQLParser.SigExp_OneContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#transConstNode}.
	 * @param ctx the parse tree
	 */
	void enterTransConstNode(@NotNull FQLParser.TransConstNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#transConstNode}.
	 * @param ctx the parse tree
	 */
	void exitTransConstNode(@NotNull FQLParser.TransConstNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapExp_Case}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapExp_Case(@NotNull FQLParser.MapExp_CaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapExp_Case}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapExp_Case(@NotNull FQLParser.MapExp_CaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_TransEval}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_TransEval(@NotNull FQLParser.TransExp_TransEvalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_TransEval}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_TransEval(@NotNull FQLParser.TransExp_TransEvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#fullQueryDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFullQueryDeclaration(@NotNull FQLParser.FullQueryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#fullQueryDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFullQueryDeclaration(@NotNull FQLParser.FullQueryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstExp_FullSigma}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void enterInstExp_FullSigma(@NotNull FQLParser.InstExp_FullSigmaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstExp_FullSigma}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void exitInstExp_FullSigma(@NotNull FQLParser.InstExp_FullSigmaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapExp_Curry}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapExp_Curry(@NotNull FQLParser.MapExp_CurryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapExp_Curry}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapExp_Curry(@NotNull FQLParser.MapExp_CurryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(@NotNull FQLParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(@NotNull FQLParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#mappingConstNodes}.
	 * @param ctx the parse tree
	 */
	void enterMappingConstNodes(@NotNull FQLParser.MappingConstNodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#mappingConstNodes}.
	 * @param ctx the parse tree
	 */
	void exitMappingConstNodes(@NotNull FQLParser.MappingConstNodesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstExp_Times}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void enterInstExp_Times(@NotNull FQLParser.InstExp_TimesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstExp_Times}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void exitInstExp_Times(@NotNull FQLParser.InstExp_TimesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_Or}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_Or(@NotNull FQLParser.TransExp_OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_Or}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_Or(@NotNull FQLParser.TransExp_OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FullQueryExp_Delta}
	 * labeled alternative in {@link FQLParser#fullQuery}.
	 * @param ctx the parse tree
	 */
	void enterFullQueryExp_Delta(@NotNull FQLParser.FullQueryExp_DeltaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FullQueryExp_Delta}
	 * labeled alternative in {@link FQLParser#fullQuery}.
	 * @param ctx the parse tree
	 */
	void exitFullQueryExp_Delta(@NotNull FQLParser.FullQueryExp_DeltaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#instanceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInstanceDeclaration(@NotNull FQLParser.InstanceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#instanceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInstanceDeclaration(@NotNull FQLParser.InstanceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#plusType}.
	 * @param ctx the parse tree
	 */
	void enterPlusType(@NotNull FQLParser.PlusTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#plusType}.
	 * @param ctx the parse tree
	 */
	void exitPlusType(@NotNull FQLParser.PlusTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#unionType}.
	 * @param ctx the parse tree
	 */
	void enterUnionType(@NotNull FQLParser.UnionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#unionType}.
	 * @param ctx the parse tree
	 */
	void exitUnionType(@NotNull FQLParser.UnionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#instanceSigma}.
	 * @param ctx the parse tree
	 */
	void enterInstanceSigma(@NotNull FQLParser.InstanceSigmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#instanceSigma}.
	 * @param ctx the parse tree
	 */
	void exitInstanceSigma(@NotNull FQLParser.InstanceSigmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#instanceConstArrow}.
	 * @param ctx the parse tree
	 */
	void enterInstanceConstArrow(@NotNull FQLParser.InstanceConstArrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#instanceConstArrow}.
	 * @param ctx the parse tree
	 */
	void exitInstanceConstArrow(@NotNull FQLParser.InstanceConstArrowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_Fst}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_Fst(@NotNull FQLParser.TransExp_FstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_Fst}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_Fst(@NotNull FQLParser.TransExp_FstContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#transDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTransDeclaration(@NotNull FQLParser.TransDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#transDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTransDeclaration(@NotNull FQLParser.TransDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#schemaDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSchemaDeclaration(@NotNull FQLParser.SchemaDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#schemaDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSchemaDeclaration(@NotNull FQLParser.SchemaDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapExp_Const}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapExp_Const(@NotNull FQLParser.MapExp_ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapExp_Const}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapExp_Const(@NotNull FQLParser.MapExp_ConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SigExp_Zero}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void enterSigExp_Zero(@NotNull FQLParser.SigExp_ZeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SigExp_Zero}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void exitSigExp_Zero(@NotNull FQLParser.SigExp_ZeroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstExp_Plus}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void enterInstExp_Plus(@NotNull FQLParser.InstExp_PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstExp_Plus}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void exitInstExp_Plus(@NotNull FQLParser.InstExp_PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstExp_Zero}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void enterInstExp_Zero(@NotNull FQLParser.InstExp_ZeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstExp_Zero}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void exitInstExp_Zero(@NotNull FQLParser.InstExp_ZeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(@NotNull FQLParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(@NotNull FQLParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_TransIso}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_TransIso(@NotNull FQLParser.TransExp_TransIsoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_TransIso}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_TransIso(@NotNull FQLParser.TransExp_TransIsoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_Inl}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_Inl(@NotNull FQLParser.TransExp_InlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_Inl}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_Inl(@NotNull FQLParser.TransExp_InlContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#queryDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterQueryDeclaration(@NotNull FQLParser.QueryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#queryDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitQueryDeclaration(@NotNull FQLParser.QueryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapExp_Iso}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapExp_Iso(@NotNull FQLParser.MapExp_IsoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapExp_Iso}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapExp_Iso(@NotNull FQLParser.MapExp_IsoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QueryExp_Comp}
	 * labeled alternative in {@link FQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQueryExp_Comp(@NotNull FQLParser.QueryExp_CompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QueryExp_Comp}
	 * labeled alternative in {@link FQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQueryExp_Comp(@NotNull FQLParser.QueryExp_CompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SigExp_Exp}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void enterSigExp_Exp(@NotNull FQLParser.SigExp_ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SigExp_Exp}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void exitSigExp_Exp(@NotNull FQLParser.SigExp_ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstExp_Delta}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void enterInstExp_Delta(@NotNull FQLParser.InstExp_DeltaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstExp_Delta}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void exitInstExp_Delta(@NotNull FQLParser.InstExp_DeltaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#schemaComponentsArrows}.
	 * @param ctx the parse tree
	 */
	void enterSchemaComponentsArrows(@NotNull FQLParser.SchemaComponentsArrowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#schemaComponentsArrows}.
	 * @param ctx the parse tree
	 */
	void exitSchemaComponentsArrows(@NotNull FQLParser.SchemaComponentsArrowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#fullQueryYYY}.
	 * @param ctx the parse tree
	 */
	void enterFullQueryYYY(@NotNull FQLParser.FullQueryYYYContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#fullQueryYYY}.
	 * @param ctx the parse tree
	 */
	void exitFullQueryYYY(@NotNull FQLParser.FullQueryYYYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapExp_Apply}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapExp_Apply(@NotNull FQLParser.MapExp_ApplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapExp_Apply}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapExp_Apply(@NotNull FQLParser.MapExp_ApplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#instanceConstNodes}.
	 * @param ctx the parse tree
	 */
	void enterInstanceConstNodes(@NotNull FQLParser.InstanceConstNodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#instanceConstNodes}.
	 * @param ctx the parse tree
	 */
	void exitInstanceConstNodes(@NotNull FQLParser.InstanceConstNodesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#instanceEval}.
	 * @param ctx the parse tree
	 */
	void enterInstanceEval(@NotNull FQLParser.InstanceEvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#instanceEval}.
	 * @param ctx the parse tree
	 */
	void exitInstanceEval(@NotNull FQLParser.InstanceEvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#mappingConstArrows}.
	 * @param ctx the parse tree
	 */
	void enterMappingConstArrows(@NotNull FQLParser.MappingConstArrowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#mappingConstArrows}.
	 * @param ctx the parse tree
	 */
	void exitMappingConstArrows(@NotNull FQLParser.MappingConstArrowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_Not}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_Not(@NotNull FQLParser.TransExp_NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_Not}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_Not(@NotNull FQLParser.TransExp_NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapExp_Snd}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapExp_Snd(@NotNull FQLParser.MapExp_SndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapExp_Snd}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapExp_Snd(@NotNull FQLParser.MapExp_SndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapExp_Fst}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapExp_Fst(@NotNull FQLParser.MapExp_FstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapExp_Fst}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapExp_Fst(@NotNull FQLParser.MapExp_FstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapExp_Void}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapExp_Void(@NotNull FQLParser.MapExp_VoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapExp_Void}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapExp_Void(@NotNull FQLParser.MapExp_VoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SigExp_Plus}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void enterSigExp_Plus(@NotNull FQLParser.SigExp_PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SigExp_Plus}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void exitSigExp_Plus(@NotNull FQLParser.SigExp_PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#schemaConst}.
	 * @param ctx the parse tree
	 */
	void enterSchemaConst(@NotNull FQLParser.SchemaConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#schemaConst}.
	 * @param ctx the parse tree
	 */
	void exitSchemaConst(@NotNull FQLParser.SchemaConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_Var}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_Var(@NotNull FQLParser.TransExp_VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_Var}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_Var(@NotNull FQLParser.TransExp_VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#fullQueryXXX}.
	 * @param ctx the parse tree
	 */
	void enterFullQueryXXX(@NotNull FQLParser.FullQueryXXXContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#fullQueryXXX}.
	 * @param ctx the parse tree
	 */
	void exitFullQueryXXX(@NotNull FQLParser.FullQueryXXXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_Squash}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_Squash(@NotNull FQLParser.TransExp_SquashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_Squash}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_Squash(@NotNull FQLParser.TransExp_SquashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_Snd}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_Snd(@NotNull FQLParser.TransExp_SndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_Snd}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_Snd(@NotNull FQLParser.TransExp_SndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapExp_Comp}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapExp_Comp(@NotNull FQLParser.MapExp_CompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapExp_Comp}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapExp_Comp(@NotNull FQLParser.MapExp_CompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SigExp_Var}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void enterSigExp_Var(@NotNull FQLParser.SigExp_VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SigExp_Var}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void exitSigExp_Var(@NotNull FQLParser.SigExp_VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FullQueryExp_Comp}
	 * labeled alternative in {@link FQLParser#fullQuery}.
	 * @param ctx the parse tree
	 */
	void enterFullQueryExp_Comp(@NotNull FQLParser.FullQueryExp_CompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FullQueryExp_Comp}
	 * labeled alternative in {@link FQLParser#fullQuery}.
	 * @param ctx the parse tree
	 */
	void exitFullQueryExp_Comp(@NotNull FQLParser.FullQueryExp_CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull FQLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull FQLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_FF}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_FF(@NotNull FQLParser.TransExp_FFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_FF}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_FF(@NotNull FQLParser.TransExp_FFContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#instanceConstAttributes}.
	 * @param ctx the parse tree
	 */
	void enterInstanceConstAttributes(@NotNull FQLParser.InstanceConstAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#instanceConstAttributes}.
	 * @param ctx the parse tree
	 */
	void exitInstanceConstAttributes(@NotNull FQLParser.InstanceConstAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FullQueryExp_Match}
	 * labeled alternative in {@link FQLParser#fullQuery}.
	 * @param ctx the parse tree
	 */
	void enterFullQueryExp_Match(@NotNull FQLParser.FullQueryExp_MatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FullQueryExp_Match}
	 * labeled alternative in {@link FQLParser#fullQuery}.
	 * @param ctx the parse tree
	 */
	void exitFullQueryExp_Match(@NotNull FQLParser.FullQueryExp_MatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull FQLParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull FQLParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstExp_}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void enterInstExp_(@NotNull FQLParser.InstExp_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code InstExp_}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void exitInstExp_(@NotNull FQLParser.InstExp_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#queryZZZ}.
	 * @param ctx the parse tree
	 */
	void enterQueryZZZ(@NotNull FQLParser.QueryZZZContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#queryZZZ}.
	 * @param ctx the parse tree
	 */
	void exitQueryZZZ(@NotNull FQLParser.QueryZZZContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#instanceRelationalize}.
	 * @param ctx the parse tree
	 */
	void enterInstanceRelationalize(@NotNull FQLParser.InstanceRelationalizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#instanceRelationalize}.
	 * @param ctx the parse tree
	 */
	void exitInstanceRelationalize(@NotNull FQLParser.InstanceRelationalizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapExp_Opposite}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapExp_Opposite(@NotNull FQLParser.MapExp_OppositeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapExp_Opposite}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapExp_Opposite(@NotNull FQLParser.MapExp_OppositeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#mappingConstAttributes}.
	 * @param ctx the parse tree
	 */
	void enterMappingConstAttributes(@NotNull FQLParser.MappingConstAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#mappingConstAttributes}.
	 * @param ctx the parse tree
	 */
	void exitMappingConstAttributes(@NotNull FQLParser.MappingConstAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#instanceConstArrows}.
	 * @param ctx the parse tree
	 */
	void enterInstanceConstArrows(@NotNull FQLParser.InstanceConstArrowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#instanceConstArrows}.
	 * @param ctx the parse tree
	 */
	void exitInstanceConstArrows(@NotNull FQLParser.InstanceConstArrowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#instanceFullEval}.
	 * @param ctx the parse tree
	 */
	void enterInstanceFullEval(@NotNull FQLParser.InstanceFullEvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#instanceFullEval}.
	 * @param ctx the parse tree
	 */
	void exitInstanceFullEval(@NotNull FQLParser.InstanceFullEvalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_External}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_External(@NotNull FQLParser.TransExp_ExternalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_External}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_External(@NotNull FQLParser.TransExp_ExternalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstExp_Two}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void enterInstExp_Two(@NotNull FQLParser.InstExp_TwoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstExp_Two}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void exitInstExp_Two(@NotNull FQLParser.InstExp_TwoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#queryMtch}.
	 * @param ctx the parse tree
	 */
	void enterQueryMtch(@NotNull FQLParser.QueryMtchContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#queryMtch}.
	 * @param ctx the parse tree
	 */
	void exitQueryMtch(@NotNull FQLParser.QueryMtchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstExp_One}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void enterInstExp_One(@NotNull FQLParser.InstExp_OneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstExp_One}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void exitInstExp_One(@NotNull FQLParser.InstExp_OneContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#schemaComponentsEquations}.
	 * @param ctx the parse tree
	 */
	void enterSchemaComponentsEquations(@NotNull FQLParser.SchemaComponentsEquationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#schemaComponentsEquations}.
	 * @param ctx the parse tree
	 */
	void exitSchemaComponentsEquations(@NotNull FQLParser.SchemaComponentsEquationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#instanceFullSigma}.
	 * @param ctx the parse tree
	 */
	void enterInstanceFullSigma(@NotNull FQLParser.InstanceFullSigmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#instanceFullSigma}.
	 * @param ctx the parse tree
	 */
	void exitInstanceFullSigma(@NotNull FQLParser.InstanceFullSigmaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_TT}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_TT(@NotNull FQLParser.TransExp_TTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_TT}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_TT(@NotNull FQLParser.TransExp_TTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SigExp_Union}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void enterSigExp_Union(@NotNull FQLParser.SigExp_UnionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SigExp_Union}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void exitSigExp_Union(@NotNull FQLParser.SigExp_UnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#fullQueryMatch}.
	 * @param ctx the parse tree
	 */
	void enterFullQueryMatch(@NotNull FQLParser.FullQueryMatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#fullQueryMatch}.
	 * @param ctx the parse tree
	 */
	void exitFullQueryMatch(@NotNull FQLParser.FullQueryMatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstExp_Const}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void enterInstExp_Const(@NotNull FQLParser.InstExp_ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstExp_Const}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void exitInstExp_Const(@NotNull FQLParser.InstExp_ConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_Inr}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_Inr(@NotNull FQLParser.TransExp_InrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_Inr}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_Inr(@NotNull FQLParser.TransExp_InrContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull FQLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull FQLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QueryExp_Const}
	 * labeled alternative in {@link FQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQueryExp_Const(@NotNull FQLParser.QueryExp_ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QueryExp_Const}
	 * labeled alternative in {@link FQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQueryExp_Const(@NotNull FQLParser.QueryExp_ConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#schemaComponentsNodes}.
	 * @param ctx the parse tree
	 */
	void enterSchemaComponentsNodes(@NotNull FQLParser.SchemaComponentsNodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#schemaComponentsNodes}.
	 * @param ctx the parse tree
	 */
	void exitSchemaComponentsNodes(@NotNull FQLParser.SchemaComponentsNodesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#instanceConstArrowStrings}.
	 * @param ctx the parse tree
	 */
	void enterInstanceConstArrowStrings(@NotNull FQLParser.InstanceConstArrowStringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#instanceConstArrowStrings}.
	 * @param ctx the parse tree
	 */
	void exitInstanceConstArrowStrings(@NotNull FQLParser.InstanceConstArrowStringsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SigExp_Times}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void enterSigExp_Times(@NotNull FQLParser.SigExp_TimesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SigExp_Times}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void exitSigExp_Times(@NotNull FQLParser.SigExp_TimesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_Sigma}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_Sigma(@NotNull FQLParser.TransExp_SigmaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_Sigma}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_Sigma(@NotNull FQLParser.TransExp_SigmaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstExp_Relationalize}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void enterInstExp_Relationalize(@NotNull FQLParser.InstExp_RelationalizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstExp_Relationalize}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void exitInstExp_Relationalize(@NotNull FQLParser.InstExp_RelationalizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapExp_Var}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapExp_Var(@NotNull FQLParser.MapExp_VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapExp_Var}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapExp_Var(@NotNull FQLParser.MapExp_VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#queryYYY}.
	 * @param ctx the parse tree
	 */
	void enterQueryYYY(@NotNull FQLParser.QueryYYYContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#queryYYY}.
	 * @param ctx the parse tree
	 */
	void exitQueryYYY(@NotNull FQLParser.QueryYYYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapExp_Prod}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapExp_Prod(@NotNull FQLParser.MapExp_ProdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapExp_Prod}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapExp_Prod(@NotNull FQLParser.MapExp_ProdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#opposite}.
	 * @param ctx the parse tree
	 */
	void enterOpposite(@NotNull FQLParser.OppositeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#opposite}.
	 * @param ctx the parse tree
	 */
	void exitOpposite(@NotNull FQLParser.OppositeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#mappingXXX}.
	 * @param ctx the parse tree
	 */
	void enterMappingXXX(@NotNull FQLParser.MappingXXXContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#mappingXXX}.
	 * @param ctx the parse tree
	 */
	void exitMappingXXX(@NotNull FQLParser.MappingXXXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_Comp}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_Comp(@NotNull FQLParser.TransExp_CompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_Comp}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_Comp(@NotNull FQLParser.TransExp_CompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SigExp_Const}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void enterSigExp_Const(@NotNull FQLParser.SigExp_ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SigExp_Const}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void exitSigExp_Const(@NotNull FQLParser.SigExp_ConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapExp_Inr}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapExp_Inr(@NotNull FQLParser.MapExp_InrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapExp_Inr}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapExp_Inr(@NotNull FQLParser.MapExp_InrContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#instanceDelta}.
	 * @param ctx the parse tree
	 */
	void enterInstanceDelta(@NotNull FQLParser.InstanceDeltaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#instanceDelta}.
	 * @param ctx the parse tree
	 */
	void exitInstanceDelta(@NotNull FQLParser.InstanceDeltaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#mappingArrow}.
	 * @param ctx the parse tree
	 */
	void enterMappingArrow(@NotNull FQLParser.MappingArrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#mappingArrow}.
	 * @param ctx the parse tree
	 */
	void exitMappingArrow(@NotNull FQLParser.MappingArrowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FullQueryExp_Sigma}
	 * labeled alternative in {@link FQLParser#fullQuery}.
	 * @param ctx the parse tree
	 */
	void enterFullQueryExp_Sigma(@NotNull FQLParser.FullQueryExp_SigmaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FullQueryExp_Sigma}
	 * labeled alternative in {@link FQLParser#fullQuery}.
	 * @param ctx the parse tree
	 */
	void exitFullQueryExp_Sigma(@NotNull FQLParser.FullQueryExp_SigmaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapExp_Inl}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapExp_Inl(@NotNull FQLParser.MapExp_InlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapExp_Inl}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapExp_Inl(@NotNull FQLParser.MapExp_InlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstExp_Pi}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void enterInstExp_Pi(@NotNull FQLParser.InstExp_PiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstExp_Pi}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void exitInstExp_Pi(@NotNull FQLParser.InstExp_PiContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#mappingNode}.
	 * @param ctx the parse tree
	 */
	void enterMappingNode(@NotNull FQLParser.MappingNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#mappingNode}.
	 * @param ctx the parse tree
	 */
	void exitMappingNode(@NotNull FQLParser.MappingNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_Implies}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_Implies(@NotNull FQLParser.TransExp_ImpliesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_Implies}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_Implies(@NotNull FQLParser.TransExp_ImpliesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstExp_External}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void enterInstExp_External(@NotNull FQLParser.InstExp_ExternalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstExp_External}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void exitInstExp_External(@NotNull FQLParser.InstExp_ExternalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(@NotNull FQLParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(@NotNull FQLParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_Bool}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_Bool(@NotNull FQLParser.TransExp_BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_Bool}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_Bool(@NotNull FQLParser.TransExp_BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_And}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_And(@NotNull FQLParser.TransExp_AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_And}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_And(@NotNull FQLParser.TransExp_AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_FullSigma}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_FullSigma(@NotNull FQLParser.TransExp_FullSigmaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_FullSigma}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_FullSigma(@NotNull FQLParser.TransExp_FullSigmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#schemaXXX}.
	 * @param ctx the parse tree
	 */
	void enterSchemaXXX(@NotNull FQLParser.SchemaXXXContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#schemaXXX}.
	 * @param ctx the parse tree
	 */
	void exitSchemaXXX(@NotNull FQLParser.SchemaXXXContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#schemaComponents}.
	 * @param ctx the parse tree
	 */
	void enterSchemaComponents(@NotNull FQLParser.SchemaComponentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#schemaComponents}.
	 * @param ctx the parse tree
	 */
	void exitSchemaComponents(@NotNull FQLParser.SchemaComponentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapExp_TT}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapExp_TT(@NotNull FQLParser.MapExp_TTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapExp_TT}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapExp_TT(@NotNull FQLParser.MapExp_TTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_TransCurry}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_TransCurry(@NotNull FQLParser.TransExp_TransCurryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_TransCurry}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_TransCurry(@NotNull FQLParser.TransExp_TransCurryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#instanceExternal}.
	 * @param ctx the parse tree
	 */
	void enterInstanceExternal(@NotNull FQLParser.InstanceExternalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#instanceExternal}.
	 * @param ctx the parse tree
	 */
	void exitInstanceExternal(@NotNull FQLParser.InstanceExternalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#transConstP}.
	 * @param ctx the parse tree
	 */
	void enterTransConstP(@NotNull FQLParser.TransConstPContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#transConstP}.
	 * @param ctx the parse tree
	 */
	void exitTransConstP(@NotNull FQLParser.TransConstPContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#transConstXXX}.
	 * @param ctx the parse tree
	 */
	void enterTransConstXXX(@NotNull FQLParser.TransConstXXXContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#transConstXXX}.
	 * @param ctx the parse tree
	 */
	void exitTransConstXXX(@NotNull FQLParser.TransConstXXXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapExp_Sub}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapExp_Sub(@NotNull FQLParser.MapExp_SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapExp_Sub}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapExp_Sub(@NotNull FQLParser.MapExp_SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#mappingConstructor}.
	 * @param ctx the parse tree
	 */
	void enterMappingConstructor(@NotNull FQLParser.MappingConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#mappingConstructor}.
	 * @param ctx the parse tree
	 */
	void exitMappingConstructor(@NotNull FQLParser.MappingConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QueryExp_Var}
	 * labeled alternative in {@link FQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQueryExp_Var(@NotNull FQLParser.QueryExp_VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QueryExp_Var}
	 * labeled alternative in {@link FQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQueryExp_Var(@NotNull FQLParser.QueryExp_VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#transConstPTerm}.
	 * @param ctx the parse tree
	 */
	void enterTransConstPTerm(@NotNull FQLParser.TransConstPTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#transConstPTerm}.
	 * @param ctx the parse tree
	 */
	void exitTransConstPTerm(@NotNull FQLParser.TransConstPTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_Prod}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_Prod(@NotNull FQLParser.TransExp_ProdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_Prod}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_Prod(@NotNull FQLParser.TransExp_ProdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QueryExp_Mtch}
	 * labeled alternative in {@link FQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQueryExp_Mtch(@NotNull FQLParser.QueryExp_MtchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QueryExp_Mtch}
	 * labeled alternative in {@link FQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQueryExp_Mtch(@NotNull FQLParser.QueryExp_MtchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_UnChi}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_UnChi(@NotNull FQLParser.TransExp_UnChiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_UnChi}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_UnChi(@NotNull FQLParser.TransExp_UnChiContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#queryComp}.
	 * @param ctx the parse tree
	 */
	void enterQueryComp(@NotNull FQLParser.QueryCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#queryComp}.
	 * @param ctx the parse tree
	 */
	void exitQueryComp(@NotNull FQLParser.QueryCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#dropDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDropDeclaration(@NotNull FQLParser.DropDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#dropDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDropDeclaration(@NotNull FQLParser.DropDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#queryP}.
	 * @param ctx the parse tree
	 */
	void enterQueryP(@NotNull FQLParser.QueryPContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#queryP}.
	 * @param ctx the parse tree
	 */
	void exitQueryP(@NotNull FQLParser.QueryPContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#schemaComponentsAttributes}.
	 * @param ctx the parse tree
	 */
	void enterSchemaComponentsAttributes(@NotNull FQLParser.SchemaComponentsAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#schemaComponentsAttributes}.
	 * @param ctx the parse tree
	 */
	void exitSchemaComponentsAttributes(@NotNull FQLParser.SchemaComponentsAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_Coreturn}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_Coreturn(@NotNull FQLParser.TransExp_CoreturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_Coreturn}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_Coreturn(@NotNull FQLParser.TransExp_CoreturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_Chi}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_Chi(@NotNull FQLParser.TransExp_ChiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_Chi}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_Chi(@NotNull FQLParser.TransExp_ChiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstExp_Exp}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void enterInstExp_Exp(@NotNull FQLParser.InstExp_ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstExp_Exp}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void exitInstExp_Exp(@NotNull FQLParser.InstExp_ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#queryXXX}.
	 * @param ctx the parse tree
	 */
	void enterQueryXXX(@NotNull FQLParser.QueryXXXContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#queryXXX}.
	 * @param ctx the parse tree
	 */
	void exitQueryXXX(@NotNull FQLParser.QueryXXXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MapExp_Id}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapExp_Id(@NotNull FQLParser.MapExp_IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MapExp_Id}
	 * labeled alternative in {@link FQLParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapExp_Id(@NotNull FQLParser.MapExp_IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#instanceConstNode}.
	 * @param ctx the parse tree
	 */
	void enterInstanceConstNode(@NotNull FQLParser.InstanceConstNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#instanceConstNode}.
	 * @param ctx the parse tree
	 */
	void exitInstanceConstNode(@NotNull FQLParser.InstanceConstNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstExp_Sigma}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void enterInstExp_Sigma(@NotNull FQLParser.InstExp_SigmaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstExp_Sigma}
	 * labeled alternative in {@link FQLParser#instance}.
	 * @param ctx the parse tree
	 */
	void exitInstExp_Sigma(@NotNull FQLParser.InstExp_SigmaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SigExp_Opposite}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void enterSigExp_Opposite(@NotNull FQLParser.SigExp_OppositeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SigExp_Opposite}
	 * labeled alternative in {@link FQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void exitSigExp_Opposite(@NotNull FQLParser.SigExp_OppositeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FullQueryExp_Var}
	 * labeled alternative in {@link FQLParser#fullQuery}.
	 * @param ctx the parse tree
	 */
	void enterFullQueryExp_Var(@NotNull FQLParser.FullQueryExp_VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FullQueryExp_Var}
	 * labeled alternative in {@link FQLParser#fullQuery}.
	 * @param ctx the parse tree
	 */
	void exitFullQueryExp_Var(@NotNull FQLParser.FullQueryExp_VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#queryP1}.
	 * @param ctx the parse tree
	 */
	void enterQueryP1(@NotNull FQLParser.QueryP1Context ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#queryP1}.
	 * @param ctx the parse tree
	 */
	void exitQueryP1(@NotNull FQLParser.QueryP1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code TransExp_Relationalize}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransExp_Relationalize(@NotNull FQLParser.TransExp_RelationalizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransExp_Relationalize}
	 * labeled alternative in {@link FQLParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransExp_Relationalize(@NotNull FQLParser.TransExp_RelationalizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#queryP2}.
	 * @param ctx the parse tree
	 */
	void enterQueryP2(@NotNull FQLParser.QueryP2Context ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#queryP2}.
	 * @param ctx the parse tree
	 */
	void exitQueryP2(@NotNull FQLParser.QueryP2Context ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#mappingConstXXX}.
	 * @param ctx the parse tree
	 */
	void enterMappingConstXXX(@NotNull FQLParser.MappingConstXXXContext ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#mappingConstXXX}.
	 * @param ctx the parse tree
	 */
	void exitMappingConstXXX(@NotNull FQLParser.MappingConstXXXContext ctx);
	/**
	 * Enter a parse tree produced by {@link FQLParser#queryP3}.
	 * @param ctx the parse tree
	 */
	void enterQueryP3(@NotNull FQLParser.QueryP3Context ctx);
	/**
	 * Exit a parse tree produced by {@link FQLParser#queryP3}.
	 * @param ctx the parse tree
	 */
	void exitQueryP3(@NotNull FQLParser.QueryP3Context ctx);
}