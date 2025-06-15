package org.rebecalang.compiler.modelcompiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.rebecalang.compiler.CompilerConfig;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BinaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.DotPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Literal;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.utils.CompilerExtension;
import org.rebecalang.compiler.utils.CoreVersion;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@ContextConfiguration(classes = CompilerConfig.class) 
@SpringJUnitConfig
public class ExpressionStructureTest {
	
	@Autowired
	public RebecaModelCompiler compiler;
	@Autowired
	public ExceptionContainer exceptionContainer;

	@Test
	public void GIVEN_CorrectCoreRebecaModel_WHEN_CoreIs2_3_THEN_NoError() throws IOException {
		String rebecaModel = 
				"""
				reactiveclass A (2) {
					statevars {int b;}
					A methodA(){return null;}
					msgsrv a() {
						self.methodA().b = 2;
						self.b = 3;
					}
				}
				main{}
				
				""";
		File rebecaFile = createTesmpFile(rebecaModel);
		
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		RebecaModel model = 
				compiler.compileRebecaFile(rebecaFile, extension, CoreVersion.CORE_2_3).getFirst();

		Statement statement = model.getRebecaCode().getReactiveClassDeclaration().get(0).getMsgsrvs().
			get(0).getBlock().getStatements().get(0);
		
		
		Assertions.assertEquals(BinaryExpression.class, statement.getClass());
		BinaryExpression binaryExpression = (BinaryExpression) statement;
		
		Assertions.assertEquals("=", binaryExpression.getOperator());
		Assertions.assertEquals(DotPrimary.class, binaryExpression.getLeft().getClass());
		Assertions.assertEquals(Literal.class, binaryExpression.getRight().getClass());
		
		Literal literal = (Literal)binaryExpression.getRight();
		Assertions.assertEquals("2", literal.getLiteralValue());
		
		DotPrimary dotPrimary = (DotPrimary) binaryExpression.getLeft();
		Assertions.assertEquals(TermPrimary.class, dotPrimary.getLeft().getClass());
		Assertions.assertEquals(DotPrimary.class, dotPrimary.getRight().getClass());
		
		rebecaFile.delete();
	}

	private File createTesmpFile(String test) throws IOException, FileNotFoundException {
		File model = File.createTempFile("AfraTest", ".tmp");
		RandomAccessFile raf = new RandomAccessFile(model, "rw");
		raf.writeBytes(test);
		raf.close();
		return model;
	}
	
}
