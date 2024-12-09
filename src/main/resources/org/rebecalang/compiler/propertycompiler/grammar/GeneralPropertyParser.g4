parser grammar GeneralPropertyParser;

import CoreRebecaExpressionParser;

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
    	| bbe1 = expression {$e = $bbe1.e;} ({BinaryExpression e3 = new BinaryExpression();}
        	BARBAR{e3.setOperator($BARBAR.text);} | THEN {e3.setOperator($THEN.text);}) bbe2 = expression
			{e3.setLeft($bbe1.e); e3.setRight($bbe2.e);
			e3.setLineNumber($bbe1.e.getLineNumber());e3.setCharacter($bbe1.e.getCharacter()); $e = e3;
			}
    	| cee1 = expression QUES cee2 = expression COLON cee3 = expression
        	{ TernaryExpression e4 = new TernaryExpression(); e4.setCondition($cee1.e); e4.setLeft($cee2.e); e4.setRight($cee3.e);
			e4.setLineNumber($cee1.e.getLineNumber());e4.setCharacter($cee1.e.getCharacter()); $e = e4;}
    	| ase1 = expression ao = assignmentOperator ase2 = expression
    	    { BinaryExpression e3 = new BinaryExpression(); e3.setOperator($ao.ao); e3.setLeft($ase1.e); e3.setRight($ase2.e);
			e3.setLineNumber($ase1.e.getLineNumber());e3.setCharacter($ase1.e.getCharacter()); $e = e3; }
    ;




propertyModel returns [PropertyModel pm]
	:
	{$pm = new PropertyModel();}
	PROPERTY LBRACE
	
	(DEFINE LBRACE
		(id=IDENTIFIER EQ e = expression {
			Definition definition = new Definition();
			definition.setName($id.text);
			definition.setExpression($e.e);
			$pm.getDefinitions().add(definition);} SEMI)*
	RBRACE)?

	propertyDefinition[$pm]	
	
	RBRACE
	;

propertyDefinition[PropertyModel pm] :;