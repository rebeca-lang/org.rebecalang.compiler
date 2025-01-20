package org.rebecalang.compiler.modelcompiler.timedrebeca.compiler;

import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.compiler.HybridRebecaCompleteParser;
import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.TimedRebecaParentSuffixPrimary;

public class TimedRebecaListener extends TimedRebecaCompleteBaseListener {

    @Override
    public void exitPrimary(TimedRebecaCompleteParser.PrimaryContext ctx) {
        TermPrimary tp = new TermPrimary();
        tp.setName(ctx.IDENTIFIER().getText());
        tp.setLineNumber(ctx.IDENTIFIER().getSymbol().getLine());
        tp.setCharacter(ctx.IDENTIFIER().getSymbol().getCharPositionInLine());
        if (ctx.LPAREN() != null) {
            TimedRebecaParentSuffixPrimary psp = new TimedRebecaParentSuffixPrimary();
            psp.setLineNumber(ctx.LPAREN().getSymbol().getLine());
            psp.setCharacter(ctx.LPAREN().getSymbol().getCharPositionInLine());
            tp.setParentSuffixPrimary(psp);
            if (ctx.expressionList() != null) {
                tp.getParentSuffixPrimary().getArguments().addAll(ctx.expressionList().el);
            }
            if (ctx.after() != null) {
                psp.setAfterExpression(ctx.after().e);
            }
            if (ctx.deadline() != null) {
                psp.setDeadlineExpression(ctx.deadline().e);
            }
        }
        for (TimedRebecaCompleteParser.ExpressionContext ex : ctx.expression()) {
            tp.getIndices().add(ex.e);
        }
        ctx.tp = tp;
    }
}