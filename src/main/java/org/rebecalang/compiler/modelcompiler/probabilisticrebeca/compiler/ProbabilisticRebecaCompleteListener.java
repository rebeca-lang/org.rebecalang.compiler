// Generated from src/main/resources/org/rebecalang/compiler/modelcompiler/grammar/ProbabilisticRebecaComplete.g4 by ANTLR 4.2

	package org.rebecalang.compiler.modelcompiler.probabilisticrebeca.compiler;
	import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	
	import java.util.*;
	import org.antlr.runtime.BitSet;
	import org.rebecalang.compiler.utils.TypesUtilities;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProbabilisticRebecaCompleteParser}.
 */
public interface ProbabilisticRebecaCompleteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull ProbabilisticRebecaCompleteParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull ProbabilisticRebecaCompleteParser.VariableDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ProbabilisticRebecaCompleteParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ProbabilisticRebecaCompleteParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(@NotNull ProbabilisticRebecaCompleteParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(@NotNull ProbabilisticRebecaCompleteParser.RelationalOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull ProbabilisticRebecaCompleteParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull ProbabilisticRebecaCompleteParser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull ProbabilisticRebecaCompleteParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull ProbabilisticRebecaCompleteParser.UnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull ProbabilisticRebecaCompleteParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull ProbabilisticRebecaCompleteParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull ProbabilisticRebecaCompleteParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull ProbabilisticRebecaCompleteParser.PrimaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(@NotNull ProbabilisticRebecaCompleteParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(@NotNull ProbabilisticRebecaCompleteParser.ShiftExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull ProbabilisticRebecaCompleteParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull ProbabilisticRebecaCompleteParser.ImportDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#rebecaCode}.
	 * @param ctx the parse tree
	 */
	void enterRebecaCode(@NotNull ProbabilisticRebecaCompleteParser.RebecaCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#rebecaCode}.
	 * @param ctx the parse tree
	 */
	void exitRebecaCode(@NotNull ProbabilisticRebecaCompleteParser.RebecaCodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#formalParametersDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFormalParametersDeclaration(@NotNull ProbabilisticRebecaCompleteParser.FormalParametersDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#formalParametersDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFormalParametersDeclaration(@NotNull ProbabilisticRebecaCompleteParser.FormalParametersDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(@NotNull ProbabilisticRebecaCompleteParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(@NotNull ProbabilisticRebecaCompleteParser.PackageDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(@NotNull ProbabilisticRebecaCompleteParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(@NotNull ProbabilisticRebecaCompleteParser.ConditionalAndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(@NotNull ProbabilisticRebecaCompleteParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(@NotNull ProbabilisticRebecaCompleteParser.VariableDeclaratorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull ProbabilisticRebecaCompleteParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull ProbabilisticRebecaCompleteParser.AdditiveExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(@NotNull ProbabilisticRebecaCompleteParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(@NotNull ProbabilisticRebecaCompleteParser.SwitchBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull ProbabilisticRebecaCompleteParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull ProbabilisticRebecaCompleteParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(@NotNull ProbabilisticRebecaCompleteParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(@NotNull ProbabilisticRebecaCompleteParser.ExclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOfExpression(@NotNull ProbabilisticRebecaCompleteParser.InstanceOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOfExpression(@NotNull ProbabilisticRebecaCompleteParser.InstanceOfExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#msgsrvDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMsgsrvDeclaration(@NotNull ProbabilisticRebecaCompleteParser.MsgsrvDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#msgsrvDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMsgsrvDeclaration(@NotNull ProbabilisticRebecaCompleteParser.MsgsrvDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull ProbabilisticRebecaCompleteParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull ProbabilisticRebecaCompleteParser.MultiplicativeExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(@NotNull ProbabilisticRebecaCompleteParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(@NotNull ProbabilisticRebecaCompleteParser.AssignmentOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void enterShiftOp(@NotNull ProbabilisticRebecaCompleteParser.ShiftOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void exitShiftOp(@NotNull ProbabilisticRebecaCompleteParser.ShiftOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull ProbabilisticRebecaCompleteParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull ProbabilisticRebecaCompleteParser.StatementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(@NotNull ProbabilisticRebecaCompleteParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(@NotNull ProbabilisticRebecaCompleteParser.UnaryExpressionNotPlusMinusContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull ProbabilisticRebecaCompleteParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull ProbabilisticRebecaCompleteParser.VariableInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull ProbabilisticRebecaCompleteParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull ProbabilisticRebecaCompleteParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#formalParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDeclaration(@NotNull ProbabilisticRebecaCompleteParser.FormalParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#formalParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDeclaration(@NotNull ProbabilisticRebecaCompleteParser.FormalParameterDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#mainRebecDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMainRebecDefinition(@NotNull ProbabilisticRebecaCompleteParser.MainRebecDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#mainRebecDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMainRebecDefinition(@NotNull ProbabilisticRebecaCompleteParser.MainRebecDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(@NotNull ProbabilisticRebecaCompleteParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(@NotNull ProbabilisticRebecaCompleteParser.ConditionalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull ProbabilisticRebecaCompleteParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull ProbabilisticRebecaCompleteParser.AndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#rebecaModel}.
	 * @param ctx the parse tree
	 */
	void enterRebecaModel(@NotNull ProbabilisticRebecaCompleteParser.RebecaModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#rebecaModel}.
	 * @param ctx the parse tree
	 */
	void exitRebecaModel(@NotNull ProbabilisticRebecaCompleteParser.RebecaModelContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(@NotNull ProbabilisticRebecaCompleteParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(@NotNull ProbabilisticRebecaCompleteParser.FieldDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(@NotNull ProbabilisticRebecaCompleteParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(@NotNull ProbabilisticRebecaCompleteParser.RelationalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void enterDimensions(@NotNull ProbabilisticRebecaCompleteParser.DimensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void exitDimensions(@NotNull ProbabilisticRebecaCompleteParser.DimensionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(@NotNull ProbabilisticRebecaCompleteParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(@NotNull ProbabilisticRebecaCompleteParser.ConditionalOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#synchMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSynchMethodDeclaration(@NotNull ProbabilisticRebecaCompleteParser.SynchMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#synchMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSynchMethodDeclaration(@NotNull ProbabilisticRebecaCompleteParser.SynchMethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#environmentVariables}.
	 * @param ctx the parse tree
	 */
	void enterEnvironmentVariables(@NotNull ProbabilisticRebecaCompleteParser.EnvironmentVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#environmentVariables}.
	 * @param ctx the parse tree
	 */
	void exitEnvironmentVariables(@NotNull ProbabilisticRebecaCompleteParser.EnvironmentVariablesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull ProbabilisticRebecaCompleteParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull ProbabilisticRebecaCompleteParser.MethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(@NotNull ProbabilisticRebecaCompleteParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(@NotNull ProbabilisticRebecaCompleteParser.ConstructorDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#reactiveClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterReactiveClassDeclaration(@NotNull ProbabilisticRebecaCompleteParser.ReactiveClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#reactiveClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitReactiveClassDeclaration(@NotNull ProbabilisticRebecaCompleteParser.ReactiveClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#pAltStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterPAltStatementGroup(@NotNull ProbabilisticRebecaCompleteParser.PAltStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#pAltStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitPAltStatementGroup(@NotNull ProbabilisticRebecaCompleteParser.PAltStatementGroupContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRecordDeclaration(@NotNull ProbabilisticRebecaCompleteParser.RecordDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRecordDeclaration(@NotNull ProbabilisticRebecaCompleteParser.RecordDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(@NotNull ProbabilisticRebecaCompleteParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(@NotNull ProbabilisticRebecaCompleteParser.InclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainDeclaration(@NotNull ProbabilisticRebecaCompleteParser.MainDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainDeclaration(@NotNull ProbabilisticRebecaCompleteParser.MainDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(@NotNull ProbabilisticRebecaCompleteParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(@NotNull ProbabilisticRebecaCompleteParser.EqualityExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(@NotNull ProbabilisticRebecaCompleteParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(@NotNull ProbabilisticRebecaCompleteParser.ArrayInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull ProbabilisticRebecaCompleteParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull ProbabilisticRebecaCompleteParser.FormalParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#probabilisticList}.
	 * @param ctx the parse tree
	 */
	void enterProbabilisticList(@NotNull ProbabilisticRebecaCompleteParser.ProbabilisticListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#probabilisticList}.
	 * @param ctx the parse tree
	 */
	void exitProbabilisticList(@NotNull ProbabilisticRebecaCompleteParser.ProbabilisticListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(@NotNull ProbabilisticRebecaCompleteParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(@NotNull ProbabilisticRebecaCompleteParser.CastExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull ProbabilisticRebecaCompleteParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull ProbabilisticRebecaCompleteParser.ForInitContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull ProbabilisticRebecaCompleteParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull ProbabilisticRebecaCompleteParser.LiteralContext ctx);
}