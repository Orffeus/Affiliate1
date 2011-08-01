
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchInputValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchInputValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Page" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderDirection" type="{http://www.interhome.com/webservice}OrderDirection"/>
 *         &lt;element name="OrderBy" type="{http://www.interhome.com/webservice}OrderBy"/>
 *         &lt;element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesOfficeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quicksearch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlaceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ThemeFilter" type="{http://www.interhome.com/webservice}ThemeFilterTypes"/>
 *         &lt;element name="HouseApartmentType" type="{http://www.interhome.com/webservice}HouseApartmentTypes"/>
 *         &lt;element name="Facilities" type="{http://www.interhome.com/webservice}ArrayOfFacilities" minOccurs="0"/>
 *         &lt;element name="Accessibilities" type="{http://www.interhome.com/webservice}ArrayOfAccessibilities" minOccurs="0"/>
 *         &lt;element name="Activities" type="{http://www.interhome.com/webservice}ArrayOfActivities" minOccurs="0"/>
 *         &lt;element name="Situations" type="{http://www.interhome.com/webservice}ArrayOfSituations" minOccurs="0"/>
 *         &lt;element name="PropertyTypes" type="{http://www.interhome.com/webservice}ArrayOfPropertyTypes" minOccurs="0"/>
 *         &lt;element name="SpecialOffer" type="{http://www.interhome.com/webservice}SpecialOffers"/>
 *         &lt;element name="PaxMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PaxMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RoomsMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RoomsMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BedroomsMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BedroomsMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BathroomsMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BathroomsMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QualityMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QualityMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DistanceToCenter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DistanceToGolfCourse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DistanceToLake" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DistanceToSea" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DistanceToSeaOrLake" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DistanceToSkiLifts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchInputValue", propOrder = {
    "page",
    "pageSize",
    "orderDirection",
    "orderBy",
    "languageCode",
    "currencyCode",
    "salesOfficeCode",
    "quicksearch",
    "countryCode",
    "regionCode",
    "placeCode",
    "checkIn",
    "duration",
    "themeFilter",
    "houseApartmentType",
    "facilities",
    "accessibilities",
    "activities",
    "situations",
    "propertyTypes",
    "specialOffer",
    "paxMin",
    "paxMax",
    "roomsMin",
    "roomsMax",
    "bedroomsMin",
    "bedroomsMax",
    "bathroomsMin",
    "bathroomsMax",
    "qualityMin",
    "qualityMax",
    "distanceToCenter",
    "distanceToGolfCourse",
    "distanceToLake",
    "distanceToSea",
    "distanceToSeaOrLake",
    "distanceToSkiLifts"
})
public class SearchInputValue {

