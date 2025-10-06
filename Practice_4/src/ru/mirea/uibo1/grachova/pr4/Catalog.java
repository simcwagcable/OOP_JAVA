package ru.mirea.uibo1.grachova.pr4;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private String name;
    private List<Product> products; // Список товаров в каталоге

    public Catalog(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }
}