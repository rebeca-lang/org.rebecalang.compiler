// Generated from src/main/resources/org/rebecalang/compiler/propertycompiler/grammar/CoreRebecaPropertyComplete.g4 by ANTLR 4.8

	package org.rebecalang.compiler.propertycompiler.corerebeca.compiler;
	import org.rebecalang.compiler.propertycompiler.corerebeca.objectmodel.*;
	import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.Definition;
	import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.AssertionDefinition;
	import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.Label;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	import java.util.*;
	import org.antlr.runtime.BitSet;
	import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link CoreRebecaPropertyCompleteListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class CoreRebecaPropertyCompleteBaseListener implements CoreRebecaPropertyCompleteListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPropertyDefinition(CoreRebecaPropertyCompleteParser.PropertyDefinitionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPropertyDefinition(CoreRebecaPropertyCompleteParser.PropertyDefinitionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAnnotation(CoreRebecaPropertyCompleteParser.AnnotationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAnnotation(CoreRebecaPropertyCompleteParser.AnnotationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterType(CoreRebecaPropertyCompleteParser.TypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitType(CoreRebecaPropertyCompleteParser.TypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterGenericTypeParams(CoreRebecaPropertyCompleteParser.GenericTypeParamsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitGenericTypeParams(CoreRebecaPropertyCompleteParser.GenericTypeParamsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDimensions(CoreRebecaPropertyCompleteParser.DimensionsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDimensions(CoreRebecaPropertyCompleteParser.DimensionsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpression(CoreRebecaPropertyCompleteParser.ExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpression(CoreRebecaPropertyCompleteParser.ExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignmentOperator(CoreRebecaPropertyCompleteParser.AssignmentOperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignmentOperator(CoreRebecaPropertyCompleteParser.AssignmentOperatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMultiplicativeOp(CoreRebecaPropertyCompleteParser.MultiplicativeOpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMultiplicativeOp(CoreRebecaPropertyCompleteParser.MultiplicativeOpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAdditiveOp(CoreRebecaPropertyCompleteParser.AdditiveOpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAdditiveOp(CoreRebecaPropertyCompleteParser.AdditiveOpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRelationalOp(CoreRebecaPropertyCompleteParser.RelationalOpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRelationalOp(CoreRebecaPropertyCompleteParser.RelationalOpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterShiftOp(CoreRebecaPropertyCompleteParser.ShiftOpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitShiftOp(CoreRebecaPropertyCompleteParser.ShiftOpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEqualityOp(CoreRebecaPropertyCompleteParser.EqualityOpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEqualityOp(CoreRebecaPropertyCompleteParser.EqualityOpContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnaryExpression(CoreRebecaPropertyCompleteParser.UnaryExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnaryExpression(CoreRebecaPropertyCompleteParser.UnaryExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCoreExpression(CoreRebecaPropertyCompleteParser.CoreExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCoreExpression(CoreRebecaPropertyCompleteParser.CoreExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCastExpression(CoreRebecaPropertyCompleteParser.CastExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCastExpression(CoreRebecaPropertyCompleteParser.CastExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPrimary(CoreRebecaPropertyCompleteParser.PrimaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimary(CoreRebecaPropertyCompleteParser.PrimaryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpressionList(CoreRebecaPropertyCompleteParser.ExpressionListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpressionList(CoreRebecaPropertyCompleteParser.ExpressionListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLiteral(CoreRebecaPropertyCompleteParser.LiteralContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLiteral(CoreRebecaPropertyCompleteParser.LiteralContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPropertyModel(CoreRebecaPropertyCompleteParser.PropertyModelContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPropertyModel(CoreRebecaPropertyCompleteParser.PropertyModelContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}