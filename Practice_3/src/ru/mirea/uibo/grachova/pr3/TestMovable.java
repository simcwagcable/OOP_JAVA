package ru.mirea.uibo.grachova.pr3;


public class TestMovable {
    public static void main(String[] args) {
        // Тест 1: MovablePoint
        Movable mp = new MovablePoint(10, 20, 5, 8);
        System.out.println("--- MovablePoint Test ---");
        System.out.println("Start: " + mp);
        mp.moveUp();    // Y: 20 -> 12
        mp.moveRight(); // X: 10 -> 15
        System.out.println("End:   " + mp); // Ожидается: (15,12), speed=(5,8)

        // Тест 2: MovableCircle
        MovableCircle mc = new MovableCircle(0, 0, 1, 1, 5);
        System.out.println("--- MovableCircle Test ---");
        System.out.println("Start: " + mc);
        mc.moveDown();  // Y: 0 -> 1
        mc.moveLeft();  // X: 0 -> -1
        System.out.println("End:   " + mc); // Ожидается: (-1,1), speed=(1,1)


        // Тест 3: MovableRectangle
        MovableRectangle mr = new MovableRectangle(0, 10, 5, 0, 2, 3);
        System.out.println("--- MovableRectangle Test ---");
        System.out.println("Start:\n" + mr);
        mr.moveLeft();  // X: 0-> -2; X: 5-> 3
        mr.moveUp();    // Y: 10-> 7; Y: 0-> -3
        System.out.println("End:\n" + mr); // Ожидается: topLeft=(-2,7), bottomRight=(3,-3)

    }
}