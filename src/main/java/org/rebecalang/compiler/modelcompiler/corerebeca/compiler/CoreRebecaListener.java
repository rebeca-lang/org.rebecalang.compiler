package org.rebecalang.compiler.modelcompiler.corerebeca.compiler;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;

import java.util.LinkedList;
import java.util.List;

public class CoreRebecaListener extends CoreRebecaCompleteBaseListener {

    @Override
    public void exitRebecaModel(CoreRebecaCompleteParser.RebecaModelContext ctx) {
        RebecaModel rebecaModel = new RebecaModel();
        if(ctx.packageDeclaration() != null){
            rebecaModel.setPackageDeclaration(ctx.packageDeclaration().p);
        }
        for (CoreRebecaCompleteParser.ImportDeclarationContext imp : ctx.importDeclaration()) {
            rebecaModel.getImportDeclaration().add(imp.i);
        }
        rebecaModel.setRebecaCode(ctx.rebecaCode().rc);
        ctx.r = rebecaModel;
    }

    @Override
    public void exitRebecaCode(CoreRebecaCompleteParser.RebecaCodeContext ctx) {
        RebecaCode rebecaCode = new RebecaCode();
        for (CoreRebecaCompleteParser.RecordDeclarationContext recordCtx : ctx.recordDeclaration()) {
            rebecaCode.getRecordDeclaration().add(recordCtx.rd);
        }
        for (CoreRebecaCompleteParser.FieldDeclarationContext fieldCtx : ctx.fieldDeclaration()) {
            rebecaCode.getEnvironmentVariables().add(fieldCtx.fd);
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
            rebecaCode.getFeatureVariables().add(fd);
        }
        for (CoreRebecaCompleteParser.ReactiveClassDeclarationContext reactiveCtx : ctx.reactiveClassDeclaration()) {
            rebecaCode.getReactiveClassDeclaration().add(reactiveCtx.rcd);
        }
        for (CoreRebecaCompleteParser.InterfaceDeclarationContext interfaceCtx : ctx.interfaceDeclaration()) {
            rebecaCode.getInterfaceDeclaration().add(interfaceCtx.intd);
        }
        rebecaCode.setMainDeclaration(ctx.mainDeclaration().md);
        ctx.rc = rebecaCode;
    }

    @Override
    public void exitFieldDeclaration(CoreRebecaCompleteParser.FieldDeclarationContext ctx) {
        FieldDeclaration fd = new FieldDeclaration();
        for (CoreRebecaCompleteParser.AnnotationContext annotationCtx : ctx.annotation()) {
            fd.getAnnotations().add(annotationCtx.an);
        }
        fd.setType(ctx.type().t);
        fd.getVariableDeclarators().addAll(ctx.variableDeclarators().vds);
        fd.setCharacter(ctx.type().t.getCharacter());
        fd.setLineNumber(ctx.type().t.getLineNumber());
        ctx.fd = fd;
    }

    @Override
    public void exitVariableDeclarators(CoreRebecaCompleteParser.VariableDeclaratorsContext ctx) {
        List<VariableDeclarator> vds = new LinkedList<>();
        for (CoreRebecaCompleteParser.VariableDeclaratorContext vdCtx : ctx.variableDeclarator()) {
            vds.add(vdCtx.vd);
        }
        ctx.vds = vds;
    }

    @Override
    public void exitVariableDeclarator(CoreRebecaCompleteParser.VariableDeclaratorContext ctx) {
        VariableDeclarator vd = new VariableDeclarator();
        vd.setVariableName(ctx.IDENTIFIER().getText());
        vd.setLineNumber(ctx.IDENTIFIER().getSymbol().getLine());
        vd.setCharacter(ctx.IDENTIFIER().getSymbol().getCharPositionInLine());
        if (ctx.variableInitializer() != null) {
            vd.setVariableInitializer(ctx.variableInitializer().vi);
        }
        ctx.vd = vd;
    }

