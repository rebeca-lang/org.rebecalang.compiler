// Generated from src/main/resources/org/rebecalang/compiler/propertycompiler/grammar/TimedRebecaPropertyComplete.g4 by ANTLR 4.2

	package org.rebecalang.compiler.propertycompiler.timedrebeca.compiler;
	import org.rebecalang.compiler.propertycompiler.timedrebeca.objectmodel.*;
	import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.Definition;
	import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.AssertionDefinition;
	import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.Annotation;
	import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.Label;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	import java.util.*;
	import org.antlr.runtime.BitSet;
	import org.rebecalang.compiler.utils.TypesUtilities;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TimedRebecaPropertyCompleteParser}.
 */
public interface TimedRebecaPropertyCompleteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull TimedRebecaPropertyCompleteParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull TimedRebecaPropertyCompleteParser.AdditiveExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(@NotNull TimedRebecaPropertyCompleteParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(@NotNull TimedRebecaPropertyCompleteParser.RelationalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(@NotNull TimedRebecaPropertyCompleteParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(@NotNull TimedRebecaPropertyCompleteParser.AssignmentOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDefinition(@NotNull TimedRebecaPropertyCompleteParser.PropertyDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDefinition(@NotNull TimedRebecaPropertyCompleteParser.PropertyDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull TimedRebecaPropertyCompleteParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull TimedRebecaPropertyCompleteParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull TimedRebecaPropertyCompleteParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull TimedRebecaPropertyCompleteParser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(@NotNull TimedRebecaPropertyCompleteParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(@NotNull TimedRebecaPropertyCompleteParser.UnaryExpressionNotPlusMinusContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(@NotNull TimedRebecaPropertyCompleteParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(@NotNull TimedRebecaPropertyCompleteParser.CastExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull TimedRebecaPropertyCompleteParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull TimedRebecaPropertyCompleteParser.AndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(@NotNull TimedRebecaPropertyCompleteParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(@NotNull TimedRebecaPropertyCompleteParser.ConditionalOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#genericTypes}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypes(@NotNull TimedRebecaPropertyCompleteParser.GenericTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#genericTypes}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypes(@NotNull TimedRebecaPropertyCompleteParser.GenericTypesContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull TimedRebecaPropertyCompleteParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull TimedRebecaPropertyCompleteParser.UnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOfExpression(@NotNull TimedRebecaPropertyCompleteParser.InstanceOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOfExpression(@NotNull TimedRebecaPropertyCompleteParser.InstanceOfExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void enterShiftOp(@NotNull TimedRebecaPropertyCompleteParser.ShiftOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void exitShiftOp(@NotNull TimedRebecaPropertyCompleteParser.ShiftOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull TimedRebecaPropertyCompleteParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull TimedRebecaPropertyCompleteParser.AnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull TimedRebecaPropertyCompleteParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull TimedRebecaPropertyCompleteParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(@NotNull TimedRebecaPropertyCompleteParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(@NotNull TimedRebecaPropertyCompleteParser.ShiftExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(@NotNull TimedRebecaPropertyCompleteParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(@NotNull TimedRebecaPropertyCompleteParser.ConditionalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(@NotNull TimedRebecaPropertyCompleteParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(@NotNull TimedRebecaPropertyCompleteParser.InclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#propertyModel}.
	 * @param ctx the parse tree
	 */
	void enterPropertyModel(@NotNull TimedRebecaPropertyCompleteParser.PropertyModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#propertyModel}.
	 * @param ctx the parse tree
	 */
	void exitPropertyModel(@NotNull TimedRebecaPropertyCompleteParser.PropertyModelContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(@NotNull TimedRebecaPropertyCompleteParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(@NotNull TimedRebecaPropertyCompleteParser.ConditionalAndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull TimedRebecaPropertyCompleteParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull TimedRebecaPropertyCompleteParser.MultiplicativeExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull TimedRebecaPropertyCompleteParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull TimedRebecaPropertyCompleteParser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(@NotNull TimedRebecaPropertyCompleteParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(@NotNull TimedRebecaPropertyCompleteParser.RelationalOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(@NotNull TimedRebecaPropertyCompleteParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(@NotNull TimedRebecaPropertyCompleteParser.ExclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(@NotNull TimedRebecaPropertyCompleteParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(@NotNull TimedRebecaPropertyCompleteParser.EqualityExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void enterDimensions(@NotNull TimedRebecaPropertyCompleteParser.DimensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void exitDimensions(@NotNull TimedRebecaPropertyCompleteParser.DimensionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaPropertyCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull TimedRebecaPropertyCompleteParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaPropertyCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull TimedRebecaPropertyCompleteParser.PrimaryContext ctx);
}