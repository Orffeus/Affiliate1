
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckServerHealthResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckServerHealthResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchObjects" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Availability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceCheck" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServerDBLoadBalancer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OverallServerHealth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Messages" type="{http://www.interhome.com/webservice}Messages"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckServerHealthResult", propOrder = {
    "searchObjects",
    "availability",
    "priceCheck",
    "serverDBLoadBalancer",
    "overallServerHealth",
    "messages"
})
public class CheckServerHealthResult {

    @XmlElement(name = "SearchObjects")
    protected String searchObjects;
    @XmlElement(name = "Availability")
    protected String availability;
    @XmlElement(name = "PriceCheck")
    protected String priceCheck;
    @XmlElement(name = "ServerDBLoadBalancer")
    protected String serverDBLoadBalancer;
    @XmlElement(name = "OverallServerHealth")
    protected String overallServerHealth;
    @XmlElement(name = "Messages", required = true)
    protected Messages messages;

    /**
     * Gets the value of the searchObjects property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchObjects() {
        return searchObjects;
    }

    /**
     * Sets the value of the searchObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchObjects(String value) {
        this.searchObjects = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailability(String value) {
        this.availability = value;
    }

    /**
     * Gets the value of the priceCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceCheck() {
        return priceCheck;
    }

    /**
     * Sets the value of the priceCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceCheck(String value) {
        this.priceCheck = value;
    }

    /**
     * Gets the value of the serverDBLoadBalancer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerDBLoadBalancer() {
        return serverDBLoadBalancer;
    }

    /**
     * Sets the value of the serverDBLoadBalancer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerDBLoadBalancer(String value) {
        this.serverDBLoadBalancer = value;
    }

    /**
     * Gets the value of the overallServerHealth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverallServerHealth() {
        return overallServerHealth;
    }

    /**
     * Sets the value of the overallServerHealth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverallServerHealth(String value) {
        this.overallServerHealth = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link Messages }
     *     
     */
    public Messages getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Messages }
     *     
     */
    public void setMessages(Messages value) {
        this.messages = value;
    }

}
