
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element name="PriceListResult" type="{http://www.interhome.com/webservice}PriceListReturnValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "priceListResult"
})
@XmlRootElement(name = "PriceListResponse")
public class PriceListResponse {

    @XmlElement(name = "PriceListResult")
    protected PriceListReturnValue priceListResult;

    /**
     * Gets the value of the priceListResult property.
     * 
     * @return
     *     possible object is
     *     {@link PriceListReturnValue }
     *     
     */
    public PriceListReturnValue getPriceListResult() {
        return priceListResult;
    }

    /**
     * Sets the value of the priceListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceListReturnValue }
     *     
     */
    public void setPriceListResult(PriceListReturnValue value) {
        this.priceListResult = value;
    }

}
