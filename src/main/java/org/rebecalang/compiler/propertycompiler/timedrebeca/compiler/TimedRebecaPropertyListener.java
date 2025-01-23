package org.rebecalang.compiler.propertycompiler.timedrebeca.compiler;

import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.AssertionDefinition;
import org.rebecalang.compiler.propertycompiler.timedrebeca.objectmodel.PropertyModel;
import org.rebecalang.compiler.propertycompiler.timedrebeca.objectmodel.TCTLDefinition;
import java.util.ArrayList;
import java.util.List;

public class TimedRebecaPropertyListener extends TimedRebecaPropertyCompleteBaseListener {
    @Override
    public void exitAssertionBlock(TimedRebecaPropertyCompleteParser.AssertionBlockContext ctx) {
        List<AssertionDefinition> assertions = new ArrayList<>();
        int index = 0;
        for (TimedRebecaPropertyCompleteParser.ExpressionContext assertion : ctx.expression()) {
            AssertionDefinition assertionDefinition = new AssertionDefinition();
            assertionDefinition.setName(ctx.IDENTIFIER(index).getText());
            assertionDefinition.setExpression(assertion.e);
            assertions.add(assertionDefinition);
            index++;
        }
        ctx.assertions = assertions;
    }

    @Override
    public void exitTctlBlock(TimedRebecaPropertyCompleteParser.TctlBlockContext ctx) {
        List<TCTLDefinition> tctls = new ArrayList<>();
        int index = 0;
        for (TimedRebecaPropertyCompleteParser.ExpressionContext tctl : ctx.expression()) {
            TCTLDefinition tctlDefinition = new TCTLDefinition();
            tctlDefinition.setName(ctx.IDENTIFIER(index).getText());
            tctlDefinition.setExpression(tctl.e);
            tctls.add(tctlDefinition);
            index++;
        }
        ctx.tctls = tctls;
    }

    @Override
    public void exitPropertyDefinition(TimedRebecaPropertyCompleteParser.PropertyDefinitionContext ctx) {
        PropertyModel pm = ctx.pm;
        if (ctx.assertionBlock() != null)
            pm.getAssertionDefinitions().addAll(ctx.assertionBlock().assertions);
        if (ctx.tctlBlock() != null)
            pm.getTCTLDefinitions().addAll(ctx.tctlBlock().tctls);
    }
}