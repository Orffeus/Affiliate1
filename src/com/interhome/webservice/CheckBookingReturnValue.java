
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckBookingReturnValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckBookingReturnValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.interhome.com/webservice}ReturnValue">
 *       &lt;sequence>
 *         &lt;element name="CheckBookingItems" type="{http://www.interhome.com/webservice}ArrayOfCheckBookingItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckBookingReturnValue", propOrder = {
    "checkBookingItems"
})
public class CheckBookingReturnValue
    extends ReturnValue
{

    @XmlElement(name = "CheckBookingItems")
    protected ArrayOfCheckBookingItem checkBookingItems;

    /**
     * Gets the value of the checkBookingItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCheckBookingItem }
     *     
     */
    public ArrayOfCheckBookingItem getCheckBookingItems() {
        return checkBookingItems;
    }

    /**
     * Sets the value of the checkBookingItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCheckBookingItem }
     *     
     */
    public void setCheckBookingItems(ArrayOfCheckBookingItem value) {
        this.checkBookingItems = value;
    }

}
