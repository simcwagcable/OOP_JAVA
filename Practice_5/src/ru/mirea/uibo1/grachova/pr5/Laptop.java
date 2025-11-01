package ru.mirea.uibo1.grachova.pr5;

public class Laptop implements Priceable {
    private String model;
    private double price;

    public Laptop(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}