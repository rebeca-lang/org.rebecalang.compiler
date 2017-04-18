parser grammar TimedRebecaPropertyParser;

import CoreRebecaExpressionParser, GeneralPropertyParser;


propertyDefinition [PropertyModel pm]
	:
	(TCTL LBRACE
		(id=IDENTIFIER COLON tctle = expression {
			TCTLDefinition tctlDefinition = new TCTLDefinition();
			tctlDefinition.setName($id.text);
			tctlDefinition.setExpression($tctle.e);
			$pm.getTCTLDefinitions().add(tctlDefinition);} SEMI)*
	RBRACE)?
	;
