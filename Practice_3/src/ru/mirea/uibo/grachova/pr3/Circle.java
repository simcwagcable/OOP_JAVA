package ru.mirea.uibo.grachova.pr3;

public class Circle extends Shape {
    protected double radius;

    // Конструктор по умолчанию
    public Circle() {
        super(); // Вызов конструктора Shape()
        this.radius = 1.0;
    }

    // Конструктор с радиусом
    public Circle(double radius) {
        super(); // Вызов конструктора Shape()
        this.radius = radius;
    }

    // Конструктор с радиусом, цветом и заполнением
    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // Вызов конструктора Shape(color, filled)
        this.radius = radius;
    }

    // Геттер
    public double getRadius() {
        return radius;
    }

    // Сеттер
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Реализация абстрактного метода getArea()
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Реализация абстрактного метода getPerimeter()
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Переопределение toString()
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
