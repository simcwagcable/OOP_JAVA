package ru.mirea.uibo1.grachova.pr7;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Task3{
    private String name;
    private int id;
    // Поле для хранения даты рождения
    private Date birthday;

    public Task3 (String name, int id, Date birthday) {
        this.name = name;
        this.id = id;
        this.birthday = birthday;
    }

    // Метод, возвращающий строковое представление даты рождения по заданному формату
    public String getFormattedBirthday(int format) {
        DateFormat df;
        Locale locale = new Locale("ru", "RU");

        switch (format) {
            case 1:
                // Короткий формат (например, 25.09.10)
                df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
                break;
            case 2:
                // Средний формат (например, 25 сент. 2010 г.)
                df = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
                break;
            case 3:
                // Полный формат (например, суббота, 25 сентября 2010 г.)
                df = DateFormat.getDateInstance(DateFormat.FULL, locale);
                break;
            default:
                df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
                break;
        }
        return df.format(this.birthday);
    }

    // Переопределенный метод toString()
    @Override
    public String toString() {
        // Используем DateFormat.MEDIUM для отображения в toString()
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, new Locale("ru", "RU"));
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", birthday=" + df.format(birthday) +
                '}';
    }

    public static void main(String[] args) {
        // Создаем студента, устанавливая дату рождения (например, 20 сентября 2000)
        Date dob = new Date(100, 8, 20); // Используем устаревший конструктор для примера
        Task3 student = new Task3 ("Грачова Екатерина", 101, dob);

        System.out.println("Задание 3: Доработка класса Student");

        System.out.println("Объект Student (toString()): " + student);

        System.out.println("\nФорматы даты рождения:");
        System.out.println("1. Короткий формат (1): " + student.getFormattedBirthday(1));
        System.out.println("2. Средний формат (2): " + student.getFormattedBirthday(2));
        System.out.println("3. Полный формат (3): " + student.getFormattedBirthday(3));
    }
}
