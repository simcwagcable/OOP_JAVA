package ru.mirea.uibo1.grachova.pr2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(50, 20);
        System.out.println(b1);
        b1.move(10, 5);
        System.out.println(b1);
    }
}