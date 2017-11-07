// Generated from GrammarJack.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarJackParser}.
 */
public interface GrammarJackListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarJackParser#classAxiom}.
	 * @param ctx the parse tree
	 */
	void enterClassAxiom(GrammarJackParser.ClassAxiomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJackParser#classAxiom}.
	 * @param ctx the parse tree
	 */
	void exitClassAxiom(GrammarJackParser.ClassAxiomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarJackParser#classVarDec}.
	 * @param ctx the parse tree
	 */
	void enterClassVarDec(GrammarJackParser.ClassVarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJackParser#classVarDec}.
	 * @param ctx the parse tree
	 */
	void exitClassVarDec(GrammarJackParser.ClassVarDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code entero}
	 * labeled alternative in {@link GrammarJackParser#type}.
	 * @param ctx the parse tree
	 */
	void enterEntero(GrammarJackParser.EnteroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code entero}
	 * labeled alternative in {@link GrammarJackParser#type}.
	 * @param ctx the parse tree
	 */
	void exitEntero(GrammarJackParser.EnteroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caracter}
	 * labeled alternative in {@link GrammarJackParser#type}.
	 * @param ctx the parse tree
	 */
	void enterCaracter(GrammarJackParser.CaracterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caracter}
	 * labeled alternative in {@link GrammarJackParser#type}.
	 * @param ctx the parse tree
	 */
	void exitCaracter(GrammarJackParser.CaracterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleano}
	 * labeled alternative in {@link GrammarJackParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(GrammarJackParser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleano}
	 * labeled alternative in {@link GrammarJackParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(GrammarJackParser.BooleanoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nombreClase}
	 * labeled alternative in {@link GrammarJackParser#type}.
	 * @param ctx the parse tree
	 */
	void enterNombreClase(GrammarJackParser.NombreClaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nombreClase}
	 * labeled alternative in {@link GrammarJackParser#type}.
	 * @param ctx the parse tree
	 */
	void exitNombreClase(GrammarJackParser.NombreClaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarJackParser#subroutineDec}.
	 * @param ctx the parse tree
	 */
	void enterSubroutineDec(GrammarJackParser.SubroutineDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJackParser#subroutineDec}.
	 * @param ctx the parse tree
	 */
	void exitSubroutineDec(GrammarJackParser.SubroutineDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarJackParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(GrammarJackParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJackParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(GrammarJackParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarJackParser#subroutineBody}.
	 * @param ctx the parse tree
	 */
	void enterSubroutineBody(GrammarJackParser.SubroutineBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJackParser#subroutineBody}.
	 * @param ctx the parse tree
	 */
	void exitSubroutineBody(GrammarJackParser.SubroutineBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarJackParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(GrammarJackParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJackParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(GrammarJackParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarJackParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(GrammarJackParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJackParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(GrammarJackParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarJackParser#subroutineName}.
	 * @param ctx the parse tree
	 */
	void enterSubroutineName(GrammarJackParser.SubroutineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJackParser#subroutineName}.
	 * @param ctx the parse tree
	 */
	void exitSubroutineName(GrammarJackParser.SubroutineNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarJackParser#varName}.
	 * @param ctx the parse tree
	 */
	void enterVarName(GrammarJackParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJackParser#varName}.
	 * @param ctx the parse tree
	 */
	void exitVarName(GrammarJackParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarJackParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(GrammarJackParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJackParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(GrammarJackParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operationLet}
	 * labeled alternative in {@link GrammarJackParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterOperationLet(GrammarJackParser.OperationLetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operationLet}
	 * labeled alternative in {@link GrammarJackParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitOperationLet(GrammarJackParser.OperationLetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operationIf}
	 * labeled alternative in {@link GrammarJackParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterOperationIf(GrammarJackParser.OperationIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operationIf}
	 * labeled alternative in {@link GrammarJackParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitOperationIf(GrammarJackParser.OperationIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operationWhile}
	 * labeled alternative in {@link GrammarJackParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterOperationWhile(GrammarJackParser.OperationWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operationWhile}
	 * labeled alternative in {@link GrammarJackParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitOperationWhile(GrammarJackParser.OperationWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operationDo}
	 * labeled alternative in {@link GrammarJackParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterOperationDo(GrammarJackParser.OperationDoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operationDo}
	 * labeled alternative in {@link GrammarJackParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitOperationDo(GrammarJackParser.OperationDoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operationReturn}
	 * labeled alternative in {@link GrammarJackParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterOperationReturn(GrammarJackParser.OperationReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operationReturn}
	 * labeled alternative in {@link GrammarJackParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitOperationReturn(GrammarJackParser.OperationReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarJackParser#letStatement}.
	 * @param ctx the parse tree
	 */
	void enterLetStatement(GrammarJackParser.LetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJackParser#letStatement}.
	 * @param ctx the parse tree
	 */
	void exitLetStatement(GrammarJackParser.LetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarJackParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(GrammarJackParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJackParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(GrammarJackParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarJackParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(GrammarJackParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJackParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(GrammarJackParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarJackParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(GrammarJackParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJackParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(GrammarJackParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarJackParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(GrammarJackParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJackParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(GrammarJackParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarJackParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GrammarJackParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJackParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GrammarJackParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantInt}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 */
	void enterConstantInt(GrammarJackParser.ConstantIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantInt}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 */
	void exitConstantInt(GrammarJackParser.ConstantIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantString}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 */
	void enterConstantString(GrammarJackParser.ConstantStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantString}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 */
	void exitConstantString(GrammarJackParser.ConstantStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantKeyword}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 */
	void enterConstantKeyword(GrammarJackParser.ConstantKeywordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantKeyword}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 */
	void exitConstantKeyword(GrammarJackParser.ConstantKeywordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableName}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(GrammarJackParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableName}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(GrammarJackParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varArray}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 */
	void enterVarArray(GrammarJackParser.VarArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varArray}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 */
	void exitVarArray(GrammarJackParser.VarArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subroutCall}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 */
	void enterSubroutCall(GrammarJackParser.SubroutCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subroutCall}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 */
	void exitSubroutCall(GrammarJackParser.SubroutCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expresionParent}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 */
	void enterExpresionParent(GrammarJackParser.ExpresionParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expresionParent}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 */
	void exitExpresionParent(GrammarJackParser.ExpresionParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOp}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(GrammarJackParser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOp}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(GrammarJackParser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directCall}
	 * labeled alternative in {@link GrammarJackParser#subroutineCall}.
	 * @param ctx the parse tree
	 */
	void enterDirectCall(GrammarJackParser.DirectCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directCall}
	 * labeled alternative in {@link GrammarJackParser#subroutineCall}.
	 * @param ctx the parse tree
	 */
	void exitDirectCall(GrammarJackParser.DirectCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectCall}
	 * labeled alternative in {@link GrammarJackParser#subroutineCall}.
	 * @param ctx the parse tree
	 */
	void enterObjectCall(GrammarJackParser.ObjectCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectCall}
	 * labeled alternative in {@link GrammarJackParser#subroutineCall}.
	 * @param ctx the parse tree
	 */
	void exitObjectCall(GrammarJackParser.ObjectCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarJackParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(GrammarJackParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarJackParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(GrammarJackParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code suma}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterSuma(GrammarJackParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code suma}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitSuma(GrammarJackParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resta}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterResta(GrammarJackParser.RestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resta}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitResta(GrammarJackParser.RestaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterMult(GrammarJackParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitMult(GrammarJackParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code division}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterDivision(GrammarJackParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code division}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitDivision(GrammarJackParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterAnd(GrammarJackParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitAnd(GrammarJackParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOr(GrammarJackParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOr(GrammarJackParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code menor}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterMenor(GrammarJackParser.MenorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code menor}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitMenor(GrammarJackParser.MenorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mayor}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterMayor(GrammarJackParser.MayorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mayor}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitMayor(GrammarJackParser.MayorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code igual}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterIgual(GrammarJackParser.IgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code igual}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitIgual(GrammarJackParser.IgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neg}
	 * labeled alternative in {@link GrammarJackParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterNeg(GrammarJackParser.NegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neg}
	 * labeled alternative in {@link GrammarJackParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitNeg(GrammarJackParser.NegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link GrammarJackParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterNot(GrammarJackParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link GrammarJackParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitNot(GrammarJackParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link GrammarJackParser#keywordConstant}.
	 * @param ctx the parse tree
	 */
	void enterTrue(GrammarJackParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link GrammarJackParser#keywordConstant}.
	 * @param ctx the parse tree
	 */
	void exitTrue(GrammarJackParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link GrammarJackParser#keywordConstant}.
	 * @param ctx the parse tree
	 */
	void enterFalse(GrammarJackParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link GrammarJackParser#keywordConstant}.
	 * @param ctx the parse tree
	 */
	void exitFalse(GrammarJackParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code null}
	 * labeled alternative in {@link GrammarJackParser#keywordConstant}.
	 * @param ctx the parse tree
	 */
	void enterNull(GrammarJackParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code null}
	 * labeled alternative in {@link GrammarJackParser#keywordConstant}.
	 * @param ctx the parse tree
	 */
	void exitNull(GrammarJackParser.NullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code this}
	 * labeled alternative in {@link GrammarJackParser#keywordConstant}.
	 * @param ctx the parse tree
	 */
	void enterThis(GrammarJackParser.ThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code this}
	 * labeled alternative in {@link GrammarJackParser#keywordConstant}.
	 * @param ctx the parse tree
	 */
	void exitThis(GrammarJackParser.ThisContext ctx);
}