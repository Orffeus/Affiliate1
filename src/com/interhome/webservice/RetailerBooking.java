
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="inputValue" type="{http://www.interhome.com/webservice}RetailerBookingInputValue" minOccurs="0"/>
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
    "inputValue"
})
@XmlRootElement(name = "RetailerBooking")
public class RetailerBooking {

    protected RetailerBookingInputValue inputValue;

    /**
     * Gets the value of the inputValue property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerBookingInputValue }
     *     
     */
    public RetailerBookingInputValue getInputValue() {
        return inputValue;
    }

    /**
     * Sets the value of the inputValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerBookingInputValue }
     *     
     */
    public void setInputValue(RetailerBookingInputValue value) {
        this.inputValue = value;
    }

}
