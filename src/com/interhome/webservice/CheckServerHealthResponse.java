
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
 *         &lt;element name="CheckServerHealthResult" type="{http://www.interhome.com/webservice}CheckServerHealthResult"/>
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
    "checkServerHealthResult"
})
@XmlRootElement(name = "CheckServerHealthResponse")
public class CheckServerHealthResponse {

    @XmlElement(name = "CheckServerHealthResult", required = true)
    protected CheckServerHealthResult checkServerHealthResult;

    /**
     * Gets the value of the checkServerHealthResult property.
     * 
     * @return
     *     possible object is
     *     {@link CheckServerHealthResult }
     *     
     */
    public CheckServerHealthResult getCheckServerHealthResult() {
        return checkServerHealthResult;
    }

    /**
     * Sets the value of the checkServerHealthResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckServerHealthResult }
     *     
     */
    public void setCheckServerHealthResult(CheckServerHealthResult value) {
        this.checkServerHealthResult = value;
    }

}
