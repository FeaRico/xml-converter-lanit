package ru.makhach.xmlconverter.rules.impl;

import org.springframework.stereotype.Component;
import ru.makhach.xmlconverter.model.xml.request.RequestLetter;
import ru.makhach.xmlconverter.model.xml.response.ResponseLetter;
import ru.makhach.xmlconverter.rules.Rule;

import java.util.Date;

/**
 * Обработка времени отправки
 */
@Component
public class SentTimeRule implements Rule {
    @Override
    public void process(RequestLetter letter, ResponseLetter responseLetter) {
        responseLetter.setSentTime(new Date());
    }
}
