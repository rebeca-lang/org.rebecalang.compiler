package org.rebecalang.compiler.modelcompiler;

import java.util.List;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.MainRebecDefinition;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;

public class ObjectModelUtils {

	public static List<MainRebecDefinition> getMainRebecDefinition(RebecaModel rebecaModel) {
		return rebecaModel
				.getRebecaCode().getMainDeclaration().getMainRebecDefinition();
	}
}
