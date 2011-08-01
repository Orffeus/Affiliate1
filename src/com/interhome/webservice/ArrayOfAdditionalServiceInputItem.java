
package com.interhome.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdditionalServiceInputItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdditionalServiceInputItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalServiceInputItem" type="{http://www.interhome.com/webservice}AdditionalServiceInputItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdditionalServiceInputItem", propOrder = {
    "additionalServiceInputItem"
})
public class ArrayOfAdditionalServiceInputItem {

    @XmlElement(name = "AdditionalServiceInputItem", nillable = true)
    protected List<AdditionalServiceInputItem> additionalServiceInputItem;

    /**
     * Gets the value of the additionalServiceInputItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalServiceInputItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalServiceInputItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalServiceInputItem }
     * 
     * 
     */
    public List<AdditionalServiceInputItem> getAdditionalServiceInputItem() {
        if (additionalServiceInputItem == null) {
            additionalServiceInputItem = new ArrayList<AdditionalServiceInputItem>();
        }
        return this.additionalServiceInputItem;
    }

}
