/** In the name of Allah
 *  The best will come
 */

package org.rebecalang.compiler.utils;

import java.util.HashSet;
import java.util.Set;

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

	public boolean isEmpty() {
		return exceptions.isEmpty();
	}
    
}
