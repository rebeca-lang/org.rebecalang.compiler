parser grammar CoreRebecaExpressionParser;

annotation returns [Annotation an]
    :   {$an = new Annotation();} 
    	MONKEYS_AT annotationName = IDENTIFIER
    	{$an.setIdentifier($annotationName.text);
    	 $an.setLineNumber($annotationName.getLine());
    	 $an.setCharacter($annotationName.getCharPositionInLine());}
    	( LPAREN ( exp = expression {$an.setValue($exp.e);} )? RPAREN )?
    ;

type returns [Type t]
	:
		typeName = IDENTIFIER
		{$t = new OrdinaryPrimitiveType(); ((OrdinaryPrimitiveType)$t).setName($typeName.text);
	 	 $t.setLineNumber($typeName.getLine());$t.setCharacter($typeName.getCharPositionInLine());}
		(gts = genericTypeParams 
			{GenericType gt = new GenericType(); gt.setName(((OrdinaryPrimitiveType)$t).getName()); gt.setNumberOfParameters($gts.gts.size());
			GenericTypeInstance gti = new GenericTypeInstance(); gti.setBase(gt); gti.getParameters().addAll($gts.gts); $t = gti;
			$t.setLineNumber($typeName.getLine());$t.setCharacter($typeName.getCharPositionInLine());}
		)?
		(ds = dimensions {OrdinaryPrimitiveType newpt = (OrdinaryPrimitiveType)$t; $t = new ArrayType(); ((ArrayType)$t).setOrdinaryPrimitiveType(newpt); ((ArrayType)$t).getDimensions().addAll($ds.ds);})?
	;

genericTypeParams returns [List<Type> gts]
	:
		LT {$gts = new LinkedList<Type>();}
		t = type {$gts.add($t.t);} (COMMA t = type {$gts.add($t.t);})* GT
	;
	
dimensions returns [List<Integer> ds]
	:
		{$ds = new LinkedList();}
		(LBRACKET i = INTLITERAL RBRACKET {$ds.add(Integer.parseInt($i.text));})+
	;


