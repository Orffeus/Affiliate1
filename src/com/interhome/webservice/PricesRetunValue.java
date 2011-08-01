
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PricesRetunValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricesRetunValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.interhome.com/webservice}ReturnValue">
 *       &lt;sequence>
 *         &lt;element name="Prices" type="{http://www.interhome.com/webservice}ArrayOfPricesPriceItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricesRetunValue", propOrder = {
    "prices"
})
public class PricesRetunValue
    extends ReturnValue
{

    @XmlElement(name = "Prices")
    protected ArrayOfPricesPriceItem prices;

    /**
     * Gets the value of the prices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPricesPriceItem }
     *     
     */
    public ArrayOfPricesPriceItem getPrices() {
        return prices;
    }

    /**
     * Sets the value of the prices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPricesPriceItem }
     *     
     */
    public void setPrices(ArrayOfPricesPriceItem value) {
        this.prices = value;
    }

}
