parser grammar CoreRebecaExpressionParser;


type returns [Type t]
	:
		{$t = new PrimitiveType();}
		typeName = IDENTIFIER
		{$t = new OrdinaryPrimitiveType(); ((OrdinaryPrimitiveType)$t).setName($typeName.text);
	 	 $t.setLineNumber($typeName.getLine());$t.setCharacter($typeName.getCharPositionInLine());}
		(ds = dimensions {PrimitiveType newpt = (PrimitiveType)$t; $t = new ArrayType(); ((ArrayType)$t).setPrimitiveType(newpt); ((ArrayType)$t).getDimensions().addAll($ds.ds);})?
	;
	
dimensions returns [List<Integer> ds]
	:
		{$ds = new LinkedList();}
		(LBRACKET i = INTLITERAL RBRACKET {$ds.add(Integer.parseInt($i.text));})+
	;


///////////////////////////
expression returns [Expression e]
    :   
    	e1 = conditionalExpression {$e = $e1.e;}
        (ao = assignmentOperator e2 = expression {BinaryExpression e3 = new BinaryExpression();
			e3.setOperator($ao.ao); e3.setLeft($e1.e); e3.setRight($e2.e);
			e3.setLineNumber($e1.e.getLineNumber());e3.setCharacter($e1.e.getCharacter()); $e = e3;
			}
        )?
    ;


assignmentOperator returns [String ao]
    :   EQ {$ao = $EQ.text;}
    |   PLUSEQ {$ao = $PLUSEQ.text;}
    |   SUBEQ {$ao = $SUBEQ.text;}
    |   STAREQ {$ao = $STAREQ.text;}
    |   SLASHEQ {$ao = $SLASHEQ.text;}
    |   AMPEQ {$ao = $AMPEQ.text;}
    |   BAREQ {$ao = $BAREQ.text;}
    |   CARETEQ {$ao = $CARETEQ.text;}
    |   TILDAEQ {$ao = $TILDAEQ.text;}
    |   PERCENTEQ {$ao = $PERCENTEQ.text;}
    |   LTLTEQ {$ao = $LTLTEQ.text;}
    |   GTGTEQ {$ao = $GTGTEQ.text;}
    ;


conditionalExpression returns [Expression e]
    :   
    	e1 = conditionalOrExpression {$e = $e1.e;}
        (QUES e2 = expression COLON e3 = conditionalExpression 
        	{TernaryExpression e4 = new TernaryExpression();
			e4.setCondition($e1.e); e4.setLeft($e2.e); e4.setRight($e3.e);
			e4.setLineNumber($e1.e.getLineNumber());e4.setCharacter($e1.e.getCharacter()); $e = e4;
			}
        )?
    ;

conditionalOrExpression returns [Expression e]
    :   
    	e1 = conditionalAndExpression {$e = $e1.e;}
        (BARBAR e2 = conditionalAndExpression {BinaryExpression e3 = new BinaryExpression();
			e3.setOperator($BARBAR.text); e3.setLeft($e1.e); e3.setRight($e2.e);
			e3.setLineNumber($e1.e.getLineNumber());e3.setCharacter($e1.e.getCharacter()); $e = e3;
			}
        )*
    ;

conditionalAndExpression returns [Expression e]
    :   
    	e1 = inclusiveOrExpression {$e = $e1.e;}
        (AMPAMP e2 = inclusiveOrExpression {BinaryExpression e3 = new BinaryExpression();
			e3.setOperator($AMPAMP.text); e3.setLeft($e1.e); e3.setRight($e2.e);
			e3.setLineNumber($e1.e.getLineNumber());e3.setCharacter($e1.e.getCharacter()); $e = e3;
			}
        )*
    ;

inclusiveOrExpression returns [Expression e]
    :   
    	e1 = exclusiveOrExpression {$e = $e1.e;}
        (BAR e2 = exclusiveOrExpression {BinaryExpression e3 = new BinaryExpression();
			e3.setOperator($BAR.text); e3.setLeft($e1.e); e3.setRight($e2.e);
			e3.setLineNumber($e1.e.getLineNumber());e3.setCharacter($e1.e.getCharacter()); $e = e3;
			}
        )*
    ;

exclusiveOrExpression returns [Expression e]
    :   e1 = andExpression {$e = $e1.e;}
        (CARET e2 = andExpression {BinaryExpression e3 = new BinaryExpression();
			e3.setOperator($CARET.text); e3.setLeft($e1.e); e3.setRight($e2.e);
			e3.setLineNumber($e1.e.getLineNumber());e3.setCharacter($e1.e.getCharacter()); $e = e3;
			}
        )*
    ;

andExpression returns [Expression e]
    :   e1 = equalityExpression {$e = $e1.e;}
        (AMP e2 = equalityExpression {BinaryExpression e3 = new BinaryExpression();
			e3.setOperator($AMP.text); e3.setLeft($e1.e); e3.setRight($e2.e);
			e3.setLineNumber($e1.e.getLineNumber());e3.setCharacter($e1.e.getCharacter()); $e = e3;
			}
        )*
    ;

