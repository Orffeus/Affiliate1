
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
 *         &lt;element name="CheckServerHealthV2Result" type="{http://www.interhome.com/webservice}CheckServerHealthResultV2"/>
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
    "checkServerHealthV2Result"
})
@XmlRootElement(name = "CheckServerHealthV2Response")
public class CheckServerHealthV2Response {

    @XmlElement(name = "CheckServerHealthV2Result", required = true)
    protected CheckServerHealthResultV2 checkServerHealthV2Result;

    /**
     * Gets the value of the checkServerHealthV2Result property.
     * 
     * @return
     *     possible object is
     *     {@link CheckServerHealthResultV2 }
     *     
     */
    public CheckServerHealthResultV2 getCheckServerHealthV2Result() {
        return checkServerHealthV2Result;
    }

    /**
     * Sets the value of the checkServerHealthV2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckServerHealthResultV2 }
     *     
     */
    public void setCheckServerHealthV2Result(CheckServerHealthResultV2 value) {
        this.checkServerHealthV2Result = value;
    }

}
