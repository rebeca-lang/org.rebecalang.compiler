//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.07 at 11:39:17 AM IRST 
//


package org.rebecalang.compiler.modelcompiler.hybridrebeca.objectmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;


/**
 * <p>Java class for HybridTermPrimary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HybridTermPrimary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}TermPrimary">
 *       &lt;attribute name="derivativeOrder" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HybridTermPrimary")
public class HybridTermPrimary
    extends TermPrimary
{

    @XmlAttribute(name = "derivativeOrder")
    protected Integer derivativeOrder;

    /**
     * Gets the value of the derivativeOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDerivativeOrder() {
        if (derivativeOrder == null) {
            return  0;
        } else {
            return derivativeOrder;
        }
    }

    /**
     * Sets the value of the derivativeOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDerivativeOrder(Integer value) {
        this.derivativeOrder = value;
    }

}
