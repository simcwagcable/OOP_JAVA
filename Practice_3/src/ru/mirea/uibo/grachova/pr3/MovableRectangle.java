package ru.mirea.uibo.grachova.pr3;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    /**
     * Конструктор: создает две точки. Скорость должна быть одинаковой для обеих.
     */
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        // x1, y1 - координаты topLeft
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        // x2, y2 - координаты bottomRight
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    /** * Метод для проверки, что обе точки имеют одинаковую скорость.
     * Требуется по условию задания.
     */
    public boolean checkSpeeds() {
        // Сравниваем скорости обеих точек
        return (topLeft.getXSpeed() == bottomRight.getXSpeed()) &&
                (topLeft.getYSpeed() == bottomRight.getYSpeed());
    }

    /** Реализация Movable: движение прямоугольника = движение обеих его точек. */
    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle\n  topLeft: " + topLeft.toString() +
                "\n  bottomRight: " + bottomRight.toString() +
                "\n  Speeds are equal: " + checkSpeeds();
    }
}