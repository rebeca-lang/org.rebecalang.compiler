package org.rebecalang.compiler.propertycompiler.corerebeca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.rebecalang.compiler.modelcompiler.SymbolTable;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FormalParameterDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SynchMethodDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.propertycompiler.PropertyCodeCompilationException;
import org.rebecalang.compiler.propertycompiler.corerebeca.compiler.CoreRebecaPropertyCompleteLexer;
import org.rebecalang.compiler.propertycompiler.corerebeca.compiler.CoreRebecaPropertyCompleteParser;
import org.rebecalang.compiler.propertycompiler.corerebeca.objectmodel.LTLDefinition;
import org.rebecalang.compiler.propertycompiler.corerebeca.objectmodel.PropertyModel;
import org.rebecalang.compiler.propertycompiler.generalrebeca.GeneralPropertyCompiler;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public class CoreRebecaPropertyCompiler extends GeneralPropertyCompiler {

	public PropertyModel compilePropertyModel(RebecaModel rebecaModel, SymbolTable symbolTable,
			File propertyFile,
			Set<CompilerFeature> compilerFeatures) {
		
		prepareForCompilation(rebecaModel, symbolTable, propertyFile, compilerFeatures);
		
		try {
			ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(propertyFile));
			CoreRebecaPropertyCompleteLexer lexer = new CoreRebecaPropertyCompleteLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			CoreRebecaPropertyCompleteParser parser = new CoreRebecaPropertyCompleteParser(tokens);

			return (PropertyModel) performCompilation(parser);

		} catch (FileNotFoundException e) {
			exceptionContainer.addException(new PropertyCodeCompilationException("Property file \"" + 
					propertyFile.getName() + "\" not found.", 0, 0));
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void semanticCheck(org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.PropertyModel propertyModel) {
		
		super.basicSemanticCheck(propertyModel);
		
		SynchMethodDeclaration globallyMethod = new SynchMethodDeclaration();
		globallyMethod.setName("G");
		FormalParameterDeclaration fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(TypesUtilities.BOOLEAN_TYPE);
		globallyMethod.getFormalParameters().add(fpd);
		globallyMethod.setReturnType(TypesUtilities.BOOLEAN_TYPE);
		
		SynchMethodDeclaration finallyMethod = new SynchMethodDeclaration();
		finallyMethod.setName("F");
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(TypesUtilities.BOOLEAN_TYPE);
		finallyMethod.getFormalParameters().add(fpd);
		finallyMethod.setReturnType(TypesUtilities.BOOLEAN_TYPE);
		
		SynchMethodDeclaration nextMethod = new SynchMethodDeclaration();
		nextMethod.setName("X");
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(TypesUtilities.BOOLEAN_TYPE);
		nextMethod.getFormalParameters().add(fpd);
		nextMethod.setReturnType(TypesUtilities.BOOLEAN_TYPE);
		
		SynchMethodDeclaration untilMethod = new SynchMethodDeclaration();
		untilMethod.setName("U");
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(TypesUtilities.BOOLEAN_TYPE);
		untilMethod.getFormalParameters().add(fpd);
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg1");
		fpd.setType(TypesUtilities.BOOLEAN_TYPE);
		untilMethod.getFormalParameters().add(fpd);
		untilMethod.setReturnType(TypesUtilities.BOOLEAN_TYPE);
		
		SynchMethodDeclaration weakUntilMethod = new SynchMethodDeclaration();
		weakUntilMethod.setName("W");
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(TypesUtilities.BOOLEAN_TYPE);
		weakUntilMethod.getFormalParameters().add(fpd);
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg1");
		fpd.setType(TypesUtilities.BOOLEAN_TYPE);
		weakUntilMethod.getFormalParameters().add(fpd);
		weakUntilMethod.setReturnType(TypesUtilities.BOOLEAN_TYPE);

		try {
			modelSymbolTable.addMethod(null, globallyMethod,
					CoreRebecaLabelUtility.SYNCH_METHOD);
			modelSymbolTable.addMethod(null, finallyMethod,
					CoreRebecaLabelUtility.SYNCH_METHOD);
			modelSymbolTable.addMethod(null, nextMethod,
					CoreRebecaLabelUtility.SYNCH_METHOD);
			modelSymbolTable.addMethod(null, untilMethod,
					CoreRebecaLabelUtility.SYNCH_METHOD);
			modelSymbolTable.addMethod(null, weakUntilMethod,
					CoreRebecaLabelUtility.SYNCH_METHOD);
		} catch (ExceptionContainer ec) {
			exceptionContainer.addAll(ec);
		}
		
		for (LTLDefinition ltlDefinition : ((PropertyModel)propertyModel).getLTLDefinitions()) {
			Pair<Type, Object> checkingResult = expressionSemanticCheckContainer.check(ltlDefinition.getExpression());
			if (!TypesUtilities.getInstance().canTypeCastTo(checkingResult.getFirst(), TypesUtilities.BOOLEAN_TYPE)) {
				if (checkingResult.getFirst() != TypesUtilities.UNKNOWN_TYPE)
				exceptionContainer.addException(new PropertyCodeCompilationException(
						"The result of an LTL formula must be evaluatable to boolean.", 
						ltlDefinition.getExpression().getLineNumber(), ltlDefinition.getExpression().getCharacter()));
			}
		}
	}

}