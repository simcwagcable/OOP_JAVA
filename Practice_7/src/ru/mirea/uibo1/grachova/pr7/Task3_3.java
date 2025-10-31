package ru.mirea.uibo1.grachova.pr7;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task3_3{

    // Вспомогательный метод для отображения даты
    private static void displayCalendarInfo(GregorianCalendar cal, String title) {
        // Получаем год, месяц (от 0 до 11) и день
        int year = cal.get(Calendar.YEAR);
        // Месяц всегда +1, так как Calendar нумерует их с 0
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);

        System.out.println(title);
        System.out.println("  Год: " + year);
        System.out.println("  Месяц: " + month);
        System.out.println("  День: " + day);
    }

    public static void main(String[] args) {

        System.out.println("Задание №5: Класс GregorianCalendar");

        // Безаргументный конструктор создает объект типа GregorianCalendar для текущей даты
        GregorianCalendar currentCal = new GregorianCalendar();
        displayCalendarInfo(currentCal, "1. Текущий год, месяц и день:");



        long specificTime = 1234567898765L; // Указанное время в мс

        GregorianCalendar specificCal = new GregorianCalendar();
        // Установка времени, прошедшего с 1 января 1970 г.
        specificCal.setTimeInMillis(specificTime);

        displayCalendarInfo(specificCal, "2. Год, месяц и день для " + specificTime + " мс:");
    }
}