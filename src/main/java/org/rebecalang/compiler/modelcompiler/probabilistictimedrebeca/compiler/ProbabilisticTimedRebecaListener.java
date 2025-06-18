package org.rebecalang.compiler.modelcompiler.probabilistictimedrebeca.compiler;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Annotation;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ArrayType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ArrayVariableInitializer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BinaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BlockStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BreakStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.CastExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ConditionalStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ConstructorDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.DotPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FieldDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ForInitializer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ForStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FormalParameterDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.GenericType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.GenericTypeInstance;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.InstanceofExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.InterfaceDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Literal;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.MainDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.MainRebecDefinition;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.MsgsrvDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.NonDetExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryPrimitiveType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryVariableInitializer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.PlusSubExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReactiveClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecInstantiationPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaCode;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReturnStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SwitchStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SwitchStatementGroup;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SynchMethodDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TernaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.UnaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.VariableDeclarator;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.VariableInitializer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.WhileStatement;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.PAltStatement;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.PAltStatementGroup;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.ProbabilisticAlternativeValue;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel.ProbabilisticExpression;
import org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel.TimedRebecaParentSuffixPrimary;

public class ProbabilisticTimedRebecaListener extends ProbabilisticTimedRebecaCompleteBaseListener  {


    @Override
    public void exitPrimary(ProbabilisticTimedRebecaCompleteParser.PrimaryContext ctx) {
        TermPrimary termPrimary = new TermPrimary();
        if(ctx.SELF() != null) {
            termPrimary.setName("self");
            termPrimary.setLineNumber(ctx.SELF().getSymbol().getLine());
            termPrimary.setCharacter(ctx.SELF().getSymbol().getCharPositionInLine());
        } else if(ctx.SUPER() != null) {
            termPrimary.setName("super");
            termPrimary.setLineNumber(ctx.SUPER().getSymbol().getLine());
            termPrimary.setCharacter(ctx.SUPER().getSymbol().getCharPositionInLine());
        } else if(ctx.IDENTIFIER() != null) {
            termPrimary.setName(ctx.IDENTIFIER().getText());
            termPrimary.setLineNumber(ctx.IDENTIFIER().getSymbol().getLine());
            termPrimary.setCharacter(ctx.IDENTIFIER().getSymbol().getCharPositionInLine());
            if (ctx.arguments() != null) {
                TimedRebecaParentSuffixPrimary parentSuffixPrimary = new TimedRebecaParentSuffixPrimary();
                parentSuffixPrimary.setLineNumber(termPrimary.getLineNumber());
                parentSuffixPrimary.setCharacter(termPrimary.getCharacter());
                termPrimary.setParentSuffixPrimary(parentSuffixPrimary);
                parentSuffixPrimary.getArguments().addAll(ctx.arguments().args);
                if(ctx.after() != null)
                	parentSuffixPrimary.setAfterExpression(ctx.after().e);
                if(ctx.deadline() != null)
                	parentSuffixPrimary.setDeadlineExpression(ctx.deadline().e);
            }
            if (ctx.expression() != null) {
            	for(ProbabilisticTimedRebecaCompleteParser.ExpressionContext ec : ctx.expression())
            		termPrimary.getIndices().add(ec.e);
            }
        }
        ctx.tp = termPrimary;
    }

    @Override
    public void exitAfter(ProbabilisticTimedRebecaCompleteParser.AfterContext ctx) {
    	ctx.e = ctx.expression().e;
    }
    
    @Override
    public void exitDeadline(ProbabilisticTimedRebecaCompleteParser.DeadlineContext ctx) {
    	ctx.e = ctx.expression().e;
    }


