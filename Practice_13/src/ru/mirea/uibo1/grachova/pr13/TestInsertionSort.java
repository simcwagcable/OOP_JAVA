package ru.mirea.uibo1.grachova.pr13;

public class TestInsertionSort {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alex", 103, 4.5),
                new Student("Bob", 101, 3.9),
                new Student("Helen", 105, 4.1),
                new Student("David", 102, 4.8)
        };

        System.out.println("1. Сортировка вставками по iDNumber");
        System.out.println("Список студентов до сортировки:");
        for (Student s : students) {
            System.out.println(s);
        }

        InsertionSort.insertionSort(students);

        System.out.println("\nСписок студентов после сортировки:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}