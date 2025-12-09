package ru.mirea.uibo1.grachova.pr13;

import java.util.Arrays;

public class TestMergeSort {
    public static void main(String[] args) {
        Student[] list1 = {
                new Student("Kim", 115, 4.3),
                new Student("Mia", 114, 4.9),
                new Student("Leo", 111, 3.0)
        };

        Student[] list2 = {
                new Student("Pam", 116, 3.1),
                new Student("Nora", 113, 3.8),
                new Student("Omar", 112, 4.6)
        };

        System.out.println("\n3. Сортировка слиянием (Comparable)");
        System.out.println("Список 1: " + Arrays.toString(list1));
        System.out.println("Список 2: " + Arrays.toString(list2));

        Comparable[] mergedAndSorted = MergeSort.mergeTwoListsAndSort(list1, list2);

        System.out.println("\nОбъединенный и отсортированный список (по iDNumber):");
        for (Comparable s : mergedAndSorted) {
            System.out.println(s);
        }
    }
}