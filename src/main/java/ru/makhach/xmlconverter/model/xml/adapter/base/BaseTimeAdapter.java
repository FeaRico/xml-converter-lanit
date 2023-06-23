package ru.makhach.xmlconverter.model.xml.adapter.base;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Базовая реализация {@link XmlAdapter} для форматирования дат
 */
public abstract class BaseTimeAdapter extends XmlAdapter<String, Date> {
    private final SimpleDateFormat dateFormat;

    protected BaseTimeAdapter(String format) {
        dateFormat = new SimpleDateFormat(format);
    }

    @Override
    public Date unmarshal(String s) throws Exception {
        return dateFormat.parse(s);
    }

    @Override
    public String marshal(Date date) {
        return dateFormat.format(date);
    }
}
