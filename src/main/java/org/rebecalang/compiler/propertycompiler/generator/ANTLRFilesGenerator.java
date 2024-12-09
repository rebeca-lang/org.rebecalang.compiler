package org.rebecalang.compiler.propertycompiler.generator;

public class ANTLRFilesGenerator {
	public static void main(String[] args) throws Exception {
		String base = "src/main/resources/org/rebecalang/compiler";
		String[] antlrArgs;
		
		antlrArgs = new String[] {
				"-Xexact-output-dir", "-o",   "src/main/java/org/rebecalang/compiler/propertycompiler/corerebeca/compiler",
				"-lib", base + "/modelcompiler/grammar",
				base + "/propertycompiler/grammar/CoreRebecaPropertyComplete.g4"};
//		antlrArgs = new String[] {
//				"-Xexact-output-dir", "-o",   "src/main/java/org/rebecalang/compiler/propertycompiler/timedrebeca/compiler",
//				"-lib", base + "/modelcompiler/grammar",
//				base + "/propertycompiler/grammar/TimedRebecaPropertyComplete.g4"};

		org.antlr.v4.Tool.main(antlrArgs);

	}

}
