parser grammar TimedRebecaParser;

//import CoreRebecaParser;

primary returns [TermPrimary tp]
    :   
    id1 = IDENTIFIER {$tp = new TermPrimary(); $tp.setName($id1.text);
					  $tp.setLineNumber($id1.getLine()); $tp.setCharacter($id1.getCharPositionInLine());}
    (	lp = LPAREN 
    	{TimedRebecaParentSuffixPrimary psp = new TimedRebecaParentSuffixPrimary(); 
    	 psp.setLineNumber($lp.getLine()); psp.setCharacter($lp.getCharPositionInLine());
    	 $tp.setParentSuffixPrimary(psp);}
		(el = expressionList {$tp.getParentSuffixPrimary().getArguments().addAll($el.el);})?
		RPAREN
    	(AFTER LPAREN ef = expression RPAREN {psp.setAfterExpression($ef.e);})?
    	(DEADLINE LPAREN ed = expression RPAREN {psp.setDeadlineExpression($ed.e);})?
    )?
	(LBRACKET e2 = expression RBRACKET {$tp.getIndices().add($e2.e);})*
    ;
