package ru.makhach.xmlconverter.model.xml.request;

import lombok.Data;
import ru.makhach.xmlconverter.model.xml.request.attribute.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

/**
 * Неформатированное письмо
 */
@Data
@XmlRootElement(name = "Письмо_инопланетянам")
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestLetter {
    @XmlElement(name = "код_расы")
    private AttributeWithValue raceCode;

    @XmlElement(name = "created")
    private CreatedTime created;

    @XmlElement(name = "uid")
    private Uid uid;

    @XmlElement(name = "author")
    private List<Author> authors;

    @XmlElement(name = "document")
    private Document document;
}
