
package com.interhome.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceDetailRetunValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceDetailRetunValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.interhome.com/webservice}ReturnValue">
 *       &lt;sequence>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalServices" type="{http://www.interhome.com/webservice}ArrayOfAdditionalServiceItem" minOccurs="0"/>
 *         &lt;element name="ExpirationPrePayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationResidue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prepayment" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SpecialCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceDetailRetunValue", propOrder = {
    "price",
    "total",
    "currencyCode",
    "additionalServices",
    "expirationPrePayment",
    "expirationResidue",
    "prepayment",
    "specialCode",
    "specialDescription",
    "specialPrice"
})
public class PriceDetailRetunValue
    extends ReturnValue
{

    @XmlElement(name = "Price", required = true)
    protected BigDecimal price;
    @XmlElement(name = "Total", required = true)
    protected BigDecimal total;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "AdditionalServices")
    protected ArrayOfAdditionalServiceItem additionalServices;
    @XmlElement(name = "ExpirationPrePayment")
    protected String expirationPrePayment;
    @XmlElement(name = "ExpirationResidue")
    protected String expirationResidue;
    @XmlElement(name = "Prepayment", required = true)
    protected BigDecimal prepayment;
    @XmlElement(name = "SpecialCode")
    protected String specialCode;
    @XmlElement(name = "SpecialDescription")
    protected String specialDescription;
    @XmlElement(name = "SpecialPrice", required = true)
    protected BigDecimal specialPrice;

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
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

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

    /**
     * Gets the value of the expirationPrePayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationPrePayment() {
        return expirationPrePayment;
    }

    /**
     * Sets the value of the expirationPrePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationPrePayment(String value) {
        this.expirationPrePayment = value;
    }

    /**
     * Gets the value of the expirationResidue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationResidue() {
        return expirationResidue;
    }

    /**
     * Sets the value of the expirationResidue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationResidue(String value) {
        this.expirationResidue = value;
    }

    /**
     * Gets the value of the prepayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrepayment() {
        return prepayment;
    }

    /**
     * Sets the value of the prepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrepayment(BigDecimal value) {
        this.prepayment = value;
    }

    /**
     * Gets the value of the specialCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialCode() {
        return specialCode;
    }

    /**
     * Sets the value of the specialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialCode(String value) {
        this.specialCode = value;
    }

    /**
     * Gets the value of the specialDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialDescription() {
        return specialDescription;
    }

    /**
     * Sets the value of the specialDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialDescription(String value) {
        this.specialDescription = value;
    }

    /**
     * Gets the value of the specialPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpecialPrice() {
        return specialPrice;
    }

    /**
     * Sets the value of the specialPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpecialPrice(BigDecimal value) {
        this.specialPrice = value;
    }

}
