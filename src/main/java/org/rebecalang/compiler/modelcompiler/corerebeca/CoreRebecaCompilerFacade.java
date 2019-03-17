package org.rebecalang.compiler.modelcompiler.corerebeca;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.hamcrest.core.IsInstanceOf;
import org.rebecalang.compiler.modelcompiler.AbstractCompilerFacade;
import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.ScopeHandler.ScopeException;
import org.rebecalang.compiler.modelcompiler.StatementSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.SymbolTable;
import org.rebecalang.compiler.modelcompiler.SymbolTableException;
import org.rebecalang.compiler.modelcompiler.corerebeca.compiler.CoreRebecaCompleteParser;
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
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.TypesUtilities;

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
	private boolean coreVersionIsCompatibleWithInheritanceAndInterfaceDeclaration() {

		return !(compilerFeatures.contains(CompilerFeature.CORE_2_0) || 
				compilerFeatures.contains(CompilerFeature.CORE_2_1) ||
				compilerFeatures.contains(CompilerFeature.CORE_2_2));
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


			if((rcd.getExtends() != null || rcd.isAbstract()) && !coreVersionIsCompatibleWithInheritanceAndInterfaceDeclaration()) {

				CodeCompilationException cce = new CodeCompilationException(
						"Rebeca core prior to 2.3 dose not support inheritance",
						rcd.getLineNumber(), rcd.getCharacter());
				exceptionContainer.addException(cce);
			}

			ReactiveClassDeclaration tempRC = rcd;
			Stack <ReactiveClassDeclaration> extendStack = new Stack<ReactiveClassDeclaration>();

			extendStack.push(rcd);

			// adding ancestors variables (if any) to scope 
			Set<String> reactiveClassNamesForLoopBreaking = new HashSet<String>();
			reactiveClassNamesForLoopBreaking.add(rcd.getName());
			
			while (tempRC.getExtends() != null) {
				
				try {
					ReactiveClassDeclaration metaData = (ReactiveClassDeclaration)TypesUtilities.getInstance().getMetaData(tempRC.getExtends());
					extendStack.push(metaData);
					
					if(reactiveClassNamesForLoopBreaking.contains(metaData.getName())){
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
			try {
				scopeHandler.addVariableToCurrentScope(
						OWNER_REACTIVE_CLASS_KEY, TypesUtilities.getInstance().getType(rcd.getName()), 
						CoreRebecaLabelUtility.RESERVED_WORD, 0, 0);
				scopeHandler.addVariableToCurrentScope("self",
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
				scopeHandler.addVariableToCurrentScope("sender", TypesUtilities.REACTIVE_CLASS_TYPE, 
						CoreRebecaLabelUtility.RESERVED_WORD, 0, 0);
			} catch (ScopeException e) {
				e.printStackTrace();
			}
			for (MethodDeclaration md : rcd.getMsgsrvs()) {

				semanticCheckOfMethod(rcd.getName(), md, CoreRebecaLabelUtility.MSGSRV);
				if(md.isAbstract() && !coreVersionIsCompatibleWithInheritanceAndInterfaceDeclaration()) {

					CodeCompilationException cce = new CodeCompilationException(
							"Rebeca core prior to 2.3 dose not support abstract message servers",
							md.getLineNumber(), md.getCharacter());
					exceptionContainer.addException(cce);
				}
			}
			for (SynchMethodDeclaration md : rcd.getSynchMethods()) {

				if(md.isAbstract() && !coreVersionIsCompatibleWithInheritanceAndInterfaceDeclaration()) {

					CodeCompilationException cce = new CodeCompilationException(
							"Rebeca core prior to 2.3 dose not support abstract methods",
							md.getLineNumber(), md.getCharacter());
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

			scopeHandler.popScopeRecord();
		}

		semanticCheckMainBindings(rebecaModel);

		scopeHandler.popScopeRecord();
	}

	private void semanticCheckOfMethod(String reactiveClassName, MethodDeclaration md, Label label) {
		scopeHandler.pushScopeRecord(label);

		// Adding the parameters of the method
		for (FormalParameterDeclaration fpd : md.getFormalParameters()) {
			try {
				fpd.setType(TypesUtilities.getInstance().getType(fpd.getType()));
				scopeHandler.addVariableToCurrentScope(fpd.getName(), fpd.getType(),
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
					scopeHandler.addVariableToCurrentScope(mrd.getName(), type, 
							CoreRebecaLabelUtility.LOCAL_VARIABLE,
							mrd.getLineNumber(), mrd.getCharacter());
					BaseClassDeclaration mrdMetaData = TypesUtilities.getInstance().getMetaData(mrd.getType());
					if (mrdMetaData instanceof InterfaceDeclaration) {
						CodeCompilationException rce = new CodeCompilationException(
								"Cannot instantiate from interface " + mrdMetaData.getName(),
								mrd.getLineNumber(), mrd.getCharacter());
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
				symbolTable.getCastableMethodSpecification(mrd.getType(), methodName,
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