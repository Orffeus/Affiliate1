
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderBy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderBy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Favorite"/>
 *     &lt;enumeration value="Price"/>
 *     &lt;enumeration value="Place"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderBy")
@XmlEnum
public enum OrderBy {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("Favorite")
    FAVORITE("Favorite"),
    @XmlEnumValue("Price")
    PRICE("Price"),
    @XmlEnumValue("Place")
    PLACE("Place");
    private final String value;

    OrderBy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderBy fromValue(String v) {
        for (OrderBy c: OrderBy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
