package ru.makhach.xmlconverter.model.xml.adapter;

import ru.makhach.xmlconverter.model.xml.adapter.base.BaseTimeAdapter;

/**
 * Форматирование времени отправки
 */
public class SentTimeAdapter extends BaseTimeAdapter {
    protected SentTimeAdapter() {
        super("yyyy-MM-dd HH:mm");
    }
}
