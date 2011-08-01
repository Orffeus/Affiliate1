
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Salutation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Salutation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Mr"/>
 *     &lt;enumeration value="Mrs"/>
 *     &lt;enumeration value="MrAndMrs"/>
 *     &lt;enumeration value="Company"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Salutation")
@XmlEnum
public enum Salutation {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("Mr")
    MR("Mr"),
    @XmlEnumValue("Mrs")
    MRS("Mrs"),
    @XmlEnumValue("MrAndMrs")
    MR_AND_MRS("MrAndMrs"),
    @XmlEnumValue("Company")
    COMPANY("Company");
    private final String value;

    Salutation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Salutation fromValue(String v) {
        for (Salutation c: Salutation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
