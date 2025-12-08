package ru.mirea.uibo1.grachova.pr12;

import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();

            int i = Integer.parseInt(intString);
            System.out.println(2/i);

        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid integer format.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Attempted division by zero.");
        } finally {
            // Этот код выполняется ВСЕГДА: после try, или после catch.
            System.out.println("Finally block executed. Resource cleanup complete.");
            myScanner.close();
        }
    }

    public static void main(String[] args) {
        Exception4 demo = new Exception4();
        demo.exceptionDemo();
    }
}
