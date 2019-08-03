package org.rebecalang.compiler.modelcompiler.generator;

public class JaxBObjectCreator {

    public static void main(String[] args) throws Throwable {
        String[] arg = {
        		"-p", "org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel", 
        		"-d", "src/main/java", 
        		"src/main/resources/org/rebecalang/compiler/modelcompiler/objectmodel/corerebecaobjectmodel.xsd"};


//        String[] arg = {
//        		"-p", "org.rebecalang.compiler.modelcompiler.hybridrebeca.objectmodel", 
//        		"-d", "src/main/java", 
//        		"-b", "src/main/resources/org/rebecalang/compiler/modelcompiler/objectmodel/hybridrebecaobjectmodel-bindings.xml",
//        		"src/main/resources/org/rebecalang/compiler/modelcompiler/objectmodel/hybridrebecaobjectmodel.xsd"};
 
        
//        String[] arg = new String[]{
//        		"-p", "org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel", 
//        		"-d", "src/main/java",
//        		"-b", "src/main/resources/org/rebecalang/compiler/modelcompiler/objectmodel/timedrebecaexpressionobjectmodel-bindings.xml",
//        		"src/main/resources/org/rebecalang/compiler/modelcompiler/objectmodel/timedrebecaobjectmodel.xsd"};

//        String[] arg = new String[]{
//        		"-p", "org.rebecalang.compiler.modelcompiler.probabilisticrebeca.objectmodel", 
//        		"-d", "src/main/java",
//        		"-b", "src/main/resources/org/rebecalang/compiler/modelcompiler/objectmodel/probabilisticrebecaobjectmodel-bindings.xml",
//        		"src/main/resources/org/rebecalang/compiler/modelcompiler/objectmodel/probabilisticrebecaobjectmodel.xsd"};

//      String[] arg = new String[]{
//		"-p", "org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel", 
//		"-d", "src/main/java",
//		"src/main/resources/org/rebecalang/compiler/modelcompiler/objectmodel/corerebecaexpressionobjectmodel.xsd"};

    	com.sun.tools.xjc.XJCFacade.main(arg);
        
    }
}

