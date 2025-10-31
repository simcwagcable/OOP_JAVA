package ru.mirea.uibo1.grachova.pr7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false); // Не принимать нестрогие форматы (например, 2025-15-50)

        System.out.println("Задание 2: Сравнение дат");
        System.out.println("Текущая дата и время: " + sdf.format(new Date()));
        System.out.println("Введите дату и время для сравнения (формат " + dateFormat + "):");
        String userInput = scanner.nextLine();

        try {
            // 1. Парсим введенную пользователем строку в объект Date
            Date userDate = sdf.parse(userInput);
            // 2. Получаем текущую дату и время
            Date currentDate = new Date();

            System.out.println("\nСравнение:");

            // 3. Сравниваем даты с помощью метода compareTo()
            int result = userDate.compareTo(currentDate);

            if (result < 0) {
                // userDate меньше currentDate (т.е. раньше)
                System.out.println("Введенная дата (" + sdf.format(userDate) + ") РАНЬШЕ текущего системного времени.");
            } else if (result > 0) {
                // userDate больше currentDate (т.е. позже)
                System.out.println("Введенная дата (" + sdf.format(userDate) + ") ПОЗЖЕ текущего системного времени.");
            } else {
                // Даты равны
                System.out.println("Введенная дата (" + sdf.format(userDate) + ") СОВПАДАЕТ с текущим системным временем.");
            }
        } catch (ParseException e) {
            System.err.println("Ошибка: Введен неверный формат даты. Пожалуйста, используйте " + dateFormat + ".");
        } finally {
            scanner.close();
        }
    }
}