    @Override
    public void exitVariableInitializer(CoreRebecaCompleteParser.VariableInitializerContext ctx) {
        VariableInitializer vi = new VariableInitializer();
        if (ctx.arrayInitializer() != null) {
            vi = ctx.arrayInitializer().avi;
        } else {
            if (ctx.expression().e != null) {
                OrdinaryVariableInitializer ovi = new OrdinaryVariableInitializer();
                ovi.setValue(ctx.expression().e);
                ovi.setLineNumber(ctx.expression().e.getLineNumber());
                ovi.setCharacter(ctx.expression().e.getCharacter());
                vi = ovi;
            }
        }
        ctx.vi = vi;
    }

    @Override
    public void exitArrayInitializer(CoreRebecaCompleteParser.ArrayInitializerContext ctx) {
        ArrayVariableInitializer avi = new ArrayVariableInitializer();
        avi.setCharacter(ctx.LBRACE().getSymbol().getCharPositionInLine());
        avi.setLineNumber(ctx.LBRACE().getSymbol().getLine());
        for (CoreRebecaCompleteParser.VariableInitializerContext viCtx : ctx.variableInitializer()) {
            avi.getValues().add(viCtx.vi);
        }
        ctx.avi = avi;
    }
    @Override
    public void exitMethodDeclaration(CoreRebecaCompleteParser.MethodDeclarationContext ctx) {
        MethodDeclaration md = new MethodDeclaration();
        md.setName(ctx.IDENTIFIER().getText());
        md.setLineNumber(ctx.IDENTIFIER().getSymbol().getLine());
        md.setCharacter(ctx.IDENTIFIER().getSymbol().getCharPositionInLine());
        md.getFormalParameters().addAll(ctx.formalParameters().fps);
        if (ctx.block() != null) {
            BlockStatement block = ctx.block().bs;
            md.setBlock(block);
            md.setEndLineNumber(block.getEndLineNumber());
            md.setEndCharacter(block.getEndCharacter());
        }
        ctx.md = md;
    }

    @Override
    public void exitConstructorDeclaration(CoreRebecaCompleteParser.ConstructorDeclarationContext ctx) {
        ConstructorDeclaration cd = new ConstructorDeclaration();
        for (CoreRebecaCompleteParser.AnnotationContext annotationCtx : ctx.annotation()) {
            cd.getAnnotations().add(annotationCtx.an);
        }
        ctx.cd = cd;
    }

    @Override
    public void exitMsgsrvDeclaration(Parser.MsgsrvDeclarationContext ctx) {
        MsgsrvDeclaration md = new MsgsrvDeclaration();

        // Handle annotations
        for (Parser.AnnotationContext annotationCtx : ctx.annotation()) {
            Annotation annotation = annotationCtx.an;
            md.getAnnotations().add(annotation);
        }

        // Handle abstract modifier
        if (ctx.ABSTRACT() != null) {
            md.setAbstract(true);
        }

        // Process method declaration
        MethodDeclaration method = ctx.methodDeclaration().md;
        md.setName(method.getName());
        md.setFormalParameters(method.getFormalParameters());
        md.setBlock(method.getBlock());
    }

    @Override
    public void exitSynchMethodDeclaration(Parser.SynchMethodDeclarationContext ctx) {
        SynchMethodDeclaration smd = new SynchMethodDeclaration();

        // Handle annotations
        for (Parser.AnnotationContext annotationCtx : ctx.annotation()) {
            Annotation annotation = annotationCtx.an;
            smd.getAnnotations().add(annotation);
        }

        // Handle abstract modifier
        if (ctx.ABSTRACT() != null) {
            smd.setAbstract(true);
        }

        // Set return type
        smd.setReturnType(ctx.type().t);

        // Process method declaration
        MethodDeclaration method = ctx.methodDeclaration().md;
        smd.setName(method.getName());
        smd.setFormalParameters(method.getFormalParameters());
        smd.setBlock(method.getBlock());
    }

