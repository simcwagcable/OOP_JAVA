package ru.mirea.uibo1.grachova.pr7;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        System.out.println("Задание 4: Создание Date и Calendar по вводу");

        try {
            // Сбор данных от пользователя
            System.out.print("Введите Год (yyyy): ");
            int year = scanner.nextInt();
            System.out.print("Введите Месяц (1-12): ");
            int month = scanner.nextInt();
            System.out.print("Введите Число (1-31): ");
            int day = scanner.nextInt();
            System.out.print("Введите Часы (0-23): ");
            int hour = scanner.nextInt();
            System.out.print("Введите Минуты (0-59): ");
            int minute = scanner.nextInt();

            // 1. Формирование объекта Calendar (GregorianCalendar)
            // Месяцы в Calendar начинаются с 0 (0=Январь, 11=Декабрь), поэтому вычитаем 1
            Calendar cal = new GregorianCalendar(year, month - 1, day, hour, minute);

            // 2. Формирование объекта Date
            // Получаем Date из Calendar
            Date userDate = cal.getTime();

            System.out.println("\nРезультат");
            System.out.println("Объект Calendar:");
            // Вывод Calendar
            System.out.println("  Год: " + cal.get(Calendar.YEAR));
            System.out.println("  Дата (отформатировано): " + sdf.format(userDate));

            System.out.println("\nОбъект Date:");
            System.out.println("  Дата (toString()): " + userDate.toString());
            System.out.println("  Дата (отформатировано): " + sdf.format(userDate));

        } catch (java.util.InputMismatchException e) {
            System.err.println("Ошибка ввода: Убедитесь, что вы вводите целые числа.");
        } finally {
            scanner.close();
        }
    }
}
