package ru.makhach.xmlconverter.model.xml.request.attribute;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import java.util.Date;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class CreatedTime {
    //    @XmlJavaTypeAdapter(CreatedTimeAdapter.class)
    @XmlAttribute(name = "date_time", required = true)
    private Date dateTime;
}
