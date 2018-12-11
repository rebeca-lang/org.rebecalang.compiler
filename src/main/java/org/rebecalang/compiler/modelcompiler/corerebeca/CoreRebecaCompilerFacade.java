package org.rebecalang.compiler.modelcompiler.corerebeca;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.antlr.v4.runtime.CommonTokenStream;
import org.rebecalang.compiler.modelcompiler.AbstractCompilerFacade;
import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.SymbolTable;
import org.rebecalang.compiler.modelcompiler.ScopeHandler.ScopeException;
import org.rebecalang.compiler.modelcompiler.StatementSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.SymbolTableException;
import org.rebecalang.compiler.modelcompiler.corerebeca.compiler.CoreRebecaCompleteParser;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.AccessModifier;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ArrayType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BaseClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BinaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BlockStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BreakStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.CastExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ConditionalStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ConstructorDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ContinueStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.DotPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FieldDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ForStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FormalParameterDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.GenericType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.GenericTypeInstance;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.InstanceofExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.InterfaceDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Label;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Literal;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.MainRebecDefinition;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.MethodDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.NonDetExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryPrimitiveType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.PlusSubExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReactiveClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecInstantiationPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReturnStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SwitchStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SynchMethodDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TernaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.UnaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.VariableDeclarator;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.WhileStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.BinaryExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.CastExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.DotPrimaryExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.InstanceofExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.LiteralSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.NondetExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.PlusSubExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.PrimaryTermExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.RebecInstantiationExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.TernaryExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.UnaryExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement.BlockStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement.BreakStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement.ConditionalStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement.ContinueStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement.FieldDeclarationStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement.ForStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement.ReturnStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement.SwitchStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement.WhileStatementSemanticCheck;
import org.rebecalang.compiler.utils.AccessModifierUtilities;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.TypesUtilities;

import com.ibm.icu.impl.duration.impl.DataRecord.EZeroHandling;

import org.antlr.v4.runtime.Parser;
import org.apache.maven.artifact.repository.metadata.Metadata;

public class CoreRebecaCompilerFacade extends AbstractCompilerFacade {

	public final static String OWNER_REACTIVE_CLASS_KEY = "$owner$";

	protected StatementSemanticCheckContainer statementSemanticCheckContainer;

	public CoreRebecaCompilerFacade(CommonTokenStream tokens,
			Set<CompilerFeature> features, ExceptionContainer exceptionContainer) {
		super(CoreRebecaCompleteParser.class, tokens, features, exceptionContainer); 
		initialize();
	}

	public CoreRebecaCompilerFacade(Class<? extends Parser> parser, CommonTokenStream tokens,
			Set<CompilerFeature> features, ExceptionContainer exceptionContainer) {
		super(parser, tokens, features, exceptionContainer); 
		initialize();
	}

