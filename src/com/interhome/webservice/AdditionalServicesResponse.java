
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
 *         &lt;element name="AdditionalServicesResult" type="{http://www.interhome.com/webservice}AdditionalServicesReturnValue" minOccurs="0"/>
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
    "additionalServicesResult"
})
@XmlRootElement(name = "AdditionalServicesResponse")
public class AdditionalServicesResponse {

    @XmlElement(name = "AdditionalServicesResult")
    protected AdditionalServicesReturnValue additionalServicesResult;

    /**
     * Gets the value of the additionalServicesResult property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalServicesReturnValue }
     *     
     */
    public AdditionalServicesReturnValue getAdditionalServicesResult() {
        return additionalServicesResult;
    }

    /**
     * Sets the value of the additionalServicesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalServicesReturnValue }
     *     
     */
    public void setAdditionalServicesResult(AdditionalServicesReturnValue value) {
        this.additionalServicesResult = value;
    }

}
