
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="inputValue" type="{http://www.interhome.com/webservice}PriceDetailInputValue" minOccurs="0"/>
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
    "inputValue"
})
@XmlRootElement(name = "PriceDetail")
public class PriceDetail {

    protected PriceDetailInputValue inputValue;

    /**
     * Gets the value of the inputValue property.
     * 
     * @return
     *     possible object is
     *     {@link PriceDetailInputValue }
     *     
     */
    public PriceDetailInputValue getInputValue() {
        return inputValue;
    }

    /**
     * Sets the value of the inputValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDetailInputValue }
     *     
     */
    public void setInputValue(PriceDetailInputValue value) {
        this.inputValue = value;
    }

}
