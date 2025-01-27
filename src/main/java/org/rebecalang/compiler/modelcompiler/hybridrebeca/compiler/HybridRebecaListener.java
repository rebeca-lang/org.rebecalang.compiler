package org.rebecalang.compiler.modelcompiler.hybridrebeca.compiler;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FieldDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.VariableDeclarator;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.HybridrebecaUtils;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.objectmodel.*;
import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.TimedRebecaParentSuffixPrimary;

public class HybridRebecaListener extends HybridRebecaCompleteBaseListener {
    @Override
    public void exitRebecaCode(HybridRebecaCompleteParser.RebecaCodeContext ctx) {
        HybridRebecaCode hybridRebecaCode = new HybridRebecaCode();
        for (HybridRebecaCompleteParser.RecordDeclarationContext recordCtx : ctx.recordDeclaration()) {
            hybridRebecaCode.getRecordDeclaration().add(recordCtx.rd);
        }
        for (HybridRebecaCompleteParser.FieldDeclarationContext fieldCtx : ctx.fieldDeclaration()) {
            hybridRebecaCode.getEnvironmentVariables().add(fieldCtx.fd);
        }
        for (TerminalNode featureName : ctx.IDENTIFIER()) {
            VariableDeclarator vd = new VariableDeclarator();
            vd.setVariableName(featureName.getText());
            vd.setLineNumber(featureName.getSymbol().getLine());
            vd.setCharacter(featureName.getSymbol().getCharPositionInLine());
            FieldDeclaration fd = new FieldDeclaration();
            fd.getVariableDeclarators().add(vd);
            fd.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
            fd.setCharacter(featureName.getSymbol().getCharPositionInLine());
            fd.setLineNumber(featureName.getSymbol().getLine());
            hybridRebecaCode.getFeatureVariables().add(fd);
        }
        for (HybridRebecaCompleteParser.ReactiveClassDeclarationContext reactiveCtx : ctx.reactiveClassDeclaration()) {
            hybridRebecaCode.getReactiveClassDeclaration().add(reactiveCtx.rcd);
        }
        for (HybridRebecaCompleteParser.InterfaceDeclarationContext interfaceCtx : ctx.interfaceDeclaration()) {
            hybridRebecaCode.getInterfaceDeclaration().add(interfaceCtx.intd);
        }
        for (HybridRebecaCompleteParser.PhysicalClassDeclarationContext physicalCtx : ctx.physicalClassDeclaration()) {
            hybridRebecaCode.getPhysicalClassDeclaration().add(physicalCtx.pcd);
        }
        hybridRebecaCode.setMainDeclaration(ctx.mainDeclaration().md);
        ctx.rc = hybridRebecaCode;
    }
    @Override
    public void exitPhysicalClassDeclaration(HybridRebecaCompleteParser.PhysicalClassDeclarationContext ctx) {
        PhysicalClassDeclaration pcd = new PhysicalClassDeclaration();
        for (HybridRebecaCompleteParser.AnnotationContext anCtx : ctx.annotation()) {
            pcd.getAnnotations().add(anCtx.an);
        }
        pcd.setName(ctx.IDENTIFIER().getText());
        pcd.setLineNumber(ctx.IDENTIFIER().getSymbol().getLine());
        pcd.setCharacter(ctx.IDENTIFIER().getSymbol().getCharPositionInLine());
        if (ctx.INTLITERAL() != null && !ctx.INTLITERAL().getText().equals("<missing INTLITERAL>")) {
            pcd.setQueueSize(Integer.parseInt(ctx.INTLITERAL().getText()));
        }
        boolean inKnownRebecs = false;
        boolean inStateVars = false;
        for (ParseTree child : ctx.children) {
            if (child instanceof TerminalNode terminalNode) {
                // Check for keywords to toggle context
                if (terminalNode.getSymbol().getText().equals("knownrebecs")) {
                    inKnownRebecs = true;
                    inStateVars = false;
                } else if (terminalNode.getSymbol().getText().equals("statevars")) {
                    inStateVars = true;
                    inKnownRebecs = false;
                }
            } else if (child instanceof HybridRebecaCompleteParser.FieldDeclarationContext fdCtx) {
                // Assign field declarations to the correct list
                if (inKnownRebecs) {
                    pcd.getKnownRebecs().add(fdCtx.fd);
                } else if (inStateVars) {
                    pcd.getStatevars().add(fdCtx.fd);
                }
            }
        }
        for (HybridRebecaCompleteParser.ConstructorDeclarationContext cdCtx : ctx.constructorDeclaration()) {
            pcd.getConstructors().add(cdCtx.cd);
        }
        for (HybridRebecaCompleteParser.MsgsrvDeclarationContext mgdCtx : ctx.msgsrvDeclaration()) {
            pcd.getMsgsrvs().add(mgdCtx.md);
        }
        for (HybridRebecaCompleteParser.SynchMethodDeclarationContext smdCtx : ctx.synchMethodDeclaration()) {
            pcd.getSynchMethods().add(smdCtx.smd);
        }
        for (HybridRebecaCompleteParser.ModeDeclarationContext mdCtx : ctx.modeDeclaration()) {
            pcd.getModeDeclarations().add(mdCtx.md);
        }
        TerminalNode lastRBrace = ctx.RBRACE(ctx.RBRACE().size() - 1);
        pcd.setEndLineNumber(lastRBrace.getSymbol().getLine());
        pcd.setEndCharacter(lastRBrace.getSymbol().getCharPositionInLine());
        ctx.pcd = pcd;
    }
    @Override
    public void exitModeDeclaration(HybridRebecaCompleteParser.ModeDeclarationContext ctx) {
        ModeDeclaration md = new ModeDeclaration();
        GuardDeclaration gd = new GuardDeclaration();
        md.setGuardDeclaration(gd);
        InvariantDeclaration id = new InvariantDeclaration();
        md.setInvariantDeclaration(id);

        md.setName(ctx.IDENTIFIER().getText());
        md.setLineNumber(ctx.MODE().getSymbol().getLine());
        md.setCharacter(ctx.MODE().getSymbol().getCharPositionInLine());

        id.setCondition(ctx.expression(0).e);
        id.setBlock(ctx.block(0).bs);
        id.setLineNumber(ctx.INV().getSymbol().getLine());
        id.setCharacter(ctx.INV().getSymbol().getCharPositionInLine());

        gd.setCondition(ctx.expression(1).e);
        gd.setBlock(ctx.block(1).bs);
        gd.setLineNumber(ctx.GUARD().getSymbol().getLine());
        gd.setCharacter(ctx.GUARD().getSymbol().getCharPositionInLine());

        ctx.md = md;
    }
    @Override
    public void exitPrimary(HybridRebecaCompleteParser.PrimaryContext ctx) {
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
        for (HybridRebecaCompleteParser.ExpressionContext ex : ctx.expression()) {
            tp.getIndices().add(ex.e);
        }
        int primeCount = ctx.PRIME().size();
        if (primeCount > 0) {
            tp = HybridrebecaUtils.transformTermPrimaryToHybridTermPrimary(tp);
            HybridTermPrimary hybridTp = (HybridTermPrimary) tp;
            hybridTp.setDerivativeOrder(hybridTp.getDerivativeOrder() + primeCount);
        }
        ctx.tp = tp;
    }
}
