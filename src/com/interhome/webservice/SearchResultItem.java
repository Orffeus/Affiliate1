
package com.interhome.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResultItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResultItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccommodationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Place" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlaceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Quality" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Rooms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BedRooms" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
 *         &lt;element name="InsideDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Picture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResultItem", propOrder = {
    "accommodationCode",
    "country",
    "countryCode",
    "region",
    "regionCode",
    "place",
    "placeCode",
    "zip",
    "currencyCode",
    "price",
    "quality",
    "type",
    "pax",
    "rooms",
    "bedRooms",
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
    "insideDescription",
    "picture"
})
public class SearchResultItem {

    @XmlElement(name = "AccommodationCode")
    protected String accommodationCode;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "RegionCode")
    protected String regionCode;
    @XmlElement(name = "Place")
    protected String place;
    @XmlElement(name = "PlaceCode")
    protected String placeCode;
    @XmlElement(name = "Zip")
    protected String zip;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "Price", required = true)
    protected BigDecimal price;
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
    @XmlElement(name = "InsideDescription")
    protected String insideDescription;
    @XmlElement(name = "Picture")
    protected String picture;

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
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
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
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionCode(String value) {
        this.regionCode = value;
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
     * Gets the value of the placeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceCode() {
        return placeCode;
    }

    /**
     * Sets the value of the placeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceCode(String value) {
        this.placeCode = value;
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
     * Gets the value of the picture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicture() {
        return picture;
    }

    /**
     * Sets the value of the picture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicture(String value) {
        this.picture = value;
    }

}
