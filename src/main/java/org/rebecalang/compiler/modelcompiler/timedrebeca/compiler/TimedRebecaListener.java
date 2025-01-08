package org.rebecalang.compiler.modelcompiler.timedrebeca.compiler;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.TimedRebecaParentSuffixPrimary;
import java.util.ArrayList;
import java.util.List;

public class TimedRebecaListener extends TimedRebecaCompleteBaseListener {

    @Override
    public void exitPrimary(TimedRebecaCompleteParser.PrimaryContext ctx) {
        // Create and initialize TermPrimary
        TermPrimary tp = new TermPrimary();
        tp.setName(ctx.IDENTIFIER().getText());
        tp.setLineNumber(ctx.IDENTIFIER().getSymbol().getLine());
        tp.setCharacter(ctx.IDENTIFIER().getSymbol().getCharPositionInLine());

        // Handle method calls with parameters and timing constraints
        if (ctx.LPAREN(0) != null) {
            TimedRebecaParentSuffixPrimary psp = new TimedRebecaParentSuffixPrimary();
            psp.setLineNumber(ctx.LPAREN(0).getSymbol().getLine());
            psp.setCharacter(ctx.LPAREN(0).getSymbol().getCharPositionInLine());
            tp.setParentSuffixPrimary(psp);

            // Handle method arguments if present
            if (ctx.expressionList() != null) {
                for (TimedRebecaCompleteParser.ExpressionContext exprCtx : ctx.expressionList().expression()) {
                    if (exprCtx != null && exprCtx.e != null) {
                        psp.getArguments().add(exprCtx.e);
                    }
                }
            }

            // Handle AFTER timing constraint if present
            if (ctx.AFTER() != null) {
                for (TimedRebecaCompleteParser.ExpressionContext exprCtx : ctx.expression()) {
                    if (exprCtx != null && exprCtx.e != null) {
                        psp.setAfterExpression(exprCtx.e);
                        break;
                    }
                }
            }

            // Handle DEADLINE timing constraint if present
            if (ctx.DEADLINE() != null) {
                boolean afterFound = false;
                for (TimedRebecaCompleteParser.ExpressionContext exprCtx : ctx.expression()) {
                    if (exprCtx != null && exprCtx.e != null) {
                        if (psp.getAfterExpression() != null && !afterFound) {
                            afterFound = true;
                            continue;
                        }
                        psp.setDeadlineExpression(exprCtx.e);
                        break;
                    }
                }
            }
        }

        // Handle array indexing if present
        if (!ctx.expression().isEmpty()) {
            for (TimedRebecaCompleteParser.ExpressionContext exprCtx : ctx.expression()) {
                if (exprCtx != null && exprCtx.e != null) {
                    tp.getIndices().add(exprCtx.e);
                }
            }
        }

        // Store the result in the context
        ctx.tp = tp;
    }

    @Override
    public void exitExpression(TimedRebecaCompleteParser.ExpressionContext ctx) {
        // Here we'd set ctx.e based on the expression type
        // This is where expressions get evaluated and stored
        // You'll need to implement this based on your expression types
    }

    @Override
    public void exitExpressionList(TimedRebecaCompleteParser.ExpressionListContext ctx) {
        // The expressions are already handled in exitExpression
        // We just need to make sure our expressions are properly linked
        // No need to create a new list here
    }
}