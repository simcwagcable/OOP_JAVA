package ru.mirea.uibo.grachova.pr3;


public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center; // Композиция: Круг ИМЕЕТ Точку

    /** * Конструктор: создает центральную точку и устанавливает радиус.
     * Параметры центра передаются MovablePoint.
     */
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    /** Движение круга определяется движением его центральной точки. */
    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle with radius=" + radius + " and center at " + center.toString();
    }
}