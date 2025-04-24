// Generated from src/main/resources/org/rebecalang/compiler/modelcompiler/grammar/CoreRebecaComplete.g4 by ANTLR 4.8

	package org.rebecalang.compiler.modelcompiler.corerebeca.compiler;
	import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoreRebecaCompleteParser}.
 */
public interface CoreRebecaCompleteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#rebecaModel}.
	 * @param ctx the parse tree
	 */
	void enterRebecaModel(CoreRebecaCompleteParser.RebecaModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#rebecaModel}.
	 * @param ctx the parse tree
	 */
	void exitRebecaModel(CoreRebecaCompleteParser.RebecaModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(CoreRebecaCompleteParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(CoreRebecaCompleteParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(CoreRebecaCompleteParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(CoreRebecaCompleteParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#rebecaCode}.
	 * @param ctx the parse tree
	 */
	void enterRebecaCode(CoreRebecaCompleteParser.RebecaCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#rebecaCode}.
	 * @param ctx the parse tree
	 */
	void exitRebecaCode(CoreRebecaCompleteParser.RebecaCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRecordDeclaration(CoreRebecaCompleteParser.RecordDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRecordDeclaration(CoreRebecaCompleteParser.RecordDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainDeclaration(CoreRebecaCompleteParser.MainDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainDeclaration(CoreRebecaCompleteParser.MainDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#mainRebecDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMainRebecDefinition(CoreRebecaCompleteParser.MainRebecDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#mainRebecDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMainRebecDefinition(CoreRebecaCompleteParser.MainRebecDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#bindingsExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterBindingsExpressionList(CoreRebecaCompleteParser.BindingsExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#bindingsExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitBindingsExpressionList(CoreRebecaCompleteParser.BindingsExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#argumentsExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsExpressionList(CoreRebecaCompleteParser.ArgumentsExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#argumentsExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsExpressionList(CoreRebecaCompleteParser.ArgumentsExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(CoreRebecaCompleteParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(CoreRebecaCompleteParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(CoreRebecaCompleteParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(CoreRebecaCompleteParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(CoreRebecaCompleteParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(CoreRebecaCompleteParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(CoreRebecaCompleteParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(CoreRebecaCompleteParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(CoreRebecaCompleteParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(CoreRebecaCompleteParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(CoreRebecaCompleteParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(CoreRebecaCompleteParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#extendingInterface}.
	 * @param ctx the parse tree
	 */
	void enterExtendingInterface(CoreRebecaCompleteParser.ExtendingInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#extendingInterface}.
	 * @param ctx the parse tree
	 */
	void exitExtendingInterface(CoreRebecaCompleteParser.ExtendingInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#msgsrvSignature}.
	 * @param ctx the parse tree
	 */
	void enterMsgsrvSignature(CoreRebecaCompleteParser.MsgsrvSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#msgsrvSignature}.
	 * @param ctx the parse tree
	 */
	void exitMsgsrvSignature(CoreRebecaCompleteParser.MsgsrvSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#reactiveClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterReactiveClassDeclaration(CoreRebecaCompleteParser.ReactiveClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#reactiveClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitReactiveClassDeclaration(CoreRebecaCompleteParser.ReactiveClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#implementingInterface}.
	 * @param ctx the parse tree
	 */
	void enterImplementingInterface(CoreRebecaCompleteParser.ImplementingInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#implementingInterface}.
	 * @param ctx the parse tree
	 */
	void exitImplementingInterface(CoreRebecaCompleteParser.ImplementingInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#knownRebecsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterKnownRebecsDeclaration(CoreRebecaCompleteParser.KnownRebecsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#knownRebecsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitKnownRebecsDeclaration(CoreRebecaCompleteParser.KnownRebecsDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#stateVarsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStateVarsDeclaration(CoreRebecaCompleteParser.StateVarsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#stateVarsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStateVarsDeclaration(CoreRebecaCompleteParser.StateVarsDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(CoreRebecaCompleteParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(CoreRebecaCompleteParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(CoreRebecaCompleteParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(CoreRebecaCompleteParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#msgsrvDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMsgsrvDeclaration(CoreRebecaCompleteParser.MsgsrvDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#msgsrvDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMsgsrvDeclaration(CoreRebecaCompleteParser.MsgsrvDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#synchMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSynchMethodDeclaration(CoreRebecaCompleteParser.SynchMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#synchMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSynchMethodDeclaration(CoreRebecaCompleteParser.SynchMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(CoreRebecaCompleteParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(CoreRebecaCompleteParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#formalParametersDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFormalParametersDeclaration(CoreRebecaCompleteParser.FormalParametersDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#formalParametersDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFormalParametersDeclaration(CoreRebecaCompleteParser.FormalParametersDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#formalParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDeclaration(CoreRebecaCompleteParser.FormalParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#formalParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDeclaration(CoreRebecaCompleteParser.FormalParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CoreRebecaCompleteParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CoreRebecaCompleteParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CoreRebecaCompleteParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CoreRebecaCompleteParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(CoreRebecaCompleteParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(CoreRebecaCompleteParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(CoreRebecaCompleteParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(CoreRebecaCompleteParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#caseSwitchGroup}.
	 * @param ctx the parse tree
	 */
	void enterCaseSwitchGroup(CoreRebecaCompleteParser.CaseSwitchGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#caseSwitchGroup}.
	 * @param ctx the parse tree
	 */
	void exitCaseSwitchGroup(CoreRebecaCompleteParser.CaseSwitchGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#defaultSwitchGroup}.
	 * @param ctx the parse tree
	 */
	void enterDefaultSwitchGroup(CoreRebecaCompleteParser.DefaultSwitchGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#defaultSwitchGroup}.
	 * @param ctx the parse tree
	 */
	void exitDefaultSwitchGroup(CoreRebecaCompleteParser.DefaultSwitchGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#annotatedStatement}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedStatement(CoreRebecaCompleteParser.AnnotatedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#annotatedStatement}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedStatement(CoreRebecaCompleteParser.AnnotatedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(CoreRebecaCompleteParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(CoreRebecaCompleteParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(CoreRebecaCompleteParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(CoreRebecaCompleteParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CoreRebecaCompleteParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CoreRebecaCompleteParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#genericTypeParams}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeParams(CoreRebecaCompleteParser.GenericTypeParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#genericTypeParams}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeParams(CoreRebecaCompleteParser.GenericTypeParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void enterDimensions(CoreRebecaCompleteParser.DimensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#dimensions}.
	 * @param ctx the parse tree
	 */
	void exitDimensions(CoreRebecaCompleteParser.DimensionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CoreRebecaCompleteParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CoreRebecaCompleteParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(CoreRebecaCompleteParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(CoreRebecaCompleteParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOp(CoreRebecaCompleteParser.MultiplicativeOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOp(CoreRebecaCompleteParser.MultiplicativeOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#additiveOp}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOp(CoreRebecaCompleteParser.AdditiveOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#additiveOp}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOp(CoreRebecaCompleteParser.AdditiveOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(CoreRebecaCompleteParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(CoreRebecaCompleteParser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void enterShiftOp(CoreRebecaCompleteParser.ShiftOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void exitShiftOp(CoreRebecaCompleteParser.ShiftOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#equalityOp}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOp(CoreRebecaCompleteParser.EqualityOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#equalityOp}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOp(CoreRebecaCompleteParser.EqualityOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CoreRebecaCompleteParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CoreRebecaCompleteParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#extendableExpression}.
	 * @param ctx the parse tree
	 */
	void enterExtendableExpression(CoreRebecaCompleteParser.ExtendableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#extendableExpression}.
	 * @param ctx the parse tree
	 */
	void exitExtendableExpression(CoreRebecaCompleteParser.ExtendableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#coreExpression}.
	 * @param ctx the parse tree
	 */
	void enterCoreExpression(CoreRebecaCompleteParser.CoreExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#coreExpression}.
	 * @param ctx the parse tree
	 */
	void exitCoreExpression(CoreRebecaCompleteParser.CoreExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#rebecInstantiationExpression}.
	 * @param ctx the parse tree
	 */
	void enterRebecInstantiationExpression(CoreRebecaCompleteParser.RebecInstantiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#rebecInstantiationExpression}.
	 * @param ctx the parse tree
	 */
	void exitRebecInstantiationExpression(CoreRebecaCompleteParser.RebecInstantiationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(CoreRebecaCompleteParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(CoreRebecaCompleteParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(CoreRebecaCompleteParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(CoreRebecaCompleteParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(CoreRebecaCompleteParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(CoreRebecaCompleteParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#annotatedExpression}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedExpression(CoreRebecaCompleteParser.AnnotatedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#annotatedExpression}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedExpression(CoreRebecaCompleteParser.AnnotatedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreRebecaCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CoreRebecaCompleteParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreRebecaCompleteParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CoreRebecaCompleteParser.LiteralContext ctx);
}