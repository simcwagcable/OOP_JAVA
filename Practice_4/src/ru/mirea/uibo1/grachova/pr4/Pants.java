package ru.mirea.uibo1.grachova.pr4;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем мужчину в Штаны: " + this.toString());
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеваем женщину в Штаны: " + this.toString());
    }
}

