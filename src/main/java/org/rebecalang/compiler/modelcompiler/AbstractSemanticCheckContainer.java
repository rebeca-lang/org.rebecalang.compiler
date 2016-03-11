package org.rebecalang.compiler.modelcompiler;

import java.util.Hashtable;
import java.util.Set;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;

public abstract class AbstractSemanticCheckContainer {
	
	protected Hashtable<Class<? extends Statement>, AbstractSemanticCheck> translatorsRepository;
	protected ExceptionContainer exceptionContainer;
	protected ScopeHandler scopeHandler;
	protected Set<CompilerFeature> compilerFeatures;
	protected SymbolTable symbolTable;
	
	public AbstractSemanticCheckContainer(ScopeHandler scopeHandler, SymbolTable symbolTable, Set<CompilerFeature> compilerFeature, ExceptionContainer exceptionContainer) {
		this.exceptionContainer = exceptionContainer;
		this.scopeHandler = scopeHandler;
		this.symbolTable = symbolTable;
		this.compilerFeatures = compilerFeature;
		translatorsRepository = new Hashtable<Class<? extends Statement>, AbstractSemanticCheck>();
	}
	
	public void registerTranslator(Class<? extends Statement> type, AbstractSemanticCheck translator) {
		translator.setExceptionContainer(exceptionContainer);
		translator.setScopeHandler(scopeHandler);
		translator.setSymbolTable(symbolTable);
		translator.setCompilerFeatures(compilerFeatures);
		translator.setDefaultContainer(this);
		translatorsRepository.put(type, translator);
	}

	public void unregisterTranslator(Class<? extends Expression> type) {
		translatorsRepository.remove(type);
	}

	public AbstractSemanticCheck getTranslator(Class<? extends Expression> type) {
		return translatorsRepository.get(type);
	}
	public ExceptionContainer getExceptionContainer() {
		return exceptionContainer;
	}

}