package ru.mirea.uibo1.grachova.pr13;

public class InsertionSort {

    public static void insertionSort(Comparable[] list) {
        for (int index = 1; index < list.length; index++) {
            Comparable currentElement = list[index];
            int position = index;

            // Сдвиг и сравнение с использованием compareTo()
            while (position > 0 && currentElement.compareTo(list[position - 1]) < 0) {
                list[position] = list[position - 1];
                position--;
            }
            list[position] = currentElement;
        }
    }
}