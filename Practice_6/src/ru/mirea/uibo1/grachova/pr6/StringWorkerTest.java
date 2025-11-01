package ru.mirea.uibo1.grachova.pr6;

public class StringWorkerTest {
    public static void main(String[] args) {
        StringWorker worker = new ProcessStrings();
        String testString = "HelloWorld";

        System.out.println("Тестовая строка: " + testString);

        // Подсчет символов
        System.out.println("Количество символов: " + worker.countCharacters(testString)); // 10

        // Символы на нечетных позициях (H, l, o, o, l)
        System.out.println("Символы на нечетных позициях (1, 3, 5...): " + worker.getOddPositionChars(testString)); // Hlool

        // Инвертирование строки
        System.out.println("Инвертированная строка: " + worker.invertString(testString)); // dlroWolleH
    }
}
