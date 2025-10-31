package ru.mirea.uibo1.grachova.pr7;

import java.util.Random;

public class Task2_2 {
    public static void main(String[] args) {
        // Создаем объект Random с начальным значением 1000
        Random generator = new Random(1000);

        System.out.println("Задание №4: Класс Random");
        System.out.println("Первые 50 случайных целых чисел (от 0 до 99) с начальным значением 1000:");

        for (int i = 0; i < 50; i++) {
            // nextInt(100) возвращает случайное значение от 0 до 100 (не включая 100)
            int randomNumber = generator.nextInt(100);
            System.out.printf("%3d ", randomNumber);

            // Перенос на новую строку каждые 10 чисел для удобства чтения
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
