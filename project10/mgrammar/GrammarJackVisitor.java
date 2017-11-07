// Generated from GrammarJack.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarJackParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarJackVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarJackParser#classAxiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassAxiom(GrammarJackParser.ClassAxiomContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarJackParser#classVarDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVarDec(GrammarJackParser.ClassVarDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code entero}
	 * labeled alternative in {@link GrammarJackParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntero(GrammarJackParser.EnteroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caracter}
	 * labeled alternative in {@link GrammarJackParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaracter(GrammarJackParser.CaracterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleano}
	 * labeled alternative in {@link GrammarJackParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleano(GrammarJackParser.BooleanoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nombreClase}
	 * labeled alternative in {@link GrammarJackParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombreClase(GrammarJackParser.NombreClaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarJackParser#subroutineDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutineDec(GrammarJackParser.SubroutineDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarJackParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(GrammarJackParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarJackParser#subroutineBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutineBody(GrammarJackParser.SubroutineBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarJackParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(GrammarJackParser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarJackParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(GrammarJackParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarJackParser#subroutineName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutineName(GrammarJackParser.SubroutineNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarJackParser#varName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarName(GrammarJackParser.VarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarJackParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(GrammarJackParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operationLet}
	 * labeled alternative in {@link GrammarJackParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationLet(GrammarJackParser.OperationLetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operationIf}
	 * labeled alternative in {@link GrammarJackParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationIf(GrammarJackParser.OperationIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operationWhile}
	 * labeled alternative in {@link GrammarJackParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationWhile(GrammarJackParser.OperationWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operationDo}
	 * labeled alternative in {@link GrammarJackParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationDo(GrammarJackParser.OperationDoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operationReturn}
	 * labeled alternative in {@link GrammarJackParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationReturn(GrammarJackParser.OperationReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarJackParser#letStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetStatement(GrammarJackParser.LetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarJackParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(GrammarJackParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarJackParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(GrammarJackParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarJackParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(GrammarJackParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarJackParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(GrammarJackParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarJackParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GrammarJackParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantInt}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantInt(GrammarJackParser.ConstantIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantString}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantString(GrammarJackParser.ConstantStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantKeyword}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantKeyword(GrammarJackParser.ConstantKeywordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableName}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(GrammarJackParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varArray}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarArray(GrammarJackParser.VarArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subroutCall}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutCall(GrammarJackParser.SubroutCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expresionParent}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionParent(GrammarJackParser.ExpresionParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOp}
	 * labeled alternative in {@link GrammarJackParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(GrammarJackParser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directCall}
	 * labeled alternative in {@link GrammarJackParser#subroutineCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectCall(GrammarJackParser.DirectCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectCall}
	 * labeled alternative in {@link GrammarJackParser#subroutineCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectCall(GrammarJackParser.ObjectCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarJackParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(GrammarJackParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code suma}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(GrammarJackParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resta}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResta(GrammarJackParser.RestaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(GrammarJackParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code division}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(GrammarJackParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(GrammarJackParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(GrammarJackParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code menor}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenor(GrammarJackParser.MenorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mayor}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayor(GrammarJackParser.MayorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code igual}
	 * labeled alternative in {@link GrammarJackParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgual(GrammarJackParser.IgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code neg}
	 * labeled alternative in {@link GrammarJackParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg(GrammarJackParser.NegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link GrammarJackParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(GrammarJackParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link GrammarJackParser#keywordConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(GrammarJackParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link GrammarJackParser#keywordConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(GrammarJackParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code null}
	 * labeled alternative in {@link GrammarJackParser#keywordConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(GrammarJackParser.NullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code this}
	 * labeled alternative in {@link GrammarJackParser#keywordConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThis(GrammarJackParser.ThisContext ctx);
}