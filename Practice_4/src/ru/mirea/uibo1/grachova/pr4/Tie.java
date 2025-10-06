package ru.mirea.uibo1.grachova.pr4;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем мужчину в Галстук: " + this.toString());
    }
}