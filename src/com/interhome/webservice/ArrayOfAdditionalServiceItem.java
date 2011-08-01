
package com.interhome.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdditionalServiceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdditionalServiceItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalServiceItem" type="{http://www.interhome.com/webservice}AdditionalServiceItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdditionalServiceItem", propOrder = {
    "additionalServiceItem"
})
public class ArrayOfAdditionalServiceItem {

    @XmlElement(name = "AdditionalServiceItem", nillable = true)
    protected List<AdditionalServiceItem> additionalServiceItem;

    /**
     * Gets the value of the additionalServiceItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalServiceItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalServiceItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalServiceItem }
     * 
     * 
     */
    public List<AdditionalServiceItem> getAdditionalServiceItem() {
        if (additionalServiceItem == null) {
            additionalServiceItem = new ArrayList<AdditionalServiceItem>();
        }
        return this.additionalServiceItem;
    }

}
