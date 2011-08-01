
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
 *         &lt;element name="PaymentExtInformationResult" type="{http://www.interhome.com/webservice}PaymentInformationReturnValue" minOccurs="0"/>
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
    "paymentExtInformationResult"
})
@XmlRootElement(name = "PaymentExtInformationResponse")
public class PaymentExtInformationResponse {

    @XmlElement(name = "PaymentExtInformationResult")
    protected PaymentInformationReturnValue paymentExtInformationResult;

    /**
     * Gets the value of the paymentExtInformationResult property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInformationReturnValue }
     *     
     */
    public PaymentInformationReturnValue getPaymentExtInformationResult() {
        return paymentExtInformationResult;
    }

    /**
     * Sets the value of the paymentExtInformationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInformationReturnValue }
     *     
     */
    public void setPaymentExtInformationResult(PaymentInformationReturnValue value) {
        this.paymentExtInformationResult = value;
    }

}
