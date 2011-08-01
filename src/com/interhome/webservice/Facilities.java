
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Facilities.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Facilities">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Aircondition"/>
 *     &lt;enumeration value="Balcony"/>
 *     &lt;enumeration value="BBQ"/>
 *     &lt;enumeration value="Cot"/>
 *     &lt;enumeration value="Dishwasher"/>
 *     &lt;enumeration value="Fireplace"/>
 *     &lt;enumeration value="Internet"/>
 *     &lt;enumeration value="Jacuzzi"/>
 *     &lt;enumeration value="LuxuriousFurnishings"/>
 *     &lt;enumeration value="ModernFurnishings"/>
 *     &lt;enumeration value="NiceKitchen"/>
 *     &lt;enumeration value="NiceSourroundings"/>
 *     &lt;enumeration value="Parking"/>
 *     &lt;enumeration value="Sauna"/>
 *     &lt;enumeration value="Swimmingpool"/>
 *     &lt;enumeration value="TV"/>
 *     &lt;enumeration value="WashingMachine"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Facilities")
@XmlEnum
public enum Facilities {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("Aircondition")
    AIRCONDITION("Aircondition"),
    @XmlEnumValue("Balcony")
    BALCONY("Balcony"),
    BBQ("BBQ"),
    @XmlEnumValue("Cot")
    COT("Cot"),
    @XmlEnumValue("Dishwasher")
    DISHWASHER("Dishwasher"),
    @XmlEnumValue("Fireplace")
    FIREPLACE("Fireplace"),
    @XmlEnumValue("Internet")
    INTERNET("Internet"),
    @XmlEnumValue("Jacuzzi")
    JACUZZI("Jacuzzi"),
    @XmlEnumValue("LuxuriousFurnishings")
    LUXURIOUS_FURNISHINGS("LuxuriousFurnishings"),
    @XmlEnumValue("ModernFurnishings")
    MODERN_FURNISHINGS("ModernFurnishings"),
    @XmlEnumValue("NiceKitchen")
    NICE_KITCHEN("NiceKitchen"),
    @XmlEnumValue("NiceSourroundings")
    NICE_SOURROUNDINGS("NiceSourroundings"),
    @XmlEnumValue("Parking")
    PARKING("Parking"),
    @XmlEnumValue("Sauna")
    SAUNA("Sauna"),
    @XmlEnumValue("Swimmingpool")
    SWIMMINGPOOL("Swimmingpool"),
    TV("TV"),
    @XmlEnumValue("WashingMachine")
    WASHING_MACHINE("WashingMachine");
    private final String value;

    Facilities(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Facilities fromValue(String v) {
        for (Facilities c: Facilities.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
