
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThemeFilterTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ThemeFilterTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="SunAndBeach"/>
 *     &lt;enumeration value="WinterSki"/>
 *     &lt;enumeration value="LakesAndMountains"/>
 *     &lt;enumeration value="SkiChalets"/>
 *     &lt;enumeration value="VillasWithPrivatePool"/>
 *     &lt;enumeration value="Countryside"/>
 *     &lt;enumeration value="Cities"/>
 *     &lt;enumeration value="Islands"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ThemeFilterTypes")
@XmlEnum
public enum ThemeFilterTypes {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("SunAndBeach")
    SUN_AND_BEACH("SunAndBeach"),
    @XmlEnumValue("WinterSki")
    WINTER_SKI("WinterSki"),
    @XmlEnumValue("LakesAndMountains")
    LAKES_AND_MOUNTAINS("LakesAndMountains"),
    @XmlEnumValue("SkiChalets")
    SKI_CHALETS("SkiChalets"),
    @XmlEnumValue("VillasWithPrivatePool")
    VILLAS_WITH_PRIVATE_POOL("VillasWithPrivatePool"),
    @XmlEnumValue("Countryside")
    COUNTRYSIDE("Countryside"),
    @XmlEnumValue("Cities")
    CITIES("Cities"),
    @XmlEnumValue("Islands")
    ISLANDS("Islands");
    private final String value;

    ThemeFilterTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThemeFilterTypes fromValue(String v) {
        for (ThemeFilterTypes c: ThemeFilterTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
