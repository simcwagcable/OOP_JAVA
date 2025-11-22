package ru.mirea.uibo1.grachova.pr11;

public class Task7 {

    public static void factorize(int n, int d) {
        if (n == 1) {
            return;
        }

        if (n % d == 0) {
            System.out.print(d + " ");
            factorize(n / d, d);
        } else {
            factorize(n, d + 1);
        }
    }

    public static void main(String[] args) {
        int n1 = 12;
        System.out.print(n1 + " -> ");
        factorize(n1, 2); // 2 2 3
        System.out.println();

        int n2 = 13;
        System.out.print(n2 + " -> ");
        factorize(n2, 2); // 13
        System.out.println();

        int n3 = 100;
        System.out.print(n3 + " -> ");
        factorize(n3, 2); // 2 2 5 5
        System.out.println();
    }
}
