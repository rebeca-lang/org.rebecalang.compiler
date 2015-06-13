/** In the name of Allah
 *  The best will come
 */

package org.rebecalang.compiler.utils;

public class CodeCompilationException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = -785667532009988465L;
	private int line;
    private int column;
    
    public CodeCompilationException(String message, int line, int column) {
        super(message);
        this.line = line;
        this.column = column;
    }

    public String toString() {
        return "line:" + line + ", column:" + column + ", " + getMessage();
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }
    
    public void setLine(int line) {
		this.line = line;
	}
    
    public void setColumn(int column) {
		this.column = column;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CodeCompilationException that = (CodeCompilationException) o;

        if (column != that.column) return false;
        if (line != that.line) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = line;
        result = 31 * result + column;
        return result;
    }
}
