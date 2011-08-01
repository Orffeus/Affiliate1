
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
 *         &lt;element name="AvailabilityResult" type="{http://www.interhome.com/webservice}AvailabilityRetunValue" minOccurs="0"/>
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
    "availabilityResult"
})
@XmlRootElement(name = "AvailabilityResponse")
public class AvailabilityResponse {

    @XmlElement(name = "AvailabilityResult")
    protected AvailabilityRetunValue availabilityResult;

    /**
     * Gets the value of the availabilityResult property.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityRetunValue }
     *     
     */
    public AvailabilityRetunValue getAvailabilityResult() {
        return availabilityResult;
    }

    /**
     * Sets the value of the availabilityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityRetunValue }
     *     
     */
    public void setAvailabilityResult(AvailabilityRetunValue value) {
        this.availabilityResult = value;
    }

}
