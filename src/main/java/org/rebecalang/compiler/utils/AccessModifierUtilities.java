package org.rebecalang.compiler.utils;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.AccessModifier;

public class AccessModifierUtilities {
	public static final AccessModifier PUBLIC;
	public static final AccessModifier PRIVATE;
	public static final AccessModifier PROTECTED;
	
	static {
		PUBLIC = new AccessModifier();
		PUBLIC.setName("public");
		PRIVATE = new AccessModifier();
		PRIVATE.setName("private");
		PROTECTED = new AccessModifier();
		PROTECTED.setName("protected");
	}
}
