// Generated from src/main/resources/org/rebecalang/compiler/propertycompiler/grammar/TimedRebecaPropertyComplete.g4 by ANTLR 4.7.1

	package org.rebecalang.compiler.propertycompiler.timedrebeca.compiler;
	import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TimedRebecaPropertyCompleteParser}.
 */
public interface TimedRebecaPropertyCompleteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDefinition(TimedRebecaPropertyCompleteParser.PropertyDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDefinition(TimedRebecaPropertyCompleteParser.PropertyDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(TimedRebecaPropertyCompleteParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(TimedRebecaPropertyCompleteParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TimedRebecaPropertyCompleteParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TimedRebecaPropertyCompleteParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#genericTypeParams}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeParams(TimedRebecaPropertyCompleteParser.GenericTypeParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#genericTypeParams}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeParams(TimedRebecaPropertyCompleteParser.GenericTypeParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void enterDimensions(TimedRebecaPropertyCompleteParser.DimensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void exitDimensions(TimedRebecaPropertyCompleteParser.DimensionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TimedRebecaPropertyCompleteParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TimedRebecaPropertyCompleteParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(TimedRebecaPropertyCompleteParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(TimedRebecaPropertyCompleteParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(TimedRebecaPropertyCompleteParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(TimedRebecaPropertyCompleteParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(TimedRebecaPropertyCompleteParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(TimedRebecaPropertyCompleteParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(TimedRebecaPropertyCompleteParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(TimedRebecaPropertyCompleteParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(TimedRebecaPropertyCompleteParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(TimedRebecaPropertyCompleteParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(TimedRebecaPropertyCompleteParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(TimedRebecaPropertyCompleteParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(TimedRebecaPropertyCompleteParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(TimedRebecaPropertyCompleteParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(TimedRebecaPropertyCompleteParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(TimedRebecaPropertyCompleteParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOfExpression(TimedRebecaPropertyCompleteParser.InstanceOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOfExpression(TimedRebecaPropertyCompleteParser.InstanceOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(TimedRebecaPropertyCompleteParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(TimedRebecaPropertyCompleteParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(TimedRebecaPropertyCompleteParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(TimedRebecaPropertyCompleteParser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(TimedRebecaPropertyCompleteParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(TimedRebecaPropertyCompleteParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void enterShiftOp(TimedRebecaPropertyCompleteParser.ShiftOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void exitShiftOp(TimedRebecaPropertyCompleteParser.ShiftOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(TimedRebecaPropertyCompleteParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(TimedRebecaPropertyCompleteParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(TimedRebecaPropertyCompleteParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(TimedRebecaPropertyCompleteParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(TimedRebecaPropertyCompleteParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(TimedRebecaPropertyCompleteParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(TimedRebecaPropertyCompleteParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(TimedRebecaPropertyCompleteParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(TimedRebecaPropertyCompleteParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(TimedRebecaPropertyCompleteParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(TimedRebecaPropertyCompleteParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(TimedRebecaPropertyCompleteParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(TimedRebecaPropertyCompleteParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(TimedRebecaPropertyCompleteParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TimedRebecaPropertyCompleteParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TimedRebecaPropertyCompleteParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#propertyModel}.
	 * @param ctx the parse tree
	 */
	void enterPropertyModel(TimedRebecaPropertyCompleteParser.PropertyModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#propertyModel}.
	 * @param ctx the parse tree
	 */
	void exitPropertyModel(TimedRebecaPropertyCompleteParser.PropertyModelContext ctx);
}