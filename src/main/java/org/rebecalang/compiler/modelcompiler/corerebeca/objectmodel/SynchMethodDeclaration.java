//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.05 at 02:06:01 PM IRST 
//


package org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SynchMethodDeclaration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SynchMethodDeclaration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rebecalang.org/compiler/modelcompiler/corerebeca}MethodDeclaration">
 *       &lt;sequence>
 *         &lt;element name="returnType" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SynchMethodDeclaration", propOrder = {
    "returnType"
})
public class SynchMethodDeclaration
    extends MethodDeclaration
{

    @XmlElement(required = true)
    protected Type returnType;

    /**
     * Gets the value of the returnType property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getReturnType() {
        return returnType;
    }

    /**
     * Sets the value of the returnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setReturnType(Type value) {
        this.returnType = value;
    }

}
