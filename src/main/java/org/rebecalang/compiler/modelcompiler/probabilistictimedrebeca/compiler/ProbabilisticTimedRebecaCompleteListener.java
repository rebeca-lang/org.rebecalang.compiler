// Generated from src/main/resources/org/rebecalang/compiler/modelcompiler/grammar/ProbabilisticTimedRebecaComplete.g4 by ANTLR 4.2

	package org.rebecalang.compiler.modelcompiler.probabilistictimedrebeca.compiler;
	import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.*;
	
	import java.util.*;
	import org.antlr.runtime.BitSet;
	import org.rebecalang.compiler.utils.TypesUtilities;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProbabilisticTimedRebecaCompleteParser}.
 */
public interface ProbabilisticTimedRebecaCompleteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull ProbabilisticTimedRebecaCompleteParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull ProbabilisticTimedRebecaCompleteParser.VariableDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(@NotNull ProbabilisticTimedRebecaCompleteParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(@NotNull ProbabilisticTimedRebecaCompleteParser.RelationalOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull ProbabilisticTimedRebecaCompleteParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull ProbabilisticTimedRebecaCompleteParser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.UnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull ProbabilisticTimedRebecaCompleteParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull ProbabilisticTimedRebecaCompleteParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull ProbabilisticTimedRebecaCompleteParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull ProbabilisticTimedRebecaCompleteParser.PrimaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.ShiftExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.ImportDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#rebecaCode}.
	 * @param ctx the parse tree
	 */
	void enterRebecaCode(@NotNull ProbabilisticTimedRebecaCompleteParser.RebecaCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#rebecaCode}.
	 * @param ctx the parse tree
	 */
	void exitRebecaCode(@NotNull ProbabilisticTimedRebecaCompleteParser.RebecaCodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#formalParametersDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFormalParametersDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.FormalParametersDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#formalParametersDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFormalParametersDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.FormalParametersDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.PackageDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.ConditionalAndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(@NotNull ProbabilisticTimedRebecaCompleteParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(@NotNull ProbabilisticTimedRebecaCompleteParser.VariableDeclaratorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.AdditiveExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(@NotNull ProbabilisticTimedRebecaCompleteParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(@NotNull ProbabilisticTimedRebecaCompleteParser.SwitchBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull ProbabilisticTimedRebecaCompleteParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull ProbabilisticTimedRebecaCompleteParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.ExclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOfExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.InstanceOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOfExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.InstanceOfExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#msgsrvDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMsgsrvDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.MsgsrvDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#msgsrvDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMsgsrvDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.MsgsrvDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.MultiplicativeExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(@NotNull ProbabilisticTimedRebecaCompleteParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(@NotNull ProbabilisticTimedRebecaCompleteParser.AssignmentOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void enterShiftOp(@NotNull ProbabilisticTimedRebecaCompleteParser.ShiftOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void exitShiftOp(@NotNull ProbabilisticTimedRebecaCompleteParser.ShiftOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.StatementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(@NotNull ProbabilisticTimedRebecaCompleteParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(@NotNull ProbabilisticTimedRebecaCompleteParser.UnaryExpressionNotPlusMinusContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull ProbabilisticTimedRebecaCompleteParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull ProbabilisticTimedRebecaCompleteParser.VariableInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull ProbabilisticTimedRebecaCompleteParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull ProbabilisticTimedRebecaCompleteParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#formalParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.FormalParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#formalParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.FormalParameterDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#mainRebecDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMainRebecDefinition(@NotNull ProbabilisticTimedRebecaCompleteParser.MainRebecDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#mainRebecDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMainRebecDefinition(@NotNull ProbabilisticTimedRebecaCompleteParser.MainRebecDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.ConditionalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.AndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#rebecaModel}.
	 * @param ctx the parse tree
	 */
	void enterRebecaModel(@NotNull ProbabilisticTimedRebecaCompleteParser.RebecaModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#rebecaModel}.
	 * @param ctx the parse tree
	 */
	void exitRebecaModel(@NotNull ProbabilisticTimedRebecaCompleteParser.RebecaModelContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.FieldDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.RelationalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void enterDimensions(@NotNull ProbabilisticTimedRebecaCompleteParser.DimensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void exitDimensions(@NotNull ProbabilisticTimedRebecaCompleteParser.DimensionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.ConditionalOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#synchMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSynchMethodDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.SynchMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#synchMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSynchMethodDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.SynchMethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#environmentVariables}.
	 * @param ctx the parse tree
	 */
	void enterEnvironmentVariables(@NotNull ProbabilisticTimedRebecaCompleteParser.EnvironmentVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#environmentVariables}.
	 * @param ctx the parse tree
	 */
	void exitEnvironmentVariables(@NotNull ProbabilisticTimedRebecaCompleteParser.EnvironmentVariablesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.MethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.ConstructorDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#reactiveClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterReactiveClassDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.ReactiveClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#reactiveClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitReactiveClassDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.ReactiveClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#pAltStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterPAltStatementGroup(@NotNull ProbabilisticTimedRebecaCompleteParser.PAltStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#pAltStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitPAltStatementGroup(@NotNull ProbabilisticTimedRebecaCompleteParser.PAltStatementGroupContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRecordDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.RecordDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRecordDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.RecordDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.InclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.MainDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainDeclaration(@NotNull ProbabilisticTimedRebecaCompleteParser.MainDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.EqualityExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(@NotNull ProbabilisticTimedRebecaCompleteParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(@NotNull ProbabilisticTimedRebecaCompleteParser.ArrayInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull ProbabilisticTimedRebecaCompleteParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull ProbabilisticTimedRebecaCompleteParser.FormalParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#probabilisticList}.
	 * @param ctx the parse tree
	 */
	void enterProbabilisticList(@NotNull ProbabilisticTimedRebecaCompleteParser.ProbabilisticListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#probabilisticList}.
	 * @param ctx the parse tree
	 */
	void exitProbabilisticList(@NotNull ProbabilisticTimedRebecaCompleteParser.ProbabilisticListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(@NotNull ProbabilisticTimedRebecaCompleteParser.CastExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull ProbabilisticTimedRebecaCompleteParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull ProbabilisticTimedRebecaCompleteParser.ForInitContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull ProbabilisticTimedRebecaCompleteParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull ProbabilisticTimedRebecaCompleteParser.LiteralContext ctx);
}