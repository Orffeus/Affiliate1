
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
 *         &lt;element name="RetailerBookingResult" type="{http://www.interhome.com/webservice}RetailerBookingReturnValue" minOccurs="0"/>
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
    "retailerBookingResult"
})
@XmlRootElement(name = "RetailerBookingResponse")
public class RetailerBookingResponse {

    @XmlElement(name = "RetailerBookingResult")
    protected RetailerBookingReturnValue retailerBookingResult;

    /**
     * Gets the value of the retailerBookingResult property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerBookingReturnValue }
     *     
     */
    public RetailerBookingReturnValue getRetailerBookingResult() {
        return retailerBookingResult;
    }

    /**
     * Sets the value of the retailerBookingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerBookingReturnValue }
     *     
     */
    public void setRetailerBookingResult(RetailerBookingReturnValue value) {
        this.retailerBookingResult = value;
    }

}
