package ru.makhach.xmlconverter.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * Утилитный класс для работы с датой
 */
public class DateUtils {
    public static Date plusDate(Date date, int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, year);
        calendar.add(Calendar.MONTH, month);
        calendar.add(Calendar.DAY_OF_YEAR, day);
        return calendar.getTime();
    }
}
