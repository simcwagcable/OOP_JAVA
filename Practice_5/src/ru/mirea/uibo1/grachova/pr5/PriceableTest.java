package ru.mirea.uibo1.grachova.pr5;

public class PriceableTest {
    public static void main(String[] args) {
        Priceable javaBook = new Book("Java: Полное руководство", 55.99);
        Priceable dellLaptop = new Laptop("Dell XPS 13", 1250.00);

        System.out.println("Цена книги: " + javaBook.getPrice() + "$");
        System.out.println("Цена ноутбука: " + dellLaptop.getPrice() + "$");
    }
}