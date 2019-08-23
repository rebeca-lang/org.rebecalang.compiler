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

	public TimedRebecaCompleteCompilerFacade(CommonTokenStream tokens,
			Set<CompilerFeature> features, ExceptionContainer exceptionContainer) {
		super(TimedRebecaCompleteParser.class, tokens, features, exceptionContainer);
//		initialize();
	}
	
	public TimedRebecaCompleteCompilerFacade(Class<? extends Parser> parser, CommonTokenStream tokens,
			Set<CompilerFeature> features, ExceptionContainer exceptionContainer) {
		super(parser, tokens, features, exceptionContainer);
//		initialize();
	}
	
	
	protected void initialize() {
		super.initialize();
		statementSemanticCheckContainer.getExpressionSemanticCheckContainer().
			registerTranslator(TermPrimary.class, new TimedPrimaryTermSemanticCheck());

		SynchMethodDeclaration method = new SynchMethodDeclaration();
		method.setName("delay");
		FormalParameterDeclaration fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(TypesUtilities.INT_TYPE);
		method.getFormalParameters().add(fpd);
		try {
			symbolTable.addMethod(null, method,
					TimedRebecaLabelUtility.DELAY);
		} catch (ExceptionContainer ec) {
			exceptionContainer.addAll(ec);
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
			if (annotation.getIdentifier().equals("priority")) {
				Pair<Type, Object> valueCheckResult = statementSemanticCheckContainer.check(annotation.getValue());
				if (!TypesUtilities.getInstance().canTypeUpCastTo(valueCheckResult.getFirst(), TypesUtilities.INT_TYPE)) {
					CodeCompilationException cce = new CodeCompilationException(
							"Value of priority must be an integer expression", annotation.getLineNumber(),
							annotation.getCharacter());
					exceptionContainer.addException(cce);
					continue;
				}
				if (valueCheckResult.getSecond() == null) {
					CodeCompilationException cce = new CodeCompilationException(
							"Priority value expressions must be constant expressions", annotation.getLineNumber(),
							annotation.getCharacter());
					exceptionContainer.addException(cce);
					continue;
				}
				Literal literal = new Literal();
				literal.setCharacter(annotation.getCharacter());
				literal.setLineNumber(annotation.getLineNumber());
				literal.setLiteralValue(valueCheckResult.getSecond().toString());
				literal.setType(TypesUtilities.INT_TYPE);
				annotation.setValue(literal);
			} else {
				CodeCompilationException cce = new CodeCompilationException(
						"Unkown annotation " + annotation.getIdentifier(), annotation.getLineNumber(),
						annotation.getCharacter());
				exceptionContainer.addException(cce);
			}
		}
	}
}
