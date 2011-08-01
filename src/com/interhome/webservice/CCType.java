
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CCType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="VISA"/>
 *     &lt;enumeration value="MASTER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CCType")
@XmlEnum
public enum CCType {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    VISA("VISA"),
    MASTER("MASTER");
    private final String value;

    CCType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CCType fromValue(String v) {
        for (CCType c: CCType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
