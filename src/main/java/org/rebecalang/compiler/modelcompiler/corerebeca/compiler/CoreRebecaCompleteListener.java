// Generated from src/main/resources/org/rebecalang/compiler/modelcompiler/grammar/CoreRebecaComplete.g4 by ANTLR 4.2

	package org.rebecalang.compiler.modelcompiler.corerebeca.compiler;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	import java.util.*;
	import org.antlr.runtime.BitSet;
	import org.rebecalang.compiler.utils.TypesUtilities;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoreRebecaCompleteParser}.
 */
public interface CoreRebecaCompleteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull CoreRebecaCompleteParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull CoreRebecaCompleteParser.VariableDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull CoreRebecaCompleteParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull CoreRebecaCompleteParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(@NotNull CoreRebecaCompleteParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(@NotNull CoreRebecaCompleteParser.RelationalOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull CoreRebecaCompleteParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull CoreRebecaCompleteParser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull CoreRebecaCompleteParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull CoreRebecaCompleteParser.UnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull CoreRebecaCompleteParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull CoreRebecaCompleteParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull CoreRebecaCompleteParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull CoreRebecaCompleteParser.AnnotationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull CoreRebecaCompleteParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull CoreRebecaCompleteParser.PrimaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(@NotNull CoreRebecaCompleteParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(@NotNull CoreRebecaCompleteParser.ShiftExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull CoreRebecaCompleteParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull CoreRebecaCompleteParser.ImportDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#rebecaCode}.
	 * @param ctx the parse tree
	 */
	void enterRebecaCode(@NotNull CoreRebecaCompleteParser.RebecaCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#rebecaCode}.
	 * @param ctx the parse tree
	 */
	void exitRebecaCode(@NotNull CoreRebecaCompleteParser.RebecaCodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#formalParametersDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFormalParametersDeclaration(@NotNull CoreRebecaCompleteParser.FormalParametersDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#formalParametersDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFormalParametersDeclaration(@NotNull CoreRebecaCompleteParser.FormalParametersDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(@NotNull CoreRebecaCompleteParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(@NotNull CoreRebecaCompleteParser.PackageDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(@NotNull CoreRebecaCompleteParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(@NotNull CoreRebecaCompleteParser.ConditionalAndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(@NotNull CoreRebecaCompleteParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(@NotNull CoreRebecaCompleteParser.VariableDeclaratorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull CoreRebecaCompleteParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull CoreRebecaCompleteParser.AdditiveExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(@NotNull CoreRebecaCompleteParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(@NotNull CoreRebecaCompleteParser.SwitchBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull CoreRebecaCompleteParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull CoreRebecaCompleteParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(@NotNull CoreRebecaCompleteParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(@NotNull CoreRebecaCompleteParser.ExclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOfExpression(@NotNull CoreRebecaCompleteParser.InstanceOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOfExpression(@NotNull CoreRebecaCompleteParser.InstanceOfExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#msgsrvDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMsgsrvDeclaration(@NotNull CoreRebecaCompleteParser.MsgsrvDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#msgsrvDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMsgsrvDeclaration(@NotNull CoreRebecaCompleteParser.MsgsrvDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull CoreRebecaCompleteParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull CoreRebecaCompleteParser.MultiplicativeExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(@NotNull CoreRebecaCompleteParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(@NotNull CoreRebecaCompleteParser.AssignmentOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void enterShiftOp(@NotNull CoreRebecaCompleteParser.ShiftOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void exitShiftOp(@NotNull CoreRebecaCompleteParser.ShiftOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull CoreRebecaCompleteParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull CoreRebecaCompleteParser.StatementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(@NotNull CoreRebecaCompleteParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(@NotNull CoreRebecaCompleteParser.UnaryExpressionNotPlusMinusContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull CoreRebecaCompleteParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull CoreRebecaCompleteParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull CoreRebecaCompleteParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull CoreRebecaCompleteParser.VariableInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#formalParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDeclaration(@NotNull CoreRebecaCompleteParser.FormalParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#formalParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDeclaration(@NotNull CoreRebecaCompleteParser.FormalParameterDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#mainRebecDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMainRebecDefinition(@NotNull CoreRebecaCompleteParser.MainRebecDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#mainRebecDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMainRebecDefinition(@NotNull CoreRebecaCompleteParser.MainRebecDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(@NotNull CoreRebecaCompleteParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(@NotNull CoreRebecaCompleteParser.ConditionalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull CoreRebecaCompleteParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull CoreRebecaCompleteParser.AndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#rebecaModel}.
	 * @param ctx the parse tree
	 */
	void enterRebecaModel(@NotNull CoreRebecaCompleteParser.RebecaModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#rebecaModel}.
	 * @param ctx the parse tree
	 */
	void exitRebecaModel(@NotNull CoreRebecaCompleteParser.RebecaModelContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(@NotNull CoreRebecaCompleteParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(@NotNull CoreRebecaCompleteParser.FieldDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(@NotNull CoreRebecaCompleteParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(@NotNull CoreRebecaCompleteParser.RelationalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void enterDimensions(@NotNull CoreRebecaCompleteParser.DimensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void exitDimensions(@NotNull CoreRebecaCompleteParser.DimensionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(@NotNull CoreRebecaCompleteParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(@NotNull CoreRebecaCompleteParser.ConditionalOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#synchMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSynchMethodDeclaration(@NotNull CoreRebecaCompleteParser.SynchMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#synchMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSynchMethodDeclaration(@NotNull CoreRebecaCompleteParser.SynchMethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#environmentVariables}.
	 * @param ctx the parse tree
	 */
	void enterEnvironmentVariables(@NotNull CoreRebecaCompleteParser.EnvironmentVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#environmentVariables}.
	 * @param ctx the parse tree
	 */
	void exitEnvironmentVariables(@NotNull CoreRebecaCompleteParser.EnvironmentVariablesContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull CoreRebecaCompleteParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull CoreRebecaCompleteParser.MethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(@NotNull CoreRebecaCompleteParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(@NotNull CoreRebecaCompleteParser.ConstructorDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#reactiveClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterReactiveClassDeclaration(@NotNull CoreRebecaCompleteParser.ReactiveClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#reactiveClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitReactiveClassDeclaration(@NotNull CoreRebecaCompleteParser.ReactiveClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRecordDeclaration(@NotNull CoreRebecaCompleteParser.RecordDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRecordDeclaration(@NotNull CoreRebecaCompleteParser.RecordDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(@NotNull CoreRebecaCompleteParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(@NotNull CoreRebecaCompleteParser.InclusiveOrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainDeclaration(@NotNull CoreRebecaCompleteParser.MainDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainDeclaration(@NotNull CoreRebecaCompleteParser.MainDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(@NotNull CoreRebecaCompleteParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(@NotNull CoreRebecaCompleteParser.EqualityExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(@NotNull CoreRebecaCompleteParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(@NotNull CoreRebecaCompleteParser.ArrayInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull CoreRebecaCompleteParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull CoreRebecaCompleteParser.FormalParametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(@NotNull CoreRebecaCompleteParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(@NotNull CoreRebecaCompleteParser.CastExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull CoreRebecaCompleteParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull CoreRebecaCompleteParser.ForInitContext ctx);

	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull CoreRebecaCompleteParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull CoreRebecaCompleteParser.LiteralContext ctx);
}