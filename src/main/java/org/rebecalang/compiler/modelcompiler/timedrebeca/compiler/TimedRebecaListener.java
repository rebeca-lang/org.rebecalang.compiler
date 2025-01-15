package org.rebecalang.compiler.modelcompiler.timedrebeca.compiler;

import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.TimedRebecaParentSuffixPrimary;

public class TimedRebecaListener extends TimedRebecaCompleteBaseListener {

    @Override
    public void exitPrimary(TimedRebecaCompleteParser.PrimaryContext ctx) {
        TermPrimary tp = new TermPrimary();
        tp.setName(ctx.IDENTIFIER().getText());
        tp.setLineNumber(ctx.IDENTIFIER().getSymbol().getLine());
        tp.setCharacter(ctx.IDENTIFIER().getSymbol().getCharPositionInLine());

        if (ctx.LPAREN(0) != null) {
            TimedRebecaParentSuffixPrimary psp = new TimedRebecaParentSuffixPrimary();
            psp.setLineNumber(ctx.LPAREN(0).getSymbol().getLine());
            psp.setCharacter(ctx.LPAREN(0).getSymbol().getCharPositionInLine());
            tp.setParentSuffixPrimary(psp);

            if (ctx.expressionList() != null) {
                tp.getParentSuffixPrimary().getArguments().addAll(ctx.expressionList().el);
            }

            if (ctx.AFTER() != null) {
                int afterIndex = ctx.children.indexOf(ctx.AFTER());
                if (afterIndex > -1 && ctx.getChild(afterIndex + 2) != null) {
                    TimedRebecaCompleteParser.ExpressionContext afterExpressionCtx =
                            (TimedRebecaCompleteParser.ExpressionContext) ctx.getChild(afterIndex + 2);
                    psp.setAfterExpression(afterExpressionCtx.e);
                }
            }

            if (ctx.DEADLINE() != null) {
                int deadlineIndex = ctx.children.indexOf(ctx.DEADLINE());
                if (deadlineIndex > -1 && ctx.getChild(deadlineIndex + 2) != null) {
                    TimedRebecaCompleteParser.ExpressionContext deadlineExpressionCtx =
                            (TimedRebecaCompleteParser.ExpressionContext) ctx.getChild(deadlineIndex + 2);
                    psp.setDeadlineExpression(deadlineExpressionCtx.e);
                }
            }
        }

        for (int i = 0; i < ctx.getChildCount(); i++) {
            // Check if the child is an LBRACKET followed by an expression and RBRACKET
            if (ctx.getChild(i) instanceof TerminalNodeImpl child) {
                if (child.getSymbol().getType() == TimedRebecaCompleteParser.LBRACKET) {
                    // The next child should be an expression (after LBRACKET)
                    TimedRebecaCompleteParser.ExpressionContext e2Ctx =
                            (TimedRebecaCompleteParser.ExpressionContext) ctx.getChild(i + 1);
                    if (e2Ctx != null) {
                        tp.getIndices().add(e2Ctx.e); // Add the expression inside the bracket to indices
                    }
                }
            }
        }

        ctx.tp = tp; // Ensure ctx.tp is valid in the grammar
    }
}