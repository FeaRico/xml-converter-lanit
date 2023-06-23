package ru.makhach.xmlconverter.service.impl;

import org.springframework.stereotype.Service;
import ru.makhach.xmlconverter.model.xml.request.RequestLetter;
import ru.makhach.xmlconverter.model.xml.response.ResponseLetter;
import ru.makhach.xmlconverter.rules.Rule;
import ru.makhach.xmlconverter.service.ConvertService;

import java.util.List;

@Service
public class AlienConvertService implements ConvertService {
    private final List<Rule> rules;

    public AlienConvertService(List<Rule> rules) {
        this.rules = rules;
    }

    @Override
    public ResponseLetter convert(RequestLetter letter) {
        ResponseLetter responseLetter = new ResponseLetter();

        rules.forEach(rule -> rule.process(letter, responseLetter));

        return responseLetter;
    }
}
