
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
 *         &lt;element name="CancellationConditionsResult" type="{http://www.interhome.com/webservice}CancellationConditionReturnValue" minOccurs="0"/>
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
    "cancellationConditionsResult"
})
@XmlRootElement(name = "CancellationConditionsResponse")
public class CancellationConditionsResponse {

    @XmlElement(name = "CancellationConditionsResult")
    protected CancellationConditionReturnValue cancellationConditionsResult;

    /**
     * Gets the value of the cancellationConditionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationConditionReturnValue }
     *     
     */
    public CancellationConditionReturnValue getCancellationConditionsResult() {
        return cancellationConditionsResult;
    }

    /**
     * Sets the value of the cancellationConditionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationConditionReturnValue }
     *     
     */
    public void setCancellationConditionsResult(CancellationConditionReturnValue value) {
        this.cancellationConditionsResult = value;
    }

}
