// Generated from src/main/resources/org/rebecalang/compiler/modelcompiler/grammar/ProbabilisticTimedRebecaComplete.g4 by ANTLR 4.8

	package org.rebecalang.compiler.modelcompiler.probabilistictimedrebeca.compiler;
	import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.*;
	
	import java.util.*;
	import org.antlr.runtime.BitSet;
	import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProbabilisticTimedRebecaCompleteParser}.
 */
public interface ProbabilisticTimedRebecaCompleteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ProbabilisticTimedRebecaCompleteParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ProbabilisticTimedRebecaCompleteParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#pAltStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterPAltStatementGroup(ProbabilisticTimedRebecaCompleteParser.PAltStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#pAltStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitPAltStatementGroup(ProbabilisticTimedRebecaCompleteParser.PAltStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#coreExpression}.
	 * @param ctx the parse tree
	 */
	void enterCoreExpression(ProbabilisticTimedRebecaCompleteParser.CoreExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#coreExpression}.
	 * @param ctx the parse tree
	 */
	void exitCoreExpression(ProbabilisticTimedRebecaCompleteParser.CoreExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#probabilisticList}.
	 * @param ctx the parse tree
	 */
	void enterProbabilisticList(ProbabilisticTimedRebecaCompleteParser.ProbabilisticListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#probabilisticList}.
	 * @param ctx the parse tree
	 */
	void exitProbabilisticList(ProbabilisticTimedRebecaCompleteParser.ProbabilisticListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ProbabilisticTimedRebecaCompleteParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ProbabilisticTimedRebecaCompleteParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#rebecaModel}.
	 * @param ctx the parse tree
	 */
	void enterRebecaModel(ProbabilisticTimedRebecaCompleteParser.RebecaModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#rebecaModel}.
	 * @param ctx the parse tree
	 */
	void exitRebecaModel(ProbabilisticTimedRebecaCompleteParser.RebecaModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(ProbabilisticTimedRebecaCompleteParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(ProbabilisticTimedRebecaCompleteParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(ProbabilisticTimedRebecaCompleteParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(ProbabilisticTimedRebecaCompleteParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#rebecaCode}.
	 * @param ctx the parse tree
	 */
	void enterRebecaCode(ProbabilisticTimedRebecaCompleteParser.RebecaCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#rebecaCode}.
	 * @param ctx the parse tree
	 */
	void exitRebecaCode(ProbabilisticTimedRebecaCompleteParser.RebecaCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRecordDeclaration(ProbabilisticTimedRebecaCompleteParser.RecordDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRecordDeclaration(ProbabilisticTimedRebecaCompleteParser.RecordDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainDeclaration(ProbabilisticTimedRebecaCompleteParser.MainDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainDeclaration(ProbabilisticTimedRebecaCompleteParser.MainDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#mainRebecDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMainRebecDefinition(ProbabilisticTimedRebecaCompleteParser.MainRebecDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#mainRebecDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMainRebecDefinition(ProbabilisticTimedRebecaCompleteParser.MainRebecDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(ProbabilisticTimedRebecaCompleteParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(ProbabilisticTimedRebecaCompleteParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(ProbabilisticTimedRebecaCompleteParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(ProbabilisticTimedRebecaCompleteParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(ProbabilisticTimedRebecaCompleteParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(ProbabilisticTimedRebecaCompleteParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(ProbabilisticTimedRebecaCompleteParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(ProbabilisticTimedRebecaCompleteParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(ProbabilisticTimedRebecaCompleteParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(ProbabilisticTimedRebecaCompleteParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(ProbabilisticTimedRebecaCompleteParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(ProbabilisticTimedRebecaCompleteParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#reactiveClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterReactiveClassDeclaration(ProbabilisticTimedRebecaCompleteParser.ReactiveClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#reactiveClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitReactiveClassDeclaration(ProbabilisticTimedRebecaCompleteParser.ReactiveClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(ProbabilisticTimedRebecaCompleteParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(ProbabilisticTimedRebecaCompleteParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(ProbabilisticTimedRebecaCompleteParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(ProbabilisticTimedRebecaCompleteParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#msgsrvDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMsgsrvDeclaration(ProbabilisticTimedRebecaCompleteParser.MsgsrvDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#msgsrvDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMsgsrvDeclaration(ProbabilisticTimedRebecaCompleteParser.MsgsrvDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#synchMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSynchMethodDeclaration(ProbabilisticTimedRebecaCompleteParser.SynchMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#synchMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSynchMethodDeclaration(ProbabilisticTimedRebecaCompleteParser.SynchMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(ProbabilisticTimedRebecaCompleteParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(ProbabilisticTimedRebecaCompleteParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#formalParametersDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFormalParametersDeclaration(ProbabilisticTimedRebecaCompleteParser.FormalParametersDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#formalParametersDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFormalParametersDeclaration(ProbabilisticTimedRebecaCompleteParser.FormalParametersDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#formalParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDeclaration(ProbabilisticTimedRebecaCompleteParser.FormalParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#formalParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDeclaration(ProbabilisticTimedRebecaCompleteParser.FormalParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ProbabilisticTimedRebecaCompleteParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ProbabilisticTimedRebecaCompleteParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(ProbabilisticTimedRebecaCompleteParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(ProbabilisticTimedRebecaCompleteParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(ProbabilisticTimedRebecaCompleteParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(ProbabilisticTimedRebecaCompleteParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(ProbabilisticTimedRebecaCompleteParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(ProbabilisticTimedRebecaCompleteParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(ProbabilisticTimedRebecaCompleteParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(ProbabilisticTimedRebecaCompleteParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ProbabilisticTimedRebecaCompleteParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ProbabilisticTimedRebecaCompleteParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#genericTypeParams}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeParams(ProbabilisticTimedRebecaCompleteParser.GenericTypeParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#genericTypeParams}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeParams(ProbabilisticTimedRebecaCompleteParser.GenericTypeParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void enterDimensions(ProbabilisticTimedRebecaCompleteParser.DimensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void exitDimensions(ProbabilisticTimedRebecaCompleteParser.DimensionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ProbabilisticTimedRebecaCompleteParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ProbabilisticTimedRebecaCompleteParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(ProbabilisticTimedRebecaCompleteParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(ProbabilisticTimedRebecaCompleteParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOp(ProbabilisticTimedRebecaCompleteParser.MultiplicativeOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOp(ProbabilisticTimedRebecaCompleteParser.MultiplicativeOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#additiveOp}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOp(ProbabilisticTimedRebecaCompleteParser.AdditiveOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#additiveOp}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOp(ProbabilisticTimedRebecaCompleteParser.AdditiveOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(ProbabilisticTimedRebecaCompleteParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(ProbabilisticTimedRebecaCompleteParser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void enterShiftOp(ProbabilisticTimedRebecaCompleteParser.ShiftOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void exitShiftOp(ProbabilisticTimedRebecaCompleteParser.ShiftOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#equalityOp}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOp(ProbabilisticTimedRebecaCompleteParser.EqualityOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#equalityOp}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOp(ProbabilisticTimedRebecaCompleteParser.EqualityOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(ProbabilisticTimedRebecaCompleteParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(ProbabilisticTimedRebecaCompleteParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(ProbabilisticTimedRebecaCompleteParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(ProbabilisticTimedRebecaCompleteParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(ProbabilisticTimedRebecaCompleteParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(ProbabilisticTimedRebecaCompleteParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ProbabilisticTimedRebecaCompleteParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticTimedRebecaCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ProbabilisticTimedRebecaCompleteParser.LiteralContext ctx);
}