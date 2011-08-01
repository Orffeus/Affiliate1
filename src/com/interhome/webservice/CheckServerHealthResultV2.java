
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckServerHealthResultV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckServerHealthResultV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IRent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServerDBLoadBalancer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Endeca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CheckServerHealthResultV2", propOrder = {
    "iRent",
    "serverDBLoadBalancer",
    "endeca",
    "overallServerHealth",
    "messages"
})
public class CheckServerHealthResultV2 {

    @XmlElement(name = "IRent")
    protected String iRent;
    @XmlElement(name = "ServerDBLoadBalancer")
    protected String serverDBLoadBalancer;
    @XmlElement(name = "Endeca")
    protected String endeca;
    @XmlElement(name = "OverallServerHealth")
    protected String overallServerHealth;
    @XmlElement(name = "Messages", required = true)
    protected Messages messages;

    /**
     * Gets the value of the iRent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIRent() {
        return iRent;
    }

    /**
     * Sets the value of the iRent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIRent(String value) {
        this.iRent = value;
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
     * Gets the value of the endeca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndeca() {
        return endeca;
    }

    /**
     * Sets the value of the endeca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndeca(String value) {
        this.endeca = value;
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
