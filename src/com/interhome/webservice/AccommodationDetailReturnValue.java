
package com.interhome.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccommodationDetailReturnValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccommodationDetailReturnValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.interhome.com/webservice}ReturnValue">
 *       &lt;sequence>
 *         &lt;element name="AccommodationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Place" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quality" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Rooms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BedRooms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Interior" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Tranquility" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Kitchen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AccessRoad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Pets" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cots" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdditionBeds" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Parking" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TV" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Dishwasher" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Washingmachine" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Aircondition" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Pool" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Tennis" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Sauna" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Wheelchair" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="GeoLng" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="GeoLat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PoolFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PoolTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsideDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutsideDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pictures" type="{http://www.interhome.com/webservice}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccommodationDetailReturnValue", propOrder = {
    "accommodationCode",
    "houseName",
    "country",
    "region",
    "place",
    "zip",
    "quality",
    "type",
    "pax",
    "rooms",
    "bedRooms",
    "location",
    "interior",
    "tranquility",
    "kitchen",
    "accessRoad",
    "pets",
    "cots",
    "additionBeds",
    "parking",
    "tv",
    "dishwasher",
    "washingmachine",
    "aircondition",
    "pool",
    "tennis",
    "sauna",
    "wheelchair",
    "geoLng",
    "geoLat",
    "poolFrom",
    "poolTo",
    "insideDescription",
    "outsideDescription",
    "pictures"
})
public class AccommodationDetailReturnValue
    extends ReturnValue
{

    @XmlElement(name = "AccommodationCode")
    protected String accommodationCode;
    @XmlElement(name = "HouseName")
    protected String houseName;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "Place")
    protected String place;
    @XmlElement(name = "Zip")
    protected String zip;
    @XmlElement(name = "Quality")
    protected int quality;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Pax")
    protected int pax;
    @XmlElement(name = "Rooms")
    protected int rooms;
    @XmlElement(name = "BedRooms")
    protected int bedRooms;
    @XmlElement(name = "Location")
    protected int location;
    @XmlElement(name = "Interior")
    protected int interior;
    @XmlElement(name = "Tranquility")
    protected int tranquility;
    @XmlElement(name = "Kitchen")
    protected int kitchen;
    @XmlElement(name = "AccessRoad")
    protected int accessRoad;
    @XmlElement(name = "Pets")
    protected int pets;
    @XmlElement(name = "Cots")
    protected int cots;
    @XmlElement(name = "AdditionBeds")
    protected int additionBeds;
    @XmlElement(name = "Parking")
    protected boolean parking;
    @XmlElement(name = "TV")
    protected boolean tv;
    @XmlElement(name = "Dishwasher")
    protected boolean dishwasher;
    @XmlElement(name = "Washingmachine")
    protected boolean washingmachine;
    @XmlElement(name = "Aircondition")
    protected boolean aircondition;
    @XmlElement(name = "Pool")
    protected boolean pool;
    @XmlElement(name = "Tennis")
    protected boolean tennis;
    @XmlElement(name = "Sauna")
    protected boolean sauna;
    @XmlElement(name = "Wheelchair")
    protected boolean wheelchair;
    @XmlElement(name = "GeoLng", required = true)
    protected BigDecimal geoLng;
    @XmlElement(name = "GeoLat", required = true)
    protected BigDecimal geoLat;
    @XmlElement(name = "PoolFrom")
    protected String poolFrom;
    @XmlElement(name = "PoolTo")
    protected String poolTo;
    @XmlElement(name = "InsideDescription")
    protected String insideDescription;
    @XmlElement(name = "OutsideDescription")
    protected String outsideDescription;
    @XmlElement(name = "Pictures")
    protected ArrayOfString pictures;

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
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
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
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
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
     * Gets the value of the pax property.
     * 
     */
    public int getPax() {
        return pax;
    }

    /**
     * Sets the value of the pax property.
     * 
     */
    public void setPax(int value) {
        this.pax = value;
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
     * Gets the value of the location property.
     * 
     */
    public int getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     */
    public void setLocation(int value) {
        this.location = value;
    }

    /**
     * Gets the value of the interior property.
     * 
     */
    public int getInterior() {
        return interior;
    }

    /**
     * Sets the value of the interior property.
     * 
     */
    public void setInterior(int value) {
        this.interior = value;
    }

    /**
     * Gets the value of the tranquility property.
     * 
     */
    public int getTranquility() {
        return tranquility;
    }

    /**
     * Sets the value of the tranquility property.
     * 
     */
    public void setTranquility(int value) {
        this.tranquility = value;
    }

    /**
     * Gets the value of the kitchen property.
     * 
     */
    public int getKitchen() {
        return kitchen;
    }

    /**
     * Sets the value of the kitchen property.
     * 
     */
    public void setKitchen(int value) {
        this.kitchen = value;
    }

    /**
     * Gets the value of the accessRoad property.
     * 
     */
    public int getAccessRoad() {
        return accessRoad;
    }

    /**
     * Sets the value of the accessRoad property.
     * 
     */
    public void setAccessRoad(int value) {
        this.accessRoad = value;
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
     * Gets the value of the parking property.
     * 
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * Sets the value of the parking property.
     * 
     */
    public void setParking(boolean value) {
        this.parking = value;
    }

    /**
     * Gets the value of the tv property.
     * 
     */
    public boolean isTV() {
        return tv;
    }

    /**
     * Sets the value of the tv property.
     * 
     */
    public void setTV(boolean value) {
        this.tv = value;
    }

    /**
     * Gets the value of the dishwasher property.
     * 
     */
    public boolean isDishwasher() {
        return dishwasher;
    }

    /**
     * Sets the value of the dishwasher property.
     * 
     */
    public void setDishwasher(boolean value) {
        this.dishwasher = value;
    }

    /**
     * Gets the value of the washingmachine property.
     * 
     */
    public boolean isWashingmachine() {
        return washingmachine;
    }

    /**
     * Sets the value of the washingmachine property.
     * 
     */
    public void setWashingmachine(boolean value) {
        this.washingmachine = value;
    }

    /**
     * Gets the value of the aircondition property.
     * 
     */
    public boolean isAircondition() {
        return aircondition;
    }

    /**
     * Sets the value of the aircondition property.
     * 
     */
    public void setAircondition(boolean value) {
        this.aircondition = value;
    }

    /**
     * Gets the value of the pool property.
     * 
     */
    public boolean isPool() {
        return pool;
    }

    /**
     * Sets the value of the pool property.
     * 
     */
    public void setPool(boolean value) {
        this.pool = value;
    }

    /**
     * Gets the value of the tennis property.
     * 
     */
    public boolean isTennis() {
        return tennis;
    }

    /**
     * Sets the value of the tennis property.
     * 
     */
    public void setTennis(boolean value) {
        this.tennis = value;
    }

    /**
     * Gets the value of the sauna property.
     * 
     */
    public boolean isSauna() {
        return sauna;
    }

    /**
     * Sets the value of the sauna property.
     * 
     */
    public void setSauna(boolean value) {
        this.sauna = value;
    }

    /**
     * Gets the value of the wheelchair property.
     * 
     */
    public boolean isWheelchair() {
        return wheelchair;
    }

    /**
     * Sets the value of the wheelchair property.
     * 
     */
    public void setWheelchair(boolean value) {
        this.wheelchair = value;
    }

    /**
     * Gets the value of the geoLng property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGeoLng() {
        return geoLng;
    }

    /**
     * Sets the value of the geoLng property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGeoLng(BigDecimal value) {
        this.geoLng = value;
    }

    /**
     * Gets the value of the geoLat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGeoLat() {
        return geoLat;
    }

    /**
     * Sets the value of the geoLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGeoLat(BigDecimal value) {
        this.geoLat = value;
    }

    /**
     * Gets the value of the poolFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolFrom() {
        return poolFrom;
    }

    /**
     * Sets the value of the poolFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolFrom(String value) {
        this.poolFrom = value;
    }

    /**
     * Gets the value of the poolTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolTo() {
        return poolTo;
    }

    /**
     * Sets the value of the poolTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolTo(String value) {
        this.poolTo = value;
    }

    /**
     * Gets the value of the insideDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsideDescription() {
        return insideDescription;
    }

    /**
     * Sets the value of the insideDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsideDescription(String value) {
        this.insideDescription = value;
    }

    /**
     * Gets the value of the outsideDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsideDescription() {
        return outsideDescription;
    }

    /**
     * Sets the value of the outsideDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutsideDescription(String value) {
        this.outsideDescription = value;
    }

    /**
     * Gets the value of the pictures property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getPictures() {
        return pictures;
    }

    /**
     * Sets the value of the pictures property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setPictures(ArrayOfString value) {
        this.pictures = value;
    }

}
