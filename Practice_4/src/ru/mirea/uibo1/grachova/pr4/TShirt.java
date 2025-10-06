package ru.mirea.uibo1.grachova.pr4;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем мужчину в Футболку: " + this.toString());
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеваем женщину в Футболку: " + this.toString());
    }
}
