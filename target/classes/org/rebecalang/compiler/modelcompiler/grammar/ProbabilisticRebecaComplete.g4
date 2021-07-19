grammar ProbabilisticRebecaComplete;

import ProbabilisticRebecaLexer, ProbabilisticRebecaParser, CoreRebecaLexer, CoreRebecaParser;

@lexer::header {
	package org.rebecalang.compiler.modelcompiler.probabilisticrebeca.compiler;
}
    
@parser::header {
	package org.rebecalang.compiler.modelcompiler.probabilisticrebeca.compiler;
	import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	
	import java.util.*;
	import org.antlr.runtime.BitSet;
	import org.rebecalang.compiler.utils.TypesUtilities;
}
