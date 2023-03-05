package org.rebecalang.compiler.modelcompiler.abstractrebeca;

import java.util.Hashtable;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractSemanticCheckContainer {
	
	protected Hashtable<Class<? extends Statement>, AbstractSemanticCheck> semanticsCheckersRepository;
		
	public AbstractSemanticCheckContainer() {
		semanticsCheckersRepository = new Hashtable<Class<? extends Statement>, AbstractSemanticCheck>();
	}
	
	public void registerSemanticsChecker(Class<? extends Statement> type, AbstractSemanticCheck translator) {
		semanticsCheckersRepository.put(type, translator);
	}

	public void unregisterSemanticsChecker(Class<? extends Expression> type) {
		semanticsCheckersRepository.remove(type);
	}

	public AbstractSemanticCheck getTranslator(Class<? extends Expression> type) {
		return semanticsCheckersRepository.get(type);
	}
	
	public void clear() {
		semanticsCheckersRepository.clear();
	}
}