	protected void initialize() {

		symbolTable = new SymbolTable();

		scopeHandler = new ScopeHandler(rebecaModel, compilerFeatures);
		scopeHandler.pushScopeRecord(CoreRebecaLabelUtility.RESERVED_WORD);


		ExpressionSemanticCheckContainer expressionSemanticCheckContainer = new ExpressionSemanticCheckContainer(
				scopeHandler, symbolTable, compilerFeatures, exceptionContainer);	
		expressionSemanticCheckContainer.registerTranslator(CastExpression.class, new CastExpressionSemanticCheck());
		expressionSemanticCheckContainer.registerTranslator(DotPrimary.class, new DotPrimaryExpressionSemanticCheck());
		expressionSemanticCheckContainer.registerTranslator(Literal.class, new LiteralSemanticCheck());
		expressionSemanticCheckContainer.registerTranslator(PlusSubExpression.class, new PlusSubExpressionSemanticCheck());
		expressionSemanticCheckContainer.registerTranslator(NonDetExpression.class, new NondetExpressionSemanticCheck());
		expressionSemanticCheckContainer.registerTranslator(TermPrimary.class, new PrimaryTermExpressionSemanticCheck());
		expressionSemanticCheckContainer.registerTranslator(TernaryExpression.class, new TernaryExpressionSemanticCheck());
		expressionSemanticCheckContainer.registerTranslator(UnaryExpression.class, new UnaryExpressionSemanticCheck());
		expressionSemanticCheckContainer.registerTranslator(BinaryExpression.class, new BinaryExpressionSemanticCheck());
		expressionSemanticCheckContainer.registerTranslator(RebecInstantiationPrimary.class, new RebecInstantiationExpressionSemanticCheck());
		expressionSemanticCheckContainer.registerTranslator(InstanceofExpression.class, new InstanceofExpressionSemanticCheck());

		statementSemanticCheckContainer =
				new StatementSemanticCheckContainer(expressionSemanticCheckContainer, scopeHandler, symbolTable,
						compilerFeatures, exceptionContainer);	
		statementSemanticCheckContainer.registerSemanticsChecker(BlockStatement.class, new BlockStatementSemanticCheck());
		statementSemanticCheckContainer.registerSemanticsChecker(BreakStatement.class, new BreakStatementSemanticCheck());
		statementSemanticCheckContainer.registerSemanticsChecker(ConditionalStatement.class, new ConditionalStatementSemanticCheck());
		statementSemanticCheckContainer.registerSemanticsChecker(ContinueStatement.class, new ContinueStatementSemanticCheck());
		statementSemanticCheckContainer.registerSemanticsChecker(FieldDeclaration.class, new FieldDeclarationStatementSemanticCheck());
		statementSemanticCheckContainer.registerSemanticsChecker(ForStatement.class, new ForStatementSemanticCheck());
		statementSemanticCheckContainer.registerSemanticsChecker(WhileStatement.class, new WhileStatementSemanticCheck());
		statementSemanticCheckContainer.registerSemanticsChecker(ReturnStatement.class, new ReturnStatementSemanticCheck());
		statementSemanticCheckContainer.registerSemanticsChecker(SwitchStatement.class, new SwitchStatementSemanticCheck());
	}

