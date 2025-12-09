package ru.mirea.uibo1.grachova.pr14;

import java.io.*;
import java.util.Scanner;

public class FilesApp {
    private static final String FILE_NAME = "notes.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;

        try {

            System.out.println("1. Запись в файл");
            System.out.print("Введите текст для записи в файл (будет создан/перезаписан): ");
            text = scanner.nextLine();
            writeToFile(FILE_NAME, text, false);
            System.out.println("Текст успешно записан в файл " + FILE_NAME + ".");


            System.out.println("\n2. Чтение из файла");
            readFromFile(FILE_NAME);


            System.out.println("\n3. Замена информации в файле (перезапись)");
            System.out.print("Введите новый текст для полной замены в файле: ");
            text = scanner.nextLine();
            writeToFile(FILE_NAME, text, false);
            System.out.println("Информация в файле заменена.");
            System.out.println("Новое содержимое:");
            readFromFile(FILE_NAME);


            System.out.println("\n4. Добавление текста в конец файла");
            System.out.print("Введите текст для добавления в конец файла: ");
            text = scanner.nextLine();
            writeToFile(FILE_NAME, "\n" + text, true);
            System.out.println("Текст успешно добавлен в конец файла.");
            System.out.println("Финальное содержимое:");
            readFromFile(FILE_NAME);

        } catch (IOException ex) {
            System.out.println("Произошла ошибка ввода/вывода: " + ex.getMessage());
        } finally {
            scanner.close();
        }
    }


    private static void writeToFile(String fileName, String text, boolean append) throws IOException {

        try (FileWriter writer = new FileWriter(fileName, append)) {
            writer.write(text);
            writer.flush();
        }
    }

    private static void readFromFile(String fileName) throws IOException {

        try (FileReader reader = new FileReader(fileName)) {
            int character;
            System.out.println("Содержимое файла " + fileName + ":");

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
        }
    }
}
