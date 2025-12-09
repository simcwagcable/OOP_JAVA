package ru.mirea.uibo1.grachova.pr13;

public class TestQuickSort {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Eva", 110, 3.5),
                new Student("Frank", 107, 4.9),
                new Student("Grace", 109, 4.0),
                new Student("Henry", 106, 3.2),
                new Student("Ivy", 108, 4.7)
        };

        SortingStudentsByGPA gpaComparator = new SortingStudentsByGPA();

        System.out.println("\n2. Быстрая сортировка по GPA (Comparator)");
        System.out.println("Список студентов до сортировки:");
        for (Student s : students) {
            System.out.println(s);
        }

        QuickSort.quickSort(students, gpaComparator);

        System.out.println("\nСписок студентов после сортировки по GPA (убывание):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}