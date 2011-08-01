
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
 *         &lt;element name="NearestBookingDateResult" type="{http://www.interhome.com/webservice}NearestBookingDateReturnValue" minOccurs="0"/>
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
    "nearestBookingDateResult"
})
@XmlRootElement(name = "NearestBookingDateResponse")
public class NearestBookingDateResponse {

    @XmlElement(name = "NearestBookingDateResult")
    protected NearestBookingDateReturnValue nearestBookingDateResult;

    /**
     * Gets the value of the nearestBookingDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link NearestBookingDateReturnValue }
     *     
     */
    public NearestBookingDateReturnValue getNearestBookingDateResult() {
        return nearestBookingDateResult;
    }

    /**
     * Sets the value of the nearestBookingDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NearestBookingDateReturnValue }
     *     
     */
    public void setNearestBookingDateResult(NearestBookingDateReturnValue value) {
        this.nearestBookingDateResult = value;
    }

}
