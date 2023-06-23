package ru.makhach.xmlconverter.model.xml.response;

import lombok.Data;
import ru.makhach.xmlconverter.model.xml.adapter.SentTimeAdapter;
import ru.makhach.xmlconverter.model.xml.response.attribute.Contacts;
import ru.makhach.xmlconverter.model.xml.response.attribute.Title;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Форматированное письмо
 */
@Data
@XmlRootElement(name = "letter")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseLetter {
    @XmlElement(name = "title", required = true)
    private Title title;

    @XmlElementWrapper(name = "message", required = true)
    @XmlElement(name = "paragraph", required = true)
    private List<String> message = new ArrayList<>();

    @XmlElement(name = "contacts", required = true)
    private Contacts contacts;

    @XmlElement(name = "sent_time", required = true)
    @XmlJavaTypeAdapter(SentTimeAdapter.class)
    private Date sentTime;
}


