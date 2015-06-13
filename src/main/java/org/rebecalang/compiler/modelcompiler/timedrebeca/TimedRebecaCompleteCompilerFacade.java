package org.rebecalang.compiler.modelcompiler.timedrebeca;

import java.util.Set;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.rebecalang.compiler.modelcompiler.AbstractCompilerFacade;
import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaStatementObserver;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FormalParameterDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SynchMethodDeclaration;
import org.rebecalang.compiler.modelcompiler.timedrebeca.compiler.TimedRebecaCompleteParser;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.TypesUtilities;

public class TimedRebecaCompleteCompilerFacade extends AbstractCompilerFacade {

	public TimedRebecaCompleteCompilerFacade(CommonTokenStream tokens,
			Set<CompilerFeature> features) throws ExceptionContainer {
		super(TimedRebecaCompleteParser.class, tokens, features);
	}

	public TimedRebecaCompleteCompilerFacade(Class<? extends Parser> parserClass, CommonTokenStream tokens,
			Set<CompilerFeature> features) throws ExceptionContainer {
		super(parserClass, tokens, features);
	}

	@Override
	public RebecaModel getRebecaModel(Parser parser) {
		return ((TimedRebecaCompleteParser) parser).rebecaModel().r;
	}

	@Override
	public void semanticCheck(Set<CompilerFeature> features) {
		semanticCheck(features, new TimedRebecaStatementObserver());
	}

	public void semanticCheck(Set<CompilerFeature> features, CoreRebecaStatementObserver observer) {
		try {
			TimedRebecaScopeHandler scopeHandler = new TimedRebecaScopeHandler(rebecaModel,
					observer.getExpressionResolver(), features, container);
			CoreRebecaSemanticCheck semanticCheck = new CoreRebecaSemanticCheck(
					features, observer, scopeHandler, rebecaModel) {
				@Override
				protected void initializeScopeBeforeCheckMethods(
						ScopeHandler scopeHandler) {
					super.initializeScopeBeforeCheckMethods(scopeHandler);
					SynchMethodDeclaration method = new SynchMethodDeclaration();
					method.setName("delay");
					FormalParameterDeclaration fpd = new FormalParameterDeclaration();
					fpd.setName("arg0");
					fpd.setType(TypesUtilities.INT_TYPE);
					method.getFormalParameters().add(fpd);
					scopeHandler.addMethodIntoMethodDictionary("", method,
							TypesUtilities.VOID_TYPE,
							TimedRebecaCategoriesUtilities.DELAY, 
							new ExceptionContainer());
				}

				@Override
				protected void initializeScopeBeforeCheckMainBlock(
						ScopeHandler scopeHandler) {
				}
			};
			semanticCheck.doSemanticCheck();
		} catch (ExceptionContainer e) {
			container.addAll(e);
		}
	}

}
