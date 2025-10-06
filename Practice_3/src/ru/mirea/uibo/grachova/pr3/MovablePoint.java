package ru.mirea.uibo.grachova.pr3;

public class MovablePoint implements Movable {
    // Поля protected, чтобы они были доступны внутри пакета и в подклассах (как в UML)
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    /** Конструктор, инициализирующий точку и ее скорость. */
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /** Геттеры для проверки в MovableRectangle */
    public int getXSpeed() { return xSpeed; }
    public int getYSpeed() { return ySpeed; }

    /** Реализация методов интерфейса Movable */
    @Override
    public void moveUp() {
        y -= ySpeed; // Уменьшаем Y для движения вверх
    }

    @Override
    public void moveDown() {
        y += ySpeed; // Увеличиваем Y для движения вниз
    }

    @Override
    public void moveLeft() {
        x -= xSpeed; // Уменьшаем X для движения влево
    }

    @Override
    public void moveRight() {
        x += xSpeed; // Увеличиваем X для движения вправо
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "), speed=(" + xSpeed + "," + ySpeed + ")";
    }
}