///////////////////////////
expression returns [Expression e]
    :
		ece = coreExpression {$e = $ece.e;}
        | ue = unaryExpression {$e = $ue.e;}
        | me1 = expression mo = multiplicativeOp me2 = expression
    	    { BinaryExpression e3 = new BinaryExpression(); e3.setOperator($mo.mo); e3.setLeft($me1.e); e3.setRight($me2.e);
			e3.setLineNumber($me1.e.getLineNumber()); e3.setCharacter($me1.e.getCharacter()); $e = e3; }
    	| ae1 = expression ado = additiveOp ae2 = expression
    	    { BinaryExpression e3 = new BinaryExpression(); e3.setOperator($ado.ado); e3.setLeft($ae1.e); e3.setRight($ae2.e);
			e3.setLineNumber($ae1.e.getLineNumber()); e3.setCharacter($ae1.e.getCharacter()); $e = e3; }
    	| se1 = expression so = shiftOp se2 = expression
    	    { BinaryExpression e3 = new BinaryExpression(); e3.setOperator($so.so); e3.setLeft($se1.e); e3.setRight($se2.e);
			e3.setLineNumber($se1.e.getLineNumber()); e3.setCharacter($se1.e.getCharacter()); $e = e3; }
    	| re1 = expression ro = relationalOp re2 = expression
    	    { BinaryExpression e3 = new BinaryExpression(); e3.setOperator($ro.ro); e3.setLeft($re1.e); e3.setRight($re2.e);
			e3.setLineNumber($re1.e.getLineNumber()); e3.setCharacter($re1.e.getCharacter()); $e = e3; }
        | ie1 = expression INSTANCEOF t=type
            {InstanceofExpression e3 = new InstanceofExpression(); e3.setValue($ie1.e); e3.setEvaluationType($t.t);
             e3.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE); e3.setLineNumber($t.t.getLineNumber()); e3.setCharacter($t.t.getCharacter());
             $e = e3; }
    	| ee1 = expression eo = equalityOp ee2 = expression
    	    { BinaryExpression e3 = new BinaryExpression(); e3.setOperator($eo.eo); e3.setLeft($ee1.e); e3.setRight($ee2.e);
			e3.setLineNumber($ee1.e.getLineNumber()); e3.setCharacter($ee1.e.getCharacter()); $e = e3; }
        | ane1 = expression AMP ane2 = expression
    	    { BinaryExpression e3 = new BinaryExpression(); e3.setOperator($AMP.text); e3.setLeft($ane1.e); e3.setRight($ane2.e);
			e3.setLineNumber($ane1.e.getLineNumber()); e3.setCharacter($ane1.e.getCharacter()); $e = e3; }
		| ce1 = expression CARET ce2 = expression
    	    { BinaryExpression e3 = new BinaryExpression(); e3.setOperator($CARET.text); e3.setLeft($ce1.e); e3.setRight($ce2.e);
			e3.setLineNumber($ce1.e.getLineNumber()); e3.setCharacter($ce1.e.getCharacter()); $e = e3; }
		| be1 = expression BAR be2 = expression
    	    { BinaryExpression e3 = new BinaryExpression(); e3.setOperator($BAR.text); e3.setLeft($be1.e); e3.setRight($be2.e);
			e3.setLineNumber($be1.e.getLineNumber()); e3.setCharacter($be1.e.getCharacter()); $e = e3; }
		| aae1 = expression AMPAMP aae2 = expression
    	    { BinaryExpression e3 = new BinaryExpression(); e3.setOperator($AMPAMP.text); e3.setLeft($aae1.e); e3.setRight($aae2.e);
			e3.setLineNumber($aae1.e.getLineNumber()); e3.setCharacter($aae1.e.getCharacter()); $e = e3; }
        | bbe1 = expression BARBAR bbe2 = expression
    	    { BinaryExpression e3 = new BinaryExpression(); e3.setOperator($BARBAR.text); e3.setLeft($bbe1.e); e3.setRight($bbe2.e);
			e3.setLineNumber($bbe1.e.getLineNumber()); e3.setCharacter($bbe1.e.getCharacter()); $e = e3; }
    	| cee1 = expression QUES cee2 = expression COLON cee3 = expression
        	{ TernaryExpression e4 = new TernaryExpression(); e4.setCondition($cee1.e); e4.setLeft($cee2.e); e4.setRight($cee3.e);
			e4.setLineNumber($cee1.e.getLineNumber());e4.setCharacter($cee1.e.getCharacter()); $e = e4;}
    	| ase1 = expression ao = assignmentOperator ase2 = expression
    	    { BinaryExpression e3 = new BinaryExpression(); e3.setOperator($ao.ao); e3.setLeft($ase1.e); e3.setRight($ase2.e);
			e3.setLineNumber($ase1.e.getLineNumber());e3.setCharacter($ase1.e.getCharacter()); $e = e3; }
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

multiplicativeOp returns [String mo]
    :   STAR {$mo = $STAR.text;}
    |   SLASH {$mo = $SLASH.text;}
    |   PERCENT {$mo = $PERCENT.text;}
    ;

additiveOp returns [String ado]
    :   PLUS {$ado = $PLUS.text;}
    |   SUB {$ado = $SUB.text;}
    ;

relationalOp returns [String ro]
    :    LT EQ {$ro = $LT.text + $EQ.text;}
    |    GT EQ {$ro = $GT.text + $EQ.text;}
    |   LT {$ro = $LT.text;}
    |   GT {$ro = $GT.text;}
    ;

shiftOp returns [String so]
    :    LT LT {$so = "<<";}
    |    GT GT {$so = ">>";}
    ;

