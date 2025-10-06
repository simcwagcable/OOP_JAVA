package ru.mirea.uibo.grachova.pr3;
public abstract class Shape {
    // Защищенные поля (protected, отмечены '#' в UML)
    protected String color;
    protected boolean filled;

    // Конструктор по умолчанию
    public Shape() {
        this.color = "unknown";
        this.filled = false;
    }

    // Параметризованный конструктор
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Геттеры
    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    // Сеттеры
    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Абстрактные методы, которые должны быть реализованы в подклассах
    public abstract double getArea();
    public abstract double getPerimeter();

    // Метод toString()
    @Override
    public String toString() {
        return "Shape: color=" + color + ", filled=" + filled;
    }
}