    @Override
    public void exitStatementExtension(ProbabilisticTimedRebecaCompleteParser.StatementExtensionContext ctx) {
    	if(ctx.PALT() != null) {
    		PAltStatement pas = new PAltStatement();
    		for(ProbabilisticTimedRebecaCompleteParser.PAltStatementGroupContext pasg : ctx.pAltStatementGroup()) {
    			pas.getPAltStatementGroups().add(pasg.pasg);
    		}
        	ctx.s = pas;
    	}
    }
    
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
    public void exitNondetExpression(ProbabilisticTimedRebecaCompleteParser.NondetExpressionContext ctx) {
    	if(ctx.COLON().size() == 0) {
        	NonDetExpression nde = new NonDetExpression();
        	for (ProbabilisticTimedRebecaCompleteParser.ExpressionContext ec : ctx.expression()) {
            	nde.getChoices().add(ec.e);
        		if(nde.getType() == null)
        			nde.setType(ec.e.getType());
        	}
        	nde.setCharacter(ctx.QUES().getSymbol().getCharPositionInLine());
        	nde.setLineNumber(ctx.QUES().getSymbol().getLine());
        	ctx.e = nde;
    	} else {
    		ProbabilisticExpression pe = new ProbabilisticExpression();
        	for (int cnt = 0; cnt < (ctx.expression().size() / 2); cnt++) {
        		ProbabilisticAlternativeValue pav = new ProbabilisticAlternativeValue();
        		pav.setProbability(ctx.expression(cnt * 2).e);
        		pav.setValue(ctx.expression((cnt * 2) + 1).e);
            	pe.getChoices().add(pav);
        		if(pe.getType() == null)
        			pe.setType(pav.getValue().getType());
        	}
        	pe.setCharacter(ctx.QUES().getSymbol().getCharPositionInLine());
        	pe.setLineNumber(ctx.QUES().getSymbol().getLine());
        	ctx.e = pe;
    	}
    }


