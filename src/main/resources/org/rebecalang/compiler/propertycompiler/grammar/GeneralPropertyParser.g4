parser grammar GeneralPropertyParser;

import CoreRebecaExpressionParser;

expression returns [Expression e]
    :
		ece = coreExpression {$e = $ece.e;}
        | ue = unaryExpression {$e = $ue.e;}
        | me1 = expression {$e = $me1.e;}
        	{BinaryExpression e3 = new BinaryExpression(); e3.setLeft($e); e3.setLineNumber($e.getLineNumber()); e3.setCharacter($e.getCharacter());}
            (   STAR {e3.setOperator($STAR.text);} | SLASH {e3.setOperator($SLASH.text);} | PERCENT {e3.setOperator($PERCENT.text);} )
            me2 = expression {e3.setRight($me2.e); $e = e3;}
    	| ae1 = expression {$e = $ae1.e;}
        	{BinaryExpression e3 = new BinaryExpression(); e3.setLeft($e); e3.setLineNumber($e.getLineNumber()); e3.setCharacter($e.getCharacter());}
            (   PLUS {e3.setOperator($PLUS.text);} | SUB {e3.setOperator($SUB.text);} )
            ae2 = expression {e3.setRight($ae2.e); $e = e3;}
    	| se1 = expression {$e = $se1.e;} so = shiftOp se2 = expression {BinaryExpression e3 = new BinaryExpression();
			e3.setOperator($so.so); e3.setLeft($e); e3.setRight($se2.e);
			e3.setLineNumber($e.getLineNumber()); e3.setCharacter($e.getCharacter()); $e = e3;
			}
    	| re1 = expression {$e = $re1.e;} ro = relationalOp re2 = expression {BinaryExpression e3 = new BinaryExpression();
			e3.setOperator($ro.ro); e3.setLeft($e); e3.setRight($re2.e);
			e3.setLineNumber($e.getLineNumber());e3.setCharacter($e.getCharacter()); $e = e3;
			}
        | ie1 = expression {$e = $ie1.e;} INSTANCEOF t=type {$e = new InstanceofExpression();
                ((InstanceofExpression)$e).setValue($ie1.e);
                ((InstanceofExpression)$e).setEvaluationType($t.t);
                $e.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
                $e.setLineNumber($t.t.getLineNumber()); $e.setCharacter($t.t.getCharacter());
                }
    	| ase1 = expression {$e = $ase1.e;} {$e = new BinaryExpression();
                ((BinaryExpression)$e).setLeft($ase1.e); $e.setLineNumber($ase1.e.getLineNumber()); $e.setCharacter($ase1.e.getCharacter());}
                   (   EQEQ {((BinaryExpression)$e).setOperator($EQEQ.text);}
                   |   BANGEQ {((BinaryExpression)$e).setOperator($BANGEQ.text);}
                   )
                   ase2 = expression {((BinaryExpression)$e).setRight($ase2.e);}
        | ane1 = expression {$e = $ane1.e;} AMP ane2 = expression {BinaryExpression e3 = new BinaryExpression();
         	e3.setOperator($AMP.text); e3.setLeft($e); e3.setRight($ane2.e);
         	e3.setLineNumber($e.getLineNumber());e3.setCharacter($e.getCharacter()); $e = e3;
            }
		| ce1 = expression {$e = $ce1.e;} CARET ce2 = expression {BinaryExpression e3 = new BinaryExpression();
          	e3.setOperator($CARET.text); e3.setLeft($e); e3.setRight($ce2.e);
          	e3.setLineNumber($e.getLineNumber());e3.setCharacter($e.getCharacter()); $e = e3;
            }
		| be1 = expression {$e = $be1.e;} BAR be2 = expression {BinaryExpression e3 = new BinaryExpression();
			e3.setOperator($BAR.text); e3.setLeft($e); e3.setRight($be2.e);
			e3.setLineNumber($e.getLineNumber());e3.setCharacter($e.getCharacter()); $e = e3;
		    }
		| aae1 = expression {$e = $aae1.e;} AMPAMP aae2 = expression {BinaryExpression e3 = new BinaryExpression();
			e3.setOperator($AMPAMP.text); e3.setLeft($e); e3.setRight($aae2.e);
			e3.setLineNumber($e.getLineNumber());e3.setCharacter($e.getCharacter()); $e = e3;
		    }
    	| bbe1 = expression {$e = $bbe1.e;} ({BinaryExpression e3 = new BinaryExpression();}
        	BARBAR{e3.setOperator($BARBAR.text);} | THEN {e3.setOperator($THEN.text);}) bbe2 = expression
			{e3.setLeft($bbe1.e); e3.setRight($bbe2.e);
			e3.setLineNumber($bbe1.e.getLineNumber());e3.setCharacter($bbe1.e.getCharacter()); $e = e3;
			}
    	| cee1 = expression {$e = $cee1.e;} QUES cee2 = expression COLON cee3 = expression
        	{TernaryExpression e4 = new TernaryExpression();
			e4.setCondition($cee1.e); e4.setLeft($cee2.e); e4.setRight($cee3.e);
			e4.setLineNumber($cee1.e.getLineNumber());e4.setCharacter($cee1.e.getCharacter()); $e = e4;
			}
    	| asge1 = expression {$e = $asge1.e;} ao = assignmentOperator asge2 = expression {BinaryExpression e3 = new BinaryExpression();
			e3.setOperator($ao.ao); e3.setLeft($asge1.e); e3.setRight($asge2.e);
			e3.setLineNumber($asge1.e.getLineNumber());e3.setCharacter($asge1.e.getCharacter()); $e = e3;
			}
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