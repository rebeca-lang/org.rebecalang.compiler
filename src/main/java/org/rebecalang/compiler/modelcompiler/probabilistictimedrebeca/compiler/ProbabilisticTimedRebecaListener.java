package org.rebecalang.compiler.modelcompiler.probabilistictimedrebeca.compiler;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.PAltStatement;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.PAltStatementGroup;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.ProbabilisticAlternativeValue;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.ProbabilisticExpression;
import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.TimedRebecaParentSuffixPrimary;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProbabilisticTimedRebecaListener extends ProbabilisticTimedRebecaCompleteBaseListener  {

    ////
    //// Probabilistic
    ////

    @Override
    public void exitPAltStatementGroup(ProbabilisticTimedRebecaCompleteParser.PAltStatementGroupContext ctx) {
        PAltStatementGroup pasg = new PAltStatementGroup();
        if (ctx.expression() != null) {
            pasg.setExpression(ctx.expression().e);
        }
        for (ProbabilisticTimedRebecaCompleteParser.StatementContext statementCtx : ctx.statement()) {
            pasg.getStatements().add(statementCtx.s);
        }
        ctx.pasg = pasg;
    }
    @Override
    public void exitCoreExpression(ProbabilisticTimedRebecaCompleteParser.CoreExpressionContext ctx) {
        Expression e;
        if (ctx.castExpression() != null) {
            e = ctx.castExpression().e;
        } else if (ctx.expression() != null) {
            e = ctx.expression().e;
        } else if (ctx.primary() != null) {
            e = ctx.primary().tp;
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
        ctx.e = e;
    }
    @Override
    public void exitProbabilisticList(ProbabilisticTimedRebecaCompleteParser.ProbabilisticListContext ctx) {
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
    public void exitStatement(ProbabilisticTimedRebecaCompleteParser.StatementContext ctx) {
        if (ctx.statementExpression() != null) {
            ctx.s = ctx.statementExpression().expression().e;
        } else if (ctx.fieldDeclaration() != null) {
            ctx.s = ctx.fieldDeclaration().fd;
        } else if (ctx.block() != null) {
            ctx.s = ctx.block().bs;
        } else if (ctx.PALT() != null){
            PAltStatement pAltStmt = new PAltStatement();
            pAltStmt.setLineNumber(ctx.PALT().getSymbol().getLine());
            pAltStmt.setCharacter(ctx.PALT().getSymbol().getCharPositionInLine());
            ctx.pAltStatementGroup().forEach(pasgCtx -> pAltStmt.getPAltStatementGroups().add(pasgCtx.pasg));
            ctx.s = pAltStmt;
        } else if (ctx.IF() != null) {
            ConditionalStatement condStmt = new ConditionalStatement();
            condStmt.setLineNumber(ctx.IF().getSymbol().getLine());
            condStmt.setCharacter(ctx.IF().getSymbol().getCharPositionInLine());
            condStmt.setCondition(ctx.expression().e);
            condStmt.setStatement(ctx.statement(0).s);
            if (ctx.ELSE() != null) {
                condStmt.setElseStatement(ctx.statement(1).s);
            }
            ctx.s = condStmt;
        } else if (ctx.WHILE() != null) {
            WhileStatement whileStmt = new WhileStatement();
            whileStmt.setLineNumber(ctx.WHILE().getSymbol().getLine());
            whileStmt.setCharacter(ctx.WHILE().getSymbol().getCharPositionInLine());
            whileStmt.setCondition(ctx.expression().e);
            whileStmt.setStatement(ctx.statement(0).s);
            ctx.s = whileStmt;
        } else if (ctx.FOR() != null) {
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
            ctx.s = forStmt;
        } else if (ctx.SWITCH() != null) {
            SwitchStatement switchStatement = ctx.switchBlock().ss;
            switchStatement.setExpression(ctx.expression().e);
            switchStatement.setLineNumber(ctx.SWITCH().getSymbol().getLine());
            switchStatement.setCharacter(ctx.SWITCH().getSymbol().getCharPositionInLine());
            ctx.s = switchStatement;
        } else if (ctx.RETURN() != null) {
            ReturnStatement returnStmt = new ReturnStatement();
            if (ctx.expression() != null) {
                returnStmt.setExpression(ctx.expression().e);
            }
            returnStmt.setLineNumber(ctx.RETURN().getSymbol().getLine());
            returnStmt.setCharacter(ctx.RETURN().getSymbol().getCharPositionInLine());
            ctx.s = returnStmt;
        } else if (ctx.BREAK() != null) {
            BreakStatement breakStmt = new BreakStatement();
            breakStmt.setLineNumber(ctx.BREAK().getSymbol().getLine());
            breakStmt.setCharacter(ctx.BREAK().getSymbol().getCharPositionInLine());
            ctx.s = breakStmt;
        } else if (ctx.CONTINUE() != null) {
            BreakStatement continueStmt = new BreakStatement();
            continueStmt.setLineNumber(ctx.CONTINUE().getSymbol().getLine());
            continueStmt.setCharacter(ctx.CONTINUE().getSymbol().getCharPositionInLine());
            ctx.s = continueStmt;
        }else if (ctx.SEMI() != null) {
            ctx.s = new Statement();
        } else {
            throw new IllegalStateException("Unrecognized statement type");
        }
    }

    ////
    //// Timed
    ////

    @Override
    public void exitPrimary(ProbabilisticTimedRebecaCompleteParser.PrimaryContext ctx) {
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
        for (ProbabilisticTimedRebecaCompleteParser.ExpressionContext ex : ctx.expression()) {
            tp.getIndices().add(ex.e);
        }
        ctx.tp = tp;
    }

    ////
    //// SHARED LOGIC
    ////

    @Override
    public void exitRebecaModel(ProbabilisticTimedRebecaCompleteParser.RebecaModelContext ctx) {
        RebecaModel rebecaModel = new RebecaModel();
        if(ctx.packageDeclaration() != null){
            rebecaModel.setPackageDeclaration(ctx.packageDeclaration().p);
        }
        for (ProbabilisticTimedRebecaCompleteParser.ImportDeclarationContext imp : ctx.importDeclaration()) {
            rebecaModel.getImportDeclaration().add(imp.i);
        }
        rebecaModel.setRebecaCode(ctx.rebecaCode().rc);
        ctx.r = rebecaModel;
    }

    @Override
    public void exitRebecaCode(ProbabilisticTimedRebecaCompleteParser.RebecaCodeContext ctx) {
        RebecaCode rebecaCode = new RebecaCode();
        for (ProbabilisticTimedRebecaCompleteParser.RecordDeclarationContext recordCtx : ctx.recordDeclaration()) {
            rebecaCode.getRecordDeclaration().add(recordCtx.rd);
        }
        for (ProbabilisticTimedRebecaCompleteParser.FieldDeclarationContext fieldCtx : ctx.fieldDeclaration()) {
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
        for (ProbabilisticTimedRebecaCompleteParser.ReactiveClassDeclarationContext reactiveCtx : ctx.reactiveClassDeclaration()) {
            rebecaCode.getReactiveClassDeclaration().add(reactiveCtx.rcd);
        }
        for (ProbabilisticTimedRebecaCompleteParser.InterfaceDeclarationContext interfaceCtx : ctx.interfaceDeclaration()) {
            rebecaCode.getInterfaceDeclaration().add(interfaceCtx.intd);
        }
        rebecaCode.setMainDeclaration(ctx.mainDeclaration().md);
        ctx.rc = rebecaCode;
    }
    @Override
    public void exitMainDeclaration(ProbabilisticTimedRebecaCompleteParser.MainDeclarationContext ctx) {
        MainDeclaration md = new MainDeclaration();
        md.setLineNumber(ctx.MAIN().getSymbol().getLine());
        md.setCharacter(ctx.MAIN().getSymbol().getCharPositionInLine());
        for (ProbabilisticTimedRebecaCompleteParser.MainRebecDefinitionContext mrdCtx : ctx.mainRebecDefinition()) {
            md.getMainRebecDefinition().add(mrdCtx.mrd);
        }
        md.setEndLineNumber(ctx.RBRACE().getSymbol().getLine());
        md.setEndCharacter(ctx.RBRACE().getSymbol().getCharPositionInLine());
        ctx.md = md;
    }

    @Override
    public void exitMainRebecDefinition(ProbabilisticTimedRebecaCompleteParser.MainRebecDefinitionContext ctx) {
        MainRebecDefinition mainRebecDefinition = new MainRebecDefinition();
        for (ProbabilisticTimedRebecaCompleteParser.AnnotationContext annCtx : ctx.annotation()) {
            mainRebecDefinition.getAnnotations().add(annCtx.an);
        }
        mainRebecDefinition.setType(ctx.type().t);
        mainRebecDefinition.setName(ctx.IDENTIFIER().getText());
        mainRebecDefinition.setLineNumber(ctx.IDENTIFIER().getSymbol().getLine());
        mainRebecDefinition.setCharacter(ctx.IDENTIFIER().getSymbol().getCharPositionInLine());
        if (ctx.bindingsExpressionList() != null) {
            mainRebecDefinition.getBindings().addAll(ctx.bindingsExpressionList().expressionList().el);
        }
        if (ctx.argumentsExpressionList() != null) {
            mainRebecDefinition.getArguments().addAll(ctx.argumentsExpressionList().expressionList().el);
        }
        ctx.mrd = mainRebecDefinition;
    }
    @Override
    public void exitFieldDeclaration(ProbabilisticTimedRebecaCompleteParser.FieldDeclarationContext ctx) {
        FieldDeclaration fieldDeclaration = new FieldDeclaration();
        for (ProbabilisticTimedRebecaCompleteParser.AnnotationContext annotationCtx : ctx.annotation()) {
            fieldDeclaration.getAnnotations().add(annotationCtx.an);
        }
        fieldDeclaration.setType(ctx.type().t);
        fieldDeclaration.getVariableDeclarators().addAll(ctx.variableDeclarators().vds);
        fieldDeclaration.setCharacter(ctx.type().t.getCharacter());
        fieldDeclaration.setLineNumber(ctx.type().t.getLineNumber());
        ctx.fd = fieldDeclaration;
    }

    @Override
    public void exitVariableDeclarators(ProbabilisticTimedRebecaCompleteParser.VariableDeclaratorsContext ctx) {
        List<VariableDeclarator> variableDeclarators = new LinkedList<>();
        for (ProbabilisticTimedRebecaCompleteParser.VariableDeclaratorContext vdCtx : ctx.variableDeclarator()) {
            variableDeclarators.add(vdCtx.vd);
        }
        ctx.vds = variableDeclarators;
    }

    @Override
    public void exitVariableDeclarator(ProbabilisticTimedRebecaCompleteParser.VariableDeclaratorContext ctx) {
        VariableDeclarator variableDeclarator = new VariableDeclarator();
        variableDeclarator.setVariableName(ctx.IDENTIFIER().getText());
        variableDeclarator.setLineNumber(ctx.IDENTIFIER().getSymbol().getLine());
        variableDeclarator.setCharacter(ctx.IDENTIFIER().getSymbol().getCharPositionInLine());
        if (ctx.variableInitializer() != null) {
            variableDeclarator.setVariableInitializer(ctx.variableInitializer().vi);
        }
        ctx.vd = variableDeclarator;
    }

    @Override
    public void exitVariableInitializer(ProbabilisticTimedRebecaCompleteParser.VariableInitializerContext ctx) {
        VariableInitializer variableInitializer = new VariableInitializer();
        if (ctx.arrayInitializer() != null) {
            variableInitializer = ctx.arrayInitializer().avi;
        } else {
            if (ctx.expression().e != null) {
                OrdinaryVariableInitializer ovi = new OrdinaryVariableInitializer();
                ovi.setValue(ctx.expression().e);
                ovi.setLineNumber(ctx.expression().e.getLineNumber());
                ovi.setCharacter(ctx.expression().e.getCharacter());
                variableInitializer = ovi;
            }
        }
        ctx.vi = variableInitializer;
    }

    @Override
    public void exitArrayInitializer(ProbabilisticTimedRebecaCompleteParser.ArrayInitializerContext ctx) {
        ArrayVariableInitializer arrayVariableInitializer = new ArrayVariableInitializer();
        arrayVariableInitializer.setCharacter(ctx.LBRACE().getSymbol().getCharPositionInLine());
        arrayVariableInitializer.setLineNumber(ctx.LBRACE().getSymbol().getLine());
        for (ProbabilisticTimedRebecaCompleteParser.VariableInitializerContext viCtx : ctx.variableInitializer()) {
            arrayVariableInitializer.getValues().add(viCtx.vi);
        }
        ctx.avi = arrayVariableInitializer;
    }
    @Override
    public void exitInterfaceDeclaration(ProbabilisticTimedRebecaCompleteParser.InterfaceDeclarationContext ctx) {
        InterfaceDeclaration interfaceDeclaration = new InterfaceDeclaration();
        for (ProbabilisticTimedRebecaCompleteParser.AnnotationContext annotationCtx : ctx.annotation()) {
            interfaceDeclaration.getAnnotations().add(annotationCtx.an);
        }
        interfaceDeclaration.setName(ctx.IDENTIFIER().getText());
        interfaceDeclaration.setCharacter(ctx.IDENTIFIER().getSymbol().getCharPositionInLine());
        interfaceDeclaration.setLineNumber(ctx.IDENTIFIER().getSymbol().getLine());
        if (ctx.extendingInterface() != null) {
            interfaceDeclaration.getExtends().addAll(ctx.extendingInterface().opts);
        }
        for (ProbabilisticTimedRebecaCompleteParser.MsgsrvSignatureContext msgsrvSignatureContext : ctx.msgsrvSignature()) {
            interfaceDeclaration.getMsgsrvs().add(msgsrvSignatureContext.md);
        }
        interfaceDeclaration.setEndLineNumber(ctx.RBRACE().getSymbol().getLine());
        interfaceDeclaration.setEndCharacter(ctx.RBRACE().getSymbol().getCharPositionInLine());
        ctx.intd = interfaceDeclaration;
    }
    @Override
    public void exitExtendingInterface(ProbabilisticTimedRebecaCompleteParser.ExtendingInterfaceContext ctx) {
        List<OrdinaryPrimitiveType> ordinaryPrimitiveTypes = new ArrayList<>();
        for (TerminalNode name : ctx.IDENTIFIER()) {
            OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
            opt.setName(name.getText());
            opt.setLineNumber(name.getSymbol().getLine());
            opt.setCharacter(name.getSymbol().getCharPositionInLine());
            ordinaryPrimitiveTypes.add(opt);
        }
        ctx.opts = ordinaryPrimitiveTypes;
    }

    @Override
    public void exitMsgsrvSignature(ProbabilisticTimedRebecaCompleteParser.MsgsrvSignatureContext ctx) {
        MsgsrvDeclaration msgsrvDeclaration = new MsgsrvDeclaration();
        msgsrvDeclaration.setAbstract(true);
        for(ProbabilisticTimedRebecaCompleteParser.AnnotationContext annotation : ctx.annotation()){
            msgsrvDeclaration.getAnnotations().add(annotation.an);
        }
        msgsrvDeclaration.setName(ctx.IDENTIFIER().getText());
        msgsrvDeclaration.setLineNumber(ctx.IDENTIFIER().getSymbol().getLine());
        msgsrvDeclaration.setCharacter(ctx.IDENTIFIER().getSymbol().getCharPositionInLine());
        msgsrvDeclaration.getFormalParameters().addAll(ctx.formalParameters().fps);
        ctx.md = msgsrvDeclaration;
    }

    @Override
    public void exitReactiveClassDeclaration(ProbabilisticTimedRebecaCompleteParser.ReactiveClassDeclarationContext ctx) {
        ReactiveClassDeclaration reactiveClassDeclaration = new ReactiveClassDeclaration();
        for(ProbabilisticTimedRebecaCompleteParser.AnnotationContext annotation : ctx.annotation()){
            reactiveClassDeclaration.getAnnotations().add(annotation.an);
        }
        if(ctx.ABSTRACT() != null){
            reactiveClassDeclaration.setAbstract(true);
        }
        reactiveClassDeclaration.setName(ctx.IDENTIFIER(0).getText());
        reactiveClassDeclaration.setCharacter(ctx.IDENTIFIER(0).getSymbol().getCharPositionInLine());
        reactiveClassDeclaration.setLineNumber(ctx.IDENTIFIER(0).getSymbol().getLine());
        if(ctx.EXTENDS() != null) {
            OrdinaryPrimitiveType extend = new OrdinaryPrimitiveType();
            extend.setName(ctx.IDENTIFIER(1).getText());
            extend.setCharacter(ctx.IDENTIFIER(1).getSymbol().getCharPositionInLine());
            extend.setLineNumber(ctx.IDENTIFIER(1).getSymbol().getLine());
            reactiveClassDeclaration.setExtends(extend);
        }
        if(ctx.implementingInterface() != null){
            reactiveClassDeclaration.getImplements().addAll(ctx.implementingInterface().opts);
        }
        if(!ctx.INTLITERAL().getText().equals("<missing INTLITERAL>")) {
            reactiveClassDeclaration.setQueueSize(Integer.parseInt(ctx.INTLITERAL().getText()));
        }
        for(ProbabilisticTimedRebecaCompleteParser.KnownRebecsDeclarationContext knownRebecsDeclaration : ctx.knownRebecsDeclaration() ){
            reactiveClassDeclaration.getKnownRebecs().addAll(knownRebecsDeclaration.fds);
        }
        for(ProbabilisticTimedRebecaCompleteParser.StateVarsDeclarationContext stateVarsDeclaration : ctx.stateVarsDeclaration() ){
            reactiveClassDeclaration.getStatevars().addAll(stateVarsDeclaration.fds);
        }
        for(ProbabilisticTimedRebecaCompleteParser.ConstructorDeclarationContext constructorDeclaration: ctx.constructorDeclaration() ){
            reactiveClassDeclaration.getConstructors().add(constructorDeclaration.cd);
        }
        for(ProbabilisticTimedRebecaCompleteParser.MsgsrvDeclarationContext msgsrvDeclarationContext: ctx.msgsrvDeclaration() ){
            reactiveClassDeclaration.getMsgsrvs().add(msgsrvDeclarationContext.md);
        }
        for(ProbabilisticTimedRebecaCompleteParser.SynchMethodDeclarationContext synchMethodDeclarationContext: ctx.synchMethodDeclaration() ){
            reactiveClassDeclaration.getSynchMethods().add(synchMethodDeclarationContext.smd);
        }
        reactiveClassDeclaration.setEndLineNumber(ctx.RBRACE().getSymbol().getLine());
        reactiveClassDeclaration.setEndCharacter(ctx.RBRACE().getSymbol().getCharPositionInLine());
        ctx.rcd = reactiveClassDeclaration;
    }
    @Override
    public void exitImplementingInterface(ProbabilisticTimedRebecaCompleteParser.ImplementingInterfaceContext ctx) {
        List<OrdinaryPrimitiveType> ordinaryPrimitiveTypes = new ArrayList<>();
        for (TerminalNode name : ctx.IDENTIFIER()) {
            OrdinaryPrimitiveType opt = new OrdinaryPrimitiveType();
            opt.setName(name.getText());
            opt.setLineNumber(name.getSymbol().getLine());
            opt.setCharacter(name.getSymbol().getCharPositionInLine());
            ordinaryPrimitiveTypes.add(opt);
        }
        ctx.opts = ordinaryPrimitiveTypes;
    }
    @Override
    public void exitKnownRebecsDeclaration(ProbabilisticTimedRebecaCompleteParser.KnownRebecsDeclarationContext ctx) {
        List<FieldDeclaration> fieldDeclarations = new ArrayList<>();
        for(ProbabilisticTimedRebecaCompleteParser.FieldDeclarationContext fieldDeclarationContext : ctx.fieldDeclaration()){
            fieldDeclarations.add(fieldDeclarationContext.fd);
        }
        ctx.fds = fieldDeclarations;
    }
    @Override
    public void exitStateVarsDeclaration(ProbabilisticTimedRebecaCompleteParser.StateVarsDeclarationContext ctx) {
        List<FieldDeclaration> fieldDeclarations = new ArrayList<>();
        for(ProbabilisticTimedRebecaCompleteParser.FieldDeclarationContext fieldDeclarationContext : ctx.fieldDeclaration()){
            fieldDeclarations.add(fieldDeclarationContext.fd);
        }
        ctx.fds = fieldDeclarations;
    }
    private String declaration_type;
    @Override
    public void enterConstructorDeclaration(ProbabilisticTimedRebecaCompleteParser.ConstructorDeclarationContext ctx){
        declaration_type = "Constructor";
    }
    @Override
    public void enterMsgsrvDeclaration(ProbabilisticTimedRebecaCompleteParser.MsgsrvDeclarationContext ctx){
        declaration_type = "Msgsrv";
    }
    @Override
    public void enterSynchMethodDeclaration(ProbabilisticTimedRebecaCompleteParser.SynchMethodDeclarationContext ctx){
        declaration_type = "Synch";
    }
    @Override
    public void exitMethodDeclaration(ProbabilisticTimedRebecaCompleteParser.MethodDeclarationContext ctx) {
        switch (declaration_type) {
            case "Constructor" -> ctx.md = new ConstructorDeclaration();
            case "Msgsrv" -> ctx.md = new MsgsrvDeclaration();
            case "Synch" -> ctx.md = new SynchMethodDeclaration();
        }
        ctx.md.setName(ctx.IDENTIFIER().getText());
        ctx.md.setLineNumber(ctx.IDENTIFIER().getSymbol().getLine());
        ctx.md.setCharacter(ctx.IDENTIFIER().getSymbol().getCharPositionInLine());
        ctx.md.getFormalParameters().addAll(ctx.formalParameters().fps);
        if (ctx.block() != null) {
            BlockStatement block = ctx.block().bs;
            ctx.md.setBlock(block);
            ctx.md.setEndLineNumber(block.getEndLineNumber());
            ctx.md.setEndCharacter(block.getEndCharacter());
        }
    }

    @Override
    public void exitConstructorDeclaration(ProbabilisticTimedRebecaCompleteParser.ConstructorDeclarationContext ctx) {
        ConstructorDeclaration cd = (ConstructorDeclaration) ctx.methodDeclaration().md;
        for (ProbabilisticTimedRebecaCompleteParser.AnnotationContext annotationCtx : ctx.annotation()) {
            ctx.methodDeclaration().md.getAnnotations().add(annotationCtx.an);
        }
        ctx.cd = cd;
    }

    @Override
    public void exitMsgsrvDeclaration(ProbabilisticTimedRebecaCompleteParser.MsgsrvDeclarationContext ctx) {
        MsgsrvDeclaration msgd = (MsgsrvDeclaration) ctx.methodDeclaration().md;
        for (ProbabilisticTimedRebecaCompleteParser.AnnotationContext annotationCtx : ctx.annotation()) {
            msgd.getAnnotations().add(annotationCtx.an);
        }
        if (ctx.ABSTRACT() != null) {
            msgd.setAbstract(true);
        }
        ctx.md = msgd;
    }

    @Override
    public void exitSynchMethodDeclaration(ProbabilisticTimedRebecaCompleteParser.SynchMethodDeclarationContext ctx) {
        SynchMethodDeclaration smd = (SynchMethodDeclaration) ctx.methodDeclaration().md;
        for (ProbabilisticTimedRebecaCompleteParser.AnnotationContext annotationCtx : ctx.annotation()) {
            smd.getAnnotations().add(annotationCtx.an);
        }
        if (ctx.ABSTRACT() != null) {
            smd.setAbstract(true);
        }
        smd.setReturnType(ctx.type().t);
        ctx.smd = smd;
    }

    @Override
    public void exitFormalParameters(ProbabilisticTimedRebecaCompleteParser.FormalParametersContext ctx) {
        List<FormalParameterDeclaration> fps = new ArrayList<>();
        if (ctx.formalParametersDeclaration() != null) {
            fps.addAll(ctx.formalParametersDeclaration().fpds);
        }
        ctx.fps = fps;
    }

    @Override
    public void exitFormalParametersDeclaration(ProbabilisticTimedRebecaCompleteParser.FormalParametersDeclarationContext ctx) {
        List<FormalParameterDeclaration> fpds = new ArrayList<>();
        for (ProbabilisticTimedRebecaCompleteParser.FormalParameterDeclarationContext fpd : ctx.formalParameterDeclaration()) {
            fpds.add(fpd.fpd);
        }
        ctx.fpds = fpds;
    }

    @Override
    public void exitFormalParameterDeclaration(ProbabilisticTimedRebecaCompleteParser.FormalParameterDeclarationContext ctx) {
        FormalParameterDeclaration fpd = new FormalParameterDeclaration();
        fpd.setName(ctx.IDENTIFIER().getText());
        fpd.setType(ctx.type().t);
        fpd.setLineNumber(ctx.IDENTIFIER().getSymbol().getLine());
        fpd.setCharacter(ctx.IDENTIFIER().getSymbol().getCharPositionInLine());
        ctx.fpd = fpd;
    }

    @Override
    public void exitBlock(ProbabilisticTimedRebecaCompleteParser.BlockContext ctx){
        BlockStatement blockStatement = new BlockStatement();
        blockStatement.setLineNumber(ctx.LBRACE().getSymbol().getLine());
        blockStatement.setCharacter(ctx.LBRACE().getSymbol().getCharPositionInLine());
        blockStatement.setEndLineNumber(ctx.RBRACE().getSymbol().getLine());
        blockStatement.setEndCharacter(ctx.RBRACE().getSymbol().getCharPositionInLine());
        for(ProbabilisticTimedRebecaCompleteParser.AnnotatedStatementContext annotatedStatement : ctx.annotatedStatement()){
            blockStatement.getStatements().add(annotatedStatement.s);
        }
        ctx.bs = blockStatement;
    }

    @Override
    public void exitAnnotatedStatement(ProbabilisticTimedRebecaCompleteParser.AnnotatedStatementContext ctx) {
        Statement stm = ctx.statement().s;
        for(ProbabilisticTimedRebecaCompleteParser.AnnotationContext annotation : ctx.annotation()){
            stm.getAnnotations().add(annotation.an);
        }
        ctx.s = stm;
    }
    @Override
    public void exitForInit(ProbabilisticTimedRebecaCompleteParser.ForInitContext ctx) {
        ForInitializer fi = new ForInitializer();
        if (ctx.fieldDeclaration() != null) {
            fi.setFieldDeclaration(ctx.fieldDeclaration().fd);
        } else if (ctx.expressionList() != null) {
            fi.getExpressions().addAll(ctx.expressionList().el);
        }
        ctx.fi = fi;
    }
    @Override
    public void exitSwitchBlock(ProbabilisticTimedRebecaCompleteParser.SwitchBlockContext ctx) {
        SwitchStatement switchStatement = new SwitchStatement();
        for(ProbabilisticTimedRebecaCompleteParser.AnnotationContext annotation : ctx.annotation()){
            switchStatement.getAnnotations().add(annotation.an);
        }
        for(ProbabilisticTimedRebecaCompleteParser.CaseSwitchGroupContext switchGroup : ctx.caseSwitchGroup()){
            switchStatement.getSwitchStatementGroups().add(switchGroup.ssg);
        }
        if(ctx.defaultSwitchGroup() != null) {
            switchStatement.getSwitchStatementGroups().add(ctx.defaultSwitchGroup().ssg);
        }
        ctx.ss = switchStatement;
    }
    @Override
    public void exitCaseSwitchGroup(ProbabilisticTimedRebecaCompleteParser.CaseSwitchGroupContext ctx) {
        SwitchStatementGroup switchStatementGroup = new SwitchStatementGroup();
        switchStatementGroup.setExpression(ctx.expression().e);
        switchStatementGroup.setLineNumber(ctx.expression().e.getLineNumber());
        switchStatementGroup.setCharacter(ctx.expression().e.getCharacter());
        for(ProbabilisticTimedRebecaCompleteParser.AnnotatedStatementContext annotatedStatement : ctx.annotatedStatement()){
            switchStatementGroup.getStatements().add(annotatedStatement.s);
        }
        ctx.ssg = switchStatementGroup;
    }

    @Override
    public void exitDefaultSwitchGroup(ProbabilisticTimedRebecaCompleteParser.DefaultSwitchGroupContext ctx) {
        SwitchStatementGroup switchStatementGroup = new SwitchStatementGroup();
        switchStatementGroup.setLineNumber(ctx.DEFAULT().getSymbol().getLine());
        switchStatementGroup.setCharacter(ctx.DEFAULT().getSymbol().getCharPositionInLine());
        for(ProbabilisticTimedRebecaCompleteParser.AnnotatedStatementContext annotatedStatement : ctx.annotatedStatement()){
            switchStatementGroup.getStatements().add(annotatedStatement.s);
        }
        ctx.ssg = switchStatementGroup;
    }
    //
    // EXPRESSION PARSER
    //

    @Override
    public void exitExpression(ProbabilisticTimedRebecaCompleteParser.ExpressionContext ctx) {
        if (ctx.extendableExpression() != null) {
            ctx.e = ctx.extendableExpression().e;
        } else if (ctx.unaryExpression() != null) {
            ctx.e = ctx.unaryExpression().e;
        } else if (ctx.expression(0) != null && ctx.expression(1) != null && ctx.expression(2) != null) {
        	TernaryExpression te = new TernaryExpression();
        	te.setCondition(ctx.expression(0).e);
        	te.setLeft(ctx.expression(1).e);
        	te.setRight(ctx.expression(2).e);
        	ctx.e = te;
        } else if (ctx.expression(0) != null && ctx.expression(1) != null) {
            BinaryExpression binaryExpression = new BinaryExpression();
            binaryExpression.setLeft(ctx.expression(0).e);
            binaryExpression.setRight(ctx.expression(1).e);
            if (ctx.multiplicativeOp() != null) {
                binaryExpression.setOperator(ctx.multiplicativeOp().getText());
            } else if (ctx.additiveOp() != null) {
                binaryExpression.setOperator(ctx.additiveOp().getText());
            } else if (ctx.shiftOp() != null) {
                binaryExpression.setOperator(ctx.shiftOp().getText());
            } else if (ctx.relationalOp() != null) {
                binaryExpression.setOperator(ctx.relationalOp().getText());
            } else if (ctx.equalityOp() != null) {
                binaryExpression.setOperator(ctx.equalityOp().getText());
            } else if (ctx.AMP() != null) {
                binaryExpression.setOperator(ctx.AMP().getText());
            } else if (ctx.CARET() != null) {
                binaryExpression.setOperator(ctx.CARET().getText());
            } else if (ctx.BAR() != null) {
                binaryExpression.setOperator(ctx.BAR().getText());
            } else if (ctx.AMPAMP() != null) {
                binaryExpression.setOperator(ctx.AMPAMP().getText());
            } else if (ctx.BARBAR() != null) {
                binaryExpression.setOperator(ctx.BARBAR().getText());
            } else if (ctx.assignmentOperator() != null) {
                binaryExpression.setOperator(ctx.assignmentOperator().getText());
            }
            binaryExpression.setLineNumber(ctx.expression(0).e.getLineNumber());
            binaryExpression.setCharacter(ctx.expression(0).e.getCharacter());
            ctx.e = binaryExpression;
        } else if (ctx.INSTANCEOF() != null) {
            InstanceofExpression instanceofExpression = new InstanceofExpression();
            instanceofExpression.setValue(ctx.expression(0).e);
            instanceofExpression.setEvaluationType(ctx.type().t);
            instanceofExpression.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
            instanceofExpression.setLineNumber(ctx.type().t.getLineNumber());
            instanceofExpression.setCharacter(ctx.type().t.getCharacter());
            ctx.e = instanceofExpression;
        } else if (ctx.QUES() != null && ctx.COLON() != null) {
            TernaryExpression ternaryExpression = new TernaryExpression();
            ternaryExpression.setCondition(ctx.expression(0).e);
            ternaryExpression.setLeft(ctx.expression(1).e);
            ternaryExpression.setRight(ctx.expression(2).e);
            ternaryExpression.setLineNumber(ctx.expression(0).e.getLineNumber());
            ternaryExpression.setCharacter(ctx.expression(0).e.getCharacter());
            ctx.e = ternaryExpression;
        }
    }
    @Override
    public void exitAnnotation(ProbabilisticTimedRebecaCompleteParser.AnnotationContext ctx) {
        Annotation annotation = new Annotation();
        TerminalNode annotationName = ctx.IDENTIFIER();
        annotation.setIdentifier(annotationName.getText());
        annotation.setLineNumber(annotationName.getSymbol().getLine());
        annotation.setCharacter(annotationName.getSymbol().getCharPositionInLine());
        if (ctx.expression() != null) {
            annotation.setValue(ctx.expression().e);
        }
        ctx.an = annotation;
    }

    @Override
    public void exitType(ProbabilisticTimedRebecaCompleteParser.TypeContext ctx) {
        Type type;
        TerminalNode typeName = ctx.IDENTIFIER();
        OrdinaryPrimitiveType baseType = new OrdinaryPrimitiveType();
        baseType.setName(typeName.getText());
        baseType.setLineNumber(typeName.getSymbol().getLine());
        baseType.setCharacter(typeName.getSymbol().getCharPositionInLine());
        type = baseType;
        if (ctx.genericTypeParams() != null) {
            GenericType genericType = new GenericType();
            genericType.setName(baseType.getName());
            genericType.setNumberOfParameters(ctx.genericTypeParams().gts.size());

            GenericTypeInstance genericTypeInstance = new GenericTypeInstance();
            genericTypeInstance.setBase(genericType);
            genericTypeInstance.getParameters().addAll(ctx.genericTypeParams().gts);
            type = genericTypeInstance;

            type.setLineNumber(typeName.getSymbol().getLine());
            type.setCharacter(typeName.getSymbol().getCharPositionInLine());
        }
        if (ctx.dimensions() != null) {
            ArrayType arrayType = new ArrayType();
            arrayType.setOrdinaryPrimitiveType(baseType);
            arrayType.getDimensions().addAll(ctx.dimensions().ds);
            type = arrayType;
        }
        ctx.t = type;
    }

    @Override
    public void exitGenericTypeParams(ProbabilisticTimedRebecaCompleteParser.GenericTypeParamsContext ctx) {
        List<Type> genericTypeParams = new LinkedList<>();
        for (ProbabilisticTimedRebecaCompleteParser.TypeContext typeContext : ctx.type()) {
            genericTypeParams.add(typeContext.t);
        }
        ctx.gts = genericTypeParams;
    }

    @Override
    public void exitDimensions(ProbabilisticTimedRebecaCompleteParser.DimensionsContext ctx) {
        List<Integer> dimensions = new LinkedList<>();
        for (TerminalNode intLiteral : ctx.INTLITERAL()) {
            dimensions.add(Integer.parseInt(intLiteral.getText()));
        }
        ctx.ds = dimensions;
    }
    @Override
    public void exitExtendableExpression(ProbabilisticTimedRebecaCompleteParser.ExtendableExpressionContext ctx) {
        Expression e = ctx.coreExpression().e ;
        for (int i = 0; i < ctx.primary().size(); i++) {
            ProbabilisticTimedRebecaCompleteParser.PrimaryContext primaryCtx = ctx.primary(i);
            DotPrimary de = new DotPrimary();
            de.setLineNumber(ctx.DOT(i).getSymbol().getLine());
            de.setCharacter(ctx.DOT(i).getSymbol().getCharPositionInLine());
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
    public void exitAssignmentOperator(ProbabilisticTimedRebecaCompleteParser.AssignmentOperatorContext ctx) {
        String assignmentOperator = null;
        if (ctx.EQ() != null) {
            assignmentOperator = ctx.EQ().getText();
        } else if (ctx.PLUSEQ() != null) {
            assignmentOperator = ctx.PLUSEQ().getText();
        } else if (ctx.SUBEQ() != null) {
            assignmentOperator = ctx.SUBEQ().getText();
        } else if (ctx.STAREQ() != null) {
            assignmentOperator = ctx.STAREQ().getText();
        } else if (ctx.SLASHEQ() != null) {
            assignmentOperator = ctx.SLASHEQ().getText();
        } else if (ctx.AMPEQ() != null) {
            assignmentOperator = ctx.AMPEQ().getText();
        } else if (ctx.BAREQ() != null) {
            assignmentOperator = ctx.BAREQ().getText();
        } else if (ctx.CARETEQ() != null) {
            assignmentOperator = ctx.CARETEQ().getText();
        } else if (ctx.TILDAEQ() != null) {
            assignmentOperator = ctx.TILDAEQ().getText();
        } else if (ctx.PERCENTEQ() != null) {
            assignmentOperator = ctx.PERCENTEQ().getText();
        } else if (ctx.LTLTEQ() != null) {
            assignmentOperator = ctx.LTLTEQ().getText();
        } else if (ctx.GTGTEQ() != null) {
            assignmentOperator = ctx.GTGTEQ().getText();
        }
        ctx.ao = assignmentOperator;
    }
    @Override
    public void exitMultiplicativeOp(ProbabilisticTimedRebecaCompleteParser.MultiplicativeOpContext ctx) {
        String multiplicativeOperator = null;
        if (ctx.STAR() != null) {
            multiplicativeOperator = ctx.STAR().getText();
        } else if (ctx.SLASH() != null) {
            multiplicativeOperator = ctx.SLASH().getText();
        } else if (ctx.PERCENT() != null) {
            multiplicativeOperator = ctx.PERCENT().getText();
        }
        ctx.mo = multiplicativeOperator;
    }

    @Override
    public void exitAdditiveOp(ProbabilisticTimedRebecaCompleteParser.AdditiveOpContext ctx) {
        String additiveOperator = null;
        if (ctx.PLUS() != null) {
            additiveOperator = ctx.PLUS().getText();
        } else if (ctx.SUB() != null) {
            additiveOperator = ctx.SUB().getText();
        }
        ctx.ado = additiveOperator;
    }

    @Override
    public void exitRelationalOp(ProbabilisticTimedRebecaCompleteParser.RelationalOpContext ctx) {
        String relationalOperator = null;
        if (ctx.LT() != null && ctx.EQ() != null) {
            relationalOperator = ctx.LT().getText() + ctx.EQ().getText();
        } else if (ctx.GT() != null && ctx.EQ() != null) {
            relationalOperator = ctx.GT().getText() + ctx.EQ().getText();
        } else if (ctx.LT() != null) {
            relationalOperator = ctx.LT().getText();
        } else if (ctx.GT() != null) {
            relationalOperator = ctx.GT().getText();
        }
        ctx.ro = relationalOperator;
    }

    @Override
    public void exitShiftOp(ProbabilisticTimedRebecaCompleteParser.ShiftOpContext ctx) {
        String shiftOperator = null;
        if (ctx.LT().size() == 2) {
            shiftOperator = "<<";
        } else if (ctx.GT().size() == 2) {
            shiftOperator = ">>";
        }
        ctx.so = shiftOperator;
    }

    @Override
    public void exitEqualityOp(ProbabilisticTimedRebecaCompleteParser.EqualityOpContext ctx) {
        String equalityOperator = null;
        if (ctx.EQEQ() != null) {
            equalityOperator = ctx.EQEQ().getText();
        } else if (ctx.BANGEQ() != null) {
            equalityOperator = ctx.BANGEQ().getText();
        }
        ctx.eo = equalityOperator;
    }

    @Override
    public void exitUnaryExpression(ProbabilisticTimedRebecaCompleteParser.UnaryExpressionContext ctx) {
        Expression expression;
        if (ctx.PLUS() != null) {
            expression = ctx.unaryExpression().e;
        } else if (ctx.extendableExpression() != null) {
            expression = ctx.extendableExpression().e;
        }
        else {
            UnaryExpression ue = new UnaryExpression();
            ue.setExpression(ctx.unaryExpression().e);
            ue.setLineNumber(ctx.unaryExpression().e.getLineNumber());
            ue.setCharacter(ctx.unaryExpression().e.getCharacter());
            if (ctx.SUB() != null) {
                ue.setOperator(ctx.SUB().getText());
            } else if (ctx.PLUSPLUS() != null) {
                ue.setOperator(ctx.PLUSPLUS().getText());
            } else if (ctx.SUBSUB() != null) {
                ue.setOperator(ctx.SUBSUB().getText());
            } else if (ctx.TILDA() != null) {
                ue.setOperator(ctx.TILDA().getText());
            } else if (ctx.BANG() != null) {
                ue.setOperator(ctx.BANG().getText());
            }
            expression = ue;
        }
        ctx.e = expression;
    }
    @Override
    public void exitCastExpression(ProbabilisticTimedRebecaCompleteParser.CastExpressionContext ctx) {
        CastExpression castExpr = new CastExpression();
        castExpr.setExpression(ctx.expression().e);
        castExpr.setType(ctx.type().t);
        castExpr.setLineNumber(ctx.expression().e.getLineNumber());
        castExpr.setCharacter(ctx.expression().e.getCharacter());
        ctx.e = castExpr;
    }

    @Override
    public void exitExpressionList(ProbabilisticTimedRebecaCompleteParser.ExpressionListContext ctx) {
        List<Expression> expressions = new LinkedList<>();
        for (ProbabilisticTimedRebecaCompleteParser.AnnotatedExpressionContext annotatedExpression : ctx.annotatedExpression()) {
            expressions.add(annotatedExpression.e);
        }
        ctx.el = expressions;
    }
    @Override
    public void exitAnnotatedExpression(ProbabilisticTimedRebecaCompleteParser.AnnotatedExpressionContext ctx) {
        List<Annotation> annotationList = new ArrayList<>();
        Expression expr = ctx.expression().e;
        for(ProbabilisticTimedRebecaCompleteParser.AnnotationContext annotation : ctx.annotation()){
            annotationList.add(annotation.an);
        }
        expr.getAnnotations().addAll(annotationList);
        ctx.e = expr;
    }
    @Override
    public void exitLiteral(ProbabilisticTimedRebecaCompleteParser.LiteralContext ctx) {
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
