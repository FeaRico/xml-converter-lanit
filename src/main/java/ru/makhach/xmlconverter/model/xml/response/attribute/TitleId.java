package ru.makhach.xmlconverter.model.xml.response.attribute;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@Data
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class TitleId {
    @XmlAttribute(name = "description")
    private String description;

    @XmlAttribute(name = "value")
    private String value;
}
