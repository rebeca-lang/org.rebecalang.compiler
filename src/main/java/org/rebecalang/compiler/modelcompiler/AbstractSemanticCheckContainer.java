package org.rebecalang.compiler.modelcompiler;

import java.util.Hashtable;
import java.util.Set;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;

public abstract class AbstractSemanticCheckContainer {
	
	protected Hashtable<Class<? extends Statement>, AbstractSemanticCheck> semanticsCheckersRepository;
	protected ExceptionContainer exceptionContainer;
	protected ScopeHandler scopeHandler;
	protected Set<CompilerFeature> compilerFeatures;
	protected SymbolTable symbolTable;
	
	public AbstractSemanticCheckContainer(ScopeHandler scopeHandler, SymbolTable symbolTable, Set<CompilerFeature> compilerFeature, ExceptionContainer exceptionContainer) {
		this.exceptionContainer = exceptionContainer;
		this.scopeHandler = scopeHandler;
		this.symbolTable = symbolTable;
		this.compilerFeatures = compilerFeature;
		semanticsCheckersRepository = new Hashtable<Class<? extends Statement>, AbstractSemanticCheck>();
	}
	
	public void registerSemanticsChecker(Class<? extends Statement> type, AbstractSemanticCheck translator) {
		translator.setExceptionContainer(exceptionContainer);
		translator.setScopeHandler(scopeHandler);
		translator.setSymbolTable(symbolTable);
		translator.setCompilerFeatures(compilerFeatures);
		translator.setDefaultContainer(this);
		semanticsCheckersRepository.put(type, translator);
	}

	public void unregisterSemanticsChecker(Class<? extends Expression> type) {
		semanticsCheckersRepository.remove(type);
	}

	public AbstractSemanticCheck getTranslator(Class<? extends Expression> type) {
		return semanticsCheckersRepository.get(type);
	}
	public ExceptionContainer getExceptionContainer() {
		return exceptionContainer;
	}

}