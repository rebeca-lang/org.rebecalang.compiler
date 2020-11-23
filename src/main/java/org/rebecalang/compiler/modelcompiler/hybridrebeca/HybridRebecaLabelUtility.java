package org.rebecalang.compiler.modelcompiler.hybridrebeca;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Label;

public class HybridRebecaLabelUtility {
	public final static Label INVARIANT_BLOCK;
	
	
	static {
		INVARIANT_BLOCK = new Label();
		INVARIANT_BLOCK.setName("invariant");
	}
}
