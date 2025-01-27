package org.rebecalang.compiler.modelcompiler.corerebeca.compiler;

import com.oracle.js.parser.ir.Block;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.compiler.ProbabilisticRebecaCompleteParser;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.PAltStatement;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.ProbabilisticAlternativeValue;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.ProbabilisticExpression;

import java.util.ArrayList;
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
    public void exitMainDeclaration(CoreRebecaCompleteParser.MainDeclarationContext ctx) {
        MainDeclaration md = new MainDeclaration();
        md.setLineNumber(ctx.MAIN().getSymbol().getLine());
        md.setCharacter(ctx.MAIN().getSymbol().getCharPositionInLine());
        for (CoreRebecaCompleteParser.MainRebecDefinitionContext mrdCtx : ctx.mainRebecDefinition()) {
            md.getMainRebecDefinition().add(mrdCtx.mrd);
        }
        md.setEndLineNumber(ctx.RBRACE().getSymbol().getLine());
        md.setEndCharacter(ctx.RBRACE().getSymbol().getCharPositionInLine());
    }

    @Override
    public void exitMainRebecDefinition(CoreRebecaCompleteParser.MainRebecDefinitionContext ctx) {
        MainRebecDefinition mrd = new MainRebecDefinition();
        for (CoreRebecaCompleteParser.AnnotationContext annCtx : ctx.annotation()) {
            mrd.getAnnotations().add(annCtx.an);
        }
        mrd.setType(ctx.type().t);
        mrd.setName(ctx.IDENTIFIER().getText());
        mrd.setLineNumber(ctx.IDENTIFIER().getSymbol().getLine());
        mrd.setCharacter(ctx.IDENTIFIER().getSymbol().getCharPositionInLine());
        if (ctx.bindingsExpressionList() != null) {
            mrd.getBindings().addAll(ctx.bindingsExpressionList().el);
        }
        if (ctx.argumentsExpressionList() != null) {
            mrd.getArguments().addAll(ctx.argumentsExpressionList().el);
        }
        ctx.mrd = mrd;
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
        MethodDeclaration md = ctx.md;
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
        ConstructorDeclaration cd = (ConstructorDeclaration) ctx.methodDeclaration().md;
        for (CoreRebecaCompleteParser.AnnotationContext annotationCtx : ctx.annotation()) {
            cd.getAnnotations().add(annotationCtx.an);
        }
        ctx.cd = cd;
    }

    @Override
    public void exitMsgsrvDeclaration(CoreRebecaCompleteParser.MsgsrvDeclarationContext ctx) {
        MsgsrvDeclaration msgd = (MsgsrvDeclaration) ctx.methodDeclaration().md;
        for (CoreRebecaCompleteParser.AnnotationContext annotationCtx : ctx.annotation()) {
            msgd.getAnnotations().add(annotationCtx.an);
        }
        if (ctx.ABSTRACT() != null) {
            msgd.setAbstract(true);
        }
    }

    @Override
    public void exitSynchMethodDeclaration(CoreRebecaCompleteParser.SynchMethodDeclarationContext ctx) {
        SynchMethodDeclaration smd = (SynchMethodDeclaration) ctx.methodDeclaration().md;
        for (CoreRebecaCompleteParser.AnnotationContext annotationCtx : ctx.annotation()) {
            smd.getAnnotations().add(annotationCtx.an);
        }
        if (ctx.ABSTRACT() != null) {
            smd.setAbstract(true);
        }
        smd.setReturnType(ctx.type().t);
    }

    @Override
    public void exitFormalParameters(CoreRebecaCompleteParser.FormalParametersContext ctx) {
        List<FormalParameterDeclaration> fps = new ArrayList<>();
        if (ctx.formalParametersDeclaration() != null) {
            fps.addAll(ctx.formalParametersDeclaration().fpds);
        }
        ctx.fps = fps;
    }

    @Override
    public void exitFormalParametersDeclaration(CoreRebecaCompleteParser.FormalParametersDeclarationContext ctx) {
        List<FormalParameterDeclaration> fpds = new ArrayList<>();
        for (CoreRebecaCompleteParser.FormalParameterDeclarationContext fpd : ctx.formalParameterDeclaration()) {
            fpds.add(fpd.fpd);
        }
        ctx.fpds = fpds;
    }

    @Override
    public void exitFormalParameterDeclaration(CoreRebecaCompleteParser.FormalParameterDeclarationContext ctx) {
        FormalParameterDeclaration fpd = new FormalParameterDeclaration();
        fpd.setName(ctx.IDENTIFIER().getText());
        fpd.setType(ctx.type().t);
        fpd.setLineNumber(ctx.IDENTIFIER().getSymbol().getLine());
        fpd.setCharacter(ctx.IDENTIFIER().getSymbol().getCharPositionInLine());
        ctx.fpd = fpd;
    }

    @Override
    public void exitBlock(CoreRebecaCompleteParser.BlockContext ctx){
        BlockStatement blockStatement = new BlockStatement();
        blockStatement.setLineNumber(ctx.LBRACE().getSymbol().getLine());
        blockStatement.setCharacter(ctx.LBRACE().getSymbol().getCharPositionInLine());
        blockStatement.setEndLineNumber(ctx.RBRACE().getSymbol().getLine());
        blockStatement.setEndCharacter(ctx.RBRACE().getSymbol().getCharPositionInLine());
        for(CoreRebecaCompleteParser.AnnotatedStatementContext annotatedStatement : ctx.annotatedStatement()){
            blockStatement.getStatements().add(annotatedStatement.s);
        }
        ctx.bs = blockStatement;
    }

    @Override
    public void exitAnnotatedStatement(CoreRebecaCompleteParser.BlockContext ctx) {
        List<Annotation> annotationList = new ArrayList<>();
        Statement stm = ctx.statement().s;
        for(CoreRebecaCompleteParser.AnnotationContext annotation : ctx.annotation()){
            annotationList.add(annotation.an);
        }
        stm.getAnnotations().addAll(annotationList);
        ctx.s = stm;
    }
    @Override
    public void exitStatementExpression(CoreRebecaCompleteParser.StatementExpressionContext ctx){
        ctx.se = ctx.expression().e;
    }
    @Override
    public void exitForInit(CoreRebecaCompleteParser.ForInitContext ctx) {
        ForInitializer fi = new ForInitializer();
        if (ctx.fieldDeclaration() != null) {
            fi.setFieldDeclaration(ctx.fieldDeclaration().fd);
        } else if (ctx.expressionList() != null) {
            fi.getExpressions().addAll(ctx.expressionList().el);
        }
        ctx.fi = fi;
    }
    @Override
    public void exitSwitchBlock(CoreRebecaCompleteParser.SwitchBlockContext ctx) {
        SwitchStatement switchStatement = new SwitchStatement();
        for(CoreRebecaCompleteParser.AnnotationContext annotation : ctx.annotation()){
            switchStatement.getAnnotations().add(annotation.an);
        }
        for(CoreRebecaCompleteParser.CaseSwitchGroupContext switchGroup : ctx.caseSwitchGroup()){
            switchStatement.getSwitchStatementGroups().add(switchGroup.ssg);
        }
        if(ctx.defaultSwitchGroup() != null) {
            switchStatement.getSwitchStatementGroups().add(ctx.defaultGroup().ssg);
        }
        ctx.ss = switchStatement;
    }
    @Override
    public void exitCaseSwitchGroup(CoreRebecaCompleteParser.CaseSwitchGroupContext ctx) {
        SwitchStatementGroup switchStatementGroup = new SwitchStatementGroup();
        switchStatementGroup.setExpression(ctx.expression().e);
        switchStatementGroup.setLineNumber(ctx.expression().e.getLineNumber());
        switchStatementGroup.setCharacter(ctx.expression().e.getCharacter());
        for(CoreRebecaCompleteParser.AnnotatedStatementContext annotatedStatement : ctx.annotatedStatement()){
            switchStatementGroup.getStatements().add(annotatedStatement.s);
        }
        ctx.ssg = switchStatementGroup;
    }

    @Override
    public void exitDefaultSwitchGroup(CoreRebecaCompleteParser.DefaultSwitchGroupContext ctx) {
        SwitchStatementGroup switchStatementGroup = new SwitchStatementGroup();
        switchStatementGroup.setLineNumber(ctx.DEFAULT().getSymbol().getLine());
        switchStatementGroup.setCharacter(ctx.DEFAULT().getSymbol().getCharPositionInLine());
        for(CoreRebecaCompleteParser.AnnotatedStatementContext annotatedStatement : ctx.annotatedStatement()){
            switchStatementGroup.getStatements().add(annotatedStatement.s);
        }
        ctx.ssg = switchStatementGroup;
    }

    @Override
    public void exitStatement(CoreRebecaCompleteParser.StatementContext ctx) {
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
            default -> throw new IllegalStateException("Unrecognized statement type");
        }
        ctx.s = s;
    }

    private String getStatementType(CoreRebecaCompleteParser.StatementContext ctx) {
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
        return "unknown";
    }


    //
    // EXPRESSION PARSER
    //

    @Override
    public void exitAnnotation(CoreRebecaCompleteParser.AnnotationContext ctx) {
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
    public void exitType(CoreRebecaCompleteParser.TypeContext ctx) {
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
    public void exitGenericTypeParams(CoreRebecaCompleteParser.GenericTypeParamsContext ctx) {
        List<Type> genericTypeParams = new LinkedList<>();
        for (CoreRebecaCompleteParser.TypeContext typeContext : ctx.type()) {
            genericTypeParams.add(typeContext.t);
        }
        ctx.gts = genericTypeParams;
    }

    @Override
    public void exitDimensions(CoreRebecaCompleteParser.DimensionsContext ctx) {
        List<Integer> dimensions = new LinkedList<>();
        for (TerminalNode intLiteral : ctx.INTLITERAL()) {
            dimensions.add(Integer.parseInt(intLiteral.getText()));
        }
        ctx.ds = dimensions;
    }
    @Override
    public void exitCoreExpression(CoreRebecaCompleteParser.CoreExpressionContext ctx) {
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
            e = new NonDetExpression();
            List<Expression> choices = ctx.expressionList(0).el;
            ((NonDetExpression) e).getChoices().addAll(choices);
            e.setLineNumber(ctx.QUES().getSymbol().getLine());
            e.setCharacter(ctx.QUES().getSymbol().getCharPositionInLine());
        } else if (ctx.NEW() != null) {
            e = new RebecInstantiationPrimary();
            e.setLineNumber(ctx.type().t.getLineNumber());
            e.setCharacter(ctx.type().t.getCharacter());
            e.setType(ctx.type().t);
            for(CoreRebecaCompleteParser.ExpressionListContext expressionListContext : ctx.expressionList()) {
                ((RebecInstantiationPrimary)e).getBindings().addAll(expressionListContext.el);
            }
        } else {
            throw new IllegalStateException("Unrecognized expression type");
        }
        for (int i = 0; i < ctx.primary().size(); i++) {
            CoreRebecaCompleteParser.PrimaryContext primaryCtx = ctx.primary(i);
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
    public void exitAssignmentOperator(CoreRebecaCompleteParser.AssignmentOperatorContext ctx) {
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
    public void exitMultiplicativeOp(CoreRebecaCompleteParser.MultiplicativeOpContext ctx) {
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
    public void exitAdditiveOp(CoreRebecaCompleteParser.AdditiveOpContext ctx) {
        String additiveOperator = null;
        if (ctx.PLUS() != null) {
            additiveOperator = ctx.PLUS().getText();
        } else if (ctx.SUB() != null) {
            additiveOperator = ctx.SUB().getText();
        }
        ctx.ado = additiveOperator;
    }

    @Override
    public void exitRelationalOp(CoreRebecaCompleteParser.RelationalOpContext ctx) {
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
    public void exitShiftOp(CoreRebecaCompleteParser.ShiftOpContext ctx) {
        String shiftOperator = null;
        if (ctx.LT().size() == 2) {
            shiftOperator = "<<";
        } else if (ctx.GT().size() == 2) {
            shiftOperator = ">>";
        }
        ctx.so = shiftOperator;
    }

    @Override
    public void exitEqualityOp(CoreRebecaCompleteParser.EqualityOpContext ctx) {
        String equalityOperator = null;
        if (ctx.EQEQ() != null) {
            equalityOperator = ctx.EQEQ().getText();
        } else if (ctx.BANGEQ() != null) {
            equalityOperator = ctx.BANGEQ().getText();
        }
        ctx.eo = equalityOperator;
    }

    @Override
    public void exitUnaryExpression(CoreRebecaCompleteParser.UnaryExpressionContext ctx) {
        Expression expression = null;
        if (ctx.PLUS() != null) {
            expression = ctx.unaryExpression().e;
        } else if (ctx.coreExpression() != null) {
            expression = ctx.coreExpression().e;
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
    public void exitCastExpression(CoreRebecaCompleteParser.CastExpressionContext ctx) {
        CastExpression castExpr = new CastExpression();
        castExpr.setExpression(ctx.expression().e);
        castExpr.setType(ctx.type().t);
        castExpr.setLineNumber(ctx.expression().e.getLineNumber());
        castExpr.setCharacter(ctx.expression().e.getCharacter());
        ctx.e = castExpr;
    }

    @Override
    public void exitPrimary(CoreRebecaCompleteParser.PrimaryContext ctx) {
        TermPrimary tp = new TermPrimary();
        tp.setName(ctx.IDENTIFIER().getText());
        tp.setLineNumber(ctx.IDENTIFIER().getSymbol().getLine());
        tp.setCharacter(ctx.IDENTIFIER().getSymbol().getCharPositionInLine());
        if (ctx.LPAREN() != null) {
            ParentSuffixPrimary psp = new ParentSuffixPrimary();
            psp.setLineNumber(ctx.LPAREN().getSymbol().getLine());
            psp.setCharacter(ctx.LPAREN().getSymbol().getCharPositionInLine());
            tp.setParentSuffixPrimary(psp);
            if (ctx.expressionList() != null) {
                tp.getParentSuffixPrimary().getArguments().addAll(ctx.expressionList().el);
            }
        }
        for (CoreRebecaCompleteParser.ExpressionContext exprCtx : ctx.expression()) {
            tp.getIndices().add(exprCtx.e);
        }
        ctx.tp = tp;
    }

    @Override
    public void exitExpressionList(CoreRebecaCompleteParser.ExpressionListContext ctx) {
        List<Expression> expressions = new LinkedList<>();
        for (CoreRebecaCompleteParser.AnnotatedExpressionContext annotatedExpression : ctx.annotatedExpression()) {
            expressions.add(annotatedExpression);
        }
        ctx.el = expressions;
    }
    @Override
    public void exitAnnotatedExpression(CoreRebecaCompleteParser.AnnotatedExpressionContext ctx) {
        List<Annotation> annotationList = new ArrayList<>();
        Expression expr = ctx.expression().e;
        for(CoreRebecaCompleteParser.AnnotationContext annotation : ctx.annotation()){
            annotationList.add(annotation.an);
        }
        expr.getAnnotations().addAll(annotationList);
        ctx.e = expr;
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
