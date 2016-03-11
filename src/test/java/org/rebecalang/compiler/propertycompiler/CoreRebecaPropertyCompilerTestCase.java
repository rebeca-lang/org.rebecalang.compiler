package org.rebecalang.compiler.propertycompiler;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.rebecalang.compiler.modelcompiler.RebecaCompiler;
import org.rebecalang.compiler.modelcompiler.SymbolTable;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.propertycompiler.corerebeca.PropertyCompiler;
import org.rebecalang.compiler.propertycompiler.corerebeca.compiler.CoreRebecaPropertyCompleteLexer;
import org.rebecalang.compiler.propertycompiler.corerebeca.compiler.CoreRebecaPropertyCompleteParser;
import org.rebecalang.compiler.propertycompiler.corerebeca.objectmodel.PropertyModel;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.Pair;

public class CoreRebecaPropertyCompilerTestCase {

	public final static String path = "src/test/resources/org/rebecalang/compiler/propertycompiler";
	
//	@Test
	public void test1() {
		String fileName = path + "/" + "corerebecapropertytestcasedata1.property";
		ANTLRInputStream input = null;
		try {
			
			Set<CompilerFeature> compilerFeatures = new HashSet<CompilerFeature>();
			compilerFeatures.add(CompilerFeature.CORE_2_1);
			
			RebecaCompiler rebecaCompiler = new RebecaCompiler();
			Pair<RebecaModel, SymbolTable> compilationResult = 
					rebecaCompiler.compileRebecaFile(new File(path + "/phils.rebeca"), compilerFeatures);
			
			if (rebecaCompiler.getExceptionContainer().getExceptions().isEmpty()) {
				PropertyCompiler propertyHandler = new PropertyCompiler();
				PropertyModel propertyModel = propertyHandler.compilePropertyModel(
						compilationResult.getFirst(), compilationResult.getSecond(), 
						new File(path + "/phils.property"), compilerFeatures);
				if (!propertyHandler.getExceptionContainer().getExceptions().isEmpty())
					propertyHandler.getExceptionContainer().print(System.out);
	
				System.out.println(propertyModel.getDefinitions().size());
			} else {
				rebecaCompiler.getExceptionContainer().print(System.out);
			}
		} catch (RecognitionException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		CoreRebecaPropertyCompilerTestCase c = new CoreRebecaPropertyCompilerTestCase();
		c.test1();
	}
}
