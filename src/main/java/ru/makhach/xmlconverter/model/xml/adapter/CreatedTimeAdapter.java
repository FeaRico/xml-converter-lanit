package ru.makhach.xmlconverter.model.xml.adapter;

import ru.makhach.xmlconverter.model.xml.adapter.base.BaseTimeAdapter;

/**
 * Форматирование времени создания
 */
public class CreatedTimeAdapter extends BaseTimeAdapter {
    protected CreatedTimeAdapter() {
        super("yyyy-MM-dd_HH:mm");
    }
}
