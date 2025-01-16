package org.rebecalang.compiler.modelcompiler.hybridrebeca.compiler;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FieldDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.VariableDeclarator;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.objectmodel.HybridRebecaCode;

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
}
