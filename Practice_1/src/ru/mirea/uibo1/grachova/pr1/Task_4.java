package ru.mirea.uibo1.grachova.pr1;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Первые 10 членов гармонического ряда:");

        for (int n = 1; n <= 10; n++) {
            double term = 1.0 / n;
            System.out.printf("Член %2d: %.4f\n", n, term);
        }
    }
}