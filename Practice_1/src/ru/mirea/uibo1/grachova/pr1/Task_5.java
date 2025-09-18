
package ru.mirea.uibo1.grachova.pr1;

import java.util.Scanner;

public class Task_5 {
    public int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task_5 factorialCalculator = new Task_5();

        System.out.println("Введите число для вычисления факториала:");
        int number = sc.nextInt();
        int factorial = factorialCalculator.calculateFactorial(number);

        System.out.println("Факториал числа " + number + " равен " + factorial);

        sc.close();
    }
}
