package org.rebecalang.compiler.modelcompiler.probabilisticrebeca.compiler;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.PAltStatement;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.PAltStatementGroup;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.ProbabilisticAlternativeValue;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.ProbabilisticExpression;

import java.util.LinkedList;
import java.util.List;

public class ProbabilisticRebecaListener extends ProbabilisticRebecaCompleteBaseListener  {
    @Override
    public void exitPAltStatementGroup(ProbabilisticRebecaCompleteParser.PAltStatementGroupContext ctx) {
        PAltStatementGroup pasg = new PAltStatementGroup();
        if (ctx.expression() != null) {
            pasg.setExpression(ctx.expression().e);
        }
        for (ProbabilisticRebecaCompleteParser.StatementContext statementCtx : ctx.statement()) {
            pasg.getStatements().add(statementCtx.s);
        }
        ctx.pasg = pasg;
    }
    @Override
    public void exitCoreExpression(ProbabilisticRebecaCompleteParser.CoreExpressionContext ctx) {
        Expression e;
        if (ctx.castExpression() != null) {
            e = ctx.castExpression().e;
        } else if (ctx.expression() != null) {
            e = ctx.expression().e;
        } else if (ctx.primary(0) != null) {
            e = ctx.primary(0).tp;
        } else if (ctx.literal() != null) {
            e = ctx.literal().l;
        } else if (ctx.QUES() != null) {
            List<ProbabilisticAlternativeValue> el = ctx.probabilisticList().el;
            boolean isNonDet = true;
            for (ProbabilisticAlternativeValue pav : el) {
                isNonDet &= pav.getProbability() == null;
            }
            if (isNonDet) {
                NonDetExpression nonDetExpr = new NonDetExpression();
                for (ProbabilisticAlternativeValue pav : el) {
                    nonDetExpr.getChoices().add(pav.getValue());
                }
                e = nonDetExpr;
            } else {
                ProbabilisticExpression probExpr = new ProbabilisticExpression();
                probExpr.getChoices().addAll(el);
                e = probExpr;
            }
            e.setLineNumber(ctx.QUES().getSymbol().getLine());
            e.setCharacter(ctx.QUES().getSymbol().getCharPositionInLine());
        } else {
            throw new IllegalStateException("Unrecognized expression type");
        }
        for (int i = 1; i < ctx.primary().size(); i++) { // Start from the second primary
            ProbabilisticRebecaCompleteParser.PrimaryContext primaryCtx = ctx.primary(i);
            DotPrimary de = new DotPrimary();
            de.setLineNumber(ctx.DOT(i - 1).getSymbol().getLine());
            de.setCharacter(ctx.DOT(i - 1).getSymbol().getCharPositionInLine());

            if (e instanceof DotPrimary temp) {
                while (temp.getRight() instanceof DotPrimary) {
                    temp = (DotPrimary) temp.getRight();
                }
                de.setLeft(temp.getRight());
                temp.setRight(de);
                de.setRight(primaryCtx.tp);
            } else {
                de.setLeft(e);
                de.setRight(primaryCtx.tp);
                e = de;
            }
        }

        if (ctx.PLUSPLUS() != null) {
            PlusSubExpression pse = new PlusSubExpression();
            pse.setValue(e);
            pse.setOperator("++");
            pse.setLineNumber(ctx.PLUSPLUS().getSymbol().getLine());
            pse.setCharacter(ctx.PLUSPLUS().getSymbol().getCharPositionInLine());
            e = pse;
        } else if (ctx.SUBSUB() != null) {
            PlusSubExpression pse = new PlusSubExpression();
            pse.setValue(e);
            pse.setOperator("--");
            pse.setLineNumber(ctx.SUBSUB().getSymbol().getLine());
            pse.setCharacter(ctx.SUBSUB().getSymbol().getCharPositionInLine());
            e = pse;
        }
        ctx.e = e;
    }
    @Override
    public void exitProbabilisticList(ProbabilisticRebecaCompleteParser.ProbabilisticListContext ctx) {
        List<ProbabilisticAlternativeValue> el = new LinkedList<>();
        int colonIndex = 0;
        for (int i = 0; i < ctx.expression().size(); i++) {
            ProbabilisticAlternativeValue value = new ProbabilisticAlternativeValue();
            value.setValue(ctx.expression(i).e);
            el.add(value);
            if (colonIndex < ctx.COLON().size() &&
                    ctx.COLON(colonIndex).getSourceInterval().a == ctx.expression(i).getSourceInterval().b + 1) {
                colonIndex++;
                i++;
                if (i < ctx.expression().size()) {
                    value.setProbability(value.getValue());
                    value.setValue(ctx.expression(i).e);
                }
            }
        }
        ctx.el = el;
    }

