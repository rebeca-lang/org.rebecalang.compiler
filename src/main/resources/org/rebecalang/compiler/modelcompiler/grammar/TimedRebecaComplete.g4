grammar TimedRebecaComplete;

import TimedRebecaLexer, TimedRebecaParser, CoreRebecaLexer, CoreRebecaParser;

@lexer::header {
	package org.rebecalang.compiler.modelcompiler.timedrebeca.compiler;
}
    
@parser::header {
	package org.rebecalang.compiler.modelcompiler.timedrebeca.compiler;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.*;
}
    
    