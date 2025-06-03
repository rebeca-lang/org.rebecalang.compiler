// Generated from src/main/resources/org/rebecalang/compiler/modelcompiler/grammar/TimedRebecaComplete.g4 by ANTLR 4.8

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
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#after}.
	 * @param ctx the parse tree
	 */
	void enterAfter(TimedRebecaCompleteParser.AfterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#after}.
	 * @param ctx the parse tree
	 */
	void exitAfter(TimedRebecaCompleteParser.AfterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#deadline}.
	 * @param ctx the parse tree
	 */
	void enterDeadline(TimedRebecaCompleteParser.DeadlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#deadline}.
	 * @param ctx the parse tree
	 */
	void exitDeadline(TimedRebecaCompleteParser.DeadlineContext ctx);
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
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#bindingsExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterBindingsExpressionList(TimedRebecaCompleteParser.BindingsExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#bindingsExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitBindingsExpressionList(TimedRebecaCompleteParser.BindingsExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#argumentsExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsExpressionList(TimedRebecaCompleteParser.ArgumentsExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#argumentsExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsExpressionList(TimedRebecaCompleteParser.ArgumentsExpressionListContext ctx);
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
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#extendingInterface}.
	 * @param ctx the parse tree
	 */
	void enterExtendingInterface(TimedRebecaCompleteParser.ExtendingInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#extendingInterface}.
	 * @param ctx the parse tree
	 */
	void exitExtendingInterface(TimedRebecaCompleteParser.ExtendingInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#msgsrvSignature}.
	 * @param ctx the parse tree
	 */
	void enterMsgsrvSignature(TimedRebecaCompleteParser.MsgsrvSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#msgsrvSignature}.
	 * @param ctx the parse tree
	 */
	void exitMsgsrvSignature(TimedRebecaCompleteParser.MsgsrvSignatureContext ctx);
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
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#implementingInterface}.
	 * @param ctx the parse tree
	 */
	void enterImplementingInterface(TimedRebecaCompleteParser.ImplementingInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#implementingInterface}.
	 * @param ctx the parse tree
	 */
	void exitImplementingInterface(TimedRebecaCompleteParser.ImplementingInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#knownRebecsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterKnownRebecsDeclaration(TimedRebecaCompleteParser.KnownRebecsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#knownRebecsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitKnownRebecsDeclaration(TimedRebecaCompleteParser.KnownRebecsDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#stateVarsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStateVarsDeclaration(TimedRebecaCompleteParser.StateVarsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#stateVarsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStateVarsDeclaration(TimedRebecaCompleteParser.StateVarsDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#statementExtension}.
	 * @param ctx the parse tree
	 */
	void enterStatementExtension(TimedRebecaCompleteParser.StatementExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#statementExtension}.
	 * @param ctx the parse tree
	 */
	void exitStatementExtension(TimedRebecaCompleteParser.StatementExtensionContext ctx);
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
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#caseSwitchGroup}.
	 * @param ctx the parse tree
	 */
	void enterCaseSwitchGroup(TimedRebecaCompleteParser.CaseSwitchGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#caseSwitchGroup}.
	 * @param ctx the parse tree
	 */
	void exitCaseSwitchGroup(TimedRebecaCompleteParser.CaseSwitchGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#defaultSwitchGroup}.
	 * @param ctx the parse tree
	 */
	void enterDefaultSwitchGroup(TimedRebecaCompleteParser.DefaultSwitchGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#defaultSwitchGroup}.
	 * @param ctx the parse tree
	 */
	void exitDefaultSwitchGroup(TimedRebecaCompleteParser.DefaultSwitchGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#annotatedStatement}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedStatement(TimedRebecaCompleteParser.AnnotatedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#annotatedStatement}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedStatement(TimedRebecaCompleteParser.AnnotatedStatementContext ctx);
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
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#annotatedExpression}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedExpression(TimedRebecaCompleteParser.AnnotatedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#annotatedExpression}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedExpression(TimedRebecaCompleteParser.AnnotatedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(TimedRebecaCompleteParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(TimedRebecaCompleteParser.MethodCallContext ctx);
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
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#nondetExpression}.
	 * @param ctx the parse tree
	 */
	void enterNondetExpression(TimedRebecaCompleteParser.NondetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#nondetExpression}.
	 * @param ctx the parse tree
	 */
	void exitNondetExpression(TimedRebecaCompleteParser.NondetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(TimedRebecaCompleteParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(TimedRebecaCompleteParser.ArgumentsContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(TimedRebecaCompleteParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(TimedRebecaCompleteParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TimedRebecaCompleteParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(TimedRebecaCompleteParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TimedRebecaCompleteParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(TimedRebecaCompleteParser.FloatLiteralContext ctx);
}