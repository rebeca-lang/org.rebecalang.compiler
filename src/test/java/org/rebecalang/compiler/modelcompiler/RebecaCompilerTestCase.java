package org.rebecalang.compiler.modelcompiler;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.Pair;

public class RebecaCompilerTestCase {

	public static final String base = "src/test/resources/org/rebecalang/compiler/modelcompiler"; 
	
//	@Test(expected=Exception.class)
	public void testRebeca2_0() throws Exception {
		Set<CompilerFeature> features = new HashSet<CompilerFeature>();
		features.add(CompilerFeature.CORE_2_0);
		File rebecaFile = new File(base + "/structure.rebeca");
		RebecaCompiler compiler = new RebecaCompiler();
		compiler.compileRebecaFile(rebecaFile, features);
		if(compiler.getExceptionContainer().getExceptions().size() != 0) {
			throw compiler.getExceptionContainer();
		}
	}

//	@Test(expected=ExceptionContainer.class)
	public void testRebeca2_2() throws Exception {
		Set<CompilerFeature> features = new HashSet<CompilerFeature>();
		features.add(CompilerFeature.CORE_2_2);
		File rebecaFile = new File(base + "/structure.rebeca");
		RebecaCompiler compiler = new RebecaCompiler();
		compiler.compileRebecaFile(rebecaFile, features);
		if(compiler.getExceptionContainer().getExceptions().size() != 0) {
			throw compiler.getExceptionContainer();
		}
	}

//	@Test()
	public void testTimedRebeca() throws Exception {
		Set<CompilerFeature> features = new HashSet<CompilerFeature>();
		features.add(CompilerFeature.CORE_2_1);
		features.add(CompilerFeature.TIMED_REBECA);
		File rebecaFile = new File(base + "/structure.rebeca");
//		File rebecaFile = new File("/Users/ekhamespanah/Desktop/Academics/Rebeca/workspace/org.rebecalang.rmc/src/test/resources/org/rebecalang/rmc/testcase/TinyOSPV6-TDMA.rebeca");
		RebecaCompiler compiler = new RebecaCompiler();
		Pair<RebecaModel,SymbolTable> compileRebecaFile = compiler.compileRebecaFile(rebecaFile, features);
		if(compiler.getExceptionContainer().getExceptions().size() != 0) {
			throw compiler.getExceptionContainer();
		}
	}

//	@Test()
	public void testHybridRebeca() throws Exception {
		Set<CompilerFeature> features = new HashSet<CompilerFeature>();
		features.add(CompilerFeature.CORE_2_3);
		features.add(CompilerFeature.HYBRID_REBECA);
		File rebecaFile = new File(base + "/VendingMachine.rebeca");
//		File rebecaFile = new File("/Users/ekhamespanah/Desktop/Academics/Rebeca/workspace/org.rebecalang.rmc/src/test/resources/org/rebecalang/rmc/testcase/TinyOSPV6-TDMA.rebeca");
		RebecaCompiler compiler = new RebecaCompiler();
		Pair<RebecaModel,SymbolTable> compileRebecaFile = compiler.compileRebecaFile(rebecaFile, features);
		if(compiler.getExceptionContainer().getExceptions().size() != 0) {
			throw compiler.getExceptionContainer();
		}
	}

//	@Test()
	public void testProbabilisticTimedRebeca() throws Exception {
		Set<CompilerFeature> features = new HashSet<CompilerFeature>();
		features.add(CompilerFeature.CORE_2_1);
		features.add(CompilerFeature.TIMED_REBECA);
		features.add(CompilerFeature.PROBABILISTIC_REBECA);
		File rebecaFile = new File(base + "/structure.rebeca");
		RebecaCompiler compiler = new RebecaCompiler();
		compiler.compileRebecaFile(rebecaFile, features);
		if(compiler.getExceptionContainer().getExceptions().size() != 0) {
			throw compiler.getExceptionContainer();
		}
	}

	
//	@Test()
	public void testProbabilisticRebeca() throws Exception {
		Set<CompilerFeature> features = new HashSet<CompilerFeature>();
		features.add(CompilerFeature.CORE_2_1);
		features.add(CompilerFeature.PROBABILISTIC_REBECA);
		File rebecaFile = new File(base + "/structure.rebeca");
		RebecaCompiler compiler = new RebecaCompiler();
		compiler.compileRebecaFile(rebecaFile, features);
		if(compiler.getExceptionContainer().getExceptions().size() != 0) {
			throw compiler.getExceptionContainer();
		}
	}

	public static void main(String[] args) throws Exception {
		try {
			
			RebecaCompilerTestCase rcts = new RebecaCompilerTestCase();
			rcts.testHybridRebeca();
//			rcts.testRebeca2_2();
//			rcts.testProbabilisticTimedRebeca();
//			rcts.testProbabilisticRebeca();
		} catch (ExceptionContainer ec) {
			ec.print(System.out);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

