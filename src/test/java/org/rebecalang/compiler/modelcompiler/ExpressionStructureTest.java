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
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.CastExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.DotPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FieldDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Literal;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryVariableInitializer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.VariableInitializer;
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
	public void GIVEN_IncorrectUsageOfCastOperator_WHEN_CoreIs2_3_THEN_NoErrors() throws IOException {
		String rebecaModel = 
				"""
				reactiveclass Test1 (2) {
					msgsrv a() {
						byte a = (byte)1 + 2;
					}
				}
				main{}
				""";
		File rebecaFile = createTempFile(rebecaModel);
		
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		RebecaModel model = 
				compiler.compileRebecaFile(rebecaFile, extension, CoreVersion.CORE_2_3).getFirst();

		Statement statement = model.getRebecaCode().getReactiveClassDeclaration().get(0).getMsgsrvs().
			get(0).getBlock().getStatements().get(0);
		
		Assertions.assertEquals(FieldDeclaration.class, statement.getClass());
		VariableInitializer variableInitializer = ((FieldDeclaration)statement).getVariableDeclarators().get(0).getVariableInitializer();
		Expression initializerExpression = ((OrdinaryVariableInitializer)variableInitializer).getValue();
		Assertions.assertEquals(BinaryExpression.class, initializerExpression.getClass());
		Expression left = ((BinaryExpression)initializerExpression).getLeft();
		Assertions.assertEquals(CastExpression.class, left.getClass());
		Expression right = ((BinaryExpression)initializerExpression).getRight();
		Assertions.assertEquals(Literal.class, right.getClass());
		rebecaFile.delete();
	}
	
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
		File rebecaFile = createTempFile(rebecaModel);
		
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

	@Test
	public void GIVEN_CorrectCoreRebecaModel_WHEN_SELF_SYNCH_CALL_THEN_NoError() throws IOException {
		String rebecaModel = 
				"""
				reactiveclass A (2) {
					statevars {int b;}
					A methodA(){return null;}
					int methoda1(int d){return 0;}
					int methodc1(){return 0;}
					msgsrv a() {
						b = self.methoda1(b) + methodc1();
					}
				}
				main{}
				
				""";
		File rebecaFile = createTempFile(rebecaModel);
		
		Set<CompilerExtension> extension = new HashSet<CompilerExtension>();
		RebecaModel model = 
				compiler.compileRebecaFile(rebecaFile, extension, CoreVersion.CORE_2_3).getFirst();

		Statement statement = model.getRebecaCode().getReactiveClassDeclaration().get(0).getMsgsrvs().
			get(0).getBlock().getStatements().get(0);
		
		
		Assertions.assertEquals(BinaryExpression.class, statement.getClass());

		BinaryExpression binaryExpression = (BinaryExpression) statement;
		Assertions.assertEquals(TermPrimary.class, binaryExpression.getLeft().getClass());
		Assertions.assertEquals("=", binaryExpression.getOperator());
		Assertions.assertEquals(BinaryExpression.class, binaryExpression.getRight().getClass());

		binaryExpression = (BinaryExpression) binaryExpression.getRight();
		Assertions.assertEquals(DotPrimary.class, binaryExpression.getLeft().getClass());
		Assertions.assertEquals(TermPrimary.class, binaryExpression.getRight().getClass());

		DotPrimary dotPrimary = (DotPrimary) binaryExpression.getLeft();
		TermPrimary base = (TermPrimary) dotPrimary.getLeft();
		TermPrimary method = (TermPrimary) dotPrimary.getRight();
		Assertions.assertEquals("self", base.getName());
		Assertions.assertEquals("methoda1", method.getName());
	}
	
	private File createTempFile(String test) throws IOException, FileNotFoundException {
		File model = File.createTempFile("AfraTest", ".tmp");
		RandomAccessFile raf = new RandomAccessFile(model, "rw");
		raf.writeBytes(test);
		raf.close();
		return model;
	}
	
}
