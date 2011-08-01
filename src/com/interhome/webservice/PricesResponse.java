
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
 *         &lt;element name="PricesResult" type="{http://www.interhome.com/webservice}PricesRetunValue" minOccurs="0"/>
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
    "pricesResult"
})
@XmlRootElement(name = "PricesResponse")
public class PricesResponse {

    @XmlElement(name = "PricesResult")
    protected PricesRetunValue pricesResult;

    /**
     * Gets the value of the pricesResult property.
     * 
     * @return
     *     possible object is
     *     {@link PricesRetunValue }
     *     
     */
    public PricesRetunValue getPricesResult() {
        return pricesResult;
    }

    /**
     * Sets the value of the pricesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricesRetunValue }
     *     
     */
    public void setPricesResult(PricesRetunValue value) {
        this.pricesResult = value;
    }

}
