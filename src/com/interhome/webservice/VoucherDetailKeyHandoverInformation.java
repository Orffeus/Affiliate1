
package com.interhome.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoucherDetailKeyHandoverInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoucherDetailKeyHandoverInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GeoLat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="GeoLng" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="GoogleMapsLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoucherDetailKeyHandoverInformation", propOrder = {
    "title",
    "geoLat",
    "geoLng",
    "googleMapsLink",
    "description"
})
public class VoucherDetailKeyHandoverInformation {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "GeoLat", required = true)
    protected BigDecimal geoLat;
    @XmlElement(name = "GeoLng", required = true)
    protected BigDecimal geoLng;
    @XmlElement(name = "GoogleMapsLink")
    protected String googleMapsLink;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Gets the value of the googleMapsLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoogleMapsLink() {
        return googleMapsLink;
    }

    /**
     * Sets the value of the googleMapsLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoogleMapsLink(String value) {
        this.googleMapsLink = value;
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

}
