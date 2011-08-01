
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HouseApartmentTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HouseApartmentTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Apartment"/>
 *     &lt;enumeration value="DetachedHouse"/>
 *     &lt;enumeration value="House"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HouseApartmentTypes")
@XmlEnum
public enum HouseApartmentTypes {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("Apartment")
    APARTMENT("Apartment"),
    @XmlEnumValue("DetachedHouse")
    DETACHED_HOUSE("DetachedHouse"),
    @XmlEnumValue("House")
    HOUSE("House");
    private final String value;

    HouseApartmentTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HouseApartmentTypes fromValue(String v) {
        for (HouseApartmentTypes c: HouseApartmentTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
