package ru.makhach.xmlconverter.rules.impl;

import org.springframework.stereotype.Component;
import ru.makhach.xmlconverter.model.xml.request.RequestLetter;
import ru.makhach.xmlconverter.model.xml.request.attribute.Document;
import ru.makhach.xmlconverter.model.xml.response.ResponseLetter;
import ru.makhach.xmlconverter.model.xml.response.attribute.Address;
import ru.makhach.xmlconverter.model.xml.response.attribute.Contacts;
import ru.makhach.xmlconverter.model.xml.response.attribute.Telephone;
import ru.makhach.xmlconverter.rules.Rule;

/**
 * Обработка {@link Contacts контактов}
 */
@Component
public class ContactsRule implements Rule {
    @Override
    public void process(RequestLetter letter, ResponseLetter responseLetter) {
        Document document = letter.getDocument();
        Contacts contacts = new Contacts();
        String telValue = document.getTel().getValue();
        if (telValue != null) {
            String number = telValue.replaceAll("[^0-9]", "");
            contacts.setTel(new Telephone(number));
        }
        String addressValue = document.getAddress().getValue();
        if (addressValue != null) {
            contacts.setAddress(new Address(addressValue));
        }
        responseLetter.setContacts(contacts);
    }
}
