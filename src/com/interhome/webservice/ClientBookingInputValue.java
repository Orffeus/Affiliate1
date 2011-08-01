
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientBookingInputValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientBookingInputValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesOfficeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccommodationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalServices" type="{http://www.interhome.com/webservice}ArrayOfAdditionalServiceInputItem" minOccurs="0"/>
 *         &lt;element name="CustomerSalutationType" type="{http://www.interhome.com/webservice}SalutationType"/>
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerAddressStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerAddressAdditionalStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerAddressZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerAddressPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerAddressState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerAddressCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Babies" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RetailerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RetailerExtraCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentType" type="{http://www.interhome.com/webservice}PaymentType"/>
 *         &lt;element name="CreditCardType" type="{http://www.interhome.com/webservice}CCType"/>
 *         &lt;element name="CreditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardCvc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardExpiry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankAccountHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientBookingInputValue", propOrder = {
    "salesOfficeCode",
    "accommodationCode",
    "additionalServices",
    "customerSalutationType",
    "customerName",
    "customerFirstName",
    "customerPhone",
    "customerFax",
    "customerEmail",
    "customerAddressStreet",
    "customerAddressAdditionalStreet",
    "customerAddressZIP",
    "customerAddressPlace",
    "customerAddressState",
    "customerAddressCountryCode",
    "comment",
    "adults",
    "babies",
    "children",
    "checkIn",
    "checkOut",
    "languageCode",
    "currencyCode",
    "retailerCode",
    "retailerExtraCode",
    "paymentType",
    "creditCardType",
    "creditCardNumber",
    "creditCardCvc",
    "creditCardExpiry",
    "creditCardHolder",
    "bankAccountNumber",
    "bankCode",
    "bankAccountHolder"
})
public class ClientBookingInputValue {

    @XmlElement(name = "SalesOfficeCode")
    protected String salesOfficeCode;
    @XmlElement(name = "AccommodationCode")
    protected String accommodationCode;
    @XmlElement(name = "AdditionalServices")
    protected ArrayOfAdditionalServiceInputItem additionalServices;
    @XmlElement(name = "CustomerSalutationType", required = true)
    protected SalutationType customerSalutationType;
    @XmlElement(name = "CustomerName")
    protected String customerName;
    @XmlElement(name = "CustomerFirstName")
    protected String customerFirstName;
    @XmlElement(name = "CustomerPhone")
    protected String customerPhone;
    @XmlElement(name = "CustomerFax")
    protected String customerFax;
    @XmlElement(name = "CustomerEmail")
    protected String customerEmail;
    @XmlElement(name = "CustomerAddressStreet")
    protected String customerAddressStreet;
    @XmlElement(name = "CustomerAddressAdditionalStreet")
    protected String customerAddressAdditionalStreet;
    @XmlElement(name = "CustomerAddressZIP")
    protected String customerAddressZIP;
    @XmlElement(name = "CustomerAddressPlace")
    protected String customerAddressPlace;
    @XmlElement(name = "CustomerAddressState")
    protected String customerAddressState;
    @XmlElement(name = "CustomerAddressCountryCode")
    protected String customerAddressCountryCode;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "Adults")
    protected int adults;
    @XmlElement(name = "Babies")
    protected int babies;
    @XmlElement(name = "Children")
    protected int children;
    @XmlElement(name = "CheckIn")
    protected String checkIn;
    @XmlElement(name = "CheckOut")
    protected String checkOut;
    @XmlElement(name = "LanguageCode")
    protected String languageCode;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "RetailerCode")
    protected String retailerCode;
    @XmlElement(name = "RetailerExtraCode")
    protected String retailerExtraCode;
    @XmlElement(name = "PaymentType", required = true)
    protected PaymentType paymentType;
    @XmlElement(name = "CreditCardType", required = true)
    protected CCType creditCardType;
    @XmlElement(name = "CreditCardNumber")
    protected String creditCardNumber;
    @XmlElement(name = "CreditCardCvc")
    protected String creditCardCvc;
    @XmlElement(name = "CreditCardExpiry")
    protected String creditCardExpiry;
    @XmlElement(name = "CreditCardHolder")
    protected String creditCardHolder;
    @XmlElement(name = "BankAccountNumber")
    protected String bankAccountNumber;
    @XmlElement(name = "BankCode")
    protected String bankCode;
    @XmlElement(name = "BankAccountHolder")
    protected String bankAccountHolder;

    /**
     * Gets the value of the salesOfficeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOfficeCode() {
        return salesOfficeCode;
    }

    /**
     * Sets the value of the salesOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOfficeCode(String value) {
        this.salesOfficeCode = value;
    }

    /**
     * Gets the value of the accommodationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccommodationCode() {
        return accommodationCode;
    }

    /**
     * Sets the value of the accommodationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccommodationCode(String value) {
        this.accommodationCode = value;
    }

    /**
     * Gets the value of the additionalServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdditionalServiceInputItem }
     *     
     */
    public ArrayOfAdditionalServiceInputItem getAdditionalServices() {
        return additionalServices;
    }

    /**
     * Sets the value of the additionalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdditionalServiceInputItem }
     *     
     */
    public void setAdditionalServices(ArrayOfAdditionalServiceInputItem value) {
        this.additionalServices = value;
    }

    /**
     * Gets the value of the customerSalutationType property.
     * 
     * @return
     *     possible object is
     *     {@link SalutationType }
     *     
     */
    public SalutationType getCustomerSalutationType() {
        return customerSalutationType;
    }

    /**
     * Sets the value of the customerSalutationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalutationType }
     *     
     */
    public void setCustomerSalutationType(SalutationType value) {
        this.customerSalutationType = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the customerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    /**
     * Sets the value of the customerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFirstName(String value) {
        this.customerFirstName = value;
    }

    /**
     * Gets the value of the customerPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPhone() {
        return customerPhone;
    }

    /**
     * Sets the value of the customerPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPhone(String value) {
        this.customerPhone = value;
    }

    /**
     * Gets the value of the customerFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFax() {
        return customerFax;
    }

    /**
     * Sets the value of the customerFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFax(String value) {
        this.customerFax = value;
    }

    /**
     * Gets the value of the customerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * Sets the value of the customerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerEmail(String value) {
        this.customerEmail = value;
    }

    /**
     * Gets the value of the customerAddressStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAddressStreet() {
        return customerAddressStreet;
    }

    /**
     * Sets the value of the customerAddressStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAddressStreet(String value) {
        this.customerAddressStreet = value;
    }

    /**
     * Gets the value of the customerAddressAdditionalStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAddressAdditionalStreet() {
        return customerAddressAdditionalStreet;
    }

    /**
     * Sets the value of the customerAddressAdditionalStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAddressAdditionalStreet(String value) {
        this.customerAddressAdditionalStreet = value;
    }

    /**
     * Gets the value of the customerAddressZIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAddressZIP() {
        return customerAddressZIP;
    }

    /**
     * Sets the value of the customerAddressZIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAddressZIP(String value) {
        this.customerAddressZIP = value;
    }

    /**
     * Gets the value of the customerAddressPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAddressPlace() {
        return customerAddressPlace;
    }

    /**
     * Sets the value of the customerAddressPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAddressPlace(String value) {
        this.customerAddressPlace = value;
    }

    /**
     * Gets the value of the customerAddressState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAddressState() {
        return customerAddressState;
    }

    /**
     * Sets the value of the customerAddressState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAddressState(String value) {
        this.customerAddressState = value;
    }

    /**
     * Gets the value of the customerAddressCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAddressCountryCode() {
        return customerAddressCountryCode;
    }

    /**
     * Sets the value of the customerAddressCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAddressCountryCode(String value) {
        this.customerAddressCountryCode = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the adults property.
     * 
     */
    public int getAdults() {
        return adults;
    }

    /**
     * Sets the value of the adults property.
     * 
     */
    public void setAdults(int value) {
        this.adults = value;
    }

    /**
     * Gets the value of the babies property.
     * 
     */
    public int getBabies() {
        return babies;
    }

    /**
     * Sets the value of the babies property.
     * 
     */
    public void setBabies(int value) {
        this.babies = value;
    }

    /**
     * Gets the value of the children property.
     * 
     */
    public int getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     */
    public void setChildren(int value) {
        this.children = value;
    }

    /**
     * Gets the value of the checkIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckIn() {
        return checkIn;
    }

    /**
     * Sets the value of the checkIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckIn(String value) {
        this.checkIn = value;
    }

    /**
     * Gets the value of the checkOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckOut() {
        return checkOut;
    }

    /**
     * Sets the value of the checkOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckOut(String value) {
        this.checkOut = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
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
     * Gets the value of the retailerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetailerCode() {
        return retailerCode;
    }

    /**
     * Sets the value of the retailerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetailerCode(String value) {
        this.retailerCode = value;
    }

    /**
     * Gets the value of the retailerExtraCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetailerExtraCode() {
        return retailerExtraCode;
    }

    /**
     * Sets the value of the retailerExtraCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetailerExtraCode(String value) {
        this.retailerExtraCode = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setPaymentType(PaymentType value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the creditCardType property.
     * 
     * @return
     *     possible object is
     *     {@link CCType }
     *     
     */
    public CCType getCreditCardType() {
        return creditCardType;
    }

    /**
     * Sets the value of the creditCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCType }
     *     
     */
    public void setCreditCardType(CCType value) {
        this.creditCardType = value;
    }

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the creditCardCvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardCvc() {
        return creditCardCvc;
    }

    /**
     * Sets the value of the creditCardCvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardCvc(String value) {
        this.creditCardCvc = value;
    }

    /**
     * Gets the value of the creditCardExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardExpiry() {
        return creditCardExpiry;
    }

    /**
     * Sets the value of the creditCardExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardExpiry(String value) {
        this.creditCardExpiry = value;
    }

    /**
     * Gets the value of the creditCardHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardHolder() {
        return creditCardHolder;
    }

    /**
     * Sets the value of the creditCardHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardHolder(String value) {
        this.creditCardHolder = value;
    }

    /**
     * Gets the value of the bankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Sets the value of the bankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountNumber(String value) {
        this.bankAccountNumber = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the bankAccountHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountHolder() {
        return bankAccountHolder;
    }

    /**
     * Sets the value of the bankAccountHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountHolder(String value) {
        this.bankAccountHolder = value;
    }

}
