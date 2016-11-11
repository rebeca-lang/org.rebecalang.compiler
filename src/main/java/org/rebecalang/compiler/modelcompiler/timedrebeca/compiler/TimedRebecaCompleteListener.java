// Generated from src/main/resources/org/rebecalang/compiler/modelcompiler/grammar/TimedRebecaComplete.g4 by ANTLR 4.2

	package org.rebecalang.compiler.modelcompiler.timedrebeca.compiler;
	import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	import java.util.*;
	import org.antlr.runtime.BitSet;
	import org.rebecalang.compiler.utils.TypesUtilities;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TimedRebecaCompleteParser}.
 */
public interface TimedRebecaCompleteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull TimedRebecaCompleteParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull TimedRebecaCompleteParser.VariableDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull TimedRebecaCompleteParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull TimedRebecaCompleteParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(@NotNull TimedRebecaCompleteParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(@NotNull TimedRebecaCompleteParser.RelationalOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull TimedRebecaCompleteParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull TimedRebecaCompleteParser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull TimedRebecaCompleteParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull TimedRebecaCompleteParser.UnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull TimedRebecaCompleteParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull TimedRebecaCompleteParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull TimedRebecaCompleteParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull TimedRebecaCompleteParser.AnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull TimedRebecaCompleteParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull TimedRebecaCompleteParser.PrimaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(@NotNull TimedRebecaCompleteParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(@NotNull TimedRebecaCompleteParser.ShiftExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull TimedRebecaCompleteParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull TimedRebecaCompleteParser.ImportDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#rebecaCode}.
	 * @param ctx the parse tree
	 */
	void enterRebecaCode(@NotNull TimedRebecaCompleteParser.RebecaCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#rebecaCode}.
	 * @param ctx the parse tree
	 */
	void exitRebecaCode(@NotNull TimedRebecaCompleteParser.RebecaCodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#formalParametersDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFormalParametersDeclaration(@NotNull TimedRebecaCompleteParser.FormalParametersDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#formalParametersDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFormalParametersDeclaration(@NotNull TimedRebecaCompleteParser.FormalParametersDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(@NotNull TimedRebecaCompleteParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(@NotNull TimedRebecaCompleteParser.PackageDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(@NotNull TimedRebecaCompleteParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(@NotNull TimedRebecaCompleteParser.ConditionalAndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(@NotNull TimedRebecaCompleteParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(@NotNull TimedRebecaCompleteParser.VariableDeclaratorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull TimedRebecaCompleteParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull TimedRebecaCompleteParser.AdditiveExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(@NotNull TimedRebecaCompleteParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(@NotNull TimedRebecaCompleteParser.SwitchBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull TimedRebecaCompleteParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull TimedRebecaCompleteParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(@NotNull TimedRebecaCompleteParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(@NotNull TimedRebecaCompleteParser.ExclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOfExpression(@NotNull TimedRebecaCompleteParser.InstanceOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOfExpression(@NotNull TimedRebecaCompleteParser.InstanceOfExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#msgsrvDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMsgsrvDeclaration(@NotNull TimedRebecaCompleteParser.MsgsrvDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#msgsrvDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMsgsrvDeclaration(@NotNull TimedRebecaCompleteParser.MsgsrvDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull TimedRebecaCompleteParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull TimedRebecaCompleteParser.MultiplicativeExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(@NotNull TimedRebecaCompleteParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(@NotNull TimedRebecaCompleteParser.AssignmentOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void enterShiftOp(@NotNull TimedRebecaCompleteParser.ShiftOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void exitShiftOp(@NotNull TimedRebecaCompleteParser.ShiftOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull TimedRebecaCompleteParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull TimedRebecaCompleteParser.StatementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(@NotNull TimedRebecaCompleteParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(@NotNull TimedRebecaCompleteParser.UnaryExpressionNotPlusMinusContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull TimedRebecaCompleteParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull TimedRebecaCompleteParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull TimedRebecaCompleteParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull TimedRebecaCompleteParser.VariableInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#formalParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDeclaration(@NotNull TimedRebecaCompleteParser.FormalParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#formalParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDeclaration(@NotNull TimedRebecaCompleteParser.FormalParameterDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#mainRebecDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMainRebecDefinition(@NotNull TimedRebecaCompleteParser.MainRebecDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#mainRebecDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMainRebecDefinition(@NotNull TimedRebecaCompleteParser.MainRebecDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(@NotNull TimedRebecaCompleteParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(@NotNull TimedRebecaCompleteParser.ConditionalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull TimedRebecaCompleteParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull TimedRebecaCompleteParser.AndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#rebecaModel}.
	 * @param ctx the parse tree
	 */
	void enterRebecaModel(@NotNull TimedRebecaCompleteParser.RebecaModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#rebecaModel}.
	 * @param ctx the parse tree
	 */
	void exitRebecaModel(@NotNull TimedRebecaCompleteParser.RebecaModelContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(@NotNull TimedRebecaCompleteParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(@NotNull TimedRebecaCompleteParser.FieldDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(@NotNull TimedRebecaCompleteParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(@NotNull TimedRebecaCompleteParser.RelationalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void enterDimensions(@NotNull TimedRebecaCompleteParser.DimensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void exitDimensions(@NotNull TimedRebecaCompleteParser.DimensionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(@NotNull TimedRebecaCompleteParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(@NotNull TimedRebecaCompleteParser.ConditionalOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#synchMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSynchMethodDeclaration(@NotNull TimedRebecaCompleteParser.SynchMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#synchMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSynchMethodDeclaration(@NotNull TimedRebecaCompleteParser.SynchMethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#environmentVariables}.
	 * @param ctx the parse tree
	 */
	void enterEnvironmentVariables(@NotNull TimedRebecaCompleteParser.EnvironmentVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#environmentVariables}.
	 * @param ctx the parse tree
	 */
	void exitEnvironmentVariables(@NotNull TimedRebecaCompleteParser.EnvironmentVariablesContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull TimedRebecaCompleteParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull TimedRebecaCompleteParser.MethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(@NotNull TimedRebecaCompleteParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(@NotNull TimedRebecaCompleteParser.ConstructorDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#reactiveClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterReactiveClassDeclaration(@NotNull TimedRebecaCompleteParser.ReactiveClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#reactiveClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitReactiveClassDeclaration(@NotNull TimedRebecaCompleteParser.ReactiveClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRecordDeclaration(@NotNull TimedRebecaCompleteParser.RecordDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRecordDeclaration(@NotNull TimedRebecaCompleteParser.RecordDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(@NotNull TimedRebecaCompleteParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(@NotNull TimedRebecaCompleteParser.InclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainDeclaration(@NotNull TimedRebecaCompleteParser.MainDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainDeclaration(@NotNull TimedRebecaCompleteParser.MainDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(@NotNull TimedRebecaCompleteParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(@NotNull TimedRebecaCompleteParser.EqualityExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(@NotNull TimedRebecaCompleteParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(@NotNull TimedRebecaCompleteParser.ArrayInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull TimedRebecaCompleteParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull TimedRebecaCompleteParser.FormalParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(@NotNull TimedRebecaCompleteParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(@NotNull TimedRebecaCompleteParser.CastExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull TimedRebecaCompleteParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull TimedRebecaCompleteParser.ForInitContext ctx);

	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull TimedRebecaCompleteParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull TimedRebecaCompleteParser.LiteralContext ctx);
}