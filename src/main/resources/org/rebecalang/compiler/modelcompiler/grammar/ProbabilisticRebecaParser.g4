parser grammar ProbabilisticRebecaParser;

//Uncomment import in case of generating compiler for probabilistic Rebeca.
//For PTRebeca, CoreRebecaParser is imported in its own compiler descriptor
//import CoreRebecaParser;


statement returns [Statement s]
	:
		fd = fieldDeclaration {$s = $fd.fd;} SEMI
    |	b = block {$s = $b.bs;}
    |   IF {$s = new ConditionalStatement(); $s.setLineNumber($IF.getLine());$s.setCharacter($IF.getCharPositionInLine());}
    	LPAREN e = expression RPAREN st = statement
    	{((ConditionalStatement)$s).setCondition($e.e); ((ConditionalStatement)$s).setStatement($st.s);}
		(ELSE est = statement {((ConditionalStatement)$s).setElseStatement($est.s);})?
    |   WHILE {$s = new WhileStatement(); $s.setLineNumber($WHILE.getLine());$s.setCharacter($WHILE.getCharPositionInLine());} 
    	LPAREN e = expression RPAREN st = statement {((WhileStatement)$s).setCondition($e.e); ((WhileStatement)$s).setStatement($st.s);}
    |   FOR {$s = new ForStatement(); $s.setLineNumber($FOR.getLine());$s.setCharacter($FOR.getCharPositionInLine());} 
    	LPAREN (fi = forInit {((ForStatement)$s).setForInitializer($fi.fi);})? SEMI 
    	(e = expression {((ForStatement)$s).setCondition($e.e);})? SEMI 
    	(el = expressionList {((ForStatement)$s).getForIncrement().addAll($el.el); })? 
    	RPAREN st = statement {((ForStatement)$s).setStatement($st.s);}
    |   SWITCH LPAREN e = expression RPAREN LBRACE sb = switchBlock RBRACE
    	{$s = $sb.ss; ((SwitchStatement)$s).setExpression($e.e); $s.setLineNumber($SWITCH.getLine()); $s.setCharacter($SWITCH.getCharPositionInLine());}
    |   RETURN e = expression? SEMI
    	{$s = new ReturnStatement(); ((ReturnStatement)$s).setExpression($e.e); $s.setLineNumber($RETURN.getLine());$s.setCharacter($RETURN.getCharPositionInLine());}
    |   BREAK SEMI
    	{$s = new BreakStatement(); $s.setLineNumber($BREAK.getLine());$s.setCharacter($BREAK.getCharPositionInLine());}
    |   CONTINUE SEMI
    	{$s = new BreakStatement(); $s.setLineNumber($CONTINUE.getLine());$s.setCharacter($CONTINUE.getCharPositionInLine());}
    |   SEMI {$s = new Statement();}
    |   se = statementExpression {$s = $se.se;} SEMI
    |   PALT {$s = new PAltStatement(); $s.setLineNumber($PALT.getLine());$s.setCharacter($PALT.getCharPositionInLine());}
		LBRACE
    		 (pasg = pAltStatementGroup {((PAltStatement)$s).getPAltStatementGroups().add($pasg.pasg);} )+
    	RBRACE
	;

pAltStatementGroup returns [PAltStatementGroup pasg]
	:
		PROB LPAREN e = expression RPAREN COLON LBRACE
		{$pasg = new PAltStatementGroup(); $pasg.setExpression($e.e);}  
    		(st = statement {$pasg.getStatements().add($st.s);})*
    	RBRACE
	;

unaryExpressionNotPlusMinus returns [Expression e]
    :   TILDA e1 = unaryExpression {$e = new UnaryExpression(); ((UnaryExpression)$e).setOperator($TILDA.text); ((UnaryExpression)$e).setExpression($e1.e); $e.setLineNumber($e1.e.getLineNumber()); $e.setCharacter($e1.e.getCharacter());}
    |	BANG e1 = unaryExpression {$e = new UnaryExpression(); ((UnaryExpression)$e).setOperator($BANG.text); ((UnaryExpression)$e).setExpression($e1.e); $e.setLineNumber($e1.e.getLineNumber()); $e.setCharacter($e1.e.getCharacter());}
    |   (
	    	ec = castExpression {$e = $ec.e;}
    	|	LPAREN ep = expression {$e = $ep.e;} RPAREN
	    |   p = primary  {$e = $p.tp;}
	    |   l = literal {$e = $l.l;}
	    |	QUES LPAREN 
	    	el = probabilisticList 
	    	{
	    	boolean isNonDet = true;
	    	for (ProbabilisticAlternativeValue pav : $el.el) {
	    		isNonDet &= pav.getProbability() == null;
	    	}
	    	if (isNonDet) {
	    		$e = new NonDetExpression();
		    	for (ProbabilisticAlternativeValue pav : $el.el) {
					((NonDetExpression)$e).getChoices().add(pav.getValue());
		    	}
	    	} else {
	    		$e = new ProbabilisticExpression(); ((ProbabilisticExpression)$e).getChoices().addAll($el.el);
	    	}
	    	$e.setLineNumber($QUES.getLine()); $e.setCharacter($QUES.getCharPositionInLine());}
    		RPAREN
	    )
        (DOT p2 = primary
        	{
        	DotPrimary de = new DotPrimary(); de.setLineNumber($DOT.getLine()); de.setCharacter($DOT.getCharPositionInLine());
        	if ($e instanceof DotPrimary) {
        		DotPrimary temp = (DotPrimary)$e;
        		while(temp.getRight() instanceof DotPrimary)
        			temp = (DotPrimary)temp.getRight();
        		de.setLeft(temp.getRight());
        		temp.setRight(de);
        		de.setRight($p2.tp);
        	} else {
        		de.setLeft($e); de.setRight($p2.tp);
	        	$e = de;
        	}
        	}
        )*
        (   PLUSPLUS {PlusSubExpression pse = new PlusSubExpression(); pse.setValue($e); pse.setOperator("++");$e=pse;
        		pse.setLineNumber($PLUSPLUS.getLine()); pse.setCharacter($PLUSPLUS.getCharPositionInLine());}
        |   SUBSUB {PlusSubExpression pse = new PlusSubExpression(); pse.setValue($e); pse.setOperator("--");$e=pse;
        		pse.setLineNumber($SUBSUB.getLine()); pse.setCharacter($SUBSUB.getCharPositionInLine());}
        )?

    ;


probabilisticList returns [List<ProbabilisticAlternativeValue> el]
    :   {$el = new LinkedList<ProbabilisticAlternativeValue>();}
        e1 = expression 
        	{ProbabilisticAlternativeValue value = new ProbabilisticAlternativeValue();
        	 value.setValue($e1.e); $el.add(value);}
        	 (COLON e2 = expression {value.setProbability(value.getValue());value.setValue($e2.e);})?
        
        (COMMA 
	        e1 = expression 
	        	{value = new ProbabilisticAlternativeValue();
	        	 value.setValue($e1.e); $el.add(value);}
	        	 (COLON e2 = expression {value.setProbability(value.getValue());value.setValue($e2.e);})?
		)*
    ;
	