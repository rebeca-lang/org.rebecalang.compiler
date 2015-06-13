package org.rebecalang.compiler.modelcompiler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaCompleteCompilerFacade;
import org.rebecalang.compiler.modelcompiler.corerebeca.compiler.CoreRebecaCompleteLexer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.ProbabilisticRebecaCompleteCompilerFacade;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.compiler.ProbabilisticRebecaCompleteLexer;
import org.rebecalang.compiler.modelcompiler.probabilistictimedrebeca.ProbabilisticTimedRebecaCompleteCompilerFacade;
import org.rebecalang.compiler.modelcompiler.probabilistictimedrebeca.compiler.ProbabilisticTimedRebecaCompleteLexer;
import org.rebecalang.compiler.modelcompiler.timedrebeca.TimedRebecaCompleteCompilerFacade;
import org.rebecalang.compiler.modelcompiler.timedrebeca.compiler.TimedRebecaCompleteLexer;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;

public class RebecaCompiler {

	public static AbstractCompilerFacade getAppropriateParser(
			Set<CompilerFeature> features, ANTLRInputStream input)
			throws CodeCompilationException, ExceptionContainer {
		
		if (!(features.contains(CompilerFeature.CORE_2_0) ^ features
				.contains(CompilerFeature.CORE_2_1) ^ features
				.contains(CompilerFeature.CORE_2_2))) {
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
			if (!(features.contains(CompilerFeature.CORE_2_1) || features.contains(CompilerFeature.CORE_2_2)))
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
			return new ProbabilisticTimedRebecaCompleteCompilerFacade(tokens, features);
		}
		if (features.contains(CompilerFeature.PROBABILISTIC_REBECA)) {
			ProbabilisticRebecaCompleteLexer lexer = new ProbabilisticRebecaCompleteLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			return new ProbabilisticRebecaCompleteCompilerFacade(tokens, features);
		}
		if (features.contains(CompilerFeature.TIMED_REBECA)) {
			TimedRebecaCompleteLexer lexer = new TimedRebecaCompleteLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			return new TimedRebecaCompleteCompilerFacade(tokens, features);
		}
		CoreRebecaCompleteLexer lexer = new CoreRebecaCompleteLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		return new CoreRebecaCompleteCompilerFacade(tokens, features);
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

	public RebecaModel getRebecaFilesPartialModel(File rebecaFile,
			Set<CompilerFeature> features) {
		ExceptionContainer container = new ExceptionContainer();
		ANTLRInputStream input = null;
		try {
			input = new ANTLRInputStream(new FileInputStream(rebecaFile));
		} catch (IOException e) {
			container.addException(e);
			return null;
		}
		RebecaModel rebecaModel = null;
		try {
			AbstractCompilerFacade parser = getAppropriateParser(features, input);
			rebecaModel = parser.compile(features);
			parser.semanticCheck(features);
		} catch (RecognitionException e) {
			container.addException(e);
		} catch (CodeCompilationException e) {
			container.addException(e);
		} catch (ExceptionContainer e) {
			container.addAll(e);
		}
		return rebecaModel;
	}

	public RebecaModel compileRebecaFile(File rebecaFile,
			Set<CompilerFeature> features, ExceptionContainer container) {
		ANTLRInputStream input = null;
		try {
			input = new ANTLRInputStream(new FileInputStream(rebecaFile));
		} catch (IOException e) {
			container.addException(e);
			return null;
		}

		RebecaModel rebecaModel = null;
		try {
			AbstractCompilerFacade parser = getAppropriateParser(features, input);
			rebecaModel = parser.compile(features);
			if (parser.getExceptionContainer().isEmpty()) {
				parser.semanticCheck(features);
			}
			container.addAll(parser.getExceptionContainer());
		} catch (RecognitionException e) {
			container.addException(e);
		} catch (ExceptionContainer ec) {
			container.addAll(ec);
		} catch (Exception e) {
			if (container.getExceptions().size() == 0)
				container.addException(e);
		}
		return rebecaModel;
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

}
