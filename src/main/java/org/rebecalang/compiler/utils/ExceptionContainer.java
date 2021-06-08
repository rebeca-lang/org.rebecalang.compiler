/** In the name of Allah
 *  The best will come
 */

package org.rebecalang.compiler.utils;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import edu.emory.mathcs.backport.java.util.Arrays;

@Component
public class ExceptionContainer extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	Set<Exception> exceptions;
	Set<Exception> warnings;

    public ExceptionContainer() {
        exceptions = new HashSet<Exception>();
        warnings = new HashSet<Exception>();
    }

    public void addException(Exception e) {
        exceptions.add(e);
    }

    public void addWarning(Exception e) {
    	warnings.add(e);
    }

    public void addAll(ExceptionContainer ec) {
        exceptions.addAll(ec.exceptions);
        warnings.addAll(ec.warnings);
    }

    public Set<Exception> getExceptions() {
        return exceptions;
    }
    
    public Set<Exception> getWarnings() {
		return warnings;
	}

	public boolean exceptionsIsEmpty() {
		return exceptions.isEmpty();
	}
	
	public boolean warningsIsEmpty() {
		return warnings.isEmpty();
	}

	public void clear() {
		exceptions.clear();
		warnings.clear();
	}
	
	public void print(PrintStream printStream) {
		printStream.println("Errors:");
		Object[] errors = exceptions.toArray();
		Arrays.sort(errors, new Comparator<Object>() {

			public int compare(Object o1, Object o2) {
				if (!(o1 instanceof CodeCompilationException))
					return 1;
				if (!(o2 instanceof CodeCompilationException))
					return -1;
				return (((CodeCompilationException)o1).getLine() > ((CodeCompilationException)o2).getLine() ? 1 : 
					(((CodeCompilationException)o1).getLine() < ((CodeCompilationException)o2).getLine()) ? -1 :
						(((CodeCompilationException)o1).getColumn() > ((CodeCompilationException)o2).getColumn() ? 1 : -1));
			}
		});
		for (Object e : errors) {
			if (e instanceof CodeCompilationException) {
				CodeCompilationException cce = (CodeCompilationException) e;
				printStream.println(cce);
			} else {
				((Exception)e).printStackTrace();
			}
		}
		if (!warningsIsEmpty())
			printStream.println("Warnings:");
		for (Exception e : warnings) {
			if (e instanceof CodeCompilationException) {
				CodeCompilationException cce = (CodeCompilationException) e;
				printStream.println(cce);
			} else {
				e.printStackTrace();
			}
		}		
	}
	
	public String toString() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(output);
		print(printStream);
		return output.toString();
	}
}
