
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
 *         &lt;element name="CancelBookingResult" type="{http://www.interhome.com/webservice}CancelBookingReturnValue" minOccurs="0"/>
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
    "cancelBookingResult"
})
@XmlRootElement(name = "CancelBookingResponse")
public class CancelBookingResponse {

    @XmlElement(name = "CancelBookingResult")
    protected CancelBookingReturnValue cancelBookingResult;

    /**
     * Gets the value of the cancelBookingResult property.
     * 
     * @return
     *     possible object is
     *     {@link CancelBookingReturnValue }
     *     
     */
    public CancelBookingReturnValue getCancelBookingResult() {
        return cancelBookingResult;
    }

    /**
     * Sets the value of the cancelBookingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelBookingReturnValue }
     *     
     */
    public void setCancelBookingResult(CancelBookingReturnValue value) {
        this.cancelBookingResult = value;
    }

}
