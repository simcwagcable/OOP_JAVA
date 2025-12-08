package ru.mirea.uibo1.grachova.pr12;

public class Exception1 {
    public void exceptionDemo() {
        System.out.println(2/0);
    }

    public static void main(String[] args) {
        Exception1 demo = new Exception1();
        demo.exceptionDemo();
    }
}