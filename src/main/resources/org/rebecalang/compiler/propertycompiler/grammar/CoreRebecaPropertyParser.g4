parser grammar CoreRebecaPropertyParser;

import CoreRebecaExpressionParser;

conditionalOrExpression returns [Expression e]
    :   
    	e1 = conditionalAndExpression {$e = $e1.e;}
        ({BinaryExpression e3 = new BinaryExpression();}
        	(BARBAR{e3.setOperator($BARBAR.text);} | THEN {e3.setOperator($THEN.text);}) e2 = conditionalAndExpression 
			{e3.setLeft($e1.e); e3.setRight($e2.e);
			e3.setLineNumber($e1.e.getLineNumber());e3.setCharacter($e1.e.getCharacter()); $e = e3;
			}
        )*
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
	
	(LTL LBRACE
		(id=IDENTIFIER COLON ltle = expression {
			LTLDefinition ltlDefinition = new LTLDefinition();
			ltlDefinition.setName($id.text);
			ltlDefinition.setExpression($ltle.e);
			$pm.getLTLDefinitions().add(ltlDefinition);} SEMI)*
	RBRACE)?
	
	RBRACE
	;
