// Generated from src/main/resources/org/rebecalang/compiler/modelcompiler/grammar/HybridRebecaComplete.g4 by ANTLR 4.8

	package org.rebecalang.compiler.modelcompiler.hybridrebeca.compiler;
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
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#after}.
	 * @param ctx the parse tree
	 */
	void enterAfter(HybridRebecaCompleteParser.AfterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#after}.
	 * @param ctx the parse tree
	 */
	void exitAfter(HybridRebecaCompleteParser.AfterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#deadline}.
	 * @param ctx the parse tree
	 */
	void enterDeadline(HybridRebecaCompleteParser.DeadlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#deadline}.
	 * @param ctx the parse tree
	 */
	void exitDeadline(HybridRebecaCompleteParser.DeadlineContext ctx);
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
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#bindingsExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterBindingsExpressionList(HybridRebecaCompleteParser.BindingsExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#bindingsExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitBindingsExpressionList(HybridRebecaCompleteParser.BindingsExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#argumentsExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsExpressionList(HybridRebecaCompleteParser.ArgumentsExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#argumentsExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsExpressionList(HybridRebecaCompleteParser.ArgumentsExpressionListContext ctx);
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
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#extendingInterface}.
	 * @param ctx the parse tree
	 */
	void enterExtendingInterface(HybridRebecaCompleteParser.ExtendingInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#extendingInterface}.
	 * @param ctx the parse tree
	 */
	void exitExtendingInterface(HybridRebecaCompleteParser.ExtendingInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#msgsrvSignature}.
	 * @param ctx the parse tree
	 */
	void enterMsgsrvSignature(HybridRebecaCompleteParser.MsgsrvSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#msgsrvSignature}.
	 * @param ctx the parse tree
	 */
	void exitMsgsrvSignature(HybridRebecaCompleteParser.MsgsrvSignatureContext ctx);
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
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#implementingInterface}.
	 * @param ctx the parse tree
	 */
	void enterImplementingInterface(HybridRebecaCompleteParser.ImplementingInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#implementingInterface}.
	 * @param ctx the parse tree
	 */
	void exitImplementingInterface(HybridRebecaCompleteParser.ImplementingInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#knownRebecsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterKnownRebecsDeclaration(HybridRebecaCompleteParser.KnownRebecsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#knownRebecsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitKnownRebecsDeclaration(HybridRebecaCompleteParser.KnownRebecsDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#stateVarsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStateVarsDeclaration(HybridRebecaCompleteParser.StateVarsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#stateVarsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStateVarsDeclaration(HybridRebecaCompleteParser.StateVarsDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#statementExtension}.
	 * @param ctx the parse tree
	 */
	void enterStatementExtension(HybridRebecaCompleteParser.StatementExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#statementExtension}.
	 * @param ctx the parse tree
	 */
	void exitStatementExtension(HybridRebecaCompleteParser.StatementExtensionContext ctx);
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
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#caseSwitchGroup}.
	 * @param ctx the parse tree
	 */
	void enterCaseSwitchGroup(HybridRebecaCompleteParser.CaseSwitchGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#caseSwitchGroup}.
	 * @param ctx the parse tree
	 */
	void exitCaseSwitchGroup(HybridRebecaCompleteParser.CaseSwitchGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#defaultSwitchGroup}.
	 * @param ctx the parse tree
	 */
	void enterDefaultSwitchGroup(HybridRebecaCompleteParser.DefaultSwitchGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#defaultSwitchGroup}.
	 * @param ctx the parse tree
	 */
	void exitDefaultSwitchGroup(HybridRebecaCompleteParser.DefaultSwitchGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#annotatedStatement}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedStatement(HybridRebecaCompleteParser.AnnotatedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#annotatedStatement}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedStatement(HybridRebecaCompleteParser.AnnotatedStatementContext ctx);
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
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#annotatedExpression}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedExpression(HybridRebecaCompleteParser.AnnotatedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#annotatedExpression}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedExpression(HybridRebecaCompleteParser.AnnotatedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(HybridRebecaCompleteParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(HybridRebecaCompleteParser.MethodCallContext ctx);
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
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#coreExpression}.
	 * @param ctx the parse tree
	 */
	void enterCoreExpression(HybridRebecaCompleteParser.CoreExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#coreExpression}.
	 * @param ctx the parse tree
	 */
	void exitCoreExpression(HybridRebecaCompleteParser.CoreExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#nondetExpression}.
	 * @param ctx the parse tree
	 */
	void enterNondetExpression(HybridRebecaCompleteParser.NondetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#nondetExpression}.
	 * @param ctx the parse tree
	 */
	void exitNondetExpression(HybridRebecaCompleteParser.NondetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(HybridRebecaCompleteParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(HybridRebecaCompleteParser.ArgumentsContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(HybridRebecaCompleteParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(HybridRebecaCompleteParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HybridRebecaCompleteParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(HybridRebecaCompleteParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HybridRebecaCompleteParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(HybridRebecaCompleteParser.FloatLiteralContext ctx);
}