    // Common Part
    
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
            if (ctx.expression() != null) {
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
        if(!ctx.DECIMAL_LITERAL().getText().equals("<missing INTLITERAL>")) {
            reactiveClassDeclaration.setQueueSize(Integer.parseInt(ctx.DECIMAL_LITERAL().getText()));
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
    @Override
    public void exitStatement(ProbabilisticTimedRebecaCompleteParser.StatementContext ctx) {
        if (ctx.statementExpression() != null) {
            ctx.s = ctx.statementExpression().expression().e;
        } else if (ctx.fieldDeclaration() != null) {
            ctx.s = ctx.fieldDeclaration().fd;
        } else if (ctx.block() != null) {
            ctx.s = ctx.block().bs;
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
        } else if (ctx.SEMI() != null) {
            ctx.s = new Statement();
        } else {
            throw new IllegalStateException("Unrecognized statement type");
        }
    }

    //
    // EXPRESSION PARSER
    //
    
	public boolean isTernaryExpression(ProbabilisticTimedRebecaCompleteParser.ExpressionContext ctx) {
		if (ctx.bop == null)
			return false;
		return ctx.bop.getText().equals("?");
	}

	public boolean isBinaryExpression(ProbabilisticTimedRebecaCompleteParser.ExpressionContext ctx) {
		if (ctx.bop == null)
			return false;
		return !ctx.bop.getText().equals("?") && !ctx.bop.getText().equals("instanceof");
	}

	public boolean isInstanceofExpression(ProbabilisticTimedRebecaCompleteParser.ExpressionContext ctx) {
		if (ctx.bop == null)
			return false;
		return ctx.bop.getText().equals("instanceof");
	}

	public boolean isUnaryExpression(ProbabilisticTimedRebecaCompleteParser.ExpressionContext ctx) {
		return ctx.prefix != null;
	}

	public boolean isPLUSUBExpression(ProbabilisticTimedRebecaCompleteParser.ExpressionContext ctx) {
		return ctx.postfix != null;
	}

	public boolean isCoreExpression(ProbabilisticTimedRebecaCompleteParser.ExpressionContext ctx) {
		return ctx.coreExpression() != null;
	}

	public boolean isNewInstance(ProbabilisticTimedRebecaCompleteParser.ExpressionContext ctx) {
		return ctx.NEW() != null;
	}

	@Override
	public void exitExpression(ProbabilisticTimedRebecaCompleteParser.ExpressionContext ctx) {
		if(isCoreExpression(ctx)) {
			ctx.e = ctx.coreExpression().e;
		} else if (isBinaryExpression(ctx)) {
			BinaryExpression be = new BinaryExpression();
			be.setOperator(ctx.bop.getText());
			be.setLeft(ctx.expression(0).e);
			be.setRight(ctx.expression(1).e);
			be.setCharacter(ctx.bop.getCharPositionInLine());
			be.setLineNumber(ctx.bop.getLine());
			ctx.e = be;
		} else if (isUnaryExpression(ctx)) {
			UnaryExpression ue = new UnaryExpression();
			ue.setExpression(ctx.expression(0).e);
			ue.setOperator(ctx.prefix.getText());
			ue.setCharacter(ctx.prefix.getCharPositionInLine());
			ue.setLineNumber(ctx.prefix.getLine());
			ctx.e = ue;
		} else if (isPLUSUBExpression(ctx)) {
			PlusSubExpression pse = new PlusSubExpression();
			pse.setValue(ctx.expression(0).e);
			pse.setOperator(ctx.postfix.getText());
			pse.setCharacter(ctx.postfix.getCharPositionInLine());
			pse.setLineNumber(ctx.postfix.getLine());
			ctx.e = pse;
		} else if (isInstanceofExpression(ctx)) {
			InstanceofExpression instanceofExpression = new InstanceofExpression();
			instanceofExpression.setValue(ctx.expression(0).e);
			instanceofExpression.setEvaluationType(ctx.type().t);
			instanceofExpression.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
			instanceofExpression.setLineNumber(ctx.expression(0).e.getLineNumber());
			instanceofExpression.setCharacter(ctx.expression(0).e.getCharacter());
			ctx.e = instanceofExpression;
		} else if (isTernaryExpression(ctx)) {
			TernaryExpression te = new TernaryExpression();
			te.setCondition(ctx.expression(0).e);
			te.setLeft(ctx.expression(1).e);
			te.setRight(ctx.expression(2).e);
			te.setCharacter(ctx.bop.getCharPositionInLine());
			te.setLineNumber(ctx.bop.getLine());
			ctx.e = te;
		} else if (isNewInstance(ctx)) {
			RebecInstantiationPrimary rip = new RebecInstantiationPrimary();
			OrdinaryPrimitiveType type = new OrdinaryPrimitiveType();
			type.setName(ctx.type().getText());
			rip.setType(type);
			if(ctx.knownrebecsList != null)
				rip.getBindings().addAll(ctx.knownrebecsList.el);
			if(ctx.constructorParams != null)
				rip.getArguments().addAll(ctx.constructorParams.el);
			rip.setCharacter(ctx.NEW().getSymbol().getCharPositionInLine());
			rip.setLineNumber(ctx.NEW().getSymbol().getLine());
			ctx.e = rip;
		}
	}

	public boolean isCastExpression(ProbabilisticTimedRebecaCompleteParser.CoreExpressionContext ctx) {
		return ctx.castType != null;
	}

	public boolean isNondet(ProbabilisticTimedRebecaCompleteParser.CoreExpressionContext ctx) {
		return ctx.nondetExpression() != null;
	}

	public boolean isPrimary(ProbabilisticTimedRebecaCompleteParser.CoreExpressionContext ctx) {
		return ctx.leftPrimary != null;
	}

	public boolean isLiteral(ProbabilisticTimedRebecaCompleteParser.CoreExpressionContext ctx) {
		return ctx.literal() != null;
	}

	public boolean isParenExp(ProbabilisticTimedRebecaCompleteParser.CoreExpressionContext ctx) {
		return ctx.castType == null && ctx.expression() != null;
	}

	@Override
	public void exitCoreExpression(ProbabilisticTimedRebecaCompleteParser.CoreExpressionContext ctx) {
		if (isPrimary(ctx)) {
			ctx.e = ctx.primary().get(0).tp;
		} else if (isParenExp(ctx)) {
			ctx.e = ctx.expression().e;
		} else if (isNondet(ctx)) {
			ctx.e = ctx.nondetExpression().e;
		} else if (isCastExpression(ctx)) {
			CastExpression ce = new CastExpression();
			ce.setExpression(ctx.coreExpression().e);
			ce.setType(ctx.type().t);
			ce.setCharacter(ctx.type().t.getCharacter());
			ce.setLineNumber(ctx.type().t.getLineNumber());
			ctx.e = ce;
		} else if (isLiteral(ctx)) {
			ctx.e = ctx.literal().l;
		}
		
		if(ctx.DOT().size() != 0) {
			List<ProbabilisticTimedRebecaCompleteParser.PrimaryContext> primaries = ctx.primary();
			int primaryCounter = isPrimary(ctx) ? 1 : 0;
			DotPrimary dp = new DotPrimary();
			dp.setLeft(ctx.e);
			dp.setRight(primaries.get(primaryCounter++).tp);
			dp.setCharacter(ctx.DOT(0).getSymbol().getCharPositionInLine());
			dp.setLineNumber(ctx.DOT(0).getSymbol().getLine());
			ctx.e = dp;
			for(int cnt = 1; cnt < ctx.DOT().size(); cnt++) {
				DotPrimary tempDP = new DotPrimary();
				tempDP.setLeft(dp.getRight());
				tempDP.setRight(primaries.get(primaryCounter++).tp);
				tempDP.setCharacter(ctx.DOT(cnt).getSymbol().getCharPositionInLine());
				tempDP.setLineNumber(ctx.DOT(cnt).getSymbol().getLine());
				dp.setRight(tempDP);
				dp = tempDP;
			}
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
		for (TerminalNode intLiteral : ctx.DECIMAL_LITERAL()) {
			dimensions.add(Integer.parseInt(intLiteral.getText()));
		}
		ctx.ds = dimensions;
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
		for (ProbabilisticTimedRebecaCompleteParser.AnnotationContext annotation : ctx.annotation()) {
			annotationList.add(annotation.an);
		}
		expr.getAnnotations().addAll(annotationList);
		ctx.e = expr;
	}

	@Override
	// TODO: different types of integer and float literals have to be considered
	public void exitLiteral(ProbabilisticTimedRebecaCompleteParser.LiteralContext ctx) {
		Literal literal = new Literal();

		if (ctx.integerLiteral() != null) {
			String value = ctx.integerLiteral().DECIMAL_LITERAL().getText();
			literal.setLiteralValue(value);
			literal.setType(CoreRebecaTypeSystem.INT_TYPE);
			try {
				Short.parseShort(value);
				literal.setType(CoreRebecaTypeSystem.SHORT_TYPE);
				Byte.parseByte(value);
				literal.setType(CoreRebecaTypeSystem.BYTE_TYPE);
			} catch (NumberFormatException nfe) {

			}
			literal.setLineNumber(ctx.integerLiteral().DECIMAL_LITERAL().getSymbol().getLine());
			literal.setCharacter(ctx.integerLiteral().DECIMAL_LITERAL().getSymbol().getCharPositionInLine());
		} else if (ctx.floatLiteral() != null) {
			literal.setLiteralValue(ctx.floatLiteral().getText());
			literal.setType(CoreRebecaTypeSystem.FLOAT_TYPE);
			literal.setLineNumber(ctx.floatLiteral().FLOAT_LITERAL().getSymbol().getLine());
			literal.setCharacter(ctx.floatLiteral().FLOAT_LITERAL().getSymbol().getCharPositionInLine());
		} else if (ctx.BOOL_LITERAL() != null) {
			literal.setLiteralValue(ctx.BOOL_LITERAL().getText());
			literal.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
			literal.setLineNumber(ctx.BOOL_LITERAL().getSymbol().getLine());
			literal.setCharacter(ctx.BOOL_LITERAL().getSymbol().getCharPositionInLine());
		} else if (ctx.CHAR_LITERAL() != null) {
			literal.setLiteralValue(ctx.CHAR_LITERAL().getText());
			literal.setType(CoreRebecaTypeSystem.CHAR_TYPE);
			literal.setLineNumber(ctx.CHAR_LITERAL().getSymbol().getLine());
			literal.setCharacter(ctx.CHAR_LITERAL().getSymbol().getCharPositionInLine());
		} else if (ctx.STRING_LITERAL() != null) {
			literal.setLiteralValue(ctx.STRING_LITERAL().getText());
			literal.setType(CoreRebecaTypeSystem.STRING_TYPE);
			literal.setLineNumber(ctx.STRING_LITERAL().getSymbol().getLine());
			literal.setCharacter(ctx.STRING_LITERAL().getSymbol().getCharPositionInLine());
		} else if (ctx.NULL_LITERAL() != null) {
			literal.setLiteralValue("null");
			literal.setType(CoreRebecaTypeSystem.NULL_TYPE);
			literal.setLineNumber(ctx.NULL_LITERAL().getSymbol().getLine());
			literal.setCharacter(ctx.NULL_LITERAL().getSymbol().getCharPositionInLine());
		}
		ctx.l = literal;
	}

	@Override
	public void exitArguments(ProbabilisticTimedRebecaCompleteParser.ArgumentsContext ctx) {
		if (ctx.expressionList() != null)
			ctx.args = ctx.expressionList().el;
		else
			ctx.args = new ArrayList<Expression>();
	}

}