    @Override
    public void exitFormalParameters(Parser.FormalParametersContext ctx) {
        List<FormalParameterDeclaration> fps = new ArrayList<>();

        // Add formal parameters
        if (ctx.formalParametersDeclaration() != null) {
            fps.addAll(ctx.formalParametersDeclaration().fpds);
        }

        ctx.fps = fps; // Pass formal parameters up the parse tree
    }

    @Override
    public void exitFormalParameterDeclaration(Parser.FormalParameterDeclarationContext ctx) {
        FormalParameterDeclaration fpd = new FormalParameterDeclaration();

        // Set parameter name, type, and metadata
        fpd.setName(ctx.IDENTIFIER().getText());
        fpd.setType(ctx.type().t);
        fpd.setLineNumber(ctx.IDENTIFIER().getSymbol().getLine());
        fpd.setCharacter(ctx.IDENTIFIER().getSymbol().getCharPositionInLine());

        ctx.fpd = fpd; // Pass the formal parameter up the parse tree
    }



    @Override
    public void exitLiteral(CoreRebecaCompleteParser.LiteralContext ctx) {
        Literal literal = new Literal();

        if (ctx.INTLITERAL() != null) {
            literal.setLiteralValue(ctx.INTLITERAL().getText());
            literal.setType(CoreRebecaTypeSystem.INT_TYPE);
            literal.setLineNumber(ctx.INTLITERAL().getSymbol().getLine());
            literal.setCharacter(ctx.INTLITERAL().getSymbol().getCharPositionInLine());
        } else if (ctx.FLOATLITERAL() != null) {
            literal.setLiteralValue(ctx.FLOATLITERAL().getText());
            literal.setType(CoreRebecaTypeSystem.FLOAT_TYPE);
            literal.setLineNumber(ctx.FLOATLITERAL().getSymbol().getLine());
            literal.setCharacter(ctx.FLOATLITERAL().getSymbol().getCharPositionInLine());
        } else if (ctx.DOUBLELITERAL() != null) {
            literal.setLiteralValue(ctx.DOUBLELITERAL().getText());
            literal.setType(CoreRebecaTypeSystem.DOUBLE_TYPE);
            literal.setLineNumber(ctx.DOUBLELITERAL().getSymbol().getLine());
            literal.setCharacter(ctx.DOUBLELITERAL().getSymbol().getCharPositionInLine());
        } else if (ctx.CHARLITERAL() != null) {
            literal.setLiteralValue(ctx.CHARLITERAL().getText());
            literal.setType(CoreRebecaTypeSystem.CHAR_TYPE);
            literal.setLineNumber(ctx.CHARLITERAL().getSymbol().getLine());
            literal.setCharacter(ctx.CHARLITERAL().getSymbol().getCharPositionInLine());
        } else if (ctx.STRINGLITERAL() != null) {
            literal.setLiteralValue(ctx.STRINGLITERAL().getText());
            literal.setType(CoreRebecaTypeSystem.STRING_TYPE);
            literal.setLineNumber(ctx.STRINGLITERAL().getSymbol().getLine());
            literal.setCharacter(ctx.STRINGLITERAL().getSymbol().getCharPositionInLine());
        } else if (ctx.TRUE() != null) {
            literal.setLiteralValue("true");
            literal.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
            literal.setLineNumber(ctx.TRUE().getSymbol().getLine());
            literal.setCharacter(ctx.TRUE().getSymbol().getCharPositionInLine());
        } else if (ctx.FALSE() != null) {
            literal.setLiteralValue("false");
            literal.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
            literal.setLineNumber(ctx.FALSE().getSymbol().getLine());
            literal.setCharacter(ctx.FALSE().getSymbol().getCharPositionInLine());
        } else if (ctx.NULL() != null) {
            literal.setLiteralValue("null");
            literal.setType(CoreRebecaTypeSystem.NULL_TYPE);
            literal.setLineNumber(ctx.NULL().getSymbol().getLine());
            literal.setCharacter(ctx.NULL().getSymbol().getCharPositionInLine());
        }
        ctx.l = literal;
    }
}
