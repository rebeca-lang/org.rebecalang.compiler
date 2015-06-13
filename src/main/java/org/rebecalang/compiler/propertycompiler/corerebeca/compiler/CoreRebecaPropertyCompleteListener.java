// Generated from src/main/resources/org/rebecalang/compiler/propertycompiler/grammar/CoreRebecaPropertyComplete.g4 by ANTLR 4.0

	package org.rebecalang.compiler.propertycompiler.corerebeca.compiler;
	import org.rebecalang.compiler.propertycompiler.corerebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	import java.util.*;
	import org.antlr.runtime.BitSet;
	import org.rebecalang.compiler.utils.TypesUtilities;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface CoreRebecaPropertyCompleteListener extends ParseTreeListener {
	void enterAssignmentOperator(CoreRebecaPropertyCompleteParser.AssignmentOperatorContext ctx);
	void exitAssignmentOperator(CoreRebecaPropertyCompleteParser.AssignmentOperatorContext ctx);

	void enterExpression(CoreRebecaPropertyCompleteParser.ExpressionContext ctx);
	void exitExpression(CoreRebecaPropertyCompleteParser.ExpressionContext ctx);

	void enterRelationalOp(CoreRebecaPropertyCompleteParser.RelationalOpContext ctx);
	void exitRelationalOp(CoreRebecaPropertyCompleteParser.RelationalOpContext ctx);

	void enterShiftOp(CoreRebecaPropertyCompleteParser.ShiftOpContext ctx);
	void exitShiftOp(CoreRebecaPropertyCompleteParser.ShiftOpContext ctx);

	void enterUnaryExpression(CoreRebecaPropertyCompleteParser.UnaryExpressionContext ctx);
	void exitUnaryExpression(CoreRebecaPropertyCompleteParser.UnaryExpressionContext ctx);

	void enterExpressionList(CoreRebecaPropertyCompleteParser.ExpressionListContext ctx);
	void exitExpressionList(CoreRebecaPropertyCompleteParser.ExpressionListContext ctx);

	void enterUnaryExpressionNotPlusMinus(CoreRebecaPropertyCompleteParser.UnaryExpressionNotPlusMinusContext ctx);
	void exitUnaryExpressionNotPlusMinus(CoreRebecaPropertyCompleteParser.UnaryExpressionNotPlusMinusContext ctx);

	void enterType(CoreRebecaPropertyCompleteParser.TypeContext ctx);
	void exitType(CoreRebecaPropertyCompleteParser.TypeContext ctx);

	void enterConditionalExpression(CoreRebecaPropertyCompleteParser.ConditionalExpressionContext ctx);
	void exitConditionalExpression(CoreRebecaPropertyCompleteParser.ConditionalExpressionContext ctx);

	void enterAndExpression(CoreRebecaPropertyCompleteParser.AndExpressionContext ctx);
	void exitAndExpression(CoreRebecaPropertyCompleteParser.AndExpressionContext ctx);

	void enterRelationalExpression(CoreRebecaPropertyCompleteParser.RelationalExpressionContext ctx);
	void exitRelationalExpression(CoreRebecaPropertyCompleteParser.RelationalExpressionContext ctx);

	void enterPrimary(CoreRebecaPropertyCompleteParser.PrimaryContext ctx);
	void exitPrimary(CoreRebecaPropertyCompleteParser.PrimaryContext ctx);

	void enterDimensions(CoreRebecaPropertyCompleteParser.DimensionsContext ctx);
	void exitDimensions(CoreRebecaPropertyCompleteParser.DimensionsContext ctx);

	void enterConditionalOrExpression(CoreRebecaPropertyCompleteParser.ConditionalOrExpressionContext ctx);
	void exitConditionalOrExpression(CoreRebecaPropertyCompleteParser.ConditionalOrExpressionContext ctx);

	void enterShiftExpression(CoreRebecaPropertyCompleteParser.ShiftExpressionContext ctx);
	void exitShiftExpression(CoreRebecaPropertyCompleteParser.ShiftExpressionContext ctx);

	void enterConditionalAndExpression(CoreRebecaPropertyCompleteParser.ConditionalAndExpressionContext ctx);
	void exitConditionalAndExpression(CoreRebecaPropertyCompleteParser.ConditionalAndExpressionContext ctx);

	void enterAdditiveExpression(CoreRebecaPropertyCompleteParser.AdditiveExpressionContext ctx);
	void exitAdditiveExpression(CoreRebecaPropertyCompleteParser.AdditiveExpressionContext ctx);

	void enterExclusiveOrExpression(CoreRebecaPropertyCompleteParser.ExclusiveOrExpressionContext ctx);
	void exitExclusiveOrExpression(CoreRebecaPropertyCompleteParser.ExclusiveOrExpressionContext ctx);

	void enterInclusiveOrExpression(CoreRebecaPropertyCompleteParser.InclusiveOrExpressionContext ctx);
	void exitInclusiveOrExpression(CoreRebecaPropertyCompleteParser.InclusiveOrExpressionContext ctx);

	void enterInstanceOfExpression(CoreRebecaPropertyCompleteParser.InstanceOfExpressionContext ctx);
	void exitInstanceOfExpression(CoreRebecaPropertyCompleteParser.InstanceOfExpressionContext ctx);

	void enterEqualityExpression(CoreRebecaPropertyCompleteParser.EqualityExpressionContext ctx);
	void exitEqualityExpression(CoreRebecaPropertyCompleteParser.EqualityExpressionContext ctx);

	void enterCastExpression(CoreRebecaPropertyCompleteParser.CastExpressionContext ctx);
	void exitCastExpression(CoreRebecaPropertyCompleteParser.CastExpressionContext ctx);

	void enterPropertyModel(CoreRebecaPropertyCompleteParser.PropertyModelContext ctx);
	void exitPropertyModel(CoreRebecaPropertyCompleteParser.PropertyModelContext ctx);

	void enterMultiplicativeExpression(CoreRebecaPropertyCompleteParser.MultiplicativeExpressionContext ctx);
	void exitMultiplicativeExpression(CoreRebecaPropertyCompleteParser.MultiplicativeExpressionContext ctx);

	void enterLiteral(CoreRebecaPropertyCompleteParser.LiteralContext ctx);
	void exitLiteral(CoreRebecaPropertyCompleteParser.LiteralContext ctx);
}