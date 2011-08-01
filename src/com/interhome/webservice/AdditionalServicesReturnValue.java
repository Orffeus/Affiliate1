
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalServicesReturnValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalServicesReturnValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.interhome.com/webservice}ReturnValue">
 *       &lt;sequence>
 *         &lt;element name="AdditionalServices" type="{http://www.interhome.com/webservice}ArrayOfAdditionalServiceItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalServicesReturnValue", propOrder = {
    "additionalServices"
})
public class AdditionalServicesReturnValue
    extends ReturnValue
{

    @XmlElement(name = "AdditionalServices")
    protected ArrayOfAdditionalServiceItem additionalServices;

    /**
     * Gets the value of the additionalServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdditionalServiceItem }
     *     
     */
    public ArrayOfAdditionalServiceItem getAdditionalServices() {
        return additionalServices;
    }

    /**
     * Sets the value of the additionalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdditionalServiceItem }
     *     
     */
    public void setAdditionalServices(ArrayOfAdditionalServiceItem value) {
        this.additionalServices = value;
    }

}
