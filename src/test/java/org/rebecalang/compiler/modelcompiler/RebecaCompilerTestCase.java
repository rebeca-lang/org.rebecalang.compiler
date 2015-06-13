package org.rebecalang.compiler.modelcompiler;

import java.io.File;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import org.junit.Test;
import org.rebecalang.compiler.modelcompiler.RebecaCompiler;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;

import edu.emory.mathcs.backport.java.util.Arrays;

public class RebecaCompilerTestCase extends TestCase {

	public static final String base = "src/test/resources/org/rebecalang/compiler/modelcompiler"; 
	
	@Test(expected=Exception.class)
	public void testRebeca2_0() throws Exception {
		ExceptionContainer container = new ExceptionContainer();
		Set<CompilerFeature> features = new HashSet<CompilerFeature>();
		features.add(CompilerFeature.CORE_2_0);
		File rebecaFile = new File(base + "/structure.rebeca");
		RebecaCompiler compiler = new RebecaCompiler();
		compiler.compileRebecaFile(rebecaFile, features, container);
		if(container.getExceptions().size() != 0) {
			throw container;
		}
	}

	@Test(expected=ExceptionContainer.class)
	public void testRebeca2_2() throws Exception {
		ExceptionContainer container = new ExceptionContainer();
		Set<CompilerFeature> features = new HashSet<CompilerFeature>();
		features.add(CompilerFeature.CORE_2_2);
		File rebecaFile = new File(base + "/structure.rebeca");
		RebecaCompiler compiler = new RebecaCompiler();
		compiler.compileRebecaFile(rebecaFile, features, container);
		if(container.getExceptions().size() != 0) {
			throw container;
		}
	}

	@Test()
	public void testTimedRebeca() throws Exception {
		ExceptionContainer container = new ExceptionContainer();
		Set<CompilerFeature> features = new HashSet<CompilerFeature>();
		features.add(CompilerFeature.CORE_2_1);
		features.add(CompilerFeature.TIMED_REBECA);
		File rebecaFile = new File(base + "/structure.rebeca");
//		File rebecaFile = new File(base + "/SchedularV3.rebeca");
		RebecaCompiler compiler = new RebecaCompiler();
		compiler.compileRebecaFile(rebecaFile, features, container);
		if(container.getExceptions().size() != 0) {
			throw container;
		}
	}

	@Test()
	public void testProbabilisticTimedRebeca() throws Exception {
		ExceptionContainer container = new ExceptionContainer();
		Set<CompilerFeature> features = new HashSet<CompilerFeature>();
		features.add(CompilerFeature.CORE_2_1);
		features.add(CompilerFeature.TIMED_REBECA);
		features.add(CompilerFeature.PROBABILISTIC_REBECA);
		File rebecaFile = new File(base + "/structure.rebeca");
		RebecaCompiler compiler = new RebecaCompiler();
		compiler.compileRebecaFile(rebecaFile, features, container);
		if(container.getExceptions().size() != 0) {
			throw container;
		}
	}

	
	@Test()
	public void testProbabilisticRebeca() throws Exception {
		ExceptionContainer container = new ExceptionContainer();
		Set<CompilerFeature> features = new HashSet<CompilerFeature>();
		features.add(CompilerFeature.CORE_2_1);
		features.add(CompilerFeature.PROBABILISTIC_REBECA);
		File rebecaFile = new File(base + "/structure.rebeca");
		RebecaCompiler compiler = new RebecaCompiler();
		compiler.compileRebecaFile(rebecaFile, features, container);
		if(container.getExceptions().size() != 0) {
			throw container;
		}
	}

	public static void main(String[] args) throws Exception {
		try {
			
			RebecaCompilerTestCase rcts = new RebecaCompilerTestCase();
			rcts.testTimedRebeca();
//			rcts.testRebeca2_2();
//			rcts.testProbabilisticTimedRebeca();
//			rcts.testProbabilisticRebeca();
		} catch (ExceptionContainer ec) {
			System.out.println("Errors:");
			Object[] errors = ec.getExceptions().toArray();
			Arrays.sort(errors, new Comparator<Object>() {

				public int compare(Object o1, Object o2) {
					if (!(o1 instanceof CodeCompilationException))
						return 1;
					if (!(o2 instanceof CodeCompilationException))
						return -1;
					return (((CodeCompilationException)o1).getLine() > ((CodeCompilationException)o2).getLine() ? 1 : -1);
				}
			});
			for (Object e : errors) {
				if (e instanceof CodeCompilationException) {
					CodeCompilationException cce = (CodeCompilationException) e;
					System.out.println(cce);
				} else {
					((Exception)e).printStackTrace();
				}
			}
			System.out.println("Warnings:");
			for (Exception e : ec.getWarnings()) {
				if (e instanceof CodeCompilationException) {
					CodeCompilationException cce = (CodeCompilationException) e;
					System.out.println(cce);
				} else {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

