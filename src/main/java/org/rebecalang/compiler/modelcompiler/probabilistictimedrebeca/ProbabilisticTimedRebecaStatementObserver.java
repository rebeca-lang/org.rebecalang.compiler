package org.rebecalang.compiler.modelcompiler.probabilistictimedrebeca;

import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaStatementObserver;

public class ProbabilisticTimedRebecaStatementObserver extends
	CoreRebecaStatementObserver {
	public ProbabilisticTimedRebecaStatementObserver() {
		super(new ProbabilisticTimedRebecaExpressionResolver());
	}
}
