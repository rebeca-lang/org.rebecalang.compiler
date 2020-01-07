package org.rebecalang.compiler.modelcompiler.hybridrebeca;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.objectmodel.HybridTermPrimary;

public class HybridrebecaUtils {
	public static HybridTermPrimary transformTermPrimaryToHybridTermPrimary(TermPrimary termPrimary) {
		HybridTermPrimary hybridTermPrimary = new HybridTermPrimary();
		hybridTermPrimary.setCharacter(termPrimary.getCharacter());
		hybridTermPrimary.setLabel(termPrimary.getLabel());
		hybridTermPrimary.setLineNumber(termPrimary.getLineNumber());
		hybridTermPrimary.setName(termPrimary.getName());
		hybridTermPrimary.setParentSuffixPrimary(termPrimary.getParentSuffixPrimary());
		hybridTermPrimary.setType(termPrimary.getType());
		hybridTermPrimary.getIndices().addAll(termPrimary.getIndices());
		hybridTermPrimary.getAnnotations().addAll(termPrimary.getAnnotations());
		return hybridTermPrimary;
	}
}
