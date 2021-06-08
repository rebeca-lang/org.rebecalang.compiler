package org.rebecalang.compiler.modelcompiler.abstractrebeca;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.utils.CompilerInternalErrorRuntimeException;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractStatementSemanticCheck extends AbstractSemanticCheck{
	
	public abstract void check(Statement statement) throws CompilerInternalErrorRuntimeException;
	
}
