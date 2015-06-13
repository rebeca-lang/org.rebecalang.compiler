package org.rebecalang.compiler.modelcompiler.corerebeca;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.rebecalang.compiler.modelcompiler.AbstractSemanticCheck;
import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.ScopeHandler.ScopeException;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ArrayType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BlockStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ConstructorDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FieldDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FormalParameterDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.MainRebecDefinition;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.MethodDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryPrimitiveType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReactiveClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SynchMethodDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.VariableDeclarator;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.ExpressionResolver;
import org.rebecalang.compiler.utils.StatementObserver;
import org.rebecalang.compiler.utils.TypesUtilities;

public class CoreRebecaSemanticCheck extends AbstractSemanticCheck {

	protected ScopeHandler scopeHandler;
	protected CoreRebecaStatementObserver statementObserver;
	protected RebecaModel rebecaModel;

	public CoreRebecaSemanticCheck(Set<CompilerFeature> compilerFeature,
			CoreRebecaStatementObserver statementObserver, ScopeHandler scopeHandler, 
			RebecaModel rebecaModel) throws ExceptionContainer {
		super(compilerFeature);
		this.statementObserver = statementObserver;
		this.rebecaModel = rebecaModel;
		this.scopeHandler = scopeHandler;

		try {

			for (ReactiveClassDeclaration rcd : rebecaModel.getRebecaCode()
					.getReactiveClassDeclaration()) {
				for (FieldDeclaration fd : rcd.getStatevars()) {
					for (VariableDeclarator vd : fd.getVariableDeclarators()) {
						if (vd.getVariableInitializer() != null) {
							container
									.addException(new CodeCompilationException(
											"State variables should be initialized in constructors or initial message servers",
											vd.getLineNumber(), vd
													.getCharacter()));
						}
					}
				}
				for (FieldDeclaration fd : rcd.getKnownRebecs()) {
					for (VariableDeclarator vd : fd.getVariableDeclarators()) {
						if (vd.getVariableInitializer() != null) {
							container
									.addException(new CodeCompilationException(
											"Known rebecs should be set in main binding",
											vd.getLineNumber(), vd
													.getCharacter()));
						}
					}
				}
			}
		} catch (Exception exception) {
			if (exception != this.container)
				container.getExceptions().add(exception);
			throw container;
		}
		initializeScopeAndBasicAnalysis(rebecaModel, scopeHandler,
				statementObserver.getExpressionResolver());
		if (!this.container.isEmpty())
			throw container;
	}

	@Override
	public void doSemanticCheck() throws ExceptionContainer {

		// check knownrebec and initialization variables bindings
		scopeHandler.pushActivationRecord();
		initializeScopeBeforeCheckMainBlock(scopeHandler);
		checkMainBindings(rebecaModel, statementObserver);
		scopeHandler.popActivationRecord();

		initializeScopeBeforeCheckMethods(scopeHandler);
		for (ReactiveClassDeclaration rcd : rebecaModel.getRebecaCode()
				.getReactiveClassDeclaration()) {
			if (rcd.getConstructors().isEmpty()) {
				ConstructorDeclaration defaultConstructor = new ConstructorDeclaration();
				defaultConstructor.setName(rcd.getName());
				defaultConstructor.setBlock(new BlockStatement());
				rcd.getConstructors().add(defaultConstructor);
			}
			for (MethodDeclaration md : rcd.getConstructors()) {
				scopeHandler
						.initializeScopeToItsBaseScope(rcd,
								md.getFormalParameters(),
								TypesUtilities.NO_TYPE);
				initializeScopeBeforeCheckMethod(scopeHandler);
				((CoreRebecaExpressionResolver) statementObserver
						.getExpressionResolver())
						.setContainerType(TypesUtilities.CONSTRUCTOR_TYPE);
				statementObserver.resolveStatement(md.getBlock(), 
						CoreRebecaCategoriesUtility.CONSTRUCTOR, scopeHandler,
						compilerFeature, container);
			}
			for (MethodDeclaration md : rcd.getMsgsrvs()) {
				scopeHandler.initializeScopeToItsBaseScope(rcd,
						md.getFormalParameters(), TypesUtilities.NO_TYPE);
				initializeScopeBeforeCheckMethod(scopeHandler);
				((CoreRebecaExpressionResolver) statementObserver
						.getExpressionResolver())
						.setContainerType(TypesUtilities.MSGSRV_TYPE);
				statementObserver.resolveStatement(md.getBlock(), 
						CoreRebecaCategoriesUtility.MSGSRV, scopeHandler,
						compilerFeature, container);
			}
			for (SynchMethodDeclaration smd : rcd.getSynchMethods()) {
				scopeHandler.initializeScopeToItsBaseScope(rcd,
						smd.getFormalParameters(), smd.getReturnType());
				initializeScopeBeforeCheckMethod(scopeHandler);
				((CoreRebecaExpressionResolver) statementObserver
						.getExpressionResolver())
						.setContainerType(TypesUtilities.UNKNOWN_TYPE);
				statementObserver.resolveStatement(smd.getBlock(),
						CoreRebecaCategoriesUtility.SYNCH_METHOD, 
						scopeHandler, compilerFeature, container);
			}
		}

		if (this.container.getExceptions().size() > 0)
			throw this.container;
	}

