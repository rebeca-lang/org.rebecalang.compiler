/** In the name of Allah
 *  The best will come
 */

package org.rebecalang.compiler.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import org.springframework.stereotype.Component;

import edu.emory.mathcs.backport.java.util.Arrays;

@Component
public class ExceptionContainer {
//	private Set<Exception> exceptions;
//	Set<Exception> warnings;

	private Hashtable<File, Set<Exception>> exceptions;
	private Hashtable<File, Set<Exception>> warnings;
	private File correspondingResource;

	public ExceptionContainer() {
		exceptions = new Hashtable<File, Set<Exception>>();
		warnings = new Hashtable<File, Set<Exception>>();
	}

	public void setCorrespondingResource(File correspondingResource) {
		this.correspondingResource = correspondingResource;
		if (!exceptions.containsKey(correspondingResource)) {
			exceptions.put(correspondingResource, new HashSet<Exception>());
			warnings.put(correspondingResource, new HashSet<Exception>());
		}
	}

	public void addException(Exception e) {
		exceptions.get(correspondingResource).add(e);
	}

	public void addWarning(Exception e) {
		warnings.get(correspondingResource).add(e);
	}

	public Hashtable<File, Set<Exception>> getExceptions() {
		return exceptions;
	}

	public Hashtable<File, Set<Exception>> getWarnings() {
		return warnings;
	}

	public boolean exceptionsIsEmpty() {
		for(Set<Exception> exceptionSet : exceptions.values())
			if(!exceptionSet.isEmpty())
				return false;
		return true;
	}

	public boolean warningsIsEmpty() {
		for(Set<Exception> warningSet : warnings.values())
			if(!warningSet.isEmpty())
				return false;
		return true;
	}

	public void clear() {
		exceptions.clear();
		warnings.clear();
	}

	public void print(PrintStream printStream) {
		for(File key : exceptions.keySet()) {
			printStream.println(key.getAbsolutePath());
			Set<Exception> exceptionSet = exceptions.get(key);
			if(!exceptionSet.isEmpty()) {
				printStream.println("Errors:");
				print(printStream, exceptionSet);				
			}
			Set<Exception> warningSet = warnings.get(key);
			if(!warningSet.isEmpty()) {
				printStream.println("Warning:");
				print(printStream, warningSet);				
			}
		}
	}

	private void print(PrintStream printStream, Set<Exception> exceptionSet) {
		Object[] errors = exceptionSet.toArray();
		Arrays.sort(errors, new Comparator<Object>() {

			public int compare(Object o1, Object o2) {
				if (!(o1 instanceof CodeCompilationException))
					return 1;
				if (!(o2 instanceof CodeCompilationException))
					return -1;
				return (((CodeCompilationException) o1).getLine() > ((CodeCompilationException) o2)
						.getLine()
								? 1
								: (((CodeCompilationException) o1).getLine() < ((CodeCompilationException) o2)
										.getLine())
												? -1
												: (((CodeCompilationException) o1)
														.getColumn() > ((CodeCompilationException) o2).getColumn() ? 1
																: -1));
			}
		});
		for (Object e : errors) {
			if (e instanceof CodeCompilationException) {
				CodeCompilationException cce = (CodeCompilationException) e;
				printStream.println(cce);
			} else {
				((Exception) e).printStackTrace();
			}
		}
	}

	public String toString() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(output);
		print(printStream);
		return output.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((exceptions == null) ? 0 : exceptions.hashCode());
		result = prime * result + ((warnings == null) ? 0 : warnings.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExceptionContainer other = (ExceptionContainer) obj;
		if (exceptions == null) {
			if (other.exceptions != null)
				return false;
		} else if (!exceptions.equals(other.exceptions))
			return false;
		if (warnings == null) {
			if (other.warnings != null)
				return false;
		} else if (!warnings.equals(other.warnings))
			return false;
		return true;
	}
	
	
}