equalityOp returns [String eo]
    :    EQEQ {$eo = $EQEQ.text;}
    |    BANGEQ {$eo = $BANGEQ.text;}
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
    |   TILDA et = unaryExpression {$e = new UnaryExpression(); ((UnaryExpression)$e).setOperator($TILDA.text); ((UnaryExpression)$e).setExpression($et.e); $e.setLineNumber($et.e.getLineNumber()); $e.setCharacter($et.e.getCharacter());}
    |	BANG eb = unaryExpression {$e = new UnaryExpression(); ((UnaryExpression)$e).setOperator($BANG.text); ((UnaryExpression)$e).setExpression($eb.e); $e.setLineNumber($eb.e.getLineNumber()); $e.setCharacter($eb.e.getCharacter());}
    |   ece = coreExpression {$e = $ece.e;}
    ;

coreExpression returns [Expression e]
    :  (
	    	ec = castExpression {$e = $ec.e;}
    	|	LPAREN ep = expression {$e = $ep.e;} RPAREN
	    |   p = primary {$e = $p.tp;}
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
    :   {$el = new LinkedList<Expression>(); LinkedList<Annotation> ans = new LinkedList<Annotation>();}
        (a = annotation {ans.add($a.an);})* e = expression {$e.e.getAnnotations().addAll(ans); ans.clear(); $el.add($e.e);} 
		(COMMA (a = annotation {ans.add($a.an);})* e = expression {$e.e.getAnnotations().addAll(ans); ans.clear(); $el.add($e.e);})*
    ;

	
literal returns [Literal l]
    :   INTLITERAL {$l = new Literal();$l.setLiteralValue($INTLITERAL.text);
    		$l.setType(CoreRebecaTypeSystem.INT_TYPE);
    		$l.setLineNumber($INTLITERAL.getLine());$l.setCharacter($INTLITERAL.getCharPositionInLine());}
    |   FLOATLITERAL 
    	{$l = new Literal();$l.setLiteralValue($FLOATLITERAL.text);
    	$l.setType(CoreRebecaTypeSystem.FLOAT_TYPE);
    	$l.setLineNumber($FLOATLITERAL.getLine());$l.setCharacter($FLOATLITERAL.getCharPositionInLine());}
    |   DOUBLELITERAL 
    	{$l = new Literal();$l.setLiteralValue($DOUBLELITERAL.text);
    	$l.setType(CoreRebecaTypeSystem.DOUBLE_TYPE);
    	$l.setLineNumber($DOUBLELITERAL.getLine());$l.setCharacter($DOUBLELITERAL.getCharPositionInLine());}
    |   CHARLITERAL 
    	{$l = new Literal();$l.setLiteralValue($CHARLITERAL.text);
    	$l.setType(CoreRebecaTypeSystem.CHAR_TYPE);
    	$l.setLineNumber($CHARLITERAL.getLine());$l.setCharacter($CHARLITERAL.getCharPositionInLine());}
    |   STRINGLITERAL 
    	{$l = new Literal();$l.setLiteralValue($STRINGLITERAL.text);
    	$l.setType(CoreRebecaTypeSystem.STRING_TYPE);
    	$l.setLineNumber($STRINGLITERAL.getLine());$l.setCharacter($STRINGLITERAL.getCharPositionInLine());}
    |   TRUE 
    	{$l = new Literal();$l.setLiteralValue("true");
    	$l.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
    	$l.setLineNumber($TRUE.getLine());$l.setCharacter($TRUE.getCharPositionInLine());}
    |   FALSE 
    	{$l = new Literal();$l.setLiteralValue("false");
    	$l.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
    	$l.setLineNumber($FALSE.getLine());$l.setCharacter($FALSE.getCharPositionInLine());}
    |   NULL 
    	{$l = new Literal();$l.setLiteralValue("null");
    	$l.setType(CoreRebecaTypeSystem.NULL_TYPE);
    	$l.setLineNumber($NULL.getLine());$l.setCharacter($NULL.getCharPositionInLine());}
    ;