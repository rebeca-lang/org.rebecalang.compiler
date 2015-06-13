package org.rebecalang.compiler.modelcompiler.timedrebeca;

import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaCategoriesUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Category;

public class TimedRebecaCategoriesUtilities extends CoreRebecaCategoriesUtility {

	public final static Category DELAY;
	public static final Category TIMED_VARIABLE;
	
	static {
		DELAY = new Category();
		DELAY.setName("delay");
		TIMED_VARIABLE = new Category();
		TIMED_VARIABLE.setName("timed variable");
	}

}
