// Generated from src/main/resources/org/rebecalang/compiler/propertycompiler/grammar/CoreRebecaPropertyComplete.g4 by ANTLR 4.2

	package org.rebecalang.compiler.propertycompiler.corerebeca.compiler;
	import org.rebecalang.compiler.propertycompiler.corerebeca.objectmodel.*;
	import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.Definition;
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
 * {@link CoreRebecaPropertyCompleteParser}.
 */
public interface CoreRebecaPropertyCompleteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(@NotNull CoreRebecaPropertyCompleteParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(@NotNull CoreRebecaPropertyCompleteParser.AssignmentOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull CoreRebecaPropertyCompleteParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull CoreRebecaPropertyCompleteParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(@NotNull CoreRebecaPropertyCompleteParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(@NotNull CoreRebecaPropertyCompleteParser.RelationalOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void enterShiftOp(@NotNull CoreRebecaPropertyCompleteParser.ShiftOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void exitShiftOp(@NotNull CoreRebecaPropertyCompleteParser.ShiftOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull CoreRebecaPropertyCompleteParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull CoreRebecaPropertyCompleteParser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull CoreRebecaPropertyCompleteParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull CoreRebecaPropertyCompleteParser.UnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(@NotNull CoreRebecaPropertyCompleteParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(@NotNull CoreRebecaPropertyCompleteParser.UnaryExpressionNotPlusMinusContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull CoreRebecaPropertyCompleteParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull CoreRebecaPropertyCompleteParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(@NotNull CoreRebecaPropertyCompleteParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(@NotNull CoreRebecaPropertyCompleteParser.ConditionalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull CoreRebecaPropertyCompleteParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull CoreRebecaPropertyCompleteParser.AndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull CoreRebecaPropertyCompleteParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull CoreRebecaPropertyCompleteParser.AnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(@NotNull CoreRebecaPropertyCompleteParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(@NotNull CoreRebecaPropertyCompleteParser.RelationalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull CoreRebecaPropertyCompleteParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull CoreRebecaPropertyCompleteParser.PrimaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(@NotNull CoreRebecaPropertyCompleteParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(@NotNull CoreRebecaPropertyCompleteParser.ConditionalOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void enterDimensions(@NotNull CoreRebecaPropertyCompleteParser.DimensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void exitDimensions(@NotNull CoreRebecaPropertyCompleteParser.DimensionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(@NotNull CoreRebecaPropertyCompleteParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(@NotNull CoreRebecaPropertyCompleteParser.ShiftExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(@NotNull CoreRebecaPropertyCompleteParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(@NotNull CoreRebecaPropertyCompleteParser.ConditionalAndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDefinition(@NotNull CoreRebecaPropertyCompleteParser.PropertyDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDefinition(@NotNull CoreRebecaPropertyCompleteParser.PropertyDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull CoreRebecaPropertyCompleteParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull CoreRebecaPropertyCompleteParser.AdditiveExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(@NotNull CoreRebecaPropertyCompleteParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(@NotNull CoreRebecaPropertyCompleteParser.ExclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(@NotNull CoreRebecaPropertyCompleteParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(@NotNull CoreRebecaPropertyCompleteParser.InclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOfExpression(@NotNull CoreRebecaPropertyCompleteParser.InstanceOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOfExpression(@NotNull CoreRebecaPropertyCompleteParser.InstanceOfExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(@NotNull CoreRebecaPropertyCompleteParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(@NotNull CoreRebecaPropertyCompleteParser.EqualityExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(@NotNull CoreRebecaPropertyCompleteParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(@NotNull CoreRebecaPropertyCompleteParser.CastExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#propertyModel}.
	 * @param ctx the parse tree
	 */
	void enterPropertyModel(@NotNull CoreRebecaPropertyCompleteParser.PropertyModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#propertyModel}.
	 * @param ctx the parse tree
	 */
	void exitPropertyModel(@NotNull CoreRebecaPropertyCompleteParser.PropertyModelContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull CoreRebecaPropertyCompleteParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull CoreRebecaPropertyCompleteParser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaPropertyCompleteParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull CoreRebecaPropertyCompleteParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaPropertyCompleteParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull CoreRebecaPropertyCompleteParser.MultiplicativeExpressionContext ctx);
}