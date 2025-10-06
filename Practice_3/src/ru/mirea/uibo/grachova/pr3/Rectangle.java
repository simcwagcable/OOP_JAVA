package ru.mirea.uibo.grachova.pr3;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    // Конструктор по умолчанию
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    // Конструктор с шириной и длиной
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    // Конструктор с шириной, длиной, цветом и заполнением
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Геттеры
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    // Сеттеры
    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Реализация абстрактного метода getArea()
    @Override
    public double getArea() {
        return width * length;
    }

    // Реализация абстрактного метода getPerimeter()
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Переопределение toString()
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}
