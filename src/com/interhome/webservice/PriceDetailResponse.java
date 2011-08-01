
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
 *         &lt;element name="PriceDetailResult" type="{http://www.interhome.com/webservice}PriceDetailRetunValue" minOccurs="0"/>
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
    "priceDetailResult"
})
@XmlRootElement(name = "PriceDetailResponse")
public class PriceDetailResponse {

    @XmlElement(name = "PriceDetailResult")
    protected PriceDetailRetunValue priceDetailResult;

    /**
     * Gets the value of the priceDetailResult property.
     * 
     * @return
     *     possible object is
     *     {@link PriceDetailRetunValue }
     *     
     */
    public PriceDetailRetunValue getPriceDetailResult() {
        return priceDetailResult;
    }

    /**
     * Sets the value of the priceDetailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDetailRetunValue }
     *     
     */
    public void setPriceDetailResult(PriceDetailRetunValue value) {
        this.priceDetailResult = value;
    }

}
