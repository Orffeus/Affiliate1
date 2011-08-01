
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
 *         &lt;element name="CheckBookingResult" type="{http://www.interhome.com/webservice}CheckBookingReturnValue" minOccurs="0"/>
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
    "checkBookingResult"
})
@XmlRootElement(name = "CheckBookingResponse")
public class CheckBookingResponse {

    @XmlElement(name = "CheckBookingResult")
    protected CheckBookingReturnValue checkBookingResult;

    /**
     * Gets the value of the checkBookingResult property.
     * 
     * @return
     *     possible object is
     *     {@link CheckBookingReturnValue }
     *     
     */
    public CheckBookingReturnValue getCheckBookingResult() {
        return checkBookingResult;
    }

    /**
     * Sets the value of the checkBookingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckBookingReturnValue }
     *     
     */
    public void setCheckBookingResult(CheckBookingReturnValue value) {
        this.checkBookingResult = value;
    }

}