	@Override
	public void semanticCheck(Set<CompilerFeature> features) {

		initalizeSymbolTable();

		scopeHandler.pushScopeRecord(CoreRebecaLabelUtility.REBECA_MODEL);
		addEnvironmentVariablesToScope();

		for (ReactiveClassDeclaration rcd : rebecaModel.getRebecaCode()
				.getReactiveClassDeclaration()) {
			//Initializing the scope stack
			scopeHandler.pushScopeRecord(CoreRebecaLabelUtility.REACTIVE_CLASS);




			ReactiveClassDeclaration tempRC = rcd;
			Stack <ReactiveClassDeclaration> extendStack = new Stack<ReactiveClassDeclaration>();

			extendStack.push(rcd);

			// adding ancestors variables (if any) to scope
			while (tempRC.getExtends()!=null) {
				ReactiveClassDeclaration metaData = null;
				try {
					metaData = (ReactiveClassDeclaration)TypesUtilities.getInstance().getMetaData(tempRC.getExtends());

				} catch (CodeCompilationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(metaData !=null) {
					extendStack.push(metaData);
				}
				tempRC = metaData;
			}
			while (!extendStack.isEmpty()) {

				addIntraReactiveClassVariablesToScope(extendStack.pop());

			}
			try {
				scopeHandler.addVaribaleToCurrentScope(
						OWNER_REACTIVE_CLASS_KEY, TypesUtilities.getInstance().getType(rcd.getName()), 
						CoreRebecaLabelUtility.RESERVED_WORD, 0, 0);
				scopeHandler.addVaribaleToCurrentScope("self",
						TypesUtilities.getInstance().getType(rcd.getName()), 
						CoreRebecaLabelUtility.RESERVED_WORD, 0, 0);
			} catch (CodeCompilationException e) {
				e.printStackTrace();
			}

			//Semantic check of method likes constructs
			for (MethodDeclaration md : rcd.getConstructors()) {
				semanticCheckOfMethod(rcd.getName(), md, CoreRebecaLabelUtility.CONSTRUCTOR);
			}
			try {
				scopeHandler.addVaribaleToCurrentScope("sender", TypesUtilities.REACTIVE_CLASS_TYPE, 
						CoreRebecaLabelUtility.RESERVED_WORD, 0, 0);
			} catch (ScopeException e) {
				e.printStackTrace();
			}
			for (MethodDeclaration md : rcd.getMsgsrvs()) {
				semanticCheckOfMethod(rcd.getName(), md, CoreRebecaLabelUtility.MSGSRV);
			}
			for (SynchMethodDeclaration md : rcd.getSynchMethods()) {
				scopeHandler.pushScopeRecord(null);
				try {
					scopeHandler.addVaribaleToCurrentScope(ScopeHandler.RETURN_VALUE_KEY_IN_SCOPE, md.getReturnType(),
							CoreRebecaLabelUtility.LOCAL_VARIABLE, 0, 0);
				} catch (ScopeException e) {
					e.printStackTrace();
				}
				semanticCheckOfMethod(rcd.getName(), md, CoreRebecaLabelUtility.SYNCH_METHOD);
				scopeHandler.popScopeRecord();
			}

			scopeHandler.popScopeRecord();
		}

		semanticCheckMainBindings(rebecaModel);

		scopeHandler.popScopeRecord();
	}

	private void initalizeSymbolTable() {
		SynchMethodDeclaration getAllActorsMD = new SynchMethodDeclaration();
		getAllActorsMD.setName("getAllActors");
		try {
			GenericType genericListType = (GenericType)TypesUtilities.getInstance().getType("ArrayList<?>");
			GenericTypeInstance genericTypeInstanceListOfActors = new GenericTypeInstance();
			genericTypeInstanceListOfActors.setBase(genericListType);
			genericTypeInstanceListOfActors.getParameters().add(TypesUtilities.REACTIVE_CLASS_TYPE);
			getAllActorsMD.setReturnType(genericTypeInstanceListOfActors);
			symbolTable.addMethod(null, getAllActorsMD, CoreRebecaLabelUtility.SYNCH_METHOD);
		} catch (ExceptionContainer e1) {
			exceptionContainer.addAll(e1);
		} catch (CodeCompilationException e1) {
			exceptionContainer.addException(e1);
		}
		
		SynchMethodDeclaration listSize = new SynchMethodDeclaration();
		listSize.setName("size");
		try {
			GenericType genericListType = (GenericType)TypesUtilities.getInstance().getType("ArrayList<?>");
			listSize.setReturnType(TypesUtilities.INT_TYPE);
			symbolTable.addMethod(genericListType, listSize, CoreRebecaLabelUtility.BUILT_IN_METHOD);
			} catch (ExceptionContainer e1) {
				exceptionContainer.addAll(e1);
			} catch (CodeCompilationException e1) {
				exceptionContainer.addException(e1);
			}
		
		SynchMethodDeclaration listGetItem = new SynchMethodDeclaration();
		listGetItem.setName("get");
		FormalParameterDeclaration fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(TypesUtilities.INT_TYPE);
		listGetItem.getFormalParameters().add(fpd);
		try {
			GenericType genericListType = (GenericType)TypesUtilities.getInstance().getType("ArrayList<?>");
			listGetItem.setReturnType(TypesUtilities.UNKNOWN_TYPE);
			symbolTable.addMethod(genericListType, listGetItem, CoreRebecaLabelUtility.BUILT_IN_METHOD);
			} catch (ExceptionContainer e1) {
				exceptionContainer.addAll(e1);
			} catch (CodeCompilationException e1) {
				exceptionContainer.addException(e1);
			}
		
		SynchMethodDeclaration sqrtMethod = new SynchMethodDeclaration();
		sqrtMethod.setName("sqrt");
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(TypesUtilities.DOUBLE_TYPE);
		sqrtMethod.getFormalParameters().add(fpd);
		sqrtMethod.setReturnType(TypesUtilities.DOUBLE_TYPE);
		try {
			symbolTable.addMethod(null, sqrtMethod,
					CoreRebecaLabelUtility.BUILT_IN_METHOD);
		} catch (ExceptionContainer ec) {
			exceptionContainer.addAll(ec);
		}
		
		SynchMethodDeclaration powMethod = new SynchMethodDeclaration();
		powMethod.setName("pow");
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(TypesUtilities.DOUBLE_TYPE);
		powMethod.getFormalParameters().add(fpd);
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg1");
		fpd.setType(TypesUtilities.DOUBLE_TYPE);
		powMethod.getFormalParameters().add(fpd);
		powMethod.setReturnType(TypesUtilities.DOUBLE_TYPE);
		try {
			symbolTable.addMethod(null, powMethod,
					CoreRebecaLabelUtility.BUILT_IN_METHOD);
		} catch (ExceptionContainer ec) {
			exceptionContainer.addAll(ec);
		}
		
		SynchMethodDeclaration assersionMethod = new SynchMethodDeclaration();
		assersionMethod.setName("assertion");
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(TypesUtilities.BOOLEAN_TYPE);
		assersionMethod.getFormalParameters().add(fpd);
		try {
			symbolTable.addMethod(null, assersionMethod,
					CoreRebecaLabelUtility.ASSERTION);
		} catch (ExceptionContainer ec) {
			exceptionContainer.addAll(ec);
		}
		assersionMethod = new SynchMethodDeclaration();
		assersionMethod.setName("assertion");
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(TypesUtilities.BOOLEAN_TYPE);
		assersionMethod.getFormalParameters().add(fpd);
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg1");
		fpd.setType(TypesUtilities.STRING_TYPE);
		assersionMethod.getFormalParameters().add(fpd);
		try {
			symbolTable.addMethod(null, assersionMethod,
					CoreRebecaLabelUtility.ASSERTION);
		} catch (ExceptionContainer ec) {
			exceptionContainer.addAll(ec);
		}

		if (rebecaModel.getRebecaCode().getEnvironmentVariables() != null) {
			addField(null, rebecaModel.getRebecaCode().getEnvironmentVariables(), AccessModifierUtilities.PUBLIC);
		}

		HashSet<String> reactiveClassesAndInterfaces = new HashSet<String>();

		for (InterfaceDeclaration interfaceDeclaration : rebecaModel.getRebecaCode().getInterfaceDeclaration()) {
			// Check for repeated reactive class name
			if (reactiveClassesAndInterfaces.contains(interfaceDeclaration.getName())) {
				CodeCompilationException rce = new CodeCompilationException(
						"Multiple definition of "
								+ interfaceDeclaration.getName(),
								interfaceDeclaration.getLineNumber(),
								interfaceDeclaration.getCharacter());
				exceptionContainer.addException(rce);
				continue;
			} else {
				reactiveClassesAndInterfaces.add(interfaceDeclaration.getName());
			}

			try {
				Type type = TypesUtilities.getInstance().getType(interfaceDeclaration.getName());
				for (MethodDeclaration methodDeclaration : interfaceDeclaration.getSynchMethods()) {
					SynchMethodDeclaration smd = (SynchMethodDeclaration) methodDeclaration;
					try {
						smd.setReturnType(TypesUtilities.getInstance().getType(smd.getReturnType()));
					}catch (CodeCompilationException e) {
						smd.setReturnType(TypesUtilities.UNKNOWN_TYPE);
						exceptionContainer.addException(e);
					}
					if (methodDeclaration.getName().equals(
							interfaceDeclaration.getName())) {
						exceptionContainer
						.addException(new CodeCompilationException(
								"Interfaces cannot have constructor",
								methodDeclaration.getLineNumber(),
								methodDeclaration.getCharacter()));
					} else
						addMethod(type, methodDeclaration, AccessModifierUtilities.PUBLIC, CoreRebecaLabelUtility.SYNCH_METHOD);
				}
				for (MethodDeclaration methodDeclaration : interfaceDeclaration.getMsgsrvs()) {
					if (methodDeclaration.getName().equals(
							interfaceDeclaration.getName())) {
						exceptionContainer
						.addException(new CodeCompilationException(
								"Invalid usage of message-server specifier for the constructor",
								methodDeclaration.getLineNumber(),
								methodDeclaration.getCharacter()));
					} else
						addMethod(type, methodDeclaration, AccessModifierUtilities.PUBLIC, CoreRebecaLabelUtility.MSGSRV);
				}
			} catch (CodeCompilationException e) {
				e.printStackTrace();
			}
		}

		for (ReactiveClassDeclaration reactiveClassDeclaration : rebecaModel.getRebecaCode().getReactiveClassDeclaration()) {
			// Check for repeated reactive class name
			if (reactiveClassesAndInterfaces.contains(reactiveClassDeclaration.getName())) {
				CodeCompilationException rce = new CodeCompilationException(
						"Multiple definition of "
								+ reactiveClassDeclaration.getName(),
								reactiveClassDeclaration.getLineNumber(),
								reactiveClassDeclaration.getCharacter());
				exceptionContainer.addException(rce);
				continue;
			} else {
				reactiveClassesAndInterfaces.add(reactiveClassDeclaration.getName());
			}

			if (reactiveClassDeclaration.getConstructors().isEmpty()) {
				if (!compilerFeatures.contains(CompilerFeature.CORE_2_0)) {
					ConstructorDeclaration defaultConstructor = new ConstructorDeclaration();
					defaultConstructor.setName(reactiveClassDeclaration.getName());
					defaultConstructor.setBlock(new BlockStatement());
					reactiveClassDeclaration.getConstructors().add(defaultConstructor);
				}
			}
			try {
				Type type = TypesUtilities.getInstance().getType(reactiveClassDeclaration.getName());
				addField(type, reactiveClassDeclaration.getKnownRebecs(), AccessModifierUtilities.PRIVATE);
				addField(type, reactiveClassDeclaration.getStatevars(), AccessModifierUtilities.PRIVATE);
				for (int cnt = 0; cnt < reactiveClassDeclaration.getConstructors().size(); cnt++) {
					ConstructorDeclaration constructorDeclaration = reactiveClassDeclaration.getConstructors().get(cnt);
					if (compilerFeatures.contains(CompilerFeature.CORE_2_0)) {
						CodeCompilationException rce = new CodeCompilationException(
								"Rebeca core 2.0 dose not support constructor",
								constructorDeclaration.getLineNumber(),
								constructorDeclaration.getCharacter());
						exceptionContainer.addException(rce);
					}
					if (constructorDeclaration.getName().equals(
							reactiveClassDeclaration.getName())) {
						addMethod(type, constructorDeclaration, 
								AccessModifierUtilities.PUBLIC, CoreRebecaLabelUtility.CONSTRUCTOR);
					} else {
						exceptionContainer.addException(new CodeCompilationException(
								"Return type for the method is missing",
								constructorDeclaration.getLineNumber(),
								constructorDeclaration.getCharacter()));
						SynchMethodDeclaration smd = new SynchMethodDeclaration();
						smd.setBlock(constructorDeclaration.getBlock());
						smd.setCharacter(constructorDeclaration.getCharacter());
						smd.setLineNumber(constructorDeclaration.getLineNumber());
						smd.setName(constructorDeclaration.getName());
						smd.setReturnType(TypesUtilities.NO_TYPE);
						smd.setAccessModifier(constructorDeclaration.getAccessModifier());
						addMethod(type, smd, 
								AccessModifierUtilities.PUBLIC, CoreRebecaLabelUtility.SYNCH_METHOD);
						reactiveClassDeclaration.getConstructors().remove(cnt);
						reactiveClassDeclaration.getSynchMethods().add(smd);
						cnt--;
					}
				}

				for (MethodDeclaration methodDeclaration : reactiveClassDeclaration.getSynchMethods()) {
					SynchMethodDeclaration smd = (SynchMethodDeclaration) methodDeclaration;
					try {
						smd.setReturnType(TypesUtilities.getInstance().getType(smd.getReturnType()));
					}catch (CodeCompilationException e) {
						smd.setReturnType(TypesUtilities.UNKNOWN_TYPE);
						exceptionContainer.addException(e);
					}
					if (methodDeclaration.getName().equals(
							reactiveClassDeclaration.getName())) {
						exceptionContainer
						.addException(new CodeCompilationException(
								"Invalid return type for the constructor",
								methodDeclaration.getLineNumber(),
								methodDeclaration.getCharacter()));
						addMethod(type, methodDeclaration, AccessModifierUtilities.PUBLIC, CoreRebecaLabelUtility.CONSTRUCTOR);
					} else 
						addMethod(type, methodDeclaration, AccessModifierUtilities.PRIVATE, CoreRebecaLabelUtility.SYNCH_METHOD);
				}
				for (MethodDeclaration methodDeclaration : reactiveClassDeclaration.getMsgsrvs()) {
					if (methodDeclaration.getName().equals(
							reactiveClassDeclaration.getName())) {
						exceptionContainer
						.addException(new CodeCompilationException(
								"Invalid usage of message-server specifier for the constructor",
								methodDeclaration.getLineNumber(),
								methodDeclaration.getCharacter()));
						addMethod(type, methodDeclaration, AccessModifierUtilities.PUBLIC, CoreRebecaLabelUtility.CONSTRUCTOR);
					} else
						addMethod(type, methodDeclaration, AccessModifierUtilities.PUBLIC, CoreRebecaLabelUtility.MSGSRV);
				}
			} catch (CodeCompilationException e) {
				e.printStackTrace();
			}
		}
	}

	private void addMethod(Type container, MethodDeclaration methodDecleration,
			AccessModifier defaultAccessModifier, Label label) {
		if (methodDecleration.getAccessModifier() == null)
			methodDecleration.setAccessModifier(defaultAccessModifier);
		try {
			symbolTable.addMethod(container, methodDecleration, label);
		} catch (ExceptionContainer ec) {
			exceptionContainer.addAll(ec);
		}
	}

	private void addField(Type container, List<FieldDeclaration> fieldDeclarations, AccessModifier defaultModifier) {
		for (FieldDeclaration fieldDeclaration : fieldDeclarations) {
			try {
				fieldDeclaration.setType(TypesUtilities.getInstance().getType(fieldDeclaration.getType()));
				if(fieldDeclaration.getAccessModifier() == null)
					fieldDeclaration.setAccessModifier(defaultModifier);
				symbolTable.addVarible(container, fieldDeclaration);
			} catch (CodeCompilationException e) {
				exceptionContainer.addException(e);
			}
		}
	}

	private void semanticCheckOfMethod(String reactiveClassName, MethodDeclaration md, Label label) {
		scopeHandler.pushScopeRecord(label);

		// Adding the parameters of the method
		for (FormalParameterDeclaration fpd : md.getFormalParameters()) {
			try {
				fpd.setType(TypesUtilities.getInstance().getType(fpd.getType()));
				scopeHandler.addVaribaleToCurrentScope(fpd.getName(), fpd.getType(),
						CoreRebecaLabelUtility.METHOD_PARAMETER_VARIABLE,
						fpd.getLineNumber(), fpd.getCharacter());
			} catch (ScopeException se) {
				se.setColumn(fpd.getCharacter());
				se.setLine(fpd.getLineNumber());
				this.exceptionContainer.addException(se);
			} catch (CodeCompilationException cce) {
				cce.setColumn(fpd.getCharacter());
				cce.setLine(fpd.getLineNumber());
				this.exceptionContainer.addException(cce);
			}
		}

		if (md.isAbstract()) {
			if(md.getBlock() != null) {
				exceptionContainer
				.addException(new CodeCompilationException(
						"Abstract methods do not specify body",
						md.getLineNumber(),
						md.getCharacter()));
			}
		} else {
			if(md.getBlock() == null) {
				exceptionContainer
				.addException(new CodeCompilationException(
						"This method requires a body instead of a semicolon",
						md.getLineNumber(),
						md.getCharacter()));
			} else 
				statementSemanticCheckContainer.check(md.getBlock());
		}

		scopeHandler.popScopeRecord();
	}

	private void addIntraReactiveClassVariablesToScope(ReactiveClassDeclaration rcd) {
		for (FieldDeclaration fd : rcd.getStatevars()) {
			statementSemanticCheckContainer.check(fd);
			for (VariableDeclarator vd : fd.getVariableDeclarators()) {
				if (vd.getVariableInitializer() != null) {
					CodeCompilationException rce = new CodeCompilationException(
							"State variables are allowed to be initialized in constructors",
							vd.getLineNumber(), vd.getCharacter());
					exceptionContainer.addException(rce);
				}
			}
		}

		for (FieldDeclaration fd : rcd.getKnownRebecs()) {
			statementSemanticCheckContainer.check(fd);
			for (VariableDeclarator vd : fd.getVariableDeclarators()) {
				scopeHandler.updateVaribaleInCurrentScope(vd.getVariableName(),
						fd.getType(), CoreRebecaLabelUtility.KNOWNREBEC_VARIABLE, 
						vd.getLineNumber(), vd.getCharacter());

				if (vd.getVariableInitializer() != null) {
					CodeCompilationException rce = new CodeCompilationException(
							"Known rebecs are only initialized during instantiation",
							vd.getLineNumber(), vd.getCharacter());
					exceptionContainer.addException(rce);
				}
			}
		}
	}

	private void addEnvironmentVariablesToScope() {
		// Adding the environment variables
		for (FieldDeclaration fd : rebecaModel.getRebecaCode()
				.getEnvironmentVariables()) {
			if (compilerFeatures.contains(CompilerFeature.CORE_2_0)) {
				CodeCompilationException rce = new CodeCompilationException(
						"Rebeca core 2.0 dose not support environment variables",
						fd.getLineNumber(), fd.getCharacter());
				exceptionContainer.addException(rce);
			}

			statementSemanticCheckContainer.check(fd);
			for (VariableDeclarator vd : fd.getVariableDeclarators()) {
				if (vd.getVariableInitializer() == null) {
					CodeCompilationException rce = new CodeCompilationException(
							"Environment variable " + vd.getVariableName()
							+ " has to be initialized",
							vd.getLineNumber(), vd.getCharacter());
					exceptionContainer.addException(rce);
				}
			}
		}
	}

	private void semanticCheckMainBindings(RebecaModel rebecaModel) {

		// Initializing the scope stack by the defined actors and check for repeated actors
		// Types of actor instances are set here.
		scopeHandler.pushScopeRecord(CoreRebecaLabelUtility.MAIN);
		for (MainRebecDefinition mrd : rebecaModel.getRebecaCode()
				.getMainDeclaration().getMainRebecDefinition()) {
			try {
				scopeHandler.retreiveVariableFromScope(mrd.getName());
				CodeCompilationException rce = new CodeCompilationException(
						"Multiple definition for the actor " + mrd.getName(),
						mrd.getLineNumber(), mrd.getCharacter());
				this.exceptionContainer.addException(rce);
				continue;
			} catch (ScopeException se) {
				try {
					Type type = TypesUtilities.getInstance().getType(
							mrd.getType());
					mrd.setType(type);
					scopeHandler.addVaribaleToCurrentScope(mrd.getName(), type, 
							CoreRebecaLabelUtility.LOCAL_VARIABLE,
							mrd.getLineNumber(), mrd.getCharacter());
				} catch (CodeCompilationException cce) {
					cce.setColumn(mrd.getCharacter());
					cce.setLine(mrd.getLineNumber());
					exceptionContainer.addException(cce);
					continue;
				}
			}
		}

		HashMap<String, ReactiveClassDeclaration> reactiveClasses = new HashMap<String, ReactiveClassDeclaration>();
		for (ReactiveClassDeclaration rcd : rebecaModel.getRebecaCode()
				.getReactiveClassDeclaration()) {
			reactiveClasses.put(rcd.getName(), rcd);
		}
		for (MainRebecDefinition mrd : rebecaModel.getRebecaCode()
				.getMainDeclaration().getMainRebecDefinition()) {
			String methodName = (compilerFeatures
					.contains(CompilerFeature.CORE_2_0) ? "initial"
							: TypesUtilities.getTypeName(mrd.getType()));

			LinkedList<Type> constructorArgumentsTypes = new LinkedList<Type>();
			for (Expression expression : mrd.getArguments()) {
				constructorArgumentsTypes.add(statementSemanticCheckContainer.check(expression).getFirst());
			}
			LinkedList<Type> knownRebecsBindingsTypes = new LinkedList<Type>();
			for (Expression expression : mrd.getBindings()) {
				knownRebecsBindingsTypes.add(statementSemanticCheckContainer.check(expression).getFirst());
			}

			ReactiveClassDeclaration rcd = reactiveClasses.get(TypesUtilities.getTypeName(mrd.getType()));			
			List<FieldDeclaration> knownRebecs = rcd.getKnownRebecs();
			List<Type> exprectedTypes = new LinkedList<Type>();
			for (FieldDeclaration fd : knownRebecs) {
				for(int variableCounter = 0; variableCounter < fd.getVariableDeclarators().size(); variableCounter++) {
					if (fd.getType() instanceof OrdinaryPrimitiveType) {
						try {
							exprectedTypes.add(TypesUtilities.getInstance()
									.getType(fd.getType()));
						} catch (CodeCompilationException e) {
							exprectedTypes.add(TypesUtilities.UNKNOWN_TYPE);
							e.setColumn(fd.getCharacter());
							e.setLine(fd.getLineNumber());
							exceptionContainer.addException(e);
						}
					} else if (fd.getType() instanceof ArrayType) {
						ArrayType type = (ArrayType) fd.getType();
						Type primitiveType = TypesUtilities.UNKNOWN_TYPE;
						try {
							primitiveType = TypesUtilities.getInstance().getType(
									type.getOrdinaryPrimitiveType());
						} catch (CodeCompilationException e) {
							e.setColumn(fd.getCharacter());
							e.setLine(fd.getLineNumber());
							exceptionContainer.addException(e);
						}
						for (Integer dimention : type.getDimensions())
							for (int cnt = 0; cnt < dimention; cnt++)
								exprectedTypes.add(primitiveType);
					}
				}
				try {
					mrd.setType(TypesUtilities.getInstance().getType(mrd.getType()));
				} catch (CodeCompilationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			try {
				symbolTable.getMethodSpecification(mrd.getType(), methodName,
						constructorArgumentsTypes);
			} catch (SymbolTableException ste) {
				ste.setColumn(mrd.getCharacter());
				ste.setLine(mrd.getLineNumber());
				exceptionContainer.addException(ste);
			}
			if (!TypesUtilities.areTheSame(knownRebecsBindingsTypes,
					exprectedTypes, TypesUtilities.getInstance()
					.getCastableComparator())) {
				CodeCompilationException rce = new CodeCompilationException(
						createCheckMainBindingsExceptionMessage(knownRebecs,
								knownRebecsBindingsTypes, rcd.getName()),
						mrd.getLineNumber(), mrd.getCharacter());
				exceptionContainer.addException(rce);
			}
		}
		scopeHandler.popScopeRecord();
	}

	private static String createCheckMainBindingsExceptionMessage(
			List<FieldDeclaration> knownRebecs, List<Type> bindings,
			String reactiveClassName) {
		String expected = "", actual = "";

		for (FieldDeclaration fd : knownRebecs)
			expected += ", " + TypesUtilities.getTypeName(fd.getType());
		// remove the first comma from "expected".
		if (!knownRebecs.isEmpty())
			expected = expected.substring(2);

		for (Type type : bindings) {
			actual += ", " + TypesUtilities.getTypeName(type);
		}
		// remove the first comma from "actual".
		if (!bindings.isEmpty())
			actual = actual.substring(2);

		return "The " + reactiveClassName + " knownrebecs type binding of ("
		+ expected + ")" + " is not applicable for the arguments ("
		+ actual + ")";
	}
}