// Generated from src/main/resources/org/rebecalang/compiler/modelcompiler/grammar/TimedRebecaComplete.g4 by ANTLR 4.7.1

	package org.rebecalang.compiler.modelcompiler.timedrebeca.compiler;
	import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TimedRebecaCompleteParser}.
 */
public interface TimedRebecaCompleteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(TimedRebecaCompleteParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(TimedRebecaCompleteParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#rebecaModel}.
	 * @param ctx the parse tree
	 */
	void enterRebecaModel(TimedRebecaCompleteParser.RebecaModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#rebecaModel}.
	 * @param ctx the parse tree
	 */
	void exitRebecaModel(TimedRebecaCompleteParser.RebecaModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(TimedRebecaCompleteParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(TimedRebecaCompleteParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(TimedRebecaCompleteParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(TimedRebecaCompleteParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#rebecaCode}.
	 * @param ctx the parse tree
	 */
	void enterRebecaCode(TimedRebecaCompleteParser.RebecaCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#rebecaCode}.
	 * @param ctx the parse tree
	 */
	void exitRebecaCode(TimedRebecaCompleteParser.RebecaCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRecordDeclaration(TimedRebecaCompleteParser.RecordDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRecordDeclaration(TimedRebecaCompleteParser.RecordDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainDeclaration(TimedRebecaCompleteParser.MainDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainDeclaration(TimedRebecaCompleteParser.MainDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#mainRebecDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMainRebecDefinition(TimedRebecaCompleteParser.MainRebecDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#mainRebecDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMainRebecDefinition(TimedRebecaCompleteParser.MainRebecDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#environmentVariables}.
	 * @param ctx the parse tree
	 */
	void enterEnvironmentVariables(TimedRebecaCompleteParser.EnvironmentVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#environmentVariables}.
	 * @param ctx the parse tree
	 */
	void exitEnvironmentVariables(TimedRebecaCompleteParser.EnvironmentVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(TimedRebecaCompleteParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(TimedRebecaCompleteParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(TimedRebecaCompleteParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(TimedRebecaCompleteParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(TimedRebecaCompleteParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(TimedRebecaCompleteParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(TimedRebecaCompleteParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(TimedRebecaCompleteParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(TimedRebecaCompleteParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(TimedRebecaCompleteParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(TimedRebecaCompleteParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(TimedRebecaCompleteParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#reactiveClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterReactiveClassDeclaration(TimedRebecaCompleteParser.ReactiveClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#reactiveClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitReactiveClassDeclaration(TimedRebecaCompleteParser.ReactiveClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(TimedRebecaCompleteParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(TimedRebecaCompleteParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(TimedRebecaCompleteParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(TimedRebecaCompleteParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#msgsrvDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMsgsrvDeclaration(TimedRebecaCompleteParser.MsgsrvDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#msgsrvDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMsgsrvDeclaration(TimedRebecaCompleteParser.MsgsrvDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#synchMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSynchMethodDeclaration(TimedRebecaCompleteParser.SynchMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#synchMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSynchMethodDeclaration(TimedRebecaCompleteParser.SynchMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(TimedRebecaCompleteParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(TimedRebecaCompleteParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#formalParametersDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFormalParametersDeclaration(TimedRebecaCompleteParser.FormalParametersDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#formalParametersDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFormalParametersDeclaration(TimedRebecaCompleteParser.FormalParametersDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#formalParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDeclaration(TimedRebecaCompleteParser.FormalParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#formalParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDeclaration(TimedRebecaCompleteParser.FormalParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TimedRebecaCompleteParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TimedRebecaCompleteParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TimedRebecaCompleteParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TimedRebecaCompleteParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(TimedRebecaCompleteParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(TimedRebecaCompleteParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(TimedRebecaCompleteParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(TimedRebecaCompleteParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(TimedRebecaCompleteParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(TimedRebecaCompleteParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(TimedRebecaCompleteParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(TimedRebecaCompleteParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TimedRebecaCompleteParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TimedRebecaCompleteParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#genericTypeParams}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeParams(TimedRebecaCompleteParser.GenericTypeParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#genericTypeParams}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeParams(TimedRebecaCompleteParser.GenericTypeParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void enterDimensions(TimedRebecaCompleteParser.DimensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void exitDimensions(TimedRebecaCompleteParser.DimensionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TimedRebecaCompleteParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TimedRebecaCompleteParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(TimedRebecaCompleteParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(TimedRebecaCompleteParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(TimedRebecaCompleteParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(TimedRebecaCompleteParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(TimedRebecaCompleteParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(TimedRebecaCompleteParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(TimedRebecaCompleteParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(TimedRebecaCompleteParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(TimedRebecaCompleteParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(TimedRebecaCompleteParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(TimedRebecaCompleteParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(TimedRebecaCompleteParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(TimedRebecaCompleteParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(TimedRebecaCompleteParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(TimedRebecaCompleteParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(TimedRebecaCompleteParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceOfExpression(TimedRebecaCompleteParser.InstanceOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#instanceOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceOfExpression(TimedRebecaCompleteParser.InstanceOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(TimedRebecaCompleteParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(TimedRebecaCompleteParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(TimedRebecaCompleteParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(TimedRebecaCompleteParser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(TimedRebecaCompleteParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(TimedRebecaCompleteParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void enterShiftOp(TimedRebecaCompleteParser.ShiftOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void exitShiftOp(TimedRebecaCompleteParser.ShiftOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(TimedRebecaCompleteParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(TimedRebecaCompleteParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(TimedRebecaCompleteParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(TimedRebecaCompleteParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(TimedRebecaCompleteParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(TimedRebecaCompleteParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(TimedRebecaCompleteParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(TimedRebecaCompleteParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(TimedRebecaCompleteParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(TimedRebecaCompleteParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(TimedRebecaCompleteParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(TimedRebecaCompleteParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TimedRebecaCompleteParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TimedRebecaCompleteParser.LiteralContext ctx);
}