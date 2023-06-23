package ru.makhach.xmlconverter.model.xml.response.attribute;

import lombok.Data;
import ru.makhach.xmlconverter.model.xml.adapter.CreatedTimeAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Title {
    @XmlElement(name = "description", required = true)
    private String description;

    @XmlElement(name = "theme", required = true)
    private Theme theme;

    @XmlElement(name = "alien_race", required = true)
    private AlienRace alienRace;

    @XmlElement(name = "created", required = true)
    @XmlJavaTypeAdapter(CreatedTimeAdapter.class)
    private Date created;

    @XmlElement(name = "id", required = true)
    private TitleId id;

    @XmlElementWrapper(name = "authors", required = true)
    @XmlElement(name = "employee", required = true)
    private List<Employee> authors;
}
