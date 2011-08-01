
package com.interhome.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVoucherDetailCost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVoucherDetailCost">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VoucherDetailCost" type="{http://www.interhome.com/webservice}VoucherDetailCost" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVoucherDetailCost", propOrder = {
    "voucherDetailCost"
})
public class ArrayOfVoucherDetailCost {

    @XmlElement(name = "VoucherDetailCost", nillable = true)
    protected List<VoucherDetailCost> voucherDetailCost;

    /**
     * Gets the value of the voucherDetailCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voucherDetailCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoucherDetailCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoucherDetailCost }
     * 
     * 
     */
    public List<VoucherDetailCost> getVoucherDetailCost() {
        if (voucherDetailCost == null) {
            voucherDetailCost = new ArrayList<VoucherDetailCost>();
        }
        return this.voucherDetailCost;
    }

}
