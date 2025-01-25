package org.rebecalang.compiler.propertycompiler.generalrebeca;

import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BinaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.InstanceofExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TernaryExpression;
import org.rebecalang.compiler.propertycompiler.corerebeca.compiler.CoreRebecaPropertyCompleteBaseListener;
import org.rebecalang.compiler.propertycompiler.corerebeca.compiler.CoreRebecaPropertyCompleteParser;
import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.Definition;
import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.PropertyModel;

public class GeneralRebecaPropertyListener extends CoreRebecaPropertyCompleteBaseListener {

    @Override
    public void exitExpression(CoreRebecaPropertyCompleteParser.ExpressionContext ctx) {
        if (ctx.coreExpression() != null) {
            ctx.e = ctx.coreExpression().e;
        } else if (ctx.unaryExpression() != null) {
            ctx.e = ctx.unaryExpression().e;
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
            } else if (ctx.THEN() != null) {
                binaryExpression.setOperator(ctx.THEN().getText());
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
    public void exitPropertyModel(CoreRebecaPropertyCompleteParser.PropertyModelContext ctx) {
        PropertyModel propertyModel = new PropertyModel();

        if (ctx.DEFINE() != null) {
            for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
                Definition definition = new Definition();
                definition.setName(ctx.IDENTIFIER(i).getText());
                definition.setExpression(ctx.expression(i).e);
                propertyModel.getDefinitions().add(definition);
            }
        }
        ctx.pm = (org.rebecalang.compiler.propertycompiler.corerebeca.objectmodel.PropertyModel) propertyModel;
    }
}
