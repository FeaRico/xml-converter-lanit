package ru.makhach.xmlconverter.model.xml.response.attribute;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
    @XmlElement(name = "name", required = true)
    private String name;

    @XmlElement(name = "second_name")
    private String secondName;

    @XmlElement(name = "lastName", required = true)
    private String lastName;

    @XmlElement(name = "position", required = true)
    private String position;
}
