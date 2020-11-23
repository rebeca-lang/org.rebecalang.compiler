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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModeDeclaration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModeDeclaration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invariantDeclaration" type="{http://rebecalang.org/compiler/modelcompiler/hybridrebeca}InvariantDeclaration"/>
 *         &lt;element name="guardDeclaration" type="{http://rebecalang.org/compiler/modelcompiler/hybridrebeca}GuardDeclaration"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="character" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModeDeclaration", propOrder = {
    "invariantDeclaration",
    "guardDeclaration"
})
public class ModeDeclaration {

    @XmlElement(required = true)
    protected InvariantDeclaration invariantDeclaration;
    @XmlElement(required = true)
    protected GuardDeclaration guardDeclaration;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "lineNumber")
    protected Integer lineNumber;
    @XmlAttribute(name = "character")
    protected Integer character;

    /**
     * Gets the value of the invariantDeclaration property.
     * 
     * @return
     *     possible object is
     *     {@link InvariantDeclaration }
     *     
     */
    public InvariantDeclaration getInvariantDeclaration() {
        return invariantDeclaration;
    }

    /**
     * Sets the value of the invariantDeclaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvariantDeclaration }
     *     
     */
    public void setInvariantDeclaration(InvariantDeclaration value) {
        this.invariantDeclaration = value;
    }

    /**
     * Gets the value of the guardDeclaration property.
     * 
     * @return
     *     possible object is
     *     {@link GuardDeclaration }
     *     
     */
    public GuardDeclaration getGuardDeclaration() {
        return guardDeclaration;
    }

    /**
     * Sets the value of the guardDeclaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuardDeclaration }
     *     
     */
    public void setGuardDeclaration(GuardDeclaration value) {
        this.guardDeclaration = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineNumber(Integer value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the character property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCharacter() {
        return character;
    }

    /**
     * Sets the value of the character property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCharacter(Integer value) {
        this.character = value;
    }

}
