package ru.mirea.uibo1.grachova.pr12;

public class Exception11 {
    public void exceptionDemo() {
        try {
            System.out.println(2/0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Exception1 demo = new Exception1();
        demo.exceptionDemo();
    }
}