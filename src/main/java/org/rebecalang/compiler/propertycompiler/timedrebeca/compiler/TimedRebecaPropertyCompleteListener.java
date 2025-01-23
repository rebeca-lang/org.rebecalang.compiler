// Generated from src/main/resources/org/rebecalang/compiler/propertycompiler/grammar/TimedRebecaPropertyComplete.g4 by ANTLR 4.8

	package org.rebecalang.compiler.propertycompiler.timedrebeca.compiler;
	import org.rebecalang.compiler.propertycompiler.timedrebeca.objectmodel.*;
	import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.Definition;
	import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.AssertionDefinition;
	import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.Label;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	import java.util.*;
	import org.antlr.runtime.BitSet;
	import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;

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
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#assertionBlock}.
	 * @param ctx the parse tree
	 */
	void enterAssertionBlock(TimedRebecaPropertyCompleteParser.AssertionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#assertionBlock}.
	 * @param ctx the parse tree
	 */
	void exitAssertionBlock(TimedRebecaPropertyCompleteParser.AssertionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#tctlBlock}.
	 * @param ctx the parse tree
	 */
	void enterTctlBlock(TimedRebecaPropertyCompleteParser.TctlBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#tctlBlock}.
	 * @param ctx the parse tree
	 */
	void exitTctlBlock(TimedRebecaPropertyCompleteParser.TctlBlockContext ctx);
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
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOp(TimedRebecaPropertyCompleteParser.MultiplicativeOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOp(TimedRebecaPropertyCompleteParser.MultiplicativeOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#additiveOp}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOp(TimedRebecaPropertyCompleteParser.AdditiveOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#additiveOp}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOp(TimedRebecaPropertyCompleteParser.AdditiveOpContext ctx);
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
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#equalityOp}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOp(TimedRebecaPropertyCompleteParser.EqualityOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#equalityOp}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOp(TimedRebecaPropertyCompleteParser.EqualityOpContext ctx);
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
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#coreExpression}.
	 * @param ctx the parse tree
	 */
	void enterCoreExpression(TimedRebecaPropertyCompleteParser.CoreExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#coreExpression}.
	 * @param ctx the parse tree
	 */
	void exitCoreExpression(TimedRebecaPropertyCompleteParser.CoreExpressionContext ctx);
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