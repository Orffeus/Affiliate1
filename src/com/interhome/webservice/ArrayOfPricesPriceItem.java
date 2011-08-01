
package com.interhome.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPricesPriceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPricesPriceItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PricesPriceItem" type="{http://www.interhome.com/webservice}PricesPriceItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPricesPriceItem", propOrder = {
    "pricesPriceItem"
})
public class ArrayOfPricesPriceItem {

    @XmlElement(name = "PricesPriceItem", nillable = true)
    protected List<PricesPriceItem> pricesPriceItem;

    /**
     * Gets the value of the pricesPriceItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricesPriceItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricesPriceItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricesPriceItem }
     * 
     * 
     */
    public List<PricesPriceItem> getPricesPriceItem() {
        if (pricesPriceItem == null) {
            pricesPriceItem = new ArrayList<PricesPriceItem>();
        }
        return this.pricesPriceItem;
    }

}
