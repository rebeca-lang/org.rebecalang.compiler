// Generated from src/main/resources/org/rebecalang/compiler/modelcompiler/grammar/HybridRebecaComplete.g4 by ANTLR 4.7.1

	package org.rebecalang.compiler.modelcompiler.hybridrebeca.compiler;
	import org.rebecalang.compiler.modelcompiler.hybridrebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	import java.util.*;
	import org.antlr.runtime.BitSet;
	import org.rebecalang.compiler.utils.TypesUtilities;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HybridRebecaCompleteParser}.
 */
public interface HybridRebecaCompleteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#rebecaCode}.
	 * @param ctx the parse tree
	 */
	void enterRebecaCode(HybridRebecaCompleteParser.RebecaCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#rebecaCode}.
	 * @param ctx the parse tree
	 */
	void exitRebecaCode(HybridRebecaCompleteParser.RebecaCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#physicalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPhysicalClassDeclaration(HybridRebecaCompleteParser.PhysicalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#physicalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPhysicalClassDeclaration(HybridRebecaCompleteParser.PhysicalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#modeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModeDeclaration(HybridRebecaCompleteParser.ModeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#modeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModeDeclaration(HybridRebecaCompleteParser.ModeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(HybridRebecaCompleteParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(HybridRebecaCompleteParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#rebecaModel}.
	 * @param ctx the parse tree
	 */
	void enterRebecaModel(HybridRebecaCompleteParser.RebecaModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#rebecaModel}.
	 * @param ctx the parse tree
	 */
	void exitRebecaModel(HybridRebecaCompleteParser.RebecaModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(HybridRebecaCompleteParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(HybridRebecaCompleteParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(HybridRebecaCompleteParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(HybridRebecaCompleteParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRecordDeclaration(HybridRebecaCompleteParser.RecordDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRecordDeclaration(HybridRebecaCompleteParser.RecordDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainDeclaration(HybridRebecaCompleteParser.MainDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainDeclaration(HybridRebecaCompleteParser.MainDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#mainRebecDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMainRebecDefinition(HybridRebecaCompleteParser.MainRebecDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#mainRebecDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMainRebecDefinition(HybridRebecaCompleteParser.MainRebecDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#environmentVariables}.
	 * @param ctx the parse tree
	 */
	void enterEnvironmentVariables(HybridRebecaCompleteParser.EnvironmentVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#environmentVariables}.
	 * @param ctx the parse tree
	 */
	void exitEnvironmentVariables(HybridRebecaCompleteParser.EnvironmentVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(HybridRebecaCompleteParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(HybridRebecaCompleteParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(HybridRebecaCompleteParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(HybridRebecaCompleteParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(HybridRebecaCompleteParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(HybridRebecaCompleteParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(HybridRebecaCompleteParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(HybridRebecaCompleteParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(HybridRebecaCompleteParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(HybridRebecaCompleteParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(HybridRebecaCompleteParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(HybridRebecaCompleteParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#reactiveClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterReactiveClassDeclaration(HybridRebecaCompleteParser.ReactiveClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#reactiveClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitReactiveClassDeclaration(HybridRebecaCompleteParser.ReactiveClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(HybridRebecaCompleteParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(HybridRebecaCompleteParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(HybridRebecaCompleteParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(HybridRebecaCompleteParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#msgsrvDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMsgsrvDeclaration(HybridRebecaCompleteParser.MsgsrvDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#msgsrvDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMsgsrvDeclaration(HybridRebecaCompleteParser.MsgsrvDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#synchMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSynchMethodDeclaration(HybridRebecaCompleteParser.SynchMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#synchMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSynchMethodDeclaration(HybridRebecaCompleteParser.SynchMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(HybridRebecaCompleteParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(HybridRebecaCompleteParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#formalParametersDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFormalParametersDeclaration(HybridRebecaCompleteParser.FormalParametersDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#formalParametersDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFormalParametersDeclaration(HybridRebecaCompleteParser.FormalParametersDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#formalParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDeclaration(HybridRebecaCompleteParser.FormalParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#formalParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDeclaration(HybridRebecaCompleteParser.FormalParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(HybridRebecaCompleteParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(HybridRebecaCompleteParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HybridRebecaCompleteParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HybridRebecaCompleteParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(HybridRebecaCompleteParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(HybridRebecaCompleteParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(HybridRebecaCompleteParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(HybridRebecaCompleteParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(HybridRebecaCompleteParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(HybridRebecaCompleteParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(HybridRebecaCompleteParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(HybridRebecaCompleteParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(HybridRebecaCompleteParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(HybridRebecaCompleteParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#genericTypeParams}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeParams(HybridRebecaCompleteParser.GenericTypeParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#genericTypeParams}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeParams(HybridRebecaCompleteParser.GenericTypeParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void enterDimensions(HybridRebecaCompleteParser.DimensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void exitDimensions(HybridRebecaCompleteParser.DimensionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HybridRebecaCompleteParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HybridRebecaCompleteParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(HybridRebecaCompleteParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(HybridRebecaCompleteParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(HybridRebecaCompleteParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(HybridRebecaCompleteParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(HybridRebecaCompleteParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(HybridRebecaCompleteParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(HybridRebecaCompleteParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(HybridRebecaCompleteParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(HybridRebecaCompleteParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(HybridRebecaCompleteParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(HybridRebecaCompleteParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(HybridRebecaCompleteParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(HybridRebecaCompleteParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(HybridRebecaCompleteParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(HybridRebecaCompleteParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(HybridRebecaCompleteParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOfExpression(HybridRebecaCompleteParser.InstanceOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOfExpression(HybridRebecaCompleteParser.InstanceOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(HybridRebecaCompleteParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(HybridRebecaCompleteParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(HybridRebecaCompleteParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(HybridRebecaCompleteParser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(HybridRebecaCompleteParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(HybridRebecaCompleteParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void enterShiftOp(HybridRebecaCompleteParser.ShiftOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void exitShiftOp(HybridRebecaCompleteParser.ShiftOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(HybridRebecaCompleteParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(HybridRebecaCompleteParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(HybridRebecaCompleteParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(HybridRebecaCompleteParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(HybridRebecaCompleteParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(HybridRebecaCompleteParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(HybridRebecaCompleteParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(HybridRebecaCompleteParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(HybridRebecaCompleteParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(HybridRebecaCompleteParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(HybridRebecaCompleteParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(HybridRebecaCompleteParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(HybridRebecaCompleteParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(HybridRebecaCompleteParser.LiteralContext ctx);
}