    @XmlElement(name = "Page")
    protected int page;
    @XmlElement(name = "PageSize")
    protected int pageSize;
    @XmlElement(name = "OrderDirection", required = true)
    protected OrderDirection orderDirection;
    @XmlElement(name = "OrderBy", required = true)
    protected OrderBy orderBy;
    @XmlElement(name = "LanguageCode")
    protected String languageCode;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "SalesOfficeCode")
    protected String salesOfficeCode;
    @XmlElement(name = "Quicksearch")
    protected String quicksearch;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "RegionCode")
    protected String regionCode;
    @XmlElement(name = "PlaceCode")
    protected String placeCode;
    @XmlElement(name = "CheckIn")
    protected String checkIn;
    @XmlElement(name = "Duration")
    protected int duration;
    @XmlElement(name = "ThemeFilter", required = true)
    protected ThemeFilterTypes themeFilter;
    @XmlElement(name = "HouseApartmentType", required = true)
    protected HouseApartmentTypes houseApartmentType;
    @XmlElement(name = "Facilities")
    protected ArrayOfFacilities facilities;
    @XmlElement(name = "Accessibilities")
    protected ArrayOfAccessibilities accessibilities;
    @XmlElement(name = "Activities")
    protected ArrayOfActivities activities;
    @XmlElement(name = "Situations")
    protected ArrayOfSituations situations;
    @XmlElement(name = "PropertyTypes")
    protected ArrayOfPropertyTypes propertyTypes;
    @XmlElement(name = "SpecialOffer", required = true)
    protected SpecialOffers specialOffer;
    @XmlElement(name = "PaxMin")
    protected int paxMin;
    @XmlElement(name = "PaxMax")
    protected int paxMax;
    @XmlElement(name = "RoomsMin")
    protected int roomsMin;
    @XmlElement(name = "RoomsMax")
    protected int roomsMax;
    @XmlElement(name = "BedroomsMin")
    protected int bedroomsMin;
    @XmlElement(name = "BedroomsMax")
    protected int bedroomsMax;
    @XmlElement(name = "BathroomsMin")
    protected int bathroomsMin;
    @XmlElement(name = "BathroomsMax")
    protected int bathroomsMax;
    @XmlElement(name = "QualityMin")
    protected int qualityMin;
    @XmlElement(name = "QualityMax")
    protected int qualityMax;
    @XmlElement(name = "DistanceToCenter")
    protected int distanceToCenter;
    @XmlElement(name = "DistanceToGolfCourse")
    protected int distanceToGolfCourse;
    @XmlElement(name = "DistanceToLake")
    protected int distanceToLake;
    @XmlElement(name = "DistanceToSea")
    protected int distanceToSea;
    @XmlElement(name = "DistanceToSeaOrLake")
    protected int distanceToSeaOrLake;
    @XmlElement(name = "DistanceToSkiLifts")
    protected int distanceToSkiLifts;

    /**
     * Gets the value of the page property.
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     */
    public void setPage(int value) {
        this.page = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the orderDirection property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDirection }
     *     
     */
    public OrderDirection getOrderDirection() {
        return orderDirection;
    }

    /**
     * Sets the value of the orderDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDirection }
     *     
     */
    public void setOrderDirection(OrderDirection value) {
        this.orderDirection = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     * @return
     *     possible object is
     *     {@link OrderBy }
     *     
     */
    public OrderBy getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderBy }
     *     
     */
    public void setOrderBy(OrderBy value) {
        this.orderBy = value;
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
     * Gets the value of the quicksearch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuicksearch() {
        return quicksearch;
    }

    /**
     * Sets the value of the quicksearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuicksearch(String value) {
        this.quicksearch = value;
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
     * Gets the value of the themeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ThemeFilterTypes }
     *     
     */
    public ThemeFilterTypes getThemeFilter() {
        return themeFilter;
    }

    /**
     * Sets the value of the themeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThemeFilterTypes }
     *     
     */
    public void setThemeFilter(ThemeFilterTypes value) {
        this.themeFilter = value;
    }

    /**
     * Gets the value of the houseApartmentType property.
     * 
     * @return
     *     possible object is
     *     {@link HouseApartmentTypes }
     *     
     */
    public HouseApartmentTypes getHouseApartmentType() {
        return houseApartmentType;
    }

    /**
     * Sets the value of the houseApartmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseApartmentTypes }
     *     
     */
    public void setHouseApartmentType(HouseApartmentTypes value) {
        this.houseApartmentType = value;
    }

    /**
     * Gets the value of the facilities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFacilities }
     *     
     */
    public ArrayOfFacilities getFacilities() {
        return facilities;
    }

    /**
     * Sets the value of the facilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFacilities }
     *     
     */
    public void setFacilities(ArrayOfFacilities value) {
        this.facilities = value;
    }

    /**
     * Gets the value of the accessibilities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccessibilities }
     *     
     */
    public ArrayOfAccessibilities getAccessibilities() {
        return accessibilities;
    }

    /**
     * Sets the value of the accessibilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccessibilities }
     *     
     */
    public void setAccessibilities(ArrayOfAccessibilities value) {
        this.accessibilities = value;
    }

    /**
     * Gets the value of the activities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfActivities }
     *     
     */
    public ArrayOfActivities getActivities() {
        return activities;
    }

    /**
     * Sets the value of the activities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfActivities }
     *     
     */
    public void setActivities(ArrayOfActivities value) {
        this.activities = value;
    }

    /**
     * Gets the value of the situations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSituations }
     *     
     */
    public ArrayOfSituations getSituations() {
        return situations;
    }

    /**
     * Sets the value of the situations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSituations }
     *     
     */
    public void setSituations(ArrayOfSituations value) {
        this.situations = value;
    }

    /**
     * Gets the value of the propertyTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPropertyTypes }
     *     
     */
    public ArrayOfPropertyTypes getPropertyTypes() {
        return propertyTypes;
    }

    /**
     * Sets the value of the propertyTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPropertyTypes }
     *     
     */
    public void setPropertyTypes(ArrayOfPropertyTypes value) {
        this.propertyTypes = value;
    }

    /**
     * Gets the value of the specialOffer property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialOffers }
     *     
     */
    public SpecialOffers getSpecialOffer() {
        return specialOffer;
    }

    /**
     * Sets the value of the specialOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialOffers }
     *     
     */
    public void setSpecialOffer(SpecialOffers value) {
        this.specialOffer = value;
    }

    /**
     * Gets the value of the paxMin property.
     * 
     */
    public int getPaxMin() {
        return paxMin;
    }

    /**
     * Sets the value of the paxMin property.
     * 
     */
    public void setPaxMin(int value) {
        this.paxMin = value;
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
     * Gets the value of the roomsMin property.
     * 
     */
    public int getRoomsMin() {
        return roomsMin;
    }

    /**
     * Sets the value of the roomsMin property.
     * 
     */
    public void setRoomsMin(int value) {
        this.roomsMin = value;
    }

    /**
     * Gets the value of the roomsMax property.
     * 
     */
    public int getRoomsMax() {
        return roomsMax;
    }

    /**
     * Sets the value of the roomsMax property.
     * 
     */
    public void setRoomsMax(int value) {
        this.roomsMax = value;
    }

    /**
     * Gets the value of the bedroomsMin property.
     * 
     */
    public int getBedroomsMin() {
        return bedroomsMin;
    }

    /**
     * Sets the value of the bedroomsMin property.
     * 
     */
    public void setBedroomsMin(int value) {
        this.bedroomsMin = value;
    }

    /**
     * Gets the value of the bedroomsMax property.
     * 
     */
    public int getBedroomsMax() {
        return bedroomsMax;
    }

    /**
     * Sets the value of the bedroomsMax property.
     * 
     */
    public void setBedroomsMax(int value) {
        this.bedroomsMax = value;
    }

    /**
     * Gets the value of the bathroomsMin property.
     * 
     */
    public int getBathroomsMin() {
        return bathroomsMin;
    }

    /**
     * Sets the value of the bathroomsMin property.
     * 
     */
    public void setBathroomsMin(int value) {
        this.bathroomsMin = value;
    }

    /**
     * Gets the value of the bathroomsMax property.
     * 
     */
    public int getBathroomsMax() {
        return bathroomsMax;
    }

    /**
     * Sets the value of the bathroomsMax property.
     * 
     */
    public void setBathroomsMax(int value) {
        this.bathroomsMax = value;
    }

    /**
     * Gets the value of the qualityMin property.
     * 
     */
    public int getQualityMin() {
        return qualityMin;
    }

    /**
     * Sets the value of the qualityMin property.
     * 
     */
    public void setQualityMin(int value) {
        this.qualityMin = value;
    }

    /**
     * Gets the value of the qualityMax property.
     * 
     */
    public int getQualityMax() {
        return qualityMax;
    }

    /**
     * Sets the value of the qualityMax property.
     * 
     */
    public void setQualityMax(int value) {
        this.qualityMax = value;
    }

    /**
     * Gets the value of the distanceToCenter property.
     * 
     */
    public int getDistanceToCenter() {
        return distanceToCenter;
    }

    /**
     * Sets the value of the distanceToCenter property.
     * 
     */
    public void setDistanceToCenter(int value) {
        this.distanceToCenter = value;
    }

    /**
     * Gets the value of the distanceToGolfCourse property.
     * 
     */
    public int getDistanceToGolfCourse() {
        return distanceToGolfCourse;
    }

    /**
     * Sets the value of the distanceToGolfCourse property.
     * 
     */
    public void setDistanceToGolfCourse(int value) {
        this.distanceToGolfCourse = value;
    }

    /**
     * Gets the value of the distanceToLake property.
     * 
     */
    public int getDistanceToLake() {
        return distanceToLake;
    }

    /**
     * Sets the value of the distanceToLake property.
     * 
     */
    public void setDistanceToLake(int value) {
        this.distanceToLake = value;
    }

    /**
     * Gets the value of the distanceToSea property.
     * 
     */
    public int getDistanceToSea() {
        return distanceToSea;
    }

    /**
     * Sets the value of the distanceToSea property.
     * 
     */
    public void setDistanceToSea(int value) {
        this.distanceToSea = value;
    }

    /**
     * Gets the value of the distanceToSeaOrLake property.
     * 
     */
    public int getDistanceToSeaOrLake() {
        return distanceToSeaOrLake;
    }

    /**
     * Sets the value of the distanceToSeaOrLake property.
     * 
     */
    public void setDistanceToSeaOrLake(int value) {
        this.distanceToSeaOrLake = value;
    }

    /**
     * Gets the value of the distanceToSkiLifts property.
     * 
     */
    public int getDistanceToSkiLifts() {
        return distanceToSkiLifts;
    }

    /**
     * Sets the value of the distanceToSkiLifts property.
     * 
     */
    public void setDistanceToSkiLifts(int value) {
        this.distanceToSkiLifts = value;
    }

}
