package ru.mirea.uibo1.grachova.pr7;

import java.util.Date;

public class Task1_1 {
    public static void main(String[] args) {
        long[] times = {
                10000L,
                100000L,
                1000000L,
                10000000L,
                100000000L,
                1000000000L,
                10000000000L,
                100000000000L
        };

        System.out.println("Задание №3: Класс Date");
        System.out.println("Дата и время для различных значений мс с 1 января 1970 г. GMT:");

        Date date = new Date();

        for (long time : times) {
            date.setTime(time);

            System.out.printf("\nМиллисекунд: %,d\n", time);
            // Отображаем дату и время с помощью метода toString()
            System.out.println("Дата (toString()): " + date.toString());
        }
    }
}