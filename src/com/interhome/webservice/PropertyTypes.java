
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PropertyTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Apartment"/>
 *     &lt;enumeration value="Bungalow"/>
 *     &lt;enumeration value="CastleManor"/>
 *     &lt;enumeration value="Chalet"/>
 *     &lt;enumeration value="DetachedHouse"/>
 *     &lt;enumeration value="Farmhouse"/>
 *     &lt;enumeration value="HistoricProperty"/>
 *     &lt;enumeration value="HolidayVillage"/>
 *     &lt;enumeration value="SpecialProperty"/>
 *     &lt;enumeration value="Villa"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PropertyTypes")
@XmlEnum
public enum PropertyTypes {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("Apartment")
    APARTMENT("Apartment"),
    @XmlEnumValue("Bungalow")
    BUNGALOW("Bungalow"),
    @XmlEnumValue("CastleManor")
    CASTLE_MANOR("CastleManor"),
    @XmlEnumValue("Chalet")
    CHALET("Chalet"),
    @XmlEnumValue("DetachedHouse")
    DETACHED_HOUSE("DetachedHouse"),
    @XmlEnumValue("Farmhouse")
    FARMHOUSE("Farmhouse"),
    @XmlEnumValue("HistoricProperty")
    HISTORIC_PROPERTY("HistoricProperty"),
    @XmlEnumValue("HolidayVillage")
    HOLIDAY_VILLAGE("HolidayVillage"),
    @XmlEnumValue("SpecialProperty")
    SPECIAL_PROPERTY("SpecialProperty"),
    @XmlEnumValue("Villa")
    VILLA("Villa");
    private final String value;

    PropertyTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PropertyTypes fromValue(String v) {
        for (PropertyTypes c: PropertyTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
