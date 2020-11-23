package org.rebecalang.compiler.modelcompiler.timedrebeca;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Label;

public class TimedRebecaLabelUtility {
	public final static Label DELAY;
	public static final Label TIMED_VARIABLE;
	

	static {
		DELAY = new Label();
		DELAY.setName("delay");
		TIMED_VARIABLE = new Label();
		TIMED_VARIABLE.setName("timed-variable");
	}
}
