
package com.interhome.webservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Situations.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Situations">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="ByTheSea"/>
 *     &lt;enumeration value="InAHistoricTown"/>
 *     &lt;enumeration value="InAMajorCity"/>
 *     &lt;enumeration value="InTheCountryside"/>
 *     &lt;enumeration value="InALakesideTown"/>
 *     &lt;enumeration value="SeaView"/>
 *     &lt;enumeration value="SomewhereQuiet"/>
 *     &lt;enumeration value="OnAIsland"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Situations")
@XmlEnum
public enum Situations {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("ByTheSea")
    BY_THE_SEA("ByTheSea"),
    @XmlEnumValue("InAHistoricTown")
    IN_A_HISTORIC_TOWN("InAHistoricTown"),
    @XmlEnumValue("InAMajorCity")
    IN_A_MAJOR_CITY("InAMajorCity"),
    @XmlEnumValue("InTheCountryside")
    IN_THE_COUNTRYSIDE("InTheCountryside"),
    @XmlEnumValue("InALakesideTown")
    IN_A_LAKESIDE_TOWN("InALakesideTown"),
    @XmlEnumValue("SeaView")
    SEA_VIEW("SeaView"),
    @XmlEnumValue("SomewhereQuiet")
    SOMEWHERE_QUIET("SomewhereQuiet"),
    @XmlEnumValue("OnAIsland")
    ON_A_ISLAND("OnAIsland");
    private final String value;

    Situations(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Situations fromValue(String v) {
        for (Situations c: Situations.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
