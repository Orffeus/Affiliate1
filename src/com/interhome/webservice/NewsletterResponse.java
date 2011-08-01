
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
 *         &lt;element name="NewsletterResult" type="{http://www.interhome.com/webservice}NewsletterReturnValue" minOccurs="0"/>
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
    "newsletterResult"
})
@XmlRootElement(name = "NewsletterResponse")
public class NewsletterResponse {

    @XmlElement(name = "NewsletterResult")
    protected NewsletterReturnValue newsletterResult;

    /**
     * Gets the value of the newsletterResult property.
     * 
     * @return
     *     possible object is
     *     {@link NewsletterReturnValue }
     *     
     */
    public NewsletterReturnValue getNewsletterResult() {
        return newsletterResult;
    }

    /**
     * Sets the value of the newsletterResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewsletterReturnValue }
     *     
     */
    public void setNewsletterResult(NewsletterReturnValue value) {
        this.newsletterResult = value;
    }

}
