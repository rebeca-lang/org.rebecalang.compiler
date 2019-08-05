//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.05 at 11:10:51 AM IRDT 
//


package org.rebecalang.compiler.modelcompiler.hybridrebeca.objectmodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaCode;


/**
 * <p>Java class for HybridRebecaCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HybridRebecaCode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rebecalang.org/compiler/modelcompiler/corerebeca}RebecaCode">
 *       &lt;sequence>
 *         &lt;element name="physicalClassDeclaration" type="{http://rebecalang.org/compiler/modelcompiler/hybridrebeca}PhysicalClassDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HybridRebecaCode", propOrder = {
    "physicalClassDeclaration"
})
public class HybridRebecaCode
    extends RebecaCode
{

    protected List<PhysicalClassDeclaration> physicalClassDeclaration;

    /**
     * Gets the value of the physicalClassDeclaration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalClassDeclaration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalClassDeclaration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalClassDeclaration }
     * 
     * 
     */
    public List<PhysicalClassDeclaration> getPhysicalClassDeclaration() {
        if (physicalClassDeclaration == null) {
            physicalClassDeclaration = new ArrayList<PhysicalClassDeclaration>();
        }
        return this.physicalClassDeclaration;
    }

}
