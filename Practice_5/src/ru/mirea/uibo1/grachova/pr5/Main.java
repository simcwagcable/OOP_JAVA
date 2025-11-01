package ru.mirea.uibo1.grachova.pr5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Тестирование MovablePoint");
        MovablePoint p1 = new MovablePoint(0, 0, 5, 10);
        System.out.println("Начало: " + p1);

        p1.moveRight();
        p1.moveUp();
        System.out.println("После moveRight() и moveUp(): " + p1);

        p1.moveLeft();
        p1.moveDown();
        System.out.println("После moveLeft() и moveDown(): " + p1);

        System.out.println("\nТестирование MovableCircle");
        MovableCircle c1 = new MovableCircle(10, 10, 2, 3, 5);
        System.out.println("Начало: " + c1);

        c1.moveDown();
        c1.moveRight();
        System.out.println("После moveDown() и moveRight(): " + c1);

        Movable m = new MovablePoint(50, 50, 1, 1);
        System.out.println("\nТестирование интерфейсной ссылки");
        System.out.println("Объект Movable до: " + m);
        m.moveLeft();
        System.out.println("Объект Movable после moveLeft(): " + m);

    }
}