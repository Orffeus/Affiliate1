
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
 *         &lt;element name="AffiliateDetailResult" type="{http://www.interhome.com/webservice}AffiliateDetailReturnValue" minOccurs="0"/>
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
    "affiliateDetailResult"
})
@XmlRootElement(name = "AffiliateDetailResponse")
public class AffiliateDetailResponse {

    @XmlElement(name = "AffiliateDetailResult")
    protected AffiliateDetailReturnValue affiliateDetailResult;

    /**
     * Gets the value of the affiliateDetailResult property.
     * 
     * @return
     *     possible object is
     *     {@link AffiliateDetailReturnValue }
     *     
     */
    public AffiliateDetailReturnValue getAffiliateDetailResult() {
        return affiliateDetailResult;
    }

    /**
     * Sets the value of the affiliateDetailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffiliateDetailReturnValue }
     *     
     */
    public void setAffiliateDetailResult(AffiliateDetailReturnValue value) {
        this.affiliateDetailResult = value;
    }

}
