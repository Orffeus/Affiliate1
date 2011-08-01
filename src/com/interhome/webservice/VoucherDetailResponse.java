
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VoucherDetailResult" type="{http://www.interhome.com/webservice}VoucherDetailReturnValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "voucherDetailResult"
})
@XmlRootElement(name = "VoucherDetailResponse")
public class VoucherDetailResponse {

    @XmlElement(name = "VoucherDetailResult")
    protected VoucherDetailReturnValue voucherDetailResult;

    /**
     * Gets the value of the voucherDetailResult property.
     * 
     * @return
     *     possible object is
     *     {@link VoucherDetailReturnValue }
     *     
     */
    public VoucherDetailReturnValue getVoucherDetailResult() {
        return voucherDetailResult;
    }

    /**
     * Sets the value of the voucherDetailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherDetailReturnValue }
     *     
     */
    public void setVoucherDetailResult(VoucherDetailReturnValue value) {
        this.voucherDetailResult = value;
    }

}
