
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
 *         &lt;element name="ReadBookingResult" type="{http://www.interhome.com/webservice}ReadBookingReturnValue" minOccurs="0"/>
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
    "readBookingResult"
})
@XmlRootElement(name = "ReadBookingResponse")
public class ReadBookingResponse {

    @XmlElement(name = "ReadBookingResult")
    protected ReadBookingReturnValue readBookingResult;

    /**
     * Gets the value of the readBookingResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReadBookingReturnValue }
     *     
     */
    public ReadBookingReturnValue getReadBookingResult() {
        return readBookingResult;
    }

    /**
     * Sets the value of the readBookingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadBookingReturnValue }
     *     
     */
    public void setReadBookingResult(ReadBookingReturnValue value) {
        this.readBookingResult = value;
    }

}
