
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationConditionReturnValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancellationConditionReturnValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.interhome.com/webservice}ReturnValue">
 *       &lt;sequence>
 *         &lt;element name="CancellationConditions" type="{http://www.interhome.com/webservice}ArrayOfCancellationConditionItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationConditionReturnValue", propOrder = {
    "cancellationConditions"
})
public class CancellationConditionReturnValue
    extends ReturnValue
{

    @XmlElement(name = "CancellationConditions")
    protected ArrayOfCancellationConditionItem cancellationConditions;

    /**
     * Gets the value of the cancellationConditions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCancellationConditionItem }
     *     
     */
    public ArrayOfCancellationConditionItem getCancellationConditions() {
        return cancellationConditions;
    }

    /**
     * Sets the value of the cancellationConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCancellationConditionItem }
     *     
     */
    public void setCancellationConditions(ArrayOfCancellationConditionItem value) {
        this.cancellationConditions = value;
    }

}
