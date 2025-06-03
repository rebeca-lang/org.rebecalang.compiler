// Generated from src/main/resources/org/rebecalang/compiler/propertycompiler/grammar/CoreRebecaPropertyComplete.g4 by ANTLR 4.8

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
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#assertionBlock}.
	 * @param ctx the parse tree
	 */
	void enterAssertionBlock(CoreRebecaPropertyCompleteParser.AssertionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#assertionBlock}.
	 * @param ctx the parse tree
	 */
	void exitAssertionBlock(CoreRebecaPropertyCompleteParser.AssertionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#ltlBlock}.
	 * @param ctx the parse tree
	 */
	void enterLtlBlock(CoreRebecaPropertyCompleteParser.LtlBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#ltlBlock}.
	 * @param ctx the parse tree
	 */
	void exitLtlBlock(CoreRebecaPropertyCompleteParser.LtlBlockContext ctx);
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
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#propertyModel}.
	 * @param ctx the parse tree
	 */
	void enterPropertyModel(CoreRebecaPropertyCompleteParser.PropertyModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#propertyModel}.
	 * @param ctx the parse tree
	 */
	void exitPropertyModel(CoreRebecaPropertyCompleteParser.PropertyModelContext ctx);
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
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOp(CoreRebecaPropertyCompleteParser.MultiplicativeOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOp(CoreRebecaPropertyCompleteParser.MultiplicativeOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#additiveOp}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOp(CoreRebecaPropertyCompleteParser.AdditiveOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#additiveOp}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOp(CoreRebecaPropertyCompleteParser.AdditiveOpContext ctx);
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
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#equalityOp}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOp(CoreRebecaPropertyCompleteParser.EqualityOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#equalityOp}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOp(CoreRebecaPropertyCompleteParser.EqualityOpContext ctx);
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
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#extendableExpression}.
	 * @param ctx the parse tree
	 */
	void enterExtendableExpression(CoreRebecaPropertyCompleteParser.ExtendableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#extendableExpression}.
	 * @param ctx the parse tree
	 */
	void exitExtendableExpression(CoreRebecaPropertyCompleteParser.ExtendableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#coreExpression}.
	 * @param ctx the parse tree
	 */
	void enterCoreExpression(CoreRebecaPropertyCompleteParser.CoreExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#coreExpression}.
	 * @param ctx the parse tree
	 */
	void exitCoreExpression(CoreRebecaPropertyCompleteParser.CoreExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#rebecInstantiationExpression}.
	 * @param ctx the parse tree
	 */
	void enterRebecInstantiationExpression(CoreRebecaPropertyCompleteParser.RebecInstantiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#rebecInstantiationExpression}.
	 * @param ctx the parse tree
	 */
	void exitRebecInstantiationExpression(CoreRebecaPropertyCompleteParser.RebecInstantiationExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#annotatedExpression}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedExpression(CoreRebecaPropertyCompleteParser.AnnotatedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#annotatedExpression}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedExpression(CoreRebecaPropertyCompleteParser.AnnotatedExpressionContext ctx);
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
}