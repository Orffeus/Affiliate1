
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialOffers.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialOffers">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="AnySpecialOffer"/>
 *     &lt;enumeration value="EarlyBooker"/>
 *     &lt;enumeration value="LastMinute"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpecialOffers")
@XmlEnum
public enum SpecialOffers {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("AnySpecialOffer")
    ANY_SPECIAL_OFFER("AnySpecialOffer"),
    @XmlEnumValue("EarlyBooker")
    EARLY_BOOKER("EarlyBooker"),
    @XmlEnumValue("LastMinute")
    LAST_MINUTE("LastMinute");
    private final String value;

    SpecialOffers(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecialOffers fromValue(String v) {
        for (SpecialOffers c: SpecialOffers.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
