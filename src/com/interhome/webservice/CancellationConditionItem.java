
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationConditionItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancellationConditionItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DaysBeforeDeparte" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Percentage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationConditionItem", propOrder = {
    "daysBeforeDeparte",
    "percentage"
})
public class CancellationConditionItem {

    @XmlElement(name = "DaysBeforeDeparte")
    protected int daysBeforeDeparte;
    @XmlElement(name = "Percentage")
    protected int percentage;

    /**
     * Gets the value of the daysBeforeDeparte property.
     * 
     */
    public int getDaysBeforeDeparte() {
        return daysBeforeDeparte;
    }

    /**
     * Sets the value of the daysBeforeDeparte property.
     * 
     */
    public void setDaysBeforeDeparte(int value) {
        this.daysBeforeDeparte = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     */
    public int getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     */
    public void setPercentage(int value) {
        this.percentage = value;
    }

}
