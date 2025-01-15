package org.rebecalang.compiler.modelcompiler.timedrebeca;

import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.rebecalang.compiler.modelcompiler.ScopeException;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.SymbolTableInitializer;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.TypeSystemInitializer;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaCompleteCompilerFacade;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Annotation;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FormalParameterDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Literal;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SynchMethodDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.timedrebeca.compiler.TimedRebecaCompleteLexer;
import org.rebecalang.compiler.modelcompiler.timedrebeca.compiler.TimedRebecaCompleteParser;
import org.rebecalang.compiler.modelcompiler.timedrebeca.compiler.TimedRebecaListener;
import org.rebecalang.compiler.modelcompiler.timedrebeca.statementsemanticchecker.expression.TimedPrimaryTermSemanticCheck;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("TIMED_REBECA")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TimedRebecaCompleteCompilerFacade extends CoreRebecaCompleteCompilerFacade {


	public TimedRebecaCompleteCompilerFacade(@Qualifier("TIMED_REBECA") TypeSystemInitializer typeSystemInitializer,
			@Qualifier("TIMED_REBECA") SymbolTableInitializer symbolTableInitializer) {
		super(typeSystemInitializer, symbolTableInitializer);
	}

	@Autowired
	private ApplicationContext appContext;
	private PriorityType modelPriorityType;
	

	@Autowired
	public void setTypeSystem(@Qualifier("TIMED_REBECA") AbstractTypeSystem typeSystem) {
		this.typeSystem = typeSystem;
	}

	@Override
	public void semanticCheck() {
		this.modelPriorityType = null;
		super.semanticCheck();
	}
	@Override
	protected void initializeExpressionSemanticCheckContainer() {
		super.initializeExpressionSemanticCheckContainer();

		expressionSemanticCheckContainer.registerSemanticsChecker(TermPrimary.class, 
				appContext.getBean(TimedPrimaryTermSemanticCheck.class,
				typeSystem,
				expressionSemanticCheckContainer));
	}

	@Override
	protected void addMethodsOfRebecaExtensionToSymbolTable() {
		super.addMethodsOfRebecaExtensionToSymbolTable();

		addMethodToSymbolTable(CoreRebecaLabelUtility.BUILT_IN_METHOD, null, "delay", CoreRebecaTypeSystem.VOID_TYPE,
				new Pair<Type, String>(CoreRebecaTypeSystem.INT_TYPE, "arg0"));
		FormalParameterDeclaration fpd = new FormalParameterDeclaration();
		
		SynchMethodDeclaration startTimerMethod = new SynchMethodDeclaration();
		startTimerMethod.setName("startTimer");
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(TimedRebecaTypeSystem.TIMER_TYPE);
		startTimerMethod.getFormalParameters().add(fpd);
		startTimerMethod.setReturnType(CoreRebecaTypeSystem.VOID_TYPE);
		SynchMethodDeclaration stopTimerMethod = new SynchMethodDeclaration();
		stopTimerMethod.setName("stopTimer");
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(TimedRebecaTypeSystem.TIMER_TYPE);
		stopTimerMethod.getFormalParameters().add(fpd);
		stopTimerMethod.setReturnType(CoreRebecaTypeSystem.VOID_TYPE);
		SynchMethodDeclaration getTimerValueMethod = new SynchMethodDeclaration();
		getTimerValueMethod.setName("getTimerValue");
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(TimedRebecaTypeSystem.TIMER_TYPE);
		getTimerValueMethod.getFormalParameters().add(fpd);
		getTimerValueMethod.setReturnType(CoreRebecaTypeSystem.INT_TYPE);
		
		symbolTable.addMethod(null, startTimerMethod,
				CoreRebecaLabelUtility.BUILT_IN_METHOD);
		symbolTable.addMethod(null, stopTimerMethod,
				CoreRebecaLabelUtility.BUILT_IN_METHOD);
		symbolTable.addMethod(null, getTimerValueMethod,
				CoreRebecaLabelUtility.BUILT_IN_METHOD);

	}
	@Override
	protected void addVariablesOfRebecaExtensionToScope() {
		super.addVariablesOfRebecaExtensionToScope();
		try {
			scopeHandler.addVariableToCurrentScope("now", CoreRebecaTypeSystem.INT_TYPE, 
					CoreRebecaLabelUtility.RESERVED_WORD, 0, 0);
			scopeHandler.addVariableToCurrentScope("currentMessageArrival", CoreRebecaTypeSystem.INT_TYPE, 
					CoreRebecaLabelUtility.RESERVED_WORD, 0, 0);
			scopeHandler.addVariableToCurrentScope("currentMessageDeadline", CoreRebecaTypeSystem.INT_TYPE,
					CoreRebecaLabelUtility.RESERVED_WORD, 0, 0);
			scopeHandler.addVariableToCurrentScope("currentMessageWaitingTime", CoreRebecaTypeSystem.INT_TYPE,
					CoreRebecaLabelUtility.RESERVED_WORD, 0, 0);
		} catch (ScopeException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Parser getParser(CharStream input) {
		TimedRebecaCompleteLexer lexer = new TimedRebecaCompleteLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		return new TimedRebecaCompleteParser(tokens);
	}
	@Override
	public void attachListener(Parser parser) {
		TimedRebecaListener listener = new TimedRebecaListener();
		parser.addParseListener(listener);
	}
	
	protected void checkPriorityAnnotations(List<Annotation> annotations) {
		for (Annotation annotation : annotations) {
			if (annotation.getIdentifier().equals(PRIORITY_LABEL) || annotation.getIdentifier().equals(GLOBAL_PRIORITY_LABEL)) {
				if (annotation.getIdentifier().equals(PRIORITY_LABEL))
					if(conflictInPriorityType(PriorityType.local, annotation)) 
						continue;
				if (annotation.getIdentifier().equals(GLOBAL_PRIORITY_LABEL))
					if(conflictInPriorityType(PriorityType.global, annotation)) 
						continue;
				
				Pair<Type, Object> valueCheckResult = statementSemanticCheckContainer.check(annotation.getValue());
				if (!checkIfTheValueOfPriorityAnnotationIsInteger(valueCheckResult, annotation))
					continue;
				if (!checkIfTheValueOfPriorityAnnotationIsConstantExpression(valueCheckResult.getSecond(), annotation)) {
					continue;
				}
				
				setAnnotationConstantValue(annotation, valueCheckResult.getSecond());
			}
		}
	}

	private boolean conflictInPriorityType(PriorityType newPriorityType, Annotation annotation) {
		if((newPriorityType == PriorityType.local && modelPriorityType == PriorityType.global) ||
				(newPriorityType == PriorityType.global && modelPriorityType == PriorityType.local)) {
			CodeCompilationException cce = new CodeCompilationException(
					"Conflict between local and global priority definitions", annotation.getLineNumber(),
					annotation.getCharacter());
			exceptionContainer.addException(cce);
			return true;
		}
		modelPriorityType = newPriorityType;
		return false;
	}

	private void setAnnotationConstantValue(Annotation annotation, Object valueCheckResult) {
		Literal literal = new Literal();
		literal.setCharacter(annotation.getCharacter());
		literal.setLineNumber(annotation.getLineNumber());
		literal.setLiteralValue(valueCheckResult.toString());
		literal.setType(CoreRebecaTypeSystem.INT_TYPE);
		annotation.setValue(literal);
	}

	private boolean checkIfTheValueOfPriorityAnnotationIsConstantExpression(Object expressionValue, Annotation annotation) {
		if(expressionValue == null) {
			CodeCompilationException cce = new CodeCompilationException(
					"Priority value expressions must be constant expressions", annotation.getLineNumber(),
					annotation.getCharacter());
			exceptionContainer.addException(cce);
			return false;
		}
		return true;
	}

	private boolean checkIfTheValueOfPriorityAnnotationIsInteger(Pair<Type, Object> valueCheckResult, Annotation annotation) {
		if(!valueCheckResult.getFirst().canTypeUpCastTo(CoreRebecaTypeSystem.INT_TYPE)) {
			CodeCompilationException cce = new CodeCompilationException(
					"Value of priority must be an integer expression", annotation.getLineNumber(),
					annotation.getCharacter());
			exceptionContainer.addException(cce);
			return false;
		}
		return true;
	}
}
