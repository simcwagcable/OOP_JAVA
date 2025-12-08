package ru.mirea.uibo1.grachova.pr12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();

            // Преобразование строки в целое число
            int i = Integer.parseInt(intString);

            // Деление
            System.out.println(2/i);

        } catch (NumberFormatException e) {
            // Перехватывает Qwerty, 1.2, и т.д.
            System.out.println("Error: Input is not a valid integer format.");
        } catch (ArithmeticException e) {
            // Перехватывает 0
            System.out.println("Error: Attempted division by zero.");
        } finally {
            // Закрытие Scanner, чтобы избежать утечек ресурсов
            myScanner.close();
        }
    }

    public static void main(String[] args) {
        Exception2 demo = new Exception2();
        demo.exceptionDemo();
    }
}
