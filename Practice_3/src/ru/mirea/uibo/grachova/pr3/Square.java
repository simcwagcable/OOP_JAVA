package ru.mirea.uibo.grachova.pr3;


public class Square extends Rectangle {

    // Конструктор по умолчанию
    public Square() {
        super();
    }

    // Конструктор со стороной (side)
    public Square(double side) {
        super(side, side);
    }

    // Конструктор со стороной, цветом и заполнением
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Геттер для стороны
    public double getSide() {
        return getWidth(); // Сторона равна ширине
    }

    // Сеттер для стороны (должен обновлять и width, и length)
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Переопределение сеттеров для поддержания равенства сторон
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // Переопределение toString()
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}