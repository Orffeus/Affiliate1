
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
 *         &lt;element name="ClientBookingResult" type="{http://www.interhome.com/webservice}ClientBookingReturnValue" minOccurs="0"/>
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
    "clientBookingResult"
})
@XmlRootElement(name = "ClientBookingResponse")
public class ClientBookingResponse {

    @XmlElement(name = "ClientBookingResult")
    protected ClientBookingReturnValue clientBookingResult;

    /**
     * Gets the value of the clientBookingResult property.
     * 
     * @return
     *     possible object is
     *     {@link ClientBookingReturnValue }
     *     
     */
    public ClientBookingReturnValue getClientBookingResult() {
        return clientBookingResult;
    }

    /**
     * Sets the value of the clientBookingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientBookingReturnValue }
     *     
     */
    public void setClientBookingResult(ClientBookingReturnValue value) {
        this.clientBookingResult = value;
    }

}
