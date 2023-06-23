package ru.makhach.xmlconverter.rules.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.makhach.xmlconverter.model.xml.request.RequestLetter;
import ru.makhach.xmlconverter.model.xml.request.attribute.Document;
import ru.makhach.xmlconverter.model.xml.response.ResponseLetter;
import ru.makhach.xmlconverter.rules.Rule;

/**
 * Обработка сообщений
 */
@Component
public class MessageRule implements Rule {
    @Value("${app.additionalParagraph}")
    private String additionalParagraph;

    @Override
    public void process(RequestLetter letter, ResponseLetter responseLetter) {
        Document document = letter.getDocument();
        for (String text : document.getText().split("\n")) {
            responseLetter.getMessage().add(text);
        }
        responseLetter.getMessage().add(additionalParagraph);
    }
}
