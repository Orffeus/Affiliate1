
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoucherDetailReturnValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoucherDetailReturnValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.interhome.com/webservice}ReturnValue">
 *       &lt;sequence>
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccommodationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PaxReservation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Rooms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BedRooms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Quality" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Pets" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdditionBeds" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cots" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Place" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccommodationAddress" type="{http://www.interhome.com/webservice}VoucherDetailAddress" minOccurs="0"/>
 *         &lt;element name="VoucherCharges" type="{http://www.interhome.com/webservice}VoucherDetailCharges" minOccurs="0"/>
 *         &lt;element name="ArrivalDepartureInformation" type="{http://www.interhome.com/webservice}VoucherDetailDescription" minOccurs="0"/>
 *         &lt;element name="KeyHandoverInformation" type="{http://www.interhome.com/webservice}VoucherDetailKeyHandoverInformation" minOccurs="0"/>
 *         &lt;element name="ContactOnSite" type="{http://www.interhome.com/webservice}VoucherDetailAddress" minOccurs="0"/>
 *         &lt;element name="VoucherDescriptions" type="{http://www.interhome.com/webservice}VoucherDetailDescriptions" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoucherDetailReturnValue", propOrder = {
    "customerName",
    "accommodationCode",
    "reservationCode",
    "checkIn",
    "checkOut",
    "duration",
    "houseName",
    "paxMax",
    "paxReservation",
    "rooms",
    "bedRooms",
    "quality",
    "pets",
    "additionBeds",
    "cots",
    "place",
    "accommodationAddress",
    "voucherCharges",
    "arrivalDepartureInformation",
    "keyHandoverInformation",
    "contactOnSite",
    "voucherDescriptions",
    "additionalInformation",
    "alert"
})
public class VoucherDetailReturnValue
    extends ReturnValue
{

    @XmlElement(name = "CustomerName")
    protected String customerName;
    @XmlElement(name = "AccommodationCode")
    protected String accommodationCode;
    @XmlElement(name = "ReservationCode")
    protected String reservationCode;
    @XmlElement(name = "CheckIn")
    protected String checkIn;
    @XmlElement(name = "CheckOut")
    protected String checkOut;
    @XmlElement(name = "Duration")
    protected int duration;
    @XmlElement(name = "HouseName")
    protected String houseName;
    @XmlElement(name = "PaxMax")
    protected int paxMax;
    @XmlElement(name = "PaxReservation")
    protected int paxReservation;
    @XmlElement(name = "Rooms")
    protected int rooms;
    @XmlElement(name = "BedRooms")
    protected int bedRooms;
    @XmlElement(name = "Quality")
    protected int quality;
    @XmlElement(name = "Pets")
    protected int pets;
    @XmlElement(name = "AdditionBeds")
    protected int additionBeds;
    @XmlElement(name = "Cots")
    protected int cots;
    @XmlElement(name = "Place")
    protected String place;
    @XmlElement(name = "AccommodationAddress")
    protected VoucherDetailAddress accommodationAddress;
    @XmlElement(name = "VoucherCharges")
    protected VoucherDetailCharges voucherCharges;
    @XmlElement(name = "ArrivalDepartureInformation")
    protected VoucherDetailDescription arrivalDepartureInformation;
    @XmlElement(name = "KeyHandoverInformation")
    protected VoucherDetailKeyHandoverInformation keyHandoverInformation;
    @XmlElement(name = "ContactOnSite")
    protected VoucherDetailAddress contactOnSite;
    @XmlElement(name = "VoucherDescriptions")
    protected VoucherDetailDescriptions voucherDescriptions;
    @XmlElement(name = "AdditionalInformation")
    protected String additionalInformation;
    @XmlElement(name = "Alert")
    protected String alert;

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
     * Gets the value of the reservationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationCode() {
        return reservationCode;
    }

    /**
     * Sets the value of the reservationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationCode(String value) {
        this.reservationCode = value;
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
     * Gets the value of the duration property.
     * 
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     */
    public void setDuration(int value) {
        this.duration = value;
    }

    /**
     * Gets the value of the houseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseName() {
        return houseName;
    }

    /**
     * Sets the value of the houseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseName(String value) {
        this.houseName = value;
    }

    /**
     * Gets the value of the paxMax property.
     * 
     */
    public int getPaxMax() {
        return paxMax;
    }

    /**
     * Sets the value of the paxMax property.
     * 
     */
    public void setPaxMax(int value) {
        this.paxMax = value;
    }

    /**
     * Gets the value of the paxReservation property.
     * 
     */
    public int getPaxReservation() {
        return paxReservation;
    }

    /**
     * Sets the value of the paxReservation property.
     * 
     */
    public void setPaxReservation(int value) {
        this.paxReservation = value;
    }

    /**
     * Gets the value of the rooms property.
     * 
     */
    public int getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     */
    public void setRooms(int value) {
        this.rooms = value;
    }

    /**
     * Gets the value of the bedRooms property.
     * 
     */
    public int getBedRooms() {
        return bedRooms;
    }

    /**
     * Sets the value of the bedRooms property.
     * 
     */
    public void setBedRooms(int value) {
        this.bedRooms = value;
    }

    /**
     * Gets the value of the quality property.
     * 
     */
    public int getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     */
    public void setQuality(int value) {
        this.quality = value;
    }

    /**
     * Gets the value of the pets property.
     * 
     */
    public int getPets() {
        return pets;
    }

    /**
     * Sets the value of the pets property.
     * 
     */
    public void setPets(int value) {
        this.pets = value;
    }

    /**
     * Gets the value of the additionBeds property.
     * 
     */
    public int getAdditionBeds() {
        return additionBeds;
    }

    /**
     * Sets the value of the additionBeds property.
     * 
     */
    public void setAdditionBeds(int value) {
        this.additionBeds = value;
    }

    /**
     * Gets the value of the cots property.
     * 
     */
    public int getCots() {
        return cots;
    }

    /**
     * Sets the value of the cots property.
     * 
     */
    public void setCots(int value) {
        this.cots = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlace(String value) {
        this.place = value;
    }

    /**
     * Gets the value of the accommodationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link VoucherDetailAddress }
     *     
     */
    public VoucherDetailAddress getAccommodationAddress() {
        return accommodationAddress;
    }

    /**
     * Sets the value of the accommodationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherDetailAddress }
     *     
     */
    public void setAccommodationAddress(VoucherDetailAddress value) {
        this.accommodationAddress = value;
    }

    /**
     * Gets the value of the voucherCharges property.
     * 
     * @return
     *     possible object is
     *     {@link VoucherDetailCharges }
     *     
     */
    public VoucherDetailCharges getVoucherCharges() {
        return voucherCharges;
    }

    /**
     * Sets the value of the voucherCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherDetailCharges }
     *     
     */
    public void setVoucherCharges(VoucherDetailCharges value) {
        this.voucherCharges = value;
    }

    /**
     * Gets the value of the arrivalDepartureInformation property.
     * 
     * @return
     *     possible object is
     *     {@link VoucherDetailDescription }
     *     
     */
    public VoucherDetailDescription getArrivalDepartureInformation() {
        return arrivalDepartureInformation;
    }

    /**
     * Sets the value of the arrivalDepartureInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherDetailDescription }
     *     
     */
    public void setArrivalDepartureInformation(VoucherDetailDescription value) {
        this.arrivalDepartureInformation = value;
    }

    /**
     * Gets the value of the keyHandoverInformation property.
     * 
     * @return
     *     possible object is
     *     {@link VoucherDetailKeyHandoverInformation }
     *     
     */
    public VoucherDetailKeyHandoverInformation getKeyHandoverInformation() {
        return keyHandoverInformation;
    }

    /**
     * Sets the value of the keyHandoverInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherDetailKeyHandoverInformation }
     *     
     */
    public void setKeyHandoverInformation(VoucherDetailKeyHandoverInformation value) {
        this.keyHandoverInformation = value;
    }

    /**
     * Gets the value of the contactOnSite property.
     * 
     * @return
     *     possible object is
     *     {@link VoucherDetailAddress }
     *     
     */
    public VoucherDetailAddress getContactOnSite() {
        return contactOnSite;
    }

    /**
     * Sets the value of the contactOnSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherDetailAddress }
     *     
     */
    public void setContactOnSite(VoucherDetailAddress value) {
        this.contactOnSite = value;
    }

    /**
     * Gets the value of the voucherDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link VoucherDetailDescriptions }
     *     
     */
    public VoucherDetailDescriptions getVoucherDescriptions() {
        return voucherDescriptions;
    }

    /**
     * Sets the value of the voucherDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherDetailDescriptions }
     *     
     */
    public void setVoucherDescriptions(VoucherDetailDescriptions value) {
        this.voucherDescriptions = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInformation(String value) {
        this.additionalInformation = value;
    }

    /**
     * Gets the value of the alert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlert() {
        return alert;
    }

    /**
     * Sets the value of the alert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlert(String value) {
        this.alert = value;
    }

}
