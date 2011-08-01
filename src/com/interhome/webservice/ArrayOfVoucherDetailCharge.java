
package com.interhome.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVoucherDetailCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVoucherDetailCharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VoucherDetailCharge" type="{http://www.interhome.com/webservice}VoucherDetailCharge" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVoucherDetailCharge", propOrder = {
    "voucherDetailCharge"
})
public class ArrayOfVoucherDetailCharge {

    @XmlElement(name = "VoucherDetailCharge", nillable = true)
    protected List<VoucherDetailCharge> voucherDetailCharge;

    /**
     * Gets the value of the voucherDetailCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voucherDetailCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoucherDetailCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoucherDetailCharge }
     * 
     * 
     */
    public List<VoucherDetailCharge> getVoucherDetailCharge() {
        if (voucherDetailCharge == null) {
            voucherDetailCharge = new ArrayList<VoucherDetailCharge>();
        }
        return this.voucherDetailCharge;
    }

}
