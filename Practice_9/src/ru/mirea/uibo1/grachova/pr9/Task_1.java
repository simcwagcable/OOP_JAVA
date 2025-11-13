package ru.mirea.uibo1.grachova.pr9;

public class Task_1 {
    int count;
    public static void main(String[] args) {
        // ...
    }

    public int getCount() {
        return count;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }
}