equalityExpression returns [Expression e]
    :   
    	e1 = instanceOfExpression {$e = $e1.e;}
        (
        	{$e = new BinaryExpression(); ((BinaryExpression)$e).setLeft($e1.e); $e.setLineNumber($e1.e.getLineNumber()); $e.setCharacter($e1.e.getCharacter());}
            (   EQEQ {((BinaryExpression)$e).setOperator($EQEQ.text);}
            |   BANGEQ {((BinaryExpression)$e).setOperator($BANGEQ.text);}
            )
            e2 = instanceOfExpression {((BinaryExpression)$e).setRight($e2.e);}
        )*
    ;

instanceOfExpression returns [Expression e]
    :   
    	e1 = relationalExpression {$e = $e1.e;}
        //(INSTANCEOF type
        //)?
    ;

relationalExpression returns [Expression e]
    :   
    	e1 = shiftExpression {$e = $e1.e;}
        (ro = relationalOp e2 = shiftExpression {BinaryExpression e3 = new BinaryExpression();
			e3.setOperator($ro.ro); e3.setLeft($e1.e); e3.setRight($e2.e);
			e3.setLineNumber($e1.e.getLineNumber());e3.setCharacter($e1.e.getCharacter()); $e = e3;
			}
        )*
    ;

relationalOp returns [String ro]
    :    LT EQ {$ro = $LT.text + $EQ.text;}
    |    GT EQ {$ro = $GT.text + $EQ.text;}
    |   LT {$ro = $LT.text;}
    |   GT {$ro = $GT.text;}
    ;

shiftExpression returns [Expression e]
    :   
    	e1 = additiveExpression {$e = $e1.e;}
        (so = shiftOp e2 = additiveExpression {BinaryExpression e3 = new BinaryExpression();
			e3.setOperator($so.so); e3.setLeft($e1.e); e3.setRight($e2.e);
			e3.setLineNumber($e1.e.getLineNumber()); e3.setCharacter($e1.e.getCharacter()); $e = e3;
			}
        )*
    ;


shiftOp returns [String so]
    :    LT LT {$so = "<<";}
    |    GT GT {$so = ">>";}
    ;


additiveExpression returns [Expression e]
    :   
    	e1 = multiplicativeExpression {$e = $e1.e;}
        (
        	{BinaryExpression e3 = new BinaryExpression(); e3.setLeft($e); e3.setLineNumber($e.getLineNumber()); e3.setCharacter($e.getCharacter());}
            (   PLUS {e3.setOperator($PLUS.text);}
            |   SUB {e3.setOperator($SUB.text);}
            )
            e2 = multiplicativeExpression {e3.setRight($e2.e); $e = e3;}
         )*
    ;

multiplicativeExpression returns [Expression e]
    :
        e1 = unaryExpression {$e = $e1.e;}
        (
        	{BinaryExpression e3 = new BinaryExpression(); e3.setLeft($e); e3.setLineNumber($e.getLineNumber()); e3.setCharacter($e.getCharacter());}
            (   STAR {e3.setOperator($STAR.text);}
            |   SLASH {e3.setOperator($SLASH.text);}
            |   PERCENT {e3.setOperator($PERCENT.text);}
            )
            e2 = unaryExpression {e3.setRight($e2.e); $e = e3;}
        )*
    ;

/**
 * NOTE: for '+' and '-', if the next token is int or long interal, then it's not a unary expression.
 *       it's a literal with signed value. INTLTERAL AND LONG LITERAL are added here for this.
 */
unaryExpression returns [Expression e]
    :   PLUS ep = unaryExpression {$e = $ep.e;}
    |   SUB es = unaryExpression {$e = new UnaryExpression(); ((UnaryExpression)$e).setOperator($SUB.text); ((UnaryExpression)$e).setExpression($es.e); ((UnaryExpression)$e).setLineNumber($es.e.getLineNumber()); $e.setCharacter($es.e.getCharacter());}
    |   PLUSPLUS epp = unaryExpression {$e = new UnaryExpression(); ((UnaryExpression)$e).setOperator($PLUSPLUS.text); ((UnaryExpression)$e).setExpression($epp.e); $e.setLineNumber($epp.e.getLineNumber()); $e.setCharacter($epp.e.getCharacter());}
    |   SUBSUB ess = unaryExpression {$e = new UnaryExpression(); ((UnaryExpression)$e).setOperator($SUBSUB.text); ((UnaryExpression)$e).setExpression($ess.e); $e.setLineNumber($ess.e.getLineNumber()); $e.setCharacter($ess.e.getCharacter());}
    |   eu = unaryExpressionNotPlusMinus {$e = $eu.e;}
    ;

