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
 * <p>Java class for ReactiveClassDeclaration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReactiveClassDeclaration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rebecalang.org/compiler/modelcompiler/corerebeca}BaseClassDeclaration">
 *       &lt;sequence>
 *         &lt;element name="knownRebecs" type="{http://rebecalang.org/compiler/modelcompiler/corerebeca}FieldDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="statevars" type="{http://rebecalang.org/compiler/modelcompiler/corerebeca}FieldDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="constructors" type="{http://rebecalang.org/compiler/modelcompiler/corerebeca}ConstructorDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extends" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Type" minOccurs="0"/>
 *         &lt;element name="implements" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="queueSize" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="abstract" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReactiveClassDeclaration", propOrder = {
    "knownRebecs",
    "statevars",
    "constructors",
    "_extends",
    "_implements"
})
public class ReactiveClassDeclaration
    extends BaseClassDeclaration
{

    protected List<FieldDeclaration> knownRebecs;
    protected List<FieldDeclaration> statevars;
    protected List<ConstructorDeclaration> constructors;
    @XmlElement(name = "extends")
    protected Type _extends;
    @XmlElement(name = "implements")
    protected List<Type> _implements;
    @XmlAttribute(name = "queueSize")
    protected Integer queueSize;
    @XmlAttribute(name = "abstract")
    protected Boolean _abstract;

    /**
     * Gets the value of the knownRebecs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the knownRebecs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKnownRebecs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldDeclaration }
     * 
     * 
     */
    public List<FieldDeclaration> getKnownRebecs() {
        if (knownRebecs == null) {
            knownRebecs = new ArrayList<FieldDeclaration>();
        }
        return this.knownRebecs;
    }

    /**
     * Gets the value of the statevars property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statevars property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatevars().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldDeclaration }
     * 
     * 
     */
    public List<FieldDeclaration> getStatevars() {
        if (statevars == null) {
            statevars = new ArrayList<FieldDeclaration>();
        }
        return this.statevars;
    }

    /**
     * Gets the value of the constructors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constructors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstructors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstructorDeclaration }
     * 
     * 
     */
    public List<ConstructorDeclaration> getConstructors() {
        if (constructors == null) {
            constructors = new ArrayList<ConstructorDeclaration>();
        }
        return this.constructors;
    }

    /**
     * Gets the value of the extends property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getExtends() {
        return _extends;
    }

    /**
     * Sets the value of the extends property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setExtends(Type value) {
        this._extends = value;
    }

    /**
     * Gets the value of the implements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the implements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImplements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Type }
     * 
     * 
     */
    public List<Type> getImplements() {
        if (_implements == null) {
            _implements = new ArrayList<Type>();
        }
        return this._implements;
    }

    /**
     * Gets the value of the queueSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQueueSize() {
        return queueSize;
    }

    /**
     * Sets the value of the queueSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQueueSize(Integer value) {
        this.queueSize = value;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAbstract() {
        if (_abstract == null) {
            return false;
        } else {
            return _abstract;
        }
    }

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAbstract(Boolean value) {
        this._abstract = value;
    }

}
