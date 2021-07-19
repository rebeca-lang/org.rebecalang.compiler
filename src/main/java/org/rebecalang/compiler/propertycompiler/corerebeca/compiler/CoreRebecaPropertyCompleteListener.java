// Generated from src/main/resources/org/rebecalang/compiler/propertycompiler/grammar/CoreRebecaPropertyComplete.g4 by ANTLR 4.7.1

	package org.rebecalang.compiler.propertycompiler.corerebeca.compiler;
	import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoreRebecaPropertyCompleteParser}.
 */
public interface CoreRebecaPropertyCompleteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDefinition(CoreRebecaPropertyCompleteParser.PropertyDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDefinition(CoreRebecaPropertyCompleteParser.PropertyDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(CoreRebecaPropertyCompleteParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(CoreRebecaPropertyCompleteParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CoreRebecaPropertyCompleteParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CoreRebecaPropertyCompleteParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#genericTypeParams}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeParams(CoreRebecaPropertyCompleteParser.GenericTypeParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#genericTypeParams}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeParams(CoreRebecaPropertyCompleteParser.GenericTypeParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void enterDimensions(CoreRebecaPropertyCompleteParser.DimensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void exitDimensions(CoreRebecaPropertyCompleteParser.DimensionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CoreRebecaPropertyCompleteParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CoreRebecaPropertyCompleteParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(CoreRebecaPropertyCompleteParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(CoreRebecaPropertyCompleteParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(CoreRebecaPropertyCompleteParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(CoreRebecaPropertyCompleteParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(CoreRebecaPropertyCompleteParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(CoreRebecaPropertyCompleteParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(CoreRebecaPropertyCompleteParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(CoreRebecaPropertyCompleteParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(CoreRebecaPropertyCompleteParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(CoreRebecaPropertyCompleteParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(CoreRebecaPropertyCompleteParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(CoreRebecaPropertyCompleteParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(CoreRebecaPropertyCompleteParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(CoreRebecaPropertyCompleteParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(CoreRebecaPropertyCompleteParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(CoreRebecaPropertyCompleteParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOfExpression(CoreRebecaPropertyCompleteParser.InstanceOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOfExpression(CoreRebecaPropertyCompleteParser.InstanceOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(CoreRebecaPropertyCompleteParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(CoreRebecaPropertyCompleteParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(CoreRebecaPropertyCompleteParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(CoreRebecaPropertyCompleteParser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(CoreRebecaPropertyCompleteParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(CoreRebecaPropertyCompleteParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void enterShiftOp(CoreRebecaPropertyCompleteParser.ShiftOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void exitShiftOp(CoreRebecaPropertyCompleteParser.ShiftOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(CoreRebecaPropertyCompleteParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(CoreRebecaPropertyCompleteParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(CoreRebecaPropertyCompleteParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(CoreRebecaPropertyCompleteParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CoreRebecaPropertyCompleteParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CoreRebecaPropertyCompleteParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(CoreRebecaPropertyCompleteParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(CoreRebecaPropertyCompleteParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(CoreRebecaPropertyCompleteParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(CoreRebecaPropertyCompleteParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(CoreRebecaPropertyCompleteParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(CoreRebecaPropertyCompleteParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(CoreRebecaPropertyCompleteParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(CoreRebecaPropertyCompleteParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CoreRebecaPropertyCompleteParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CoreRebecaPropertyCompleteParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#propertyModel}.
	 * @param ctx the parse tree
	 */
	void enterPropertyModel(CoreRebecaPropertyCompleteParser.PropertyModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#propertyModel}.
	 * @param ctx the parse tree
	 */
	void exitPropertyModel(CoreRebecaPropertyCompleteParser.PropertyModelContext ctx);
}