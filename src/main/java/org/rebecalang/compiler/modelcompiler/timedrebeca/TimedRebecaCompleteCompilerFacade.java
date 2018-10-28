package org.rebecalang.compiler.modelcompiler.timedrebeca;

import java.util.Set;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.rebecalang.compiler.modelcompiler.ScopeHandler.ScopeException;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaCompilerFacade;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FormalParameterDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SynchMethodDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.timedrebeca.compiler.TimedRebecaCompleteParser;
import org.rebecalang.compiler.modelcompiler.timedrebeca.statementsemanticchecker.expression.TimedPrimaryTermSemanticCheck;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;
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
			scopeHandler.addVaribaleToCurrentScope("now", TypesUtilities.INT_TYPE, 
					CoreRebecaLabelUtility.RESERVED_WORD, 0, 0);
			scopeHandler.addVaribaleToCurrentScope("currentMessageArrival", TypesUtilities.INT_TYPE, 
					CoreRebecaLabelUtility.RESERVED_WORD, 0, 0);
			scopeHandler.addVaribaleToCurrentScope("currentMessageDeadline", TypesUtilities.INT_TYPE,
					CoreRebecaLabelUtility.RESERVED_WORD, 0, 0);
			scopeHandler.addVaribaleToCurrentScope("currentMessageWaitingTime", TypesUtilities.INT_TYPE,
					CoreRebecaLabelUtility.RESERVED_WORD, 0, 0);
		} catch (ScopeException e) {
			e.printStackTrace();
		}
	}
}
