//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.21 at 03:19:34 PM IRDT 
//


package org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RebecaCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RebecaCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://rebecalang.org/compiler/modelcompiler/corerebeca}RecordDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="globalVariables" type="{http://rebecalang.org/compiler/modelcompiler/corerebeca}FieldDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="environmentVariables" type="{http://rebecalang.org/compiler/modelcompiler/corerebeca}FieldDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reactiveClassDeclaration" type="{http://rebecalang.org/compiler/modelcompiler/corerebeca}ReactiveClassDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="interfaceDeclaration" type="{http://rebecalang.org/compiler/modelcompiler/corerebeca}InterfaceDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://rebecalang.org/compiler/modelcompiler/corerebeca}MainDeclaration"/>
 *       &lt;/sequence>
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
@XmlType(name = "RebecaCode", propOrder = {
    "recordDeclaration",
    "globalVariables",
    "environmentVariables",
    "reactiveClassDeclaration",
    "interfaceDeclaration",
    "mainDeclaration"
})
public class RebecaCode {

    @XmlElement(name = "RecordDeclaration")
    protected List<RecordDeclaration> recordDeclaration;
    protected List<FieldDeclaration> globalVariables;
    protected List<FieldDeclaration> environmentVariables;
    protected List<ReactiveClassDeclaration> reactiveClassDeclaration;
    protected List<InterfaceDeclaration> interfaceDeclaration;
    @XmlElement(name = "MainDeclaration", required = true)
    protected MainDeclaration mainDeclaration;
    @XmlAttribute(name = "lineNumber")
    protected Integer lineNumber;
    @XmlAttribute(name = "character")
    protected Integer character;

    /**
     * Gets the value of the recordDeclaration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordDeclaration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordDeclaration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordDeclaration }
     * 
     * 
     */
    public List<RecordDeclaration> getRecordDeclaration() {
        if (recordDeclaration == null) {
            recordDeclaration = new ArrayList<RecordDeclaration>();
        }
        return this.recordDeclaration;
    }

    /**
     * Gets the value of the globalVariables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalVariables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldDeclaration }
     * 
     * 
     */
    public List<FieldDeclaration> getGlobalVariables() {
        if (globalVariables == null) {
            globalVariables = new ArrayList<FieldDeclaration>();
        }
        return this.globalVariables;
    }

    /**
     * Gets the value of the environmentVariables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environmentVariables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironmentVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldDeclaration }
     * 
     * 
     */
    public List<FieldDeclaration> getEnvironmentVariables() {
        if (environmentVariables == null) {
            environmentVariables = new ArrayList<FieldDeclaration>();
        }
        return this.environmentVariables;
    }

    /**
     * Gets the value of the reactiveClassDeclaration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reactiveClassDeclaration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReactiveClassDeclaration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReactiveClassDeclaration }
     * 
     * 
     */
    public List<ReactiveClassDeclaration> getReactiveClassDeclaration() {
        if (reactiveClassDeclaration == null) {
            reactiveClassDeclaration = new ArrayList<ReactiveClassDeclaration>();
        }
        return this.reactiveClassDeclaration;
    }

    /**
     * Gets the value of the interfaceDeclaration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interfaceDeclaration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterfaceDeclaration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterfaceDeclaration }
     * 
     * 
     */
    public List<InterfaceDeclaration> getInterfaceDeclaration() {
        if (interfaceDeclaration == null) {
            interfaceDeclaration = new ArrayList<InterfaceDeclaration>();
        }
        return this.interfaceDeclaration;
    }

    /**
     * Gets the value of the mainDeclaration property.
     * 
     * @return
     *     possible object is
     *     {@link MainDeclaration }
     *     
     */
    public MainDeclaration getMainDeclaration() {
        return mainDeclaration;
    }

    /**
     * Sets the value of the mainDeclaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link MainDeclaration }
     *     
     */
    public void setMainDeclaration(MainDeclaration value) {
        this.mainDeclaration = value;
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
