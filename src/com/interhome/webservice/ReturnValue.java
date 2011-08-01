
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReturnValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Errors" type="{http://www.interhome.com/webservice}ArrayOfError" minOccurs="0"/>
 *         &lt;element name="Ok" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnValue", propOrder = {
    "errors",
    "ok"
})
@XmlSeeAlso({
    TripsReturnValue.class,
    CancellationConditionReturnValue.class,
    CheckBookingReturnValue.class,
    SearchReturnValue.class,
    NearestBookingDateReturnValue.class,
    AffiliateDetailReturnValue.class,
    ReadBookingReturnValue.class,
    NewsletterReturnValue.class,
    RetailerBookingReturnValue.class,
    VoucherDetailReturnValue.class,
    AccommodationDetailReturnValue.class,
    ClientBookingReturnValue.class,
    CancelBookingReturnValue.class,
    AdditionalServicesReturnValue.class,
    RatifyBookingReturnValue.class,
    PriceDetailRetunValue.class,
    AvailabilityRetunValue.class,
    PricesRetunValue.class,
    PriceListReturnValue.class,
    PaymentInformationReturnValue.class
})
public class ReturnValue {

    @XmlElement(name = "Errors")
    protected ArrayOfError errors;
    @XmlElement(name = "Ok")
    protected boolean ok;

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfError }
     *     
     */
    public ArrayOfError getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfError }
     *     
     */
    public void setErrors(ArrayOfError value) {
        this.errors = value;
    }

    /**
     * Gets the value of the ok property.
     * 
     */
    public boolean isOk() {
        return ok;
    }

    /**
     * Sets the value of the ok property.
     * 
     */
    public void setOk(boolean value) {
        this.ok = value;
    }

}
