
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
 *         &lt;element name="TripsResult" type="{http://www.interhome.com/webservice}TripsReturnValue" minOccurs="0"/>
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
    "tripsResult"
})
@XmlRootElement(name = "TripsResponse")
public class TripsResponse {

    @XmlElement(name = "TripsResult")
    protected TripsReturnValue tripsResult;

    /**
     * Gets the value of the tripsResult property.
     * 
     * @return
     *     possible object is
     *     {@link TripsReturnValue }
     *     
     */
    public TripsReturnValue getTripsResult() {
        return tripsResult;
    }

    /**
     * Sets the value of the tripsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripsReturnValue }
     *     
     */
    public void setTripsResult(TripsReturnValue value) {
        this.tripsResult = value;
    }

}
