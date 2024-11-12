// Generated from /home/gabriel/Desktop/Proj_C/pdraw-t08/src/Pdraw.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PdrawParser}.
 */
public interface PdrawListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PdrawParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PdrawParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PdrawParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PdrawParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PdrawParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#penDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPenDefinition(PdrawParser.PenDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#penDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPenDefinition(PdrawParser.PenDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#penAttributes}.
	 * @param ctx the parse tree
	 */
	void enterPenAttributes(PdrawParser.PenAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#penAttributes}.
	 * @param ctx the parse tree
	 */
	void exitPenAttributes(PdrawParser.PenAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#penAttribute}.
	 * @param ctx the parse tree
	 */
	void enterPenAttribute(PdrawParser.PenAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#penAttribute}.
	 * @param ctx the parse tree
	 */
	void exitPenAttribute(PdrawParser.PenAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#penDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPenDeclaration(PdrawParser.PenDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#penDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPenDeclaration(PdrawParser.PenDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#penExecution}.
	 * @param ctx the parse tree
	 */
	void enterPenExecution(PdrawParser.PenExecutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#penExecution}.
	 * @param ctx the parse tree
	 */
	void exitPenExecution(PdrawParser.PenExecutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(PdrawParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(PdrawParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#penCommand}.
	 * @param ctx the parse tree
	 */
	void enterPenCommand(PdrawParser.PenCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#penCommand}.
	 * @param ctx the parse tree
	 */
	void exitPenCommand(PdrawParser.PenCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#drawCommand}.
	 * @param ctx the parse tree
	 */
	void enterDrawCommand(PdrawParser.DrawCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#drawCommand}.
	 * @param ctx the parse tree
	 */
	void exitDrawCommand(PdrawParser.DrawCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(PdrawParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(PdrawParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(PdrawParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(PdrawParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#outputCommand}.
	 * @param ctx the parse tree
	 */
	void enterOutputCommand(PdrawParser.OutputCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#outputCommand}.
	 * @param ctx the parse tree
	 */
	void exitOutputCommand(PdrawParser.OutputCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#inputCommand}.
	 * @param ctx the parse tree
	 */
	void enterInputCommand(PdrawParser.InputCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#inputCommand}.
	 * @param ctx the parse tree
	 */
	void exitInputCommand(PdrawParser.InputCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PdrawParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PdrawParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#attributeAssign}.
	 * @param ctx the parse tree
	 */
	void enterAttributeAssign(PdrawParser.AttributeAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#attributeAssign}.
	 * @param ctx the parse tree
	 */
	void exitAttributeAssign(PdrawParser.AttributeAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#canvasDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCanvasDefinition(PdrawParser.CanvasDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#canvasDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCanvasDefinition(PdrawParser.CanvasDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PdrawParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PdrawParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(PdrawParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(PdrawParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(PdrawParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(PdrawParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#endStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndStatement(PdrawParser.EndStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#endStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndStatement(PdrawParser.EndStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PdrawParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PdrawParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Degree}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDegree(PdrawParser.DegreeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Degree}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDegree(PdrawParser.DegreeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(PdrawParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(PdrawParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Booleans}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleans(PdrawParser.BooleansContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Booleans}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleans(PdrawParser.BooleansContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Grouping}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGrouping(PdrawParser.GroupingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Grouping}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGrouping(PdrawParser.GroupingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Data}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterData(PdrawParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Data}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitData(PdrawParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Strings}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStrings(PdrawParser.StringsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Strings}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStrings(PdrawParser.StringsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary(PdrawParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary(PdrawParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Function}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunction(PdrawParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Function}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunction(PdrawParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Input}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInput(PdrawParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Input}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInput(PdrawParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Type}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterType(PdrawParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Type}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitType(PdrawParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Plain}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlain(PdrawParser.PlainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plain}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlain(PdrawParser.PlainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Concatenation}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(PdrawParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Concatenation}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(PdrawParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equality}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality(PdrawParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equality}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality(PdrawParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tuple}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTuple(PdrawParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tuple}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTuple(PdrawParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparation}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparation(PdrawParser.ComparationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparation}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparation(PdrawParser.ComparationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arithmetic}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(PdrawParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arithmetic}
	 * labeled alternative in {@link PdrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(PdrawParser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#typeCast}.
	 * @param ctx the parse tree
	 */
	void enterTypeCast(PdrawParser.TypeCastContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#typeCast}.
	 * @param ctx the parse tree
	 */
	void exitTypeCast(PdrawParser.TypeCastContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PdrawParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PdrawParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#degreeExpression}.
	 * @param ctx the parse tree
	 */
	void enterDegreeExpression(PdrawParser.DegreeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#degreeExpression}.
	 * @param ctx the parse tree
	 */
	void exitDegreeExpression(PdrawParser.DegreeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(PdrawParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(PdrawParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#colorExpression}.
	 * @param ctx the parse tree
	 */
	void enterColorExpression(PdrawParser.ColorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#colorExpression}.
	 * @param ctx the parse tree
	 */
	void exitColorExpression(PdrawParser.ColorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PdrawParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PdrawParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PdrawParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PdrawParser.ValueContext ctx);
}