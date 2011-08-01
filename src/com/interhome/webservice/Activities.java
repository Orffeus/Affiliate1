
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Activities.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Activities">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Biking"/>
 *     &lt;enumeration value="CrossCountrySkiing"/>
 *     &lt;enumeration value="Golfing"/>
 *     &lt;enumeration value="Hiking"/>
 *     &lt;enumeration value="MountainBiking"/>
 *     &lt;enumeration value="Nightlife"/>
 *     &lt;enumeration value="NordicWalking"/>
 *     &lt;enumeration value="Riding"/>
 *     &lt;enumeration value="Sailing"/>
 *     &lt;enumeration value="Skiing"/>
 *     &lt;enumeration value="Snowboarding"/>
 *     &lt;enumeration value="Surfing"/>
 *     &lt;enumeration value="Tennis"/>
 *     &lt;enumeration value="ThemeParkNearby"/>
 *     &lt;enumeration value="Toboggan"/>
 *     &lt;enumeration value="Windsurfing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Activities")
@XmlEnum
public enum Activities {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("Biking")
    BIKING("Biking"),
    @XmlEnumValue("CrossCountrySkiing")
    CROSS_COUNTRY_SKIING("CrossCountrySkiing"),
    @XmlEnumValue("Golfing")
    GOLFING("Golfing"),
    @XmlEnumValue("Hiking")
    HIKING("Hiking"),
    @XmlEnumValue("MountainBiking")
    MOUNTAIN_BIKING("MountainBiking"),
    @XmlEnumValue("Nightlife")
    NIGHTLIFE("Nightlife"),
    @XmlEnumValue("NordicWalking")
    NORDIC_WALKING("NordicWalking"),
    @XmlEnumValue("Riding")
    RIDING("Riding"),
    @XmlEnumValue("Sailing")
    SAILING("Sailing"),
    @XmlEnumValue("Skiing")
    SKIING("Skiing"),
    @XmlEnumValue("Snowboarding")
    SNOWBOARDING("Snowboarding"),
    @XmlEnumValue("Surfing")
    SURFING("Surfing"),
    @XmlEnumValue("Tennis")
    TENNIS("Tennis"),
    @XmlEnumValue("ThemeParkNearby")
    THEME_PARK_NEARBY("ThemeParkNearby"),
    @XmlEnumValue("Toboggan")
    TOBOGGAN("Toboggan"),
    @XmlEnumValue("Windsurfing")
    WINDSURFING("Windsurfing");
    private final String value;

    Activities(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Activities fromValue(String v) {
        for (Activities c: Activities.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
