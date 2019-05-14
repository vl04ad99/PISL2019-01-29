package logic;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum
public enum City {
   @XmlEnumValue("Минск") MINSK("Минск"),
    @XmlEnumValue("Гродно") GRODNO("Гродно"),
    @XmlEnumValue("Гомель") GOMEL("Гомель"),
    @XmlEnumValue("Витебск") VITEBSK("Витебск"),
    @XmlEnumValue("Брест") BREST("Брест");

    private String value;

    City(String s){
        this.value = s;
    }

    @Override
    public String toString() {
        return value;
    }
}
