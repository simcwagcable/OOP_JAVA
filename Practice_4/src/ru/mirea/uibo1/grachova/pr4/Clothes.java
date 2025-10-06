package ru.mirea.uibo1.grachova.pr4;

public abstract class Clothes {
    // Общие поля: размер, стоимость, цвет
    private Size size;
    private double price;
    private String color;

    // Конструктор
    public Clothes(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    // Геттеры
    public Size getSize() { return size; }
    public double getPrice() { return price; }
    public String getColor() { return color; }

    // Переопределение toString для вывода информации
    @Override
    public String toString() {
        return "Тип: " + this.getClass().getSimpleName() +
                ", Размер: " + size +
                " (" + size.getEuroSize() + " Euro, " + size.getDescription() + ")" +
                ", Цвет: " + color +
                ", Цена: " + price + " руб.";
    }
}