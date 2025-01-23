package org.rebecalang.compiler.propertycompiler.corerebeca.compiler;

import org.rebecalang.compiler.propertycompiler.corerebeca.objectmodel.LTLDefinition;
import org.rebecalang.compiler.propertycompiler.corerebeca.objectmodel.PropertyModel;
import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.AssertionDefinition;
import org.rebecalang.compiler.propertycompiler.timedrebeca.compiler.TimedRebecaPropertyCompleteParser;
import org.rebecalang.compiler.propertycompiler.timedrebeca.objectmodel.TCTLDefinition;

import java.util.ArrayList;
import java.util.List;

public class CoreRebecaPropertyListener extends CoreRebecaPropertyCompleteBaseListener{

    @Override
    public void exitAssertionBlock(CoreRebecaPropertyCompleteParser.AssertionBlockContext ctx) {
        List<AssertionDefinition> assertions = new ArrayList<>();
        int index = 0;
        for (CoreRebecaPropertyCompleteParser.ExpressionContext assertion : ctx.expression()) {
            AssertionDefinition assertionDefinition = new AssertionDefinition();
            assertionDefinition.setName(ctx.IDENTIFIER(index).getText());
            assertionDefinition.setExpression(assertion.e);
            assertions.add(assertionDefinition);
            index++;
        }
        ctx.assertions = assertions;
    }

    @Override
    public void exitLtlBlock(CoreRebecaPropertyCompleteParser.LtlBlockContext ctx) {
        List<LTLDefinition> ltls = new ArrayList<>();
        int index = 0;
        for (CoreRebecaPropertyCompleteParser.ExpressionContext ltl : ctx.expression()) {
            LTLDefinition ltlDefinition = new LTLDefinition();
            ltlDefinition.setName(ctx.IDENTIFIER(index).getText());
            ltlDefinition.setExpression(ltl.e);
            ltls.add(ltlDefinition);
            index++;
        }
        ctx.ltls = ltls;
    }

    @Override
    public void exitPropertyDefinition(CoreRebecaPropertyCompleteParser.PropertyDefinitionContext ctx) {
        PropertyModel pm = ctx.pm;
        if (ctx.assertionBlock() != null)
            pm.getAssertionDefinitions().addAll(ctx.assertionBlock().assertions);
        if (ctx.ltlBlock() != null)
            pm.getLTLDefinitions().addAll(ctx.ltlBlock().ltls);
    }
}