unaryExpressionNotPlusMinus returns [Expression e]
    :   TILDA e1 = unaryExpression {$e = new UnaryExpression(); ((UnaryExpression)$e).setOperator($TILDA.text); ((UnaryExpression)$e).setExpression($e1.e); $e.setLineNumber($e1.e.getLineNumber()); $e.setCharacter($e1.e.getCharacter());}
    |	BANG e1 = unaryExpression {$e = new UnaryExpression(); ((UnaryExpression)$e).setOperator($BANG.text); ((UnaryExpression)$e).setExpression($e1.e); $e.setLineNumber($e1.e.getLineNumber()); $e.setCharacter($e1.e.getCharacter());}
    |   (
	    	ec = castExpression {$e = $ec.e;}
    	|	LPAREN ep = expression {$e = $ep.e;} RPAREN
	    |   p = primary  {$e = $p.tp;}
	    |   l = literal {$e = $l.l;}
	    |	QUES LPAREN el = expressionList RPAREN 
	    	{$e = new NonDetExpression(); ((NonDetExpression)$e).getChoices().addAll($el.el);
	    	$e.setLineNumber($QUES.getLine()); $e.setCharacter($QUES.getCharPositionInLine());}
	    |  	NEW 
	    	t = type 
	    	{$e = new RebecInstantiationPrimary();
				$e.setLineNumber($t.t.getLineNumber()); $e.setCharacter($t.t.getCharacter()); $e.setType($t.t);}
			LPAREN (el = expressionList {((RebecInstantiationPrimary)$e).getBindings().addAll($el.el);})? RPAREN 
			COLON
			LPAREN (el = expressionList {((RebecInstantiationPrimary)$e).getArguments().addAll($el.el);})? RPAREN 
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

castExpression returns [Expression e]
    :   
    LPAREN t = type RPAREN e1 = expression {$e = new CastExpression();
    	((CastExpression)$e).setExpression($e1.e); ((CastExpression)$e).setType($t.t);
		$e.setLineNumber($e1.e.getLineNumber()); $e.setCharacter($e1.e.getCharacter());}
    ;

primary returns [TermPrimary tp]
    :   
    id1 = IDENTIFIER {$tp = new TermPrimary(); $tp.setName($id1.text);
					  $tp.setLineNumber($id1.getLine()); $tp.setCharacter($id1.getCharPositionInLine());}
    (	lp = LPAREN 
    	{ParentSuffixPrimary psp = new ParentSuffixPrimary(); 
    	 psp.setLineNumber($lp.getLine()); psp.setCharacter($lp.getCharPositionInLine());
    	 $tp.setParentSuffixPrimary(psp);}
		(el = expressionList {$tp.getParentSuffixPrimary().getArguments().addAll($el.el);})?
		RPAREN
    )?
	(LBRACKET e2 = expression RBRACKET {$tp.getIndices().add($e2.e);})*
    ;

expressionList returns [List<Expression> el]
    :   {$el = new LinkedList<Expression>();}
        e = expression {$el.add($e.e);} (COMMA e = expression {$el.add($e.e);})*
    ;

	
literal returns [Literal l]
    :   INTLITERAL {$l = new Literal();$l.setLiteralValue($INTLITERAL.text);
    		$l.setType(TypesUtilities.INT_TYPE);
    		$l.setLineNumber($INTLITERAL.getLine());$l.setCharacter($INTLITERAL.getCharPositionInLine());}
    |   FLOATLITERAL 
    	{$l = new Literal();$l.setLiteralValue($FLOATLITERAL.text);
    	$l.setType(TypesUtilities.FLOAT_TYPE);
    	$l.setLineNumber($FLOATLITERAL.getLine());$l.setCharacter($FLOATLITERAL.getCharPositionInLine());}
    |   DOUBLELITERAL 
    	{$l = new Literal();$l.setLiteralValue($DOUBLELITERAL.text);
    	$l.setType(TypesUtilities.DOUBLE_TYPE);
    	$l.setLineNumber($DOUBLELITERAL.getLine());$l.setCharacter($DOUBLELITERAL.getCharPositionInLine());}
    |   CHARLITERAL 
    	{$l = new Literal();$l.setLiteralValue($CHARLITERAL.text);
    	$l.setType(TypesUtilities.CHAR_TYPE);
    	$l.setLineNumber($CHARLITERAL.getLine());$l.setCharacter($CHARLITERAL.getCharPositionInLine());}
    |   STRINGLITERAL 
    	{$l = new Literal();$l.setLiteralValue($STRINGLITERAL.text);
    	$l.setType(TypesUtilities.STRING_TYPE);
    	$l.setLineNumber($STRINGLITERAL.getLine());$l.setCharacter($STRINGLITERAL.getCharPositionInLine());}
    |   TRUE 
    	{$l = new Literal();$l.setLiteralValue("true");
    	$l.setType(TypesUtilities.BOOLEAN_TYPE);
    	$l.setLineNumber($TRUE.getLine());$l.setCharacter($TRUE.getCharPositionInLine());}
    |   FALSE 
    	{$l = new Literal();$l.setLiteralValue("false");
    	$l.setType(TypesUtilities.BOOLEAN_TYPE);
    	$l.setLineNumber($FALSE.getLine());$l.setCharacter($FALSE.getCharPositionInLine());}
    |   NULL 
    	{$l = new Literal();$l.setLiteralValue("null");
    	$l.setType(TypesUtilities.NULL_TYPE);
    	$l.setLineNumber($NULL.getLine());$l.setCharacter($NULL.getCharPositionInLine());}
    ;

