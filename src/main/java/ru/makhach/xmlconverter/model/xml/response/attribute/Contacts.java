package ru.makhach.xmlconverter.model.xml.response.attribute;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Contacts {
    @XmlElement(name = "tel")
    private Telephone tel;

    @XmlElement(name = "address")
    private Address address;

    @XmlAttribute(name = "value")
    private String value = "not found";

    public void setTel(Telephone tel) {
        this.tel = tel;
        this.value = null;
    }

    public void setAddress(Address address) {
        this.address = address;
        this.value = null;
    }
}
