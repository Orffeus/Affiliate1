
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadBookingReturnValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadBookingReturnValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.interhome.com/webservice}ReturnValue">
 *       &lt;sequence>
 *         &lt;element name="BookingID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AccommodationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalServices" type="{http://www.interhome.com/webservice}ArrayOfAdditionalServiceItem" minOccurs="0"/>
 *         &lt;element name="CustomerSalutationType" type="{http://www.interhome.com/webservice}SalutationType"/>
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerAddressPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerAddressCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Babies" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RetailerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RetailerExtraCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RetailerContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentType" type="{http://www.interhome.com/webservice}PaymentType"/>
 *         &lt;element name="Price" type="{http://www.interhome.com/webservice}ReadBookingPriceItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadBookingReturnValue", propOrder = {
    "bookingID",
    "bookingDate",
    "optionDate",
    "state",
    "accommodationCode",
    "additionalServices",
    "customerSalutationType",
    "customerName",
    "customerFirstName",
    "customerEmail",
    "customerAddressPlace",
    "customerAddressCountryCode",
    "comment",
    "adults",
    "babies",
    "children",
    "checkIn",
    "checkOut",
    "currencyCode",
    "languageCode",
    "retailerCode",
    "retailerExtraCode",
    "retailerContact",
    "paymentType",
    "price"
})
public class ReadBookingReturnValue
    extends ReturnValue
{

    @XmlElement(name = "BookingID")
    protected String bookingID;
    @XmlElement(name = "BookingDate")
    protected String bookingDate;
    @XmlElement(name = "OptionDate")
    protected String optionDate;
    @XmlElement(name = "State")
    protected int state;
    @XmlElement(name = "AccommodationCode")
    protected String accommodationCode;
    @XmlElement(name = "AdditionalServices")
    protected ArrayOfAdditionalServiceItem additionalServices;
    @XmlElement(name = "CustomerSalutationType", required = true)
    protected SalutationType customerSalutationType;
    @XmlElement(name = "CustomerName")
    protected String customerName;
    @XmlElement(name = "CustomerFirstName")
    protected String customerFirstName;
    @XmlElement(name = "CustomerEmail")
    protected String customerEmail;
    @XmlElement(name = "CustomerAddressPlace")
    protected String customerAddressPlace;
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
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "LanguageCode")
    protected String languageCode;
    @XmlElement(name = "RetailerCode")
    protected String retailerCode;
    @XmlElement(name = "RetailerExtraCode")
    protected String retailerExtraCode;
    @XmlElement(name = "RetailerContact")
    protected String retailerContact;
    @XmlElement(name = "PaymentType", required = true)
    protected PaymentType paymentType;
    @XmlElement(name = "Price")
    protected ReadBookingPriceItem price;

    /**
     * Gets the value of the bookingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingID() {
        return bookingID;
    }

    /**
     * Sets the value of the bookingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingID(String value) {
        this.bookingID = value;
    }

    /**
     * Gets the value of the bookingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingDate() {
        return bookingDate;
    }

    /**
     * Sets the value of the bookingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingDate(String value) {
        this.bookingDate = value;
    }

    /**
     * Gets the value of the optionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionDate() {
        return optionDate;
    }

    /**
     * Sets the value of the optionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionDate(String value) {
        this.optionDate = value;
    }

    /**
     * Gets the value of the state property.
     * 
     */
    public int getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     */
    public void setState(int value) {
        this.state = value;
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
     * Gets the value of the retailerContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetailerContact() {
        return retailerContact;
    }

    /**
     * Sets the value of the retailerContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetailerContact(String value) {
        this.retailerContact = value;
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
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link ReadBookingPriceItem }
     *     
     */
    public ReadBookingPriceItem getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadBookingPriceItem }
     *     
     */
    public void setPrice(ReadBookingPriceItem value) {
        this.price = value;
    }

}
