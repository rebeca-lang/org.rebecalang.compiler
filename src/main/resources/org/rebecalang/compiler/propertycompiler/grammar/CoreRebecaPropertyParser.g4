parser grammar CoreRebecaPropertyParser;

import CoreRebecaExpressionParser, GeneralPropertyParser;


propertyDefinition [PropertyModel pm]
	:
	(LTL LBRACE
		(id=IDENTIFIER COLON ltle = expression {
			LTLDefinition ltlDefinition = new LTLDefinition();
			ltlDefinition.setName($id.text);
			ltlDefinition.setExpression($ltle.e);
			$pm.getLTLDefinitions().add(ltlDefinition);} SEMI)*
	RBRACE)?
	;
