
package com.interhome.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStayItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStayItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StayItem" type="{http://www.interhome.com/webservice}StayItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStayItem", propOrder = {
    "stayItem"
})
public class ArrayOfStayItem {

    @XmlElement(name = "StayItem", nillable = true)
    protected List<StayItem> stayItem;

    /**
     * Gets the value of the stayItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stayItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStayItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StayItem }
     * 
     * 
     */
    public List<StayItem> getStayItem() {
        if (stayItem == null) {
            stayItem = new ArrayList<StayItem>();
        }
        return this.stayItem;
    }

}
