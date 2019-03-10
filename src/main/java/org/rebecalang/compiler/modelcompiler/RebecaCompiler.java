package org.rebecalang.compiler.modelcompiler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaCompilerFacade;
import org.rebecalang.compiler.modelcompiler.corerebeca.compiler.CoreRebecaCompleteLexer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.ProbabilisticRebecaCompilerFacade;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.compiler.ProbabilisticRebecaCompleteLexer;
import org.rebecalang.compiler.modelcompiler.probabilistictimedrebeca.ProbabilisticTimedRebecaCompilerFacade;
import org.rebecalang.compiler.modelcompiler.probabilistictimedrebeca.compiler.ProbabilisticTimedRebecaCompleteLexer;
import org.rebecalang.compiler.modelcompiler.timedrebeca.TimedRebecaCompleteCompilerFacade;
import org.rebecalang.compiler.modelcompiler.timedrebeca.compiler.TimedRebecaCompleteLexer;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.Pair;

public class RebecaCompiler {

	private ExceptionContainer exceptionContainer = new ExceptionContainer();
	
	private AbstractCompilerFacade getAppropriateCompilerFacade(
			Set<CompilerFeature> features, ANTLRInputStream input)
			throws CodeCompilationException {
		
		if (!(features.contains(CompilerFeature.CORE_2_0) ^ 
				features.contains(CompilerFeature.CORE_2_1) ^ 
				features.contains(CompilerFeature.CORE_2_2) ^ 
				features.contains(CompilerFeature.CORE_2_3))) {
			throw createFeaturesIncompatibilityMessage(features);
		}
		if (features.contains(CompilerFeature.TIMED_REBECA)
				&& features.contains(CompilerFeature.SYSTEM_C)) {
			throw createFeaturesIncompatibilityMessage(features);
		}
		if (features.contains(CompilerFeature.PROBABILISTIC_REBECA)
				&& features.contains(CompilerFeature.SYSTEM_C)) {
			throw createFeaturesIncompatibilityMessage(features);
		}

		if (features.contains(CompilerFeature.TIMED_REBECA)
				|| features.contains(CompilerFeature.PROBABILISTIC_REBECA)) {
			if (!(features.contains(CompilerFeature.CORE_2_1) || features.contains(CompilerFeature.CORE_2_2) 
					|| features.contains(CompilerFeature.CORE_2_3)))
				throw createFeaturesIncompatibilityMessage(features);
		}

		if (features.contains(CompilerFeature.SYSTEM_C)
				&& !features.contains(CompilerFeature.CORE_2_0)) {
			throw createFeaturesIncompatibilityMessage(features);
		}

		if (features.contains(CompilerFeature.SYSTEM_C)) {
			//Todo implement systemc feature
			throw createFeaturesIncompatibilityMessage(features);
		}
		if (features.contains(CompilerFeature.PROBABILISTIC_REBECA) && features.contains(CompilerFeature.TIMED_REBECA)) {
			ProbabilisticTimedRebecaCompleteLexer lexer = new ProbabilisticTimedRebecaCompleteLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			return new ProbabilisticTimedRebecaCompilerFacade(tokens, features, exceptionContainer);
		}
		if (features.contains(CompilerFeature.PROBABILISTIC_REBECA)) {
			ProbabilisticRebecaCompleteLexer lexer = new ProbabilisticRebecaCompleteLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			return new ProbabilisticRebecaCompilerFacade(tokens, features, exceptionContainer);
		}
		if (features.contains(CompilerFeature.TIMED_REBECA)) {
			TimedRebecaCompleteLexer lexer = new TimedRebecaCompleteLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			return new TimedRebecaCompleteCompilerFacade(tokens, features, exceptionContainer);
		}
		CoreRebecaCompleteLexer lexer = new CoreRebecaCompleteLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		return new CoreRebecaCompilerFacade(tokens, features, exceptionContainer);
	}

	public static CodeCompilationException createFeaturesIncompatibilityMessage(
			Set<CompilerFeature> features) {
		String retValue = "Incompatible feature set [";
		for (CompilerFeature feature : features) {
			retValue += feature.name() + ", ";
		}
		return new CodeCompilationException(retValue.substring(0,
				retValue.length() - 2)
				+ "]", 0, 0);
	}

	public Pair<RebecaModel, SymbolTable> compileRebecaFile(File rebecaFile,
			Set<CompilerFeature> compilerFeatures) {
		return compileRebecaFile (rebecaFile, compilerFeatures, true);
	}
	
	public Pair<RebecaModel, SymbolTable> compileRebecaFile(File rebecaFile,
			Set<CompilerFeature> compilerFeatures, boolean performSemanticCheck) {
		exceptionContainer.clear();

		try {
			ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(rebecaFile));
			AbstractCompilerFacade compilerFacade = getAppropriateCompilerFacade(compilerFeatures, input);
			compilerFacade.compile();
			if (exceptionContainer.exceptionsIsEmpty() && performSemanticCheck) {
				compilerFacade.semanticCheck(compilerFeatures);
			}
			return new Pair<RebecaModel, SymbolTable>(compilerFacade.getRebecaModel(), compilerFacade.getSymbolTable());
		} catch (RecognitionException e) {
			exceptionContainer.addException(e);
		} catch (Exception e) {
			if (exceptionContainer.getExceptions().size() == 0)
				exceptionContainer.addException(e);
		}
		return null;
	}

	public void generateXMLFromRebecaFiles(File rebecaFile,
			File destinationXMLFile, Set<CompilerFeature> features)
			throws ExceptionContainer {
//		Writer output;
//		ExceptionContainer container = new ExceptionContainer();
//		try {
//			ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(
//					rebecaFile));
//			CoreRebecaCompleteLexer lexer = new CoreRebecaCompleteLexer(input);
//			CommonTokenStream tokens = new CommonTokenStream(lexer);
//			AbstractCompilerFacade parser = new CoreRebecaCompleteCompilerFacade(tokens, features);
//			RebecaModel rebecaModel = parser.compile(features);
//			parser.semanticCheck(features);
//			output = new BufferedWriter(new FileWriter(destinationXMLFile));
//			JAXBContext Context = JAXBContext.newInstance("rebecaobjectmodel");
//			Marshaller marshaller = Context.createMarshaller();
//			marshaller.marshal(rebecaModel, output);
//
//		} catch (JAXBException e) {
//			container.addException(e);
//		} catch (FileNotFoundException e) {
//			container.addException(e);
//		} catch (RecognitionException e) {
//			container.addException(e);
//		} catch (IOException e) {
//			container.addException(e);
//		}
//		if (container.getExceptions().size() > 0)
//			throw container;
	}
	
	public ExceptionContainer getExceptionContainer() {
		return exceptionContainer;
	}
}
