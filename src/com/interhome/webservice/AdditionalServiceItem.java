
package com.interhome.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalServiceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalServiceItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalServiceType" type="{http://www.interhome.com/webservice}AdditionalServiceType"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EitherOr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDefaultService" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsInsurance" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PaymentInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalServiceItem", propOrder = {
    "additionalServiceType",
    "amount",
    "code",
    "count",
    "currency",
    "description",
    "eitherOr",
    "isDefaultService",
    "isIncluded",
    "isInsurance",
    "isMandatory",
    "paymentInfo",
    "text",
    "type",
    "validFrom",
    "validTo"
})
public class AdditionalServiceItem {

    @XmlElement(name = "AdditionalServiceType", required = true)
    protected AdditionalServiceType additionalServiceType;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Count")
    protected int count;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "EitherOr")
    protected String eitherOr;
    @XmlElement(name = "IsDefaultService")
    protected boolean isDefaultService;
    @XmlElement(name = "IsIncluded")
    protected boolean isIncluded;
    @XmlElement(name = "IsInsurance")
    protected boolean isInsurance;
    @XmlElement(name = "IsMandatory")
    protected boolean isMandatory;
    @XmlElement(name = "PaymentInfo")
    protected String paymentInfo;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "ValidFrom")
    protected String validFrom;
    @XmlElement(name = "ValidTo")
    protected String validTo;

    /**
     * Gets the value of the additionalServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalServiceType }
     *     
     */
    public AdditionalServiceType getAdditionalServiceType() {
        return additionalServiceType;
    }

    /**
     * Sets the value of the additionalServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalServiceType }
     *     
     */
    public void setAdditionalServiceType(AdditionalServiceType value) {
        this.additionalServiceType = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the count property.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the eitherOr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEitherOr() {
        return eitherOr;
    }

    /**
     * Sets the value of the eitherOr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEitherOr(String value) {
        this.eitherOr = value;
    }

    /**
     * Gets the value of the isDefaultService property.
     * 
     */
    public boolean isIsDefaultService() {
        return isDefaultService;
    }

    /**
     * Sets the value of the isDefaultService property.
     * 
     */
    public void setIsDefaultService(boolean value) {
        this.isDefaultService = value;
    }

    /**
     * Gets the value of the isIncluded property.
     * 
     */
    public boolean isIsIncluded() {
        return isIncluded;
    }

    /**
     * Sets the value of the isIncluded property.
     * 
     */
    public void setIsIncluded(boolean value) {
        this.isIncluded = value;
    }

    /**
     * Gets the value of the isInsurance property.
     * 
     */
    public boolean isIsInsurance() {
        return isInsurance;
    }

    /**
     * Sets the value of the isInsurance property.
     * 
     */
    public void setIsInsurance(boolean value) {
        this.isInsurance = value;
    }

    /**
     * Gets the value of the isMandatory property.
     * 
     */
    public boolean isIsMandatory() {
        return isMandatory;
    }

    /**
     * Sets the value of the isMandatory property.
     * 
     */
    public void setIsMandatory(boolean value) {
        this.isMandatory = value;
    }

    /**
     * Gets the value of the paymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * Sets the value of the paymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInfo(String value) {
        this.paymentInfo = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidFrom(String value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidTo(String value) {
        this.validTo = value;
    }

}
