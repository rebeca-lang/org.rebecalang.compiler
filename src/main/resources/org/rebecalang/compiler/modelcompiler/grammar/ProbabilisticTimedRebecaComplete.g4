grammar ProbabilisticTimedRebecaComplete;

import ProbabilisticRebecaLexer, ProbabilisticRebecaParser, TimedRebecaParser, TimedRebecaLexer, CoreRebecaParser, CoreRebecaLexer;

@lexer::header {
	package org.rebecalang.compiler.modelcompiler.probabilistictimedrebeca.compiler;
}
    
@parser::header {
	package org.rebecalang.compiler.modelcompiler.probabilistictimedrebeca.compiler;
	import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.*;
	import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.*;
}
