package org.rebecalang.compiler.modelcompiler.corerebeca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.ScopeException;
import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.StatementSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.SymbolTableException;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractCompilerFacade;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.SymbolTableInitializer;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.TypeSystemInitializer;
import org.rebecalang.compiler.modelcompiler.corerebeca.compiler.CoreRebecaCompleteLexer;
import org.rebecalang.compiler.modelcompiler.corerebeca.compiler.CoreRebecaCompleteParser;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Annotation;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ArrayType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BaseClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BinaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BlockStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BreakStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.CastExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ConditionalStatement;
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
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.RebecInstantiationExpressionDummySemanticCheck;
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
import org.rebecalang.compiler.utils.CoreVersion;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CORE_REBECA")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CoreRebecaCompleteCompilerFacade extends AbstractCompilerFacade {

	
	public static final String PRIORITY_LABEL = "Priority";
	public static final String GLOBAL_PRIORITY_LABEL = "GlobalPriority";
	
	public CoreRebecaCompleteCompilerFacade(@Qualifier("CORE_REBECA") TypeSystemInitializer typeSystemInitializer,
			@Qualifier("CORE_REBECA") SymbolTableInitializer symbolTableInitializer) {
		super(typeSystemInitializer, symbolTableInitializer);		
	}

	public final static String OWNER_REACTIVE_CLASS_KEY = "$owner$";

	protected AbstractTypeSystem typeSystem;

	@Autowired
	protected ExpressionSemanticCheckContainer expressionSemanticCheckContainer;

	@Autowired
	protected StatementSemanticCheckContainer statementSemanticCheckContainer;

	@Autowired
	private ConfigurableApplicationContext appContext;

	@Autowired
	public void setTypeSystem(@Qualifier("CORE_REBECA") AbstractTypeSystem typeSystem) {
		this.typeSystem = typeSystem;
	}
	
	protected void addMethodsOfRebecaExtensionToSymbolTable() {
		try {
			GenericType genericListType = (GenericType) typeSystem.getType("ArrayList<?>");
			GenericTypeInstance genericTypeInstanceListOfActors = new GenericTypeInstance();
			genericTypeInstanceListOfActors.setBase(genericListType);
			genericTypeInstanceListOfActors.getParameters().add(CoreRebecaTypeSystem.REACTIVE_CLASS_TYPE);
			addMethodToSymbolTable(CoreRebecaLabelUtility.BUILT_IN_METHOD, null, "getAllActors",
					genericTypeInstanceListOfActors);

			addMethodToSymbolTable(CoreRebecaLabelUtility.BUILT_IN_METHOD, genericListType, "size",
					CoreRebecaTypeSystem.INT_TYPE);

			addMethodToSymbolTable(CoreRebecaLabelUtility.BUILT_IN_METHOD, genericListType, "get",
					AbstractTypeSystem.UNKNOWN_TYPE, new Pair<Type, String>(CoreRebecaTypeSystem.INT_TYPE, "arg0"));

		} catch (CodeCompilationException e) {
			exceptionContainer.addException(e);
		}

		addMethodToSymbolTable(CoreRebecaLabelUtility.BUILT_IN_METHOD, null, "sqrt", CoreRebecaTypeSystem.DOUBLE_TYPE,
				new Pair<Type, String>(CoreRebecaTypeSystem.DOUBLE_TYPE, "arg0"));

		addMethodToSymbolTable(CoreRebecaLabelUtility.BUILT_IN_METHOD, null, "pow", CoreRebecaTypeSystem.DOUBLE_TYPE,
				new Pair<Type, String>(CoreRebecaTypeSystem.DOUBLE_TYPE, "arg0"),
				new Pair<Type, String>(CoreRebecaTypeSystem.DOUBLE_TYPE, "arg1"));

		addMethodToSymbolTable(CoreRebecaLabelUtility.BUILT_IN_METHOD, null, "assertion",
				CoreRebecaTypeSystem.VOID_TYPE, new Pair<Type, String>(CoreRebecaTypeSystem.BOOLEAN_TYPE, "arg0"));

		addMethodToSymbolTable(CoreRebecaLabelUtility.BUILT_IN_METHOD, null, "assertion",
				CoreRebecaTypeSystem.VOID_TYPE, new Pair<Type, String>(CoreRebecaTypeSystem.BOOLEAN_TYPE, "arg0"),
				new Pair<Type, String>(CoreRebecaTypeSystem.STRING_TYPE, "arg1"));
	}

	@Override
	protected void addVariablesOfRebecaExtensionToScope() {		
	}

	protected void initializeStatementSemanticCheckContainer() {
		statementSemanticCheckContainer.clear();
		statementSemanticCheckContainer.setExpressionSemanticCheckContainer(expressionSemanticCheckContainer);
		statementSemanticCheckContainer.registerSemanticsChecker(BlockStatement.class,
				appContext.getBean(BlockStatementSemanticCheck.class ,
						statementSemanticCheckContainer));
		statementSemanticCheckContainer.registerSemanticsChecker(BreakStatement.class,
				appContext.getBean(BreakStatementSemanticCheck.class));
		statementSemanticCheckContainer.registerSemanticsChecker(ConditionalStatement.class,
				appContext.getBean(ConditionalStatementSemanticCheck.class,
						statementSemanticCheckContainer,
						expressionSemanticCheckContainer));
		statementSemanticCheckContainer.registerSemanticsChecker(ContinueStatement.class,
				appContext.getBean(ContinueStatementSemanticCheck.class));
		statementSemanticCheckContainer.registerSemanticsChecker(FieldDeclaration.class,
				appContext.getBean(FieldDeclarationStatementSemanticCheck.class, 
						typeSystem, 
						statementSemanticCheckContainer, 
						expressionSemanticCheckContainer));
		statementSemanticCheckContainer.registerSemanticsChecker(ForStatement.class, 
				appContext.getBean(ForStatementSemanticCheck.class,
						statementSemanticCheckContainer,
						expressionSemanticCheckContainer));
		statementSemanticCheckContainer.registerSemanticsChecker(WhileStatement.class,
				appContext.getBean(WhileStatementSemanticCheck.class,
						statementSemanticCheckContainer,
						expressionSemanticCheckContainer));
		statementSemanticCheckContainer.registerSemanticsChecker(ReturnStatement.class,
				appContext.getBean(ReturnStatementSemanticCheck.class,
						statementSemanticCheckContainer));
		statementSemanticCheckContainer.registerSemanticsChecker(SwitchStatement.class,
				appContext.getBean(SwitchStatementSemanticCheck.class,
						statementSemanticCheckContainer,
						expressionSemanticCheckContainer));
	}

	protected void initializeExpressionSemanticCheckContainer() {
		expressionSemanticCheckContainer.clear();

		expressionSemanticCheckContainer.registerSemanticsChecker(CastExpression.class,
				appContext.getBean(CastExpressionSemanticCheck.class, 
						typeSystem,
						expressionSemanticCheckContainer));
		expressionSemanticCheckContainer.registerSemanticsChecker(DotPrimary.class,
				appContext.getBean(DotPrimaryExpressionSemanticCheck.class,
						expressionSemanticCheckContainer));
		expressionSemanticCheckContainer.registerSemanticsChecker(Literal.class, 
				appContext.getBean(LiteralSemanticCheck.class));
		expressionSemanticCheckContainer.registerSemanticsChecker(PlusSubExpression.class,
				appContext.getBean(PlusSubExpressionSemanticCheck.class,
						expressionSemanticCheckContainer));
		expressionSemanticCheckContainer.registerSemanticsChecker(NonDetExpression.class,
				appContext.getBean(NondetExpressionSemanticCheck.class,
						expressionSemanticCheckContainer));
		expressionSemanticCheckContainer.registerSemanticsChecker(TermPrimary.class,
				(PrimaryTermExpressionSemanticCheck)appContext.getBean("CORE_PRIMARY", 
						typeSystem,
						expressionSemanticCheckContainer));
		expressionSemanticCheckContainer.registerSemanticsChecker(TernaryExpression.class,
				appContext.getBean(TernaryExpressionSemanticCheck.class,
					expressionSemanticCheckContainer));
		expressionSemanticCheckContainer.registerSemanticsChecker(UnaryExpression.class,
				appContext.getBean(UnaryExpressionSemanticCheck.class,
						expressionSemanticCheckContainer));
		expressionSemanticCheckContainer.registerSemanticsChecker(BinaryExpression.class,
				appContext.getBean(BinaryExpressionSemanticCheck.class,
						expressionSemanticCheckContainer));
		expressionSemanticCheckContainer.registerSemanticsChecker(InstanceofExpression.class,
				appContext.getBean(InstanceofExpressionSemanticCheck.class, 
						typeSystem,
						expressionSemanticCheckContainer));

		if (coreVersion == CoreVersion.CORE_2_2) {
			expressionSemanticCheckContainer.registerSemanticsChecker(RebecInstantiationPrimary.class,
					appContext.getBean(RebecInstantiationExpressionSemanticCheck.class, 
							typeSystem));
		} else {
			expressionSemanticCheckContainer.registerSemanticsChecker(RebecInstantiationPrimary.class,
					appContext.getBean(RebecInstantiationExpressionDummySemanticCheck.class, 
							typeSystem));
		}
	}

	private boolean coreVersionIsCompatibleWithInheritanceAndInterfaceDeclaration() {

		return !(coreVersion == CoreVersion.CORE_2_0 || coreVersion == CoreVersion.CORE_2_1
				|| coreVersion == CoreVersion.CORE_2_2);
	}

	@Override
	public void semanticCheck() {

		super.semanticCheck();

		scopeHandler.pushScopeRecord(CoreRebecaLabelUtility.REBECA_MODEL);

		addEnvironmentVariablesToScope();
		
		semanticCheckReactiveClassDeclarations();

		semanticCheckMainBindings(rebecaModel);

		scopeHandler.popScopeRecord();
	}

	protected void semanticCheckReactiveClassDeclarations() {
				
		for (ReactiveClassDeclaration rcd : rebecaModel.getRebecaCode().getReactiveClassDeclaration()) {

			scopeHandler.pushScopeRecord(CoreRebecaLabelUtility.REACTIVE_CLASS);

			addStatevarsToScope(rcd);

			semanticCheckForConstructorsOfReactiveClassDeclaration(rcd);

			semanticCheckForSynchMethodsOfReactiveClassDeclaration(rcd);

			semanticCheckForMessageServersOfReactiveClassDeclaration(rcd);

			scopeHandler.popScopeRecord();
		}
	}

	protected void semanticCheckForMessageServersOfReactiveClassDeclaration(ReactiveClassDeclaration rcd) {
		try {
			scopeHandler.addVariableToCurrentScope("sender", CoreRebecaTypeSystem.REACTIVE_CLASS_TYPE,
					CoreRebecaLabelUtility.RESERVED_WORD, 0, 0);
		} catch (ScopeException e) {
			e.printStackTrace();
		}
		for (MethodDeclaration md : rcd.getMsgsrvs()) {

			semanticCheckOfMethod(rcd.getName(), md, CoreRebecaLabelUtility.MSGSRV);
			if (md.isAbstract() && !coreVersionIsCompatibleWithInheritanceAndInterfaceDeclaration()) {

				CodeCompilationException cce = new CodeCompilationException(
						"Rebeca core prior to 2.3 dose not support abstract message servers", md.getLineNumber(),
						md.getCharacter());
				exceptionContainer.addException(cce);
			}
		}
	}

	protected void semanticCheckForSynchMethodsOfReactiveClassDeclaration(ReactiveClassDeclaration rcd) {
		for (SynchMethodDeclaration md : rcd.getSynchMethods()) {

			if (md.isAbstract() && !coreVersionIsCompatibleWithInheritanceAndInterfaceDeclaration()) {

				CodeCompilationException cce = new CodeCompilationException(
						"Rebeca core prior to 2.3 dose not support abstract methods", md.getLineNumber(),
						md.getCharacter());
				exceptionContainer.addException(cce);
			}
			scopeHandler.pushScopeRecord(null);
			try {
				scopeHandler.addVariableToCurrentScope(ScopeHandler.RETURN_VALUE_KEY_IN_SCOPE, md.getReturnType(),
						CoreRebecaLabelUtility.LOCAL_VARIABLE, 0, 0);
			} catch (ScopeException e) {
				e.printStackTrace();
			}
			semanticCheckOfMethod(rcd.getName(), md, CoreRebecaLabelUtility.SYNCH_METHOD);
			scopeHandler.popScopeRecord();
		}
	}

	protected void semanticCheckForConstructorsOfReactiveClassDeclaration(ReactiveClassDeclaration rcd) {
		try {
			scopeHandler.addVariableToCurrentScope(OWNER_REACTIVE_CLASS_KEY, typeSystem.getType(rcd.getName()),
					CoreRebecaLabelUtility.RESERVED_WORD, 0, 0);
			scopeHandler.addVariableToCurrentScope("self", typeSystem.getType(rcd.getName()),
					CoreRebecaLabelUtility.RESERVED_WORD, 0, 0);
		} catch (CodeCompilationException e) {
			e.printStackTrace();
		}

		// Semantic check of method likes constructs
		for (MethodDeclaration md : rcd.getConstructors()) {
			semanticCheckOfMethod(rcd.getName(), md, CoreRebecaLabelUtility.CONSTRUCTOR);
		}
	}

	protected void addStatevarsToScope(ReactiveClassDeclaration rcd) {
		if ((rcd.getExtends() != null || rcd.isAbstract())
				&& !coreVersionIsCompatibleWithInheritanceAndInterfaceDeclaration()) {

			CodeCompilationException cce = new CodeCompilationException(
					"Rebeca core prior to 2.3 dose not support inheritance", rcd.getLineNumber(), rcd.getCharacter());
			exceptionContainer.addException(cce);
		}

		ReactiveClassDeclaration tempRC = rcd;
		Stack<ReactiveClassDeclaration> extendStack = new Stack<ReactiveClassDeclaration>();

		extendStack.push(rcd);

		// adding ancestors variables (if any) to scope
		Set<String> reactiveClassNamesForLoopBreaking = new HashSet<String>();
		reactiveClassNamesForLoopBreaking.add(rcd.getName());

		while (tempRC.getExtends() != null) {

			try {
				ReactiveClassDeclaration metaData = (ReactiveClassDeclaration) typeSystem
						.getMetaData(tempRC.getExtends());
				extendStack.push(metaData);

				if (reactiveClassNamesForLoopBreaking.contains(metaData.getName())) {
					break;
				}
				reactiveClassNamesForLoopBreaking.add(metaData.getName());
				tempRC = metaData;

			} catch (CodeCompilationException e) {
				// This case has been handled before
				break;
			}
		}
		while (!extendStack.isEmpty()) {
			addIntraReactiveClassVariablesToScope(extendStack.pop());
		}
	}

	private void semanticCheckOfMethod(String reactiveClassName, MethodDeclaration md, Label label) {
		scopeHandler.pushScopeRecord(label);

		// Adding the parameters of the method

		checkPriorityAnnotations(md.getAnnotations());
		for (FormalParameterDeclaration fpd : md.getFormalParameters()) {
			try {
				fpd.setType(typeSystem.getType(fpd.getType()));
				scopeHandler.addVariableToCurrentScope(fpd.getName(), fpd.getType(),
						CoreRebecaLabelUtility.METHOD_PARAMETER_VARIABLE, fpd.getLineNumber(), fpd.getCharacter());
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
			if (md.getBlock() != null) {
				exceptionContainer.addException(new CodeCompilationException("Abstract methods do not specify body",
						md.getLineNumber(), md.getCharacter()));
			}
		} else {
			if (md.getBlock() == null) {
				exceptionContainer.addException(new CodeCompilationException(
						"This method requires a body instead of a semicolon", md.getLineNumber(), md.getCharacter()));
			} else
				statementSemanticCheckContainer.check(md.getBlock());
		}

		scopeHandler.popScopeRecord();
	}

	protected void addIntraReactiveClassVariablesToScope(ReactiveClassDeclaration rcd) {
		for (FieldDeclaration fd : rcd.getStatevars()) {
			statementSemanticCheckContainer.check(fd);
			for (VariableDeclarator vd : fd.getVariableDeclarators()) {
				if (vd.getVariableInitializer() != null) {
					CodeCompilationException rce = new CodeCompilationException(
							"State variables are allowed to be initialized in constructors", vd.getLineNumber(),
							vd.getCharacter());
					exceptionContainer.addException(rce);
				}
			}
		}

		for (FieldDeclaration fd : rcd.getKnownRebecs()) {
			statementSemanticCheckContainer.check(fd);
			for (VariableDeclarator vd : fd.getVariableDeclarators()) {
				scopeHandler.updateVaribaleInCurrentScope(vd.getVariableName(), fd.getType(),
						CoreRebecaLabelUtility.KNOWNREBEC_VARIABLE, vd.getLineNumber(), vd.getCharacter());

				if (vd.getVariableInitializer() != null) {
					CodeCompilationException rce = new CodeCompilationException(
							"Known rebecs are only initialized during instantiation", vd.getLineNumber(),
							vd.getCharacter());
					exceptionContainer.addException(rce);
				}
			}
		}
	}

	protected void addEnvironmentVariablesToScope() {
		for (FieldDeclaration fd : rebecaModel.getRebecaCode().getEnvironmentVariables()) {
			if (coreVersion == CoreVersion.CORE_2_0) {
				CodeCompilationException rce = new CodeCompilationException(
						"Rebeca core 2.0 dose not support environment variables", fd.getLineNumber(),
						fd.getCharacter());
				exceptionContainer.addException(rce);
				return;
			}

			statementSemanticCheckContainer.check(fd);

			for (VariableDeclarator vd : fd.getVariableDeclarators()) {
				if (vd.getVariableInitializer() == null) {
					CodeCompilationException rce = new CodeCompilationException(
							"Environment variable " + vd.getVariableName() + " has to be initialized",
							vd.getLineNumber(), vd.getCharacter());
					exceptionContainer.addException(rce);
				}
			}
		}
	}


	private void semanticCheckMainBindings(RebecaModel rebecaModel) {

		// Initializing the scope stack by the defined actors and check for repeated
		// actors
		// Types of actor instances are set here.
		scopeHandler.pushScopeRecord(CoreRebecaLabelUtility.MAIN);
		for (MainRebecDefinition mrd : rebecaModel.getRebecaCode().getMainDeclaration().getMainRebecDefinition()) {
			try {
				scopeHandler.retreiveVariableFromScope(mrd.getName());
				CodeCompilationException rce = new CodeCompilationException(
						"Multiple definition for the actor " + mrd.getName(), mrd.getLineNumber(), mrd.getCharacter());
				this.exceptionContainer.addException(rce);
				continue;
			} catch (ScopeException se) {
				try {
					Type type = typeSystem.getType(mrd.getType());
					mrd.setType(type);
					scopeHandler.addVariableToCurrentScope(mrd.getName(), type, CoreRebecaLabelUtility.LOCAL_VARIABLE,
							mrd.getLineNumber(), mrd.getCharacter());
					BaseClassDeclaration mrdMetaData = typeSystem.getMetaData(mrd.getType());
					if (mrdMetaData instanceof InterfaceDeclaration) {
						CodeCompilationException rce = new CodeCompilationException(
								"Cannot instantiate from interface " + mrdMetaData.getName(), mrd.getLineNumber(),
								mrd.getCharacter());
						this.exceptionContainer.addException(rce);
					} else if (mrdMetaData instanceof ReactiveClassDeclaration) {
						ReactiveClassDeclaration rcd = (ReactiveClassDeclaration) mrdMetaData;
						if (rcd.isAbstract()) {
							CodeCompilationException rce = new CodeCompilationException(
									"Cannot instantiate from abstract reactiveclass " + rcd.getName(),
									mrd.getLineNumber(), mrd.getCharacter());
							this.exceptionContainer.addException(rce);
						}
					}
					checkPriorityAnnotations(mrd.getAnnotations());
				} catch (CodeCompilationException cce) {
					cce.setColumn(mrd.getCharacter());
					cce.setLine(mrd.getLineNumber());
					exceptionContainer.addException(cce);
					continue;
				}
			}
		}

		HashMap<String, ReactiveClassDeclaration> reactiveClasses = getAllClasses();

		for (MainRebecDefinition mrd : rebecaModel.getRebecaCode().getMainDeclaration().getMainRebecDefinition()) {
			String methodName = ((coreVersion == CoreVersion.CORE_2_0) ? "initial" : mrd.getType().getTypeName());

			LinkedList<Type> constructorArgumentsTypes = new LinkedList<Type>();
			for (Expression expression : mrd.getArguments()) {
				constructorArgumentsTypes.add(statementSemanticCheckContainer.check(expression).getFirst());
			}
			LinkedList<Type> knownRebecsBindingsTypes = new LinkedList<Type>();
			for (Expression expression : mrd.getBindings()) {
				knownRebecsBindingsTypes.add(statementSemanticCheckContainer.check(expression).getFirst());
			}

			ReactiveClassDeclaration rcd = reactiveClasses.get(mrd.getType().getTypeName());
			List<FieldDeclaration> knownRebecs = getKnownRebecs(rcd);
			List<Type> exprectedTypes = new LinkedList<Type>();
			for (FieldDeclaration fd : knownRebecs) {
				for (int variableCounter = 0; variableCounter < fd.getVariableDeclarators().size(); variableCounter++) {
					if (fd.getType() instanceof OrdinaryPrimitiveType) {
						try {
							exprectedTypes.add(typeSystem.getType(fd.getType()));
						} catch (CodeCompilationException e) {
							exprectedTypes.add(AbstractTypeSystem.UNKNOWN_TYPE);
							e.setColumn(fd.getCharacter());
							e.setLine(fd.getLineNumber());
							exceptionContainer.addException(e);
						}
					} else if (fd.getType() instanceof ArrayType) {
						ArrayType type = (ArrayType) fd.getType();
						Type primitiveType = AbstractTypeSystem.UNKNOWN_TYPE;
						try {
							primitiveType = typeSystem.getType(type.getOrdinaryPrimitiveType());
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
					mrd.setType(typeSystem.getType(mrd.getType()));
				} catch (CodeCompilationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			try {
				symbolTable.getCastableMethodSpecification(mrd.getType(), methodName, constructorArgumentsTypes);
			} catch (SymbolTableException ste) {
				ste.setColumn(mrd.getCharacter());
				ste.setLine(mrd.getLineNumber());
				exceptionContainer.addException(ste);
			}
			if (!TypesUtilities.areTheSame(knownRebecsBindingsTypes, exprectedTypes, Type.getCastableComparator())) {
				CodeCompilationException rce = new CodeCompilationException(
						createCheckMainBindingsExceptionMessage(knownRebecs, knownRebecsBindingsTypes, rcd.getName()),
						mrd.getLineNumber(), mrd.getCharacter());
				exceptionContainer.addException(rce);
			}
		}
		scopeHandler.popScopeRecord();
	}

	private ArrayList<FieldDeclaration> getKnownRebecs(ReactiveClassDeclaration lastRebec){
		ArrayList<ReactiveClassDeclaration> rebecsSeries = new ArrayList<>();
		ArrayList<FieldDeclaration> knownRebecs = new ArrayList<>();
		ReactiveClassDeclaration curRebec = lastRebec;

		while (curRebec.getExtends() != null) {
			rebecsSeries.add(curRebec);
			try {
				curRebec = (ReactiveClassDeclaration) curRebec.getExtends().getTypeSystem().getMetaData(curRebec.getExtends());
			} catch (CodeCompilationException e) {
				e.printStackTrace();
			}
		}
		rebecsSeries.add(curRebec);
		Collections.reverse(rebecsSeries);
		for (ReactiveClassDeclaration rebec: rebecsSeries) {
			for (FieldDeclaration curRebecKnownRebec: rebec.getKnownRebecs()) {
				knownRebecs.add(curRebecKnownRebec);
			}
		}
		return knownRebecs;
	}
	
	protected void checkPriorityAnnotations(List<Annotation> annotations) {
		if (annotations.isEmpty())
			return;
		for (Annotation annotation : annotations) {
			if (annotation.getIdentifier().equals(PRIORITY_LABEL) || annotation.getIdentifier().equals(GLOBAL_PRIORITY_LABEL)) {
				CodeCompilationException cce = new CodeCompilationException("Core Rebeca does not support priority",
						annotation.getLineNumber(), annotation.getCharacter());
				exceptionContainer.addException(cce);
			}
		}
	}

	protected HashMap<String, ReactiveClassDeclaration> getAllClasses() {
		HashMap<String, ReactiveClassDeclaration> reactiveClasses = new HashMap<String, ReactiveClassDeclaration>();
		for (ReactiveClassDeclaration rcd : rebecaModel.getRebecaCode().getReactiveClassDeclaration()) {
			reactiveClasses.put(rcd.getName(), rcd);
		}
		return reactiveClasses;
	}

	private String createCheckMainBindingsExceptionMessage(
			List<FieldDeclaration> knownRebecs, List<Type> bindings,
			String reactiveClassName) {
		String expected = "", actual = "";

		for (FieldDeclaration fd : knownRebecs)
			expected += ", " + fd.getType().getTypeName();
		// remove the first comma from "expected".
		if (!knownRebecs.isEmpty())
			expected = expected.substring(2);

		for (Type type : bindings) {
			actual += ", " + type.getTypeName();
		}
		// remove the first comma from "actual".
		if (!bindings.isEmpty())
			actual = actual.substring(2);

		return "The " + reactiveClassName + " knownrebecs type binding of (" + expected + ")"
				+ " is not applicable for the arguments (" + actual + ")";
	}

	@SafeVarargs
	protected final void addMethodToSymbolTable(Label methodLabel, Type base, String name, Type returnType,
			Pair<Type, String>... arguments) {

		SynchMethodDeclaration methodDeclaration = new SynchMethodDeclaration();
		methodDeclaration.setName(name);
		methodDeclaration.setAccessModifier(AccessModifierUtilities.PUBLIC);
		for (Pair<Type, String> argument : arguments) {
			FormalParameterDeclaration fpd = new FormalParameterDeclaration();
			fpd.setName(argument.getSecond());
			fpd.setType(argument.getFirst());
			methodDeclaration.getFormalParameters().add(fpd);
		}
		methodDeclaration.setReturnType(returnType);
		symbolTable.addMethod(base, methodDeclaration, methodLabel);
	}

	@Override
	public Parser getParser(CharStream input) {
		CoreRebecaCompleteLexer lexer = new CoreRebecaCompleteLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		return new CoreRebecaCompleteParser(tokens);
	}

	@Override
	protected StatementSemanticCheckContainer getStatementSemanticCheckContainer() {
		return statementSemanticCheckContainer;
	}
}