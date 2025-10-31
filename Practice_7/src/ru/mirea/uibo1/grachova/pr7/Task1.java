package ru.mirea.uibo1.grachova.pr7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Task1{

    public static void main(String[] args) {
        // Фамилия разработчика
        String developerName = "Грачова";

        // Дата и время получения задания (фиксированная)
        // Устанавливаем дату, например, 25 октября 2025 года, 10:00:00
        long receivedTimeMillis = 1761376800000L; // 2025-10-25 10:00:00 GMT+3 (пример)
        Date receivedDate = new Date(receivedTimeMillis);

        // Дата и время сдачи задания (текущее время)
        // Используем Date() для получения текущего времени
        Date dueDate = new Date();

        // Форматировщик даты
        // Шаблон: 'EEEE, dd MMMM yyyy HH:mm:ss z' (Полный день, число месяц год часы:минуты:секунды часовой пояс)
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm:ss z", new Locale("ru", "RU"));

        System.out.println("Задание 1: Информация о работе");
        System.out.println("Разработчик: " + developerName);
        System.out.println("Дата и время получения задания: " + sdf.format(receivedDate));
        System.out.println("Дата и время сдачи задания: " + sdf.format(dueDate));
    }
}