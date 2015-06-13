package org.rebecalang.compiler.modelcompiler;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.TokenStream;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;

public abstract class AbstractCompilerFacade {

	private Parser parser;
	protected ExceptionContainer container;
	protected RebecaModel rebecaModel;
	protected Set<CompilerFeature> features;

	public AbstractCompilerFacade(Class<? extends Parser> parserClass,
			CommonTokenStream tokens, Set<CompilerFeature> features)
			throws ExceptionContainer {
		try {
			this.features = features;
			Constructor<? extends Parser> constructor = parserClass
					.getConstructor(TokenStream.class);
			parser = constructor.newInstance(tokens);
		} catch (InstantiationException e1) {
			throw new RuntimeException("Illegal Rebeca parser class "
					+ parserClass.getName());
		} catch (IllegalAccessException e1) {
			throw new RuntimeException("Illegal Rebeca parser class "
					+ parserClass.getName());
		} catch (SecurityException e1) {
			throw new RuntimeException("Illegal Rebeca parser class "
					+ parserClass.getName());
		} catch (NoSuchMethodException e1) {
			throw new RuntimeException("Illegal Rebeca parser class "
					+ parserClass.getName());
		} catch (IllegalArgumentException e1) {
			throw new RuntimeException("Illegal Rebeca parser class "
					+ parserClass.getName());
		} catch (InvocationTargetException e1) {
			throw new RuntimeException("Illegal Rebeca parser class "
					+ parserClass.getName());
		}
		parser.removeErrorListeners();
		parser.addErrorListener(new BaseErrorListener() {
			@Override
			public void syntaxError(Recognizer<?, ?> recognizer,
					Object offendingSymbol, int line, int charPositionInLine,
					String msg, RecognitionException e) {
				container.addException(new CodeCompilationException(msg, line,
						charPositionInLine));
			}
		});
		container = new ExceptionContainer();
	}

	/**
	 * 
	 * @param features
	 * @return
	 * @throws ExceptionContainer
	 */
	public RebecaModel compile(Set<CompilerFeature> features) {
		rebecaModel = getRebecaModel(parser);
		return rebecaModel;
	}

	/**
	 * Semantic check of each type Rebeca model should be implemented by the
	 * corresponding derived class.
	 * 
	 * @param features
	 *            The features which the semantic check should be done under its
	 *            content assumptions.
	 * @throws ExceptionContainer Collection of semantic exceptions and warnings.
	 */
	public abstract void semanticCheck(Set<CompilerFeature> features);

	/**
	 * This method should be implemented by the derived classes to show that how
	 * a RebecaModel should be extracted from a parser.
	 * 
	 * @param parser
	 *            The parser that the compiles a Rebeca file and generates its
	 *            corresponding RebecaModel object
	 * @return The generated RebecaModel
	 */
	protected abstract RebecaModel getRebecaModel(Parser parser);

	public ExceptionContainer getExceptionContainer() {
		return container;
	}
}