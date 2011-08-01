
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalServiceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="CostsOnInvoice"/>
 *     &lt;enumeration value="InPriceIncluded"/>
 *     &lt;enumeration value="ExtracostOnPlace"/>
 *     &lt;enumeration value="BookableServiceOnInvoice"/>
 *     &lt;enumeration value="BookbaleServiceOnPlace"/>
 *     &lt;enumeration value="BookableOnPlacePayableOnPlace"/>
 *     &lt;enumeration value="SelfOrganised"/>
 *     &lt;enumeration value="BookableServiceNoCost"/>
 *     &lt;enumeration value="CommissionDiscount"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdditionalServiceType")
@XmlEnum
public enum AdditionalServiceType {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("CostsOnInvoice")
    COSTS_ON_INVOICE("CostsOnInvoice"),
    @XmlEnumValue("InPriceIncluded")
    IN_PRICE_INCLUDED("InPriceIncluded"),
    @XmlEnumValue("ExtracostOnPlace")
    EXTRACOST_ON_PLACE("ExtracostOnPlace"),
    @XmlEnumValue("BookableServiceOnInvoice")
    BOOKABLE_SERVICE_ON_INVOICE("BookableServiceOnInvoice"),
    @XmlEnumValue("BookbaleServiceOnPlace")
    BOOKBALE_SERVICE_ON_PLACE("BookbaleServiceOnPlace"),
    @XmlEnumValue("BookableOnPlacePayableOnPlace")
    BOOKABLE_ON_PLACE_PAYABLE_ON_PLACE("BookableOnPlacePayableOnPlace"),
    @XmlEnumValue("SelfOrganised")
    SELF_ORGANISED("SelfOrganised"),
    @XmlEnumValue("BookableServiceNoCost")
    BOOKABLE_SERVICE_NO_COST("BookableServiceNoCost"),
    @XmlEnumValue("CommissionDiscount")
    COMMISSION_DISCOUNT("CommissionDiscount");
    private final String value;

    AdditionalServiceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdditionalServiceType fromValue(String v) {
        for (AdditionalServiceType c: AdditionalServiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
