package org.rebecalang.compiler.modelcompiler.generator;

public class ANTLRFilesGenerator {
	public static void main(String[] args) throws Exception {
		String base = "src/main/loc/org/rebecalang/compiler/modelcompiler";
		String grammarBase = base.replaceFirst("loc", "resources") + "/grammar";

		String[] antlrArgs;
//		antlrArgs = new String[] { "-Xexact-output-dir", "-o", 
//				base.replaceFirst("loc", "java") + "/corerebeca/compiler",
//				grammarBase + "/CoreRebecaComplete.g4" };

//		antlrArgs = new String[] { "-Xexact-output-dir", "-o",
//				base.replaceFirst("loc", "java") + "/timedrebeca/compiler",
//				grammarBase + "/TimedRebecaComplete.g4" };

//		antlrArgs = new String[] { "-Xexact-output-dir", "-o",
//				base.replaceFirst("loc", "java") + "/probabilisticrebeca/compiler",
//				grammarBase + "/ProbabilisticRebecaComplete.g4" 
//				};
		
//		antlrArgs = new String[] {
//		"-Xexact-output-dir", "-o", base.replaceFirst("loc", "java") + "/probabilistictimedrebeca/compiler",
//		"-lib", ".",
//		grammarBase + "/ProbabilisticTimedRebecaComplete.g4" };

		antlrArgs = new String[] { "-Xexact-output-dir", "-o",
				base.replaceFirst("loc", "java") + "/hybridrebeca/compiler",
				grammarBase + "/HybridRebecaComplete.g4" };

		org.antlr.v4.Tool.main(antlrArgs);

	}

}
