package ru.makhach.xmlconverter.rules;

import ru.makhach.xmlconverter.model.xml.request.RequestLetter;
import ru.makhach.xmlconverter.model.xml.response.ResponseLetter;

/**
 * Правила обработки XML-документа
 */
public interface Rule {
    void process(RequestLetter letter, ResponseLetter responseLetter);
}
