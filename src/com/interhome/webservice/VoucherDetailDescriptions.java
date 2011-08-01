
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoucherDetailDescriptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoucherDetailDescriptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DescriptionTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descriptions" type="{http://www.interhome.com/webservice}ArrayOfVoucherDetailDescription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoucherDetailDescriptions", propOrder = {
    "descriptionTitle",
    "descriptions"
})
public class VoucherDetailDescriptions {

    @XmlElement(name = "DescriptionTitle")
    protected String descriptionTitle;
    @XmlElement(name = "Descriptions")
    protected ArrayOfVoucherDetailDescription descriptions;

    /**
     * Gets the value of the descriptionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionTitle() {
        return descriptionTitle;
    }

    /**
     * Sets the value of the descriptionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionTitle(String value) {
        this.descriptionTitle = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVoucherDetailDescription }
     *     
     */
    public ArrayOfVoucherDetailDescription getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVoucherDetailDescription }
     *     
     */
    public void setDescriptions(ArrayOfVoucherDetailDescription value) {
        this.descriptions = value;
    }

}
