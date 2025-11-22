package ru.mirea.uibo1.grachova.pr11;

import java.util.Scanner;

public class Task6 {

    public static boolean isPrime(int n, int d) {
        if (d * d > n) {
            return true;
        }

        if (n % d == 0) {
            return false;
        }

        // Шаг рекурсии: Увеличиваем делитель и продолжаем проверку
        return isPrime(n, d + 1);
    }

    public static void checkPrime(int n) {
        if (n <= 1) {
            System.out.println("NO"); // По условию n > 1
            return;
        }

        if (isPrime(n, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        // Пример использования
        int n1 = 13;
        System.out.print(n1 + ": ");
        checkPrime(n1); // YES

        int n2 = 12;
        System.out.print(n2 + ": ");
        checkPrime(n2); // NO

        int n3 = 2;
        System.out.print(n3 + ": ");
        checkPrime(n3); // YES
    }
}