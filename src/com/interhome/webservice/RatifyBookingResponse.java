
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
 *         &lt;element name="RatifyBookingResult" type="{http://www.interhome.com/webservice}RatifyBookingReturnValue" minOccurs="0"/>
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
    "ratifyBookingResult"
})
@XmlRootElement(name = "RatifyBookingResponse")
public class RatifyBookingResponse {

    @XmlElement(name = "RatifyBookingResult")
    protected RatifyBookingReturnValue ratifyBookingResult;

    /**
     * Gets the value of the ratifyBookingResult property.
     * 
     * @return
     *     possible object is
     *     {@link RatifyBookingReturnValue }
     *     
     */
    public RatifyBookingReturnValue getRatifyBookingResult() {
        return ratifyBookingResult;
    }

    /**
     * Sets the value of the ratifyBookingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatifyBookingReturnValue }
     *     
     */
    public void setRatifyBookingResult(RatifyBookingReturnValue value) {
        this.ratifyBookingResult = value;
    }

}
