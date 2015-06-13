//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.05 at 11:34:57 AM IRDT 
//


package org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="fieldDeclaration" type="{http://rebecalang.org/compiler/modelcompiler/corerebeca}FieldDeclaration"/>
 *         &lt;element name="expressions" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Expression" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fieldDeclaration",
    "expressions"
})
@XmlRootElement(name = "ForInitializer")
public class ForInitializer {

    protected FieldDeclaration fieldDeclaration;
    protected List<Expression> expressions;

    /**
     * Gets the value of the fieldDeclaration property.
     * 
     * @return
     *     possible object is
     *     {@link FieldDeclaration }
     *     
     */
    public FieldDeclaration getFieldDeclaration() {
        return fieldDeclaration;
    }

    /**
     * Sets the value of the fieldDeclaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDeclaration }
     *     
     */
    public void setFieldDeclaration(FieldDeclaration value) {
        this.fieldDeclaration = value;
    }

    /**
     * Gets the value of the expressions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expressions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpressions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Expression }
     * 
     * 
     */
    public List<Expression> getExpressions() {
        if (expressions == null) {
            expressions = new ArrayList<Expression>();
        }
        return this.expressions;
    }

}
