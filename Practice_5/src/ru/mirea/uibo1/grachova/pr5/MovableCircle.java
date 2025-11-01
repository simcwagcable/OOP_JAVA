package ru.mirea.uibo1.grachova.pr5;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Movable Circle with radius=" + radius + ", center=" + center.toString();
    }

    @Override
    public void moveUp() {
        center.moveUp(); // [cite: 135]
    }

    @Override
    public void moveDown() {
        center.moveDown(); // [cite: 136]
    }

    @Override
    public void moveLeft() {
        center.moveLeft(); // [cite: 137]
    }

    @Override
    public void moveRight() {
        center.moveRight(); // [cite: 138]
    }
}