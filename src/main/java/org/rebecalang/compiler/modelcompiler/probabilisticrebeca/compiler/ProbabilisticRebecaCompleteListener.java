// Generated from src/main/resources/org/rebecalang/compiler/modelcompiler/grammar/ProbabilisticRebecaComplete.g4 by ANTLR 4.8

	package org.rebecalang.compiler.modelcompiler.probabilisticrebeca.compiler;
	import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProbabilisticRebecaCompleteParser}.
 */
public interface ProbabilisticRebecaCompleteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ProbabilisticRebecaCompleteParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ProbabilisticRebecaCompleteParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#pAltStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterPAltStatementGroup(ProbabilisticRebecaCompleteParser.PAltStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#pAltStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitPAltStatementGroup(ProbabilisticRebecaCompleteParser.PAltStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(ProbabilisticRebecaCompleteParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(ProbabilisticRebecaCompleteParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#probabilisticList}.
	 * @param ctx the parse tree
	 */
	void enterProbabilisticList(ProbabilisticRebecaCompleteParser.ProbabilisticListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#probabilisticList}.
	 * @param ctx the parse tree
	 */
	void exitProbabilisticList(ProbabilisticRebecaCompleteParser.ProbabilisticListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#rebecaModel}.
	 * @param ctx the parse tree
	 */
	void enterRebecaModel(ProbabilisticRebecaCompleteParser.RebecaModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#rebecaModel}.
	 * @param ctx the parse tree
	 */
	void exitRebecaModel(ProbabilisticRebecaCompleteParser.RebecaModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(ProbabilisticRebecaCompleteParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(ProbabilisticRebecaCompleteParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(ProbabilisticRebecaCompleteParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(ProbabilisticRebecaCompleteParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#rebecaCode}.
	 * @param ctx the parse tree
	 */
	void enterRebecaCode(ProbabilisticRebecaCompleteParser.RebecaCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#rebecaCode}.
	 * @param ctx the parse tree
	 */
	void exitRebecaCode(ProbabilisticRebecaCompleteParser.RebecaCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRecordDeclaration(ProbabilisticRebecaCompleteParser.RecordDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRecordDeclaration(ProbabilisticRebecaCompleteParser.RecordDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainDeclaration(ProbabilisticRebecaCompleteParser.MainDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainDeclaration(ProbabilisticRebecaCompleteParser.MainDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#mainRebecDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMainRebecDefinition(ProbabilisticRebecaCompleteParser.MainRebecDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#mainRebecDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMainRebecDefinition(ProbabilisticRebecaCompleteParser.MainRebecDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(ProbabilisticRebecaCompleteParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(ProbabilisticRebecaCompleteParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(ProbabilisticRebecaCompleteParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(ProbabilisticRebecaCompleteParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(ProbabilisticRebecaCompleteParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(ProbabilisticRebecaCompleteParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(ProbabilisticRebecaCompleteParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(ProbabilisticRebecaCompleteParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(ProbabilisticRebecaCompleteParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(ProbabilisticRebecaCompleteParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(ProbabilisticRebecaCompleteParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(ProbabilisticRebecaCompleteParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#reactiveClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterReactiveClassDeclaration(ProbabilisticRebecaCompleteParser.ReactiveClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#reactiveClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitReactiveClassDeclaration(ProbabilisticRebecaCompleteParser.ReactiveClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(ProbabilisticRebecaCompleteParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(ProbabilisticRebecaCompleteParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(ProbabilisticRebecaCompleteParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(ProbabilisticRebecaCompleteParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#msgsrvDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMsgsrvDeclaration(ProbabilisticRebecaCompleteParser.MsgsrvDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#msgsrvDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMsgsrvDeclaration(ProbabilisticRebecaCompleteParser.MsgsrvDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#synchMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSynchMethodDeclaration(ProbabilisticRebecaCompleteParser.SynchMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#synchMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSynchMethodDeclaration(ProbabilisticRebecaCompleteParser.SynchMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(ProbabilisticRebecaCompleteParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(ProbabilisticRebecaCompleteParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#formalParametersDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFormalParametersDeclaration(ProbabilisticRebecaCompleteParser.FormalParametersDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#formalParametersDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFormalParametersDeclaration(ProbabilisticRebecaCompleteParser.FormalParametersDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#formalParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDeclaration(ProbabilisticRebecaCompleteParser.FormalParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#formalParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDeclaration(ProbabilisticRebecaCompleteParser.FormalParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ProbabilisticRebecaCompleteParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ProbabilisticRebecaCompleteParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(ProbabilisticRebecaCompleteParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(ProbabilisticRebecaCompleteParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(ProbabilisticRebecaCompleteParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(ProbabilisticRebecaCompleteParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(ProbabilisticRebecaCompleteParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(ProbabilisticRebecaCompleteParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(ProbabilisticRebecaCompleteParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(ProbabilisticRebecaCompleteParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ProbabilisticRebecaCompleteParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ProbabilisticRebecaCompleteParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#genericTypeParams}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeParams(ProbabilisticRebecaCompleteParser.GenericTypeParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#genericTypeParams}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeParams(ProbabilisticRebecaCompleteParser.GenericTypeParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void enterDimensions(ProbabilisticRebecaCompleteParser.DimensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void exitDimensions(ProbabilisticRebecaCompleteParser.DimensionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ProbabilisticRebecaCompleteParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ProbabilisticRebecaCompleteParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(ProbabilisticRebecaCompleteParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(ProbabilisticRebecaCompleteParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(ProbabilisticRebecaCompleteParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(ProbabilisticRebecaCompleteParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(ProbabilisticRebecaCompleteParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(ProbabilisticRebecaCompleteParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(ProbabilisticRebecaCompleteParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(ProbabilisticRebecaCompleteParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(ProbabilisticRebecaCompleteParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(ProbabilisticRebecaCompleteParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(ProbabilisticRebecaCompleteParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(ProbabilisticRebecaCompleteParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(ProbabilisticRebecaCompleteParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(ProbabilisticRebecaCompleteParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(ProbabilisticRebecaCompleteParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(ProbabilisticRebecaCompleteParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOfExpression(ProbabilisticRebecaCompleteParser.InstanceOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOfExpression(ProbabilisticRebecaCompleteParser.InstanceOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(ProbabilisticRebecaCompleteParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(ProbabilisticRebecaCompleteParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(ProbabilisticRebecaCompleteParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(ProbabilisticRebecaCompleteParser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(ProbabilisticRebecaCompleteParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(ProbabilisticRebecaCompleteParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void enterShiftOp(ProbabilisticRebecaCompleteParser.ShiftOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void exitShiftOp(ProbabilisticRebecaCompleteParser.ShiftOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(ProbabilisticRebecaCompleteParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(ProbabilisticRebecaCompleteParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(ProbabilisticRebecaCompleteParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(ProbabilisticRebecaCompleteParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(ProbabilisticRebecaCompleteParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(ProbabilisticRebecaCompleteParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(ProbabilisticRebecaCompleteParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(ProbabilisticRebecaCompleteParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ProbabilisticRebecaCompleteParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ProbabilisticRebecaCompleteParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(ProbabilisticRebecaCompleteParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(ProbabilisticRebecaCompleteParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProbabilisticRebecaCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ProbabilisticRebecaCompleteParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProbabilisticRebecaCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ProbabilisticRebecaCompleteParser.LiteralContext ctx);
}