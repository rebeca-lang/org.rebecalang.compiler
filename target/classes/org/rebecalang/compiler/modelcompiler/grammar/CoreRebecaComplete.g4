grammar CoreRebecaComplete;
    
import CoreRebecaLexer, CoreRebecaParser;

@lexer::header {
	package org.rebecalang.compiler.modelcompiler.corerebeca.compiler;
}
    
@parser::header {
	package org.rebecalang.compiler.modelcompiler.corerebeca.compiler;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	import java.util.*;
	import org.antlr.runtime.BitSet;
	import org.rebecalang.compiler.utils.TypesUtilities;
}
