package org.rebecalang.compiler.propertycompiler.generator;

public class JaxBObjectModelGenerator {
	public static void main(String[] args) throws Throwable {
//		String[] arg = {
//				"-p", "org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel",
//				"-d", "src/main/java",
//				"-b", "src/main/resources/org/rebecalang/compiler/propertycompiler/objectmodel/generalpropertyobjectmodel-bindings.xml", 
//				"src/main/resources/org/rebecalang/compiler/propertycompiler/objectmodel/generalpropertyobjectmodel.xsd" };
//		String[] arg = {
//				"-p", "org.rebecalang.compiler.propertycompiler.corerebeca.objectmodel",
//				"-d", "src/main/java",
//				"-b", "src/main/resources/org/rebecalang/compiler/propertycompiler/objectmodel/corerebecapropertyobjectmodel-bindings.xml", 
//				"src/main/resources/org/rebecalang/compiler/propertycompiler/objectmodel/corerebecapropertyobjectmodel.xsd" };
		String[] arg = {
				"-p", "org.rebecalang.compiler.propertycompiler.timedrebeca.objectmodel",
				"-d", "src/main/java",
				"-b", "src/main/resources/org/rebecalang/compiler/propertycompiler/objectmodel/timedrebecapropertyobjectmodel-bindings.xml", 
				"src/main/resources/org/rebecalang/compiler/propertycompiler/objectmodel/timedrebecapropertyobjectmodel.xsd" };
		com.sun.tools.xjc.XJCFacade.main(arg);

	}

}
