package ru.makhach.xmlconverter.model.xml.request.attribute;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class AttributeWithValue {
    @XmlElement(name = "value", required = true)
    private String value;
}
