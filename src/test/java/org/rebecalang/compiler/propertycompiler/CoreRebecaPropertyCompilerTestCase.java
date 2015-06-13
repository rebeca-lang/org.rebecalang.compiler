package org.rebecalang.compiler.propertycompiler;

import java.io.FileInputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.junit.Test;
import org.rebecalang.compiler.propertycompiler.corerebeca.compiler.CoreRebecaPropertyCompleteLexer;
import org.rebecalang.compiler.propertycompiler.corerebeca.compiler.CoreRebecaPropertyCompleteParser;
import org.rebecalang.compiler.propertycompiler.corerebeca.objectmodel.PropertyModel;

import junit.framework.TestCase;

public class CoreRebecaPropertyCompilerTestCase extends TestCase {

	public final static String path = "src/test/resources/org/rebecalang/compiler/propertycompiler";
	
	@Test
	public void test1() {
		String fileName = path + "/" + "corerebecapropertytestcasedata1.property";
		ANTLRInputStream input = null;
		try {
			input = new ANTLRInputStream(new FileInputStream(fileName));
			CoreRebecaPropertyCompleteLexer lexer = new CoreRebecaPropertyCompleteLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			CoreRebecaPropertyCompleteParser parser = new CoreRebecaPropertyCompleteParser(tokens);
			
			PropertyModel propertyModel = parser.propertyModel().pm;
			System.out.println(propertyModel.getDefinitions().size());
		} catch (RecognitionException e) {
		} catch (Exception e) {
		}
	}
	
	public static void main(String[] args) {
		CoreRebecaPropertyCompilerTestCase c = new CoreRebecaPropertyCompilerTestCase();
		c.test1();
	}
}
