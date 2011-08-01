
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Accessibilities.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Accessibilities">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="FamilyFrienldy"/>
 *     &lt;enumeration value="LiftsInhouse"/>
 *     &lt;enumeration value="NonSmoking"/>
 *     &lt;enumeration value="PetsWelcome"/>
 *     &lt;enumeration value="PetsNotAllowed"/>
 *     &lt;enumeration value="SuitableForSeniors"/>
 *     &lt;enumeration value="WheelchairAccessible"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Accessibilities")
@XmlEnum
public enum Accessibilities {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("FamilyFrienldy")
    FAMILY_FRIENLDY("FamilyFrienldy"),
    @XmlEnumValue("LiftsInhouse")
    LIFTS_INHOUSE("LiftsInhouse"),
    @XmlEnumValue("NonSmoking")
    NON_SMOKING("NonSmoking"),
    @XmlEnumValue("PetsWelcome")
    PETS_WELCOME("PetsWelcome"),
    @XmlEnumValue("PetsNotAllowed")
    PETS_NOT_ALLOWED("PetsNotAllowed"),
    @XmlEnumValue("SuitableForSeniors")
    SUITABLE_FOR_SENIORS("SuitableForSeniors"),
    @XmlEnumValue("WheelchairAccessible")
    WHEELCHAIR_ACCESSIBLE("WheelchairAccessible");
    private final String value;

    Accessibilities(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Accessibilities fromValue(String v) {
        for (Accessibilities c: Accessibilities.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
