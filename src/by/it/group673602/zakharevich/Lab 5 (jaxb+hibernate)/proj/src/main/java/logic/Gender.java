package logic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum(String.class)
public enum Gender{
    @XmlEnumValue("Мужской") MAN("Мужской"),
    @XmlEnumValue("Женский") WOMAN("Женский");

    private String value;

    Gender(String s){
        this.value = s;
    }

    @Override
    public String toString(){
        return value;
    }
}