	private String createCheckMainBindingsExceptionMessage(
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

	private void checkMainBindings(RebecaModel rebecaModel,
			StatementObserver statementObserver) {

		HashMap<String, ReactiveClassDeclaration> reactiveClasses = new HashMap<String, ReactiveClassDeclaration>();
		for (ReactiveClassDeclaration rcd : rebecaModel.getRebecaCode()
				.getReactiveClassDeclaration()) {
			reactiveClasses.put(rcd.getName(), rcd);
		}
		// Check reactive class existence and fill the rebecs' types map.
		for (MainRebecDefinition mrd : rebecaModel.getRebecaCode()
				.getMainDeclaration().getMainRebecDefinition()) {
			try {
				scopeHandler.retreiveVariableTypeFromScope(mrd.getName());
				CodeCompilationException rce = new CodeCompilationException(
						"Multiple definition of rebec " + mrd.getName(),
						mrd.getLineNumber(), mrd.getCharacter());
				this.container.addException(rce);
				continue;
			} catch (ScopeException se) {
				try {
					Type type = TypesUtilities.getInstance().getType(
							mrd.getType());
					mrd.setType(type);
					scopeHandler.addVaribaleToScope(mrd.getName(), type, 
							CoreRebecaCategoriesUtility.NORMAL_VARIABLE,
							mrd.getLineNumber(), mrd.getCharacter());
				} catch (CodeCompilationException cce) {
					cce.setColumn(mrd.getCharacter());
					cce.setLine(mrd.getLineNumber());
					container.addException(cce);
					continue;
				}
			}
		}
		for (MainRebecDefinition mrd : rebecaModel.getRebecaCode()
				.getMainDeclaration().getMainRebecDefinition()) {
			String methodCanonicalName = TypesUtilities.getTypeName(mrd
					.getType()) + ScopeHandler.METHOD_SIGNATURE_SEPERATOR;
			methodCanonicalName += (compilerFeature
					.contains(CompilerFeature.CORE_2_0) ? "initial"
					: TypesUtilities.getTypeName(mrd.getType()));
			LinkedList<Type> constructionArgumentsTypes = new LinkedList<Type>();
			for (Expression expression : mrd.getArguments()) {
				constructionArgumentsTypes.add(statementObserver
						.getExpressionResolver()
						.evaluate(expression, scopeHandler, compilerFeature,
								container).getFirst().getFirst());
			}
			LinkedList<Type> knownRebecsBindingsTypes = new LinkedList<Type>();
			for (Expression expression : mrd.getBindings()) {
				knownRebecsBindingsTypes.add(statementObserver
						.getExpressionResolver()
						.evaluate(expression, scopeHandler, compilerFeature,
								container).getFirst().getFirst());
			}
			ReactiveClassDeclaration rcd = reactiveClasses.get(TypesUtilities
					.getTypeName(mrd.getType()));
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
							container.addException(e);
						}
					} else if (fd.getType() instanceof ArrayType) {
						ArrayType type = (ArrayType) fd.getType();
						Type primitiveType = TypesUtilities.UNKNOWN_TYPE;
						try {
							primitiveType = TypesUtilities.getInstance().getType(
									type.getPrimitiveType());
						} catch (CodeCompilationException e) {
							e.setColumn(fd.getCharacter());
							e.setLine(fd.getLineNumber());
							container.addException(e);
						}
						for (Integer dimention : type.getDimensions())
							for (int cnt = 0; cnt < dimention; cnt++)
								exprectedTypes.add(primitiveType);
					}
				}
			}

			try {
				scopeHandler.findCastableMatch(methodCanonicalName,
						constructionArgumentsTypes);
			} catch (ScopeException se) {
				se.setColumn(mrd.getCharacter());
				se.setLine(mrd.getLineNumber());
				container.addException(se);
			}
			if (!TypesUtilities.areTheSame(knownRebecsBindingsTypes,
					exprectedTypes, TypesUtilities.getInstance()
							.getCastableComparator())) {
				CodeCompilationException rce = new CodeCompilationException(
						createCheckMainBindingsExceptionMessage(knownRebecs,
								knownRebecsBindingsTypes, rcd.getName()),
						mrd.getLineNumber(), mrd.getCharacter());
				container.addException(rce);
			}
		}
	}

	private void initializeScopeAndBasicAnalysis(RebecaModel rebecaModel,
			ScopeHandler scopeHandler, ExpressionResolver expressionResolver) {

		// Adding the environment variables
		for (FieldDeclaration fd : rebecaModel.getRebecaCode()
				.getEnvironmentVariables()) {
			if (compilerFeature.contains(CompilerFeature.CORE_2_0)) {
				CodeCompilationException rce = new CodeCompilationException(
						"Rebeca core 2.0 dose not support environment variables",
						fd.getLineNumber(), fd.getCharacter());
				container.addException(rce);
			}
			for (VariableDeclarator vd : fd.getVariableDeclarators()) {
				try {
					scopeHandler
							.addVaribaleToScope(vd.getVariableName(),
									fd.getType(), CoreRebecaCategoriesUtility.ENVIRONMENT_VARIABLE,
									fd.getLineNumber(), fd.getCharacter());
					scopeHandler.addVariableToCompileTimeEvaluatableVariables(
							vd.getVariableName(), vd.getVariableInitializer(),
							fd.getType(), expressionResolver,
							fd.getLineNumber(), fd.getCharacter(), container);
					if (vd.getVariableInitializer() == null) {
						CodeCompilationException rce = new CodeCompilationException(
								"Environment variable " + vd.getVariableName()
										+ " may not have been initialized",
								vd.getLineNumber(), vd.getCharacter());
						container.addException(rce);
					} else {
						TypesUtilities.getInstance()
								.checkVariableInitializationType(fd.getType(),
										vd.getVariableInitializer(),
										expressionResolver, scopeHandler,
										compilerFeature);
					}
				} catch (ScopeException e) {
					CodeCompilationException rce = new CodeCompilationException(
							e.getMessage(), vd.getLineNumber(),
							vd.getCharacter());
					container.addException(rce);
				} catch (ExceptionContainer ec) {
					container.addAll(ec);
				}
			}
		}

		// Adding the message servers and local methods to the base scope
		HashSet<String> reactiveClasses = new HashSet<String>();
		for (ReactiveClassDeclaration reactiveClassDeclaration : rebecaModel
				.getRebecaCode().getReactiveClassDeclaration()) {
			// Check for repeated reactiveclass name
			if (reactiveClasses.contains(reactiveClassDeclaration.getName())) {
				CodeCompilationException rce = new CodeCompilationException(
						"Multiple definition of reactiveclass "
								+ reactiveClassDeclaration.getName(),
						reactiveClassDeclaration.getLineNumber(),
						reactiveClassDeclaration.getCharacter());
				container.addException(rce);
			} else {
				reactiveClasses.add(reactiveClassDeclaration.getName());
			}

			if (reactiveClassDeclaration.getConstructors().isEmpty()) {
				if (!compilerFeature.contains(CompilerFeature.CORE_2_0)) {
					MethodDeclaration methodDeclaration = new MethodDeclaration();
					methodDeclaration.setName(reactiveClassDeclaration.getName());
					scopeHandler.addMethodIntoMethodDictionary(
							reactiveClassDeclaration.getName(), methodDeclaration,
							TypesUtilities.NO_TYPE,
							CoreRebecaCategoriesUtility.CONSTRUCTOR, 
							container);
				}
			} else {
				for (MethodDeclaration methodDeclaration : reactiveClassDeclaration
						.getConstructors()) {
					if (compilerFeature.contains(CompilerFeature.CORE_2_0)) {
						CodeCompilationException rce = new CodeCompilationException(
								"Rebeca core 2.0 dose not support constructor",
								methodDeclaration.getLineNumber(),
								methodDeclaration.getCharacter());
						this.container.addException(rce);
					}
					// Any message declaration without return value is considered as
					// constructor definition; however, its name should be the same
					// as its reactive class
					if (!methodDeclaration.getName().equals(
							reactiveClassDeclaration.getName())) {
						container.addException(new CodeCompilationException(
								"Return type for the method is missing",
								methodDeclaration.getLineNumber(),
								methodDeclaration.getCharacter()));
					}
					scopeHandler.addMethodIntoMethodDictionary(
							reactiveClassDeclaration.getName(), methodDeclaration,
							TypesUtilities.NO_TYPE,
							CoreRebecaCategoriesUtility.CONSTRUCTOR,
							container);
				}
			}
			for (MethodDeclaration methodDeclaration : reactiveClassDeclaration
					.getMsgsrvs()) {
				// If the name of a message server is the same as the name of
				// its reactive class, there is name clash with the constructors
				if (methodDeclaration.getName().equals(
						reactiveClassDeclaration.getName())) {
					container
							.addException(new CodeCompilationException(
									"invalid return type specification for constructor",
									methodDeclaration.getLineNumber(),
									methodDeclaration.getCharacter()));
				}
				scopeHandler.addMethodIntoMethodDictionary(
						reactiveClassDeclaration.getName(), methodDeclaration,
						TypesUtilities.MSGSRV_TYPE,
						CoreRebecaCategoriesUtility.MSGSRV,
						container);
			}
			for (SynchMethodDeclaration synchMethodDeclaration : reactiveClassDeclaration
					.getSynchMethods()) {
				if (compilerFeature.contains(CompilerFeature.CORE_2_0)) {
					CodeCompilationException rce = new CodeCompilationException(
							"Rebeca core 2.0 dose not support synch method",
							synchMethodDeclaration.getLineNumber(),
							synchMethodDeclaration.getCharacter());
					this.container.addException(rce);
				}
				// If the name of a synch message is the same as the name of its
				// reactive class, there is name clash with the constructors
				if (synchMethodDeclaration.getName().equals(
						reactiveClassDeclaration.getName())) {
					container
							.addException(new CodeCompilationException(
									"invalid return type specification for constructor",
									synchMethodDeclaration.getLineNumber(),
									synchMethodDeclaration.getCharacter()));
				}
				scopeHandler.addMethodIntoMethodDictionary(
						reactiveClassDeclaration.getName(),
						synchMethodDeclaration,
						synchMethodDeclaration.getReturnType(),
						CoreRebecaCategoriesUtility.SYNCH_METHOD, 
						container);
			}
		}
	}

	protected void initializeScopeBeforeCheckMainBlock(ScopeHandler scopeHandler) {
	}

	protected void initializeScopeBeforeCheckMethods(ScopeHandler scopeHandler) {
		SynchMethodDeclaration assersionMethod = new SynchMethodDeclaration();
		assersionMethod.setName("assertion");
		FormalParameterDeclaration fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(TypesUtilities.BOOLEAN_TYPE);
		assersionMethod.getFormalParameters().add(fpd);
		scopeHandler.addMethodIntoMethodDictionary("", assersionMethod,
				TypesUtilities.VOID_TYPE, CoreRebecaCategoriesUtility.ASSERTION,
				new ExceptionContainer());
	}

	protected void initializeScopeBeforeCheckMethod(ScopeHandler scopeHandler2) {
	}

}