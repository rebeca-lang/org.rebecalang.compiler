package org.rebecalang.compiler.modelcompiler.timedrebeca;

import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaStatementObserver;

public class TimedRebecaStatementObserver extends CoreRebecaStatementObserver {

	public TimedRebecaStatementObserver() {
		super(new TimedRebecaExpressionResolver());
	}

}