
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalutationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SalutationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Mr"/>
 *     &lt;enumeration value="Mrs"/>
 *     &lt;enumeration value="MrAndMrs"/>
 *     &lt;enumeration value="Blank"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SalutationType")
@XmlEnum
public enum SalutationType {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("Mr")
    MR("Mr"),
    @XmlEnumValue("Mrs")
    MRS("Mrs"),
    @XmlEnumValue("MrAndMrs")
    MR_AND_MRS("MrAndMrs"),
    @XmlEnumValue("Blank")
    BLANK("Blank");
    private final String value;

    SalutationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SalutationType fromValue(String v) {
        for (SalutationType c: SalutationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