    @Override
    public void exitStatement(ProbabilisticRebecaCompleteParser.StatementContext ctx) {
        Statement s;

        switch (getStatementType(ctx)) {
            case "fieldDeclaration" -> s = ctx.fieldDeclaration().fd;
            case "block" -> s = ctx.block().bs;
            case "ifStatement" -> {
                ConditionalStatement condStmt = new ConditionalStatement();
                condStmt.setLineNumber(ctx.IF().getSymbol().getLine());
                condStmt.setCharacter(ctx.IF().getSymbol().getCharPositionInLine());
                condStmt.setCondition(ctx.expression().e);
                condStmt.setStatement(ctx.statement(0).s);
                if (ctx.ELSE() != null) {
                    condStmt.setElseStatement(ctx.statement(1).s);
                }
                s = condStmt;
            }
            case "whileStatement" -> {
                WhileStatement whileStmt = new WhileStatement();
                whileStmt.setLineNumber(ctx.WHILE().getSymbol().getLine());
                whileStmt.setCharacter(ctx.WHILE().getSymbol().getCharPositionInLine());
                whileStmt.setCondition(ctx.expression().e);
                whileStmt.setStatement(ctx.statement(0).s);
                s = whileStmt;
            }
            case "forStatement" -> {
                ForStatement forStmt = new ForStatement();
                forStmt.setLineNumber(ctx.FOR().getSymbol().getLine());
                forStmt.setCharacter(ctx.FOR().getSymbol().getCharPositionInLine());
                if (ctx.forInit() != null) {
                    forStmt.setForInitializer(ctx.forInit().fi);
                }
                if (ctx.expression() != null) {
                    forStmt.setCondition(ctx.expression().e);
                }
                if (ctx.expressionList() != null) {
                    forStmt.getForIncrement().addAll(ctx.expressionList().el);
                }
                forStmt.setStatement(ctx.statement(0).s);
                s = forStmt;
            }
            case "switchStatement" -> {
                s = ctx.switchBlock().ss;
                ((SwitchStatement) s).setExpression(ctx.expression().e);
                s.setLineNumber(ctx.SWITCH().getSymbol().getLine());
                s.setCharacter(ctx.SWITCH().getSymbol().getCharPositionInLine());
            }

            case "returnStatement" -> {
                ReturnStatement returnStmt = new ReturnStatement();
                if (ctx.expression() != null) {
                    returnStmt.setExpression(ctx.expression().e);
                }
                returnStmt.setLineNumber(ctx.RETURN().getSymbol().getLine());
                returnStmt.setCharacter(ctx.RETURN().getSymbol().getCharPositionInLine());
                s = returnStmt;
            }
            case "breakStatement" -> {
                BreakStatement breakStmt = new BreakStatement();
                breakStmt.setLineNumber(ctx.BREAK().getSymbol().getLine());
                breakStmt.setCharacter(ctx.BREAK().getSymbol().getCharPositionInLine());
                s = breakStmt;
            }
            case "continueStatement" -> {
                BreakStatement continueStmt = new BreakStatement();
                continueStmt.setLineNumber(ctx.CONTINUE().getSymbol().getLine());
                continueStmt.setCharacter(ctx.CONTINUE().getSymbol().getCharPositionInLine());
                s = continueStmt;
            }
            case "semiStatement" -> s = new Statement();
            case "statementExpression" -> s = ctx.statementExpression().se;
            case "pAltStatement" -> {
                PAltStatement pAltStmt = new PAltStatement();
                pAltStmt.setLineNumber(ctx.PALT().getSymbol().getLine());
                pAltStmt.setCharacter(ctx.PALT().getSymbol().getCharPositionInLine());
                ctx.pAltStatementGroup().forEach(pasgCtx -> pAltStmt.getPAltStatementGroups().add(pasgCtx.pasg));
                s = pAltStmt;
            }
            default -> throw new IllegalStateException("Unrecognized statement type");
        }
        ctx.s = s;
    }

    private String getStatementType(ProbabilisticRebecaCompleteParser.StatementContext ctx) {
        if (ctx.fieldDeclaration() != null) return "fieldDeclaration";
        if (ctx.block() != null) return "block";
        if (ctx.IF() != null) return "ifStatement";
        if (ctx.WHILE() != null) return "whileStatement";
        if (ctx.FOR() != null) return "forStatement";
        if (ctx.SWITCH() != null) return "switchStatement";
        if (ctx.RETURN() != null) return "returnStatement";
        if (ctx.BREAK() != null) return "breakStatement";
        if (ctx.CONTINUE() != null) return "continueStatement";
        if (ctx.SEMI() != null) return "semiStatement";
        if (ctx.statementExpression() != null) return "statementExpression";
        if (ctx.PALT() != null) return "pAltStatement";
        return "unknown";
    }

}
