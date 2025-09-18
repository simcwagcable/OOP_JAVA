package ru.mirea.uibo1.grachova.pr1;
public class Task_1 {public static void main(String[]args){
    int[] numbers = {15, 25, 35, 45, 55};
    int sum = 0;
    double average;

    for (int i = 0; i < numbers.length; i++) {
        sum += numbers[i];
    }

    average = (double) sum / numbers.length;

    System.out.println("Сумма элементов: " + sum);
    System.out.println("Среднее арифметическое: " + average);
}
}