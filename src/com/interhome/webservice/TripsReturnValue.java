
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TripsReturnValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TripsReturnValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.interhome.com/webservice}ReturnValue">
 *       &lt;sequence>
 *         &lt;element name="Trips" type="{http://www.interhome.com/webservice}ArrayOfTripItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripsReturnValue", propOrder = {
    "trips"
})
public class TripsReturnValue
    extends ReturnValue
{

    @XmlElement(name = "Trips")
    protected ArrayOfTripItem trips;

    /**
     * Gets the value of the trips property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTripItem }
     *     
     */
    public ArrayOfTripItem getTrips() {
        return trips;
    }

    /**
     * Sets the value of the trips property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTripItem }
     *     
     */
    public void setTrips(ArrayOfTripItem value) {
        this.trips = value;
    }

}
