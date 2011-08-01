
package com.interhome.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceListItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ShortbreakDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ShortbreakPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceListItem", propOrder = {
    "startDate",
    "endDate",
    "price",
    "shortbreakDays",
    "shortbreakPrice"
})
public class PriceListItem {

    @XmlElement(name = "StartDate")
    protected String startDate;
    @XmlElement(name = "EndDate")
    protected String endDate;
    @XmlElement(name = "Price", required = true)
    protected BigDecimal price;
    @XmlElement(name = "ShortbreakDays")
    protected int shortbreakDays;
    @XmlElement(name = "ShortbreakPrice", required = true)
    protected BigDecimal shortbreakPrice;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the shortbreakDays property.
     * 
     */
    public int getShortbreakDays() {
        return shortbreakDays;
    }

    /**
     * Sets the value of the shortbreakDays property.
     * 
     */
    public void setShortbreakDays(int value) {
        this.shortbreakDays = value;
    }

    /**
     * Gets the value of the shortbreakPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShortbreakPrice() {
        return shortbreakPrice;
    }

    /**
     * Sets the value of the shortbreakPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShortbreakPrice(BigDecimal value) {
        this.shortbreakPrice = value;
    }

}
