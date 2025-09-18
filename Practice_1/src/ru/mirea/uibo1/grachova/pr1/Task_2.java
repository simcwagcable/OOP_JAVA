package ru.mirea.uibo1.grachova.pr1;
import java.util.Scanner;
public class Task_2 {public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите количество элементов массива: ");
    int arraySize = sc.nextInt();
    int[] array = new int[arraySize];
    System.out.println("Требуется ввести числа");
    int i = 0;
    do {
        System.out.println("Введите число для ячейки " + i + ": ");
        array[i] = sc.nextInt();
        i++;
    }
    while (i < arraySize);
    int sum = 0;
    int max = array[0];
    int min = array[0];
    i = 0;
    while (i < arraySize) {
        sum += array[i];
        if (array[i] > max) {
            max = array[i];
        }
        if (array[i] < min) {
            min = array[i];
        }
        i++;
    }
    System.out.println("Сумма элементов: " + sum);
    System.out.println("Максимальный элемент: " + max);
    System.out.println("Минимальный элемент: " + min);
}
}