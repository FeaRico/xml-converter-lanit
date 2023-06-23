package ru.makhach.xmlconverter.service;

import ru.makhach.xmlconverter.model.xml.request.RequestLetter;
import ru.makhach.xmlconverter.model.xml.response.ResponseLetter;

/**
 * Сервис обработки XML
 */
public interface ConvertService {
    ResponseLetter convert(RequestLetter letter);
}
