package org.rebecalang.compiler.modelcompiler.timedrebeca;

import java.util.List;
import java.util.Set;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.rebecalang.compiler.modelcompiler.ScopeHandler.ScopeException;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaCompilerFacade;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Annotation;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FormalParameterDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Literal;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryPrimitiveType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SynchMethodDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.timedrebeca.compiler.TimedRebecaCompleteParser;
import org.rebecalang.compiler.modelcompiler.timedrebeca.statementsemanticchecker.expression.TimedPrimaryTermSemanticCheck;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public class TimedRebecaCompleteCompilerFacade extends CoreRebecaCompilerFacade {

	private PriorityType modelPriorityType;
	private final static OrdinaryPrimitiveType TIMER_TYPE;
	static {
		TIMER_TYPE = new OrdinaryPrimitiveType();
		TIMER_TYPE.setName("Timer");
	}

	public TimedRebecaCompleteCompilerFacade(CommonTokenStream tokens,
			Set<CompilerFeature> features, ExceptionContainer exceptionContainer) {
		super(TimedRebecaCompleteParser.class, tokens, features, exceptionContainer);
	}
	
	public TimedRebecaCompleteCompilerFacade(Class<? extends Parser> parser, CommonTokenStream tokens,
			Set<CompilerFeature> features, ExceptionContainer exceptionContainer) {
		super(parser, tokens, features, exceptionContainer);
	}
	
	
	protected void initialize() {
		super.initialize();
		TypesUtilities.getInstance().addNewType(TIMER_TYPE);
		modelPriorityType = PriorityType.None;
		statementSemanticCheckContainer.getExpressionSemanticCheckContainer().
			registerTranslator(TermPrimary.class, new TimedPrimaryTermSemanticCheck());

		SynchMethodDeclaration delayMethod = new SynchMethodDeclaration();
		delayMethod.setName("delay");
		FormalParameterDeclaration fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(TypesUtilities.INT_TYPE);
		delayMethod.getFormalParameters().add(fpd);
		delayMethod.setReturnType(TypesUtilities.VOID_TYPE);

		try {
			symbolTable.addMethod(null, delayMethod,
					TimedRebecaLabelUtility.DELAY);
			
			SynchMethodDeclaration startTimerMethod = new SynchMethodDeclaration();
			startTimerMethod.setName("startTimer");
			fpd = new FormalParameterDeclaration();
			fpd.setName("arg0");
			fpd.setType(TypesUtilities.getInstance().getType("Timer"));
			startTimerMethod.getFormalParameters().add(fpd);
			startTimerMethod.setReturnType(TypesUtilities.VOID_TYPE);
			SynchMethodDeclaration stopTimerMethod = new SynchMethodDeclaration();
			stopTimerMethod.setName("stopTimer");
			fpd = new FormalParameterDeclaration();
			fpd.setName("arg0");
			fpd.setType(TypesUtilities.getInstance().getType("Timer"));
			stopTimerMethod.getFormalParameters().add(fpd);
			stopTimerMethod.setReturnType(TypesUtilities.VOID_TYPE);
			SynchMethodDeclaration getTimerValueMethod = new SynchMethodDeclaration();
			getTimerValueMethod.setName("getTimerValue");
			fpd = new FormalParameterDeclaration();
			fpd.setName("arg0");
			fpd.setType(TypesUtilities.getInstance().getType("Timer"));
			getTimerValueMethod.getFormalParameters().add(fpd);
			getTimerValueMethod.setReturnType(TypesUtilities.INT_TYPE);
			
			symbolTable.addMethod(null, startTimerMethod,
					CoreRebecaLabelUtility.BUILT_IN_METHOD);
			symbolTable.addMethod(null, stopTimerMethod,
					CoreRebecaLabelUtility.BUILT_IN_METHOD);
			symbolTable.addMethod(null, getTimerValueMethod,
					CoreRebecaLabelUtility.BUILT_IN_METHOD);

		} catch (ExceptionContainer ec) {
			exceptionContainer.addAll(ec);
		} catch (CodeCompilationException e) {
			exceptionContainer.addException(e);
		}

		try {
			scopeHandler.addVariableToCurrentScope("now", TypesUtilities.INT_TYPE, 
					CoreRebecaLabelUtility.RESERVED_WORD, 0, 0);
			scopeHandler.addVariableToCurrentScope("currentMessageArrival", TypesUtilities.INT_TYPE, 
					CoreRebecaLabelUtility.RESERVED_WORD, 0, 0);
			scopeHandler.addVariableToCurrentScope("currentMessageDeadline", TypesUtilities.INT_TYPE,
					CoreRebecaLabelUtility.RESERVED_WORD, 0, 0);
			scopeHandler.addVariableToCurrentScope("currentMessageWaitingTime", TypesUtilities.INT_TYPE,
					CoreRebecaLabelUtility.RESERVED_WORD, 0, 0);
		} catch (ScopeException e) {
			e.printStackTrace();
		}
	}
	
	protected void checkPriorityAnnotations(List<Annotation> annotations) {
		for (Annotation annotation : annotations) {
			if (annotation.getIdentifier().equals("priority") || annotation.getIdentifier().equals("globalPriority")) {
				if (annotation.getIdentifier().equals("priority"))
					if(conflictInPriorityType(PriorityType.local, annotation)) 
						continue;
				if (annotation.getIdentifier().equals("globalPriority"))
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
		literal.setType(TypesUtilities.INT_TYPE);
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
		if(!TypesUtilities.getInstance().canTypeUpCastTo(valueCheckResult.getFirst(), TypesUtilities.INT_TYPE)) {
			CodeCompilationException cce = new CodeCompilationException(
					"Value of priority must be an integer expression", annotation.getLineNumber(),
					annotation.getCharacter());
			exceptionContainer.addException(cce);
			return false;
		}
		return true;
	}
	
	protected void fillTypeSystem() {
		super.fillTypeSystem();

		TypesUtilities.getInstance().addNewType(TIMER_TYPE);
	}

}
