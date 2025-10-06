package ru.mirea.uibo1.grachova.pr4;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    // Метод добавления товара
    public void addItem(Product product) {
        this.items.add(product);
        System.out.println("-> Добавлен в корзину: " + product.getName());
    }

    // Метод расчета общей стоимости
    public double getTotalPrice() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    // Метод оформления заказа
    public void checkout() {
        System.out.println("\nОФОРМЛЕНИЕ ЗАКАЗА");
        if (items.isEmpty()) {
            System.out.println("Ваша корзина пуста. Нечего оформлять.");
            return;
        }

        System.out.println("Товары в корзине:");
        for (Product item : items) {
            System.out.println("- " + item.toString());
        }
        // Вывод итоговой суммы
        System.out.printf("ИТОГО к оплате: %.2f руб.\n", getTotalPrice());
        System.out.println("Заказ успешно оформлен! Благодарим за покупку.");
        items.clear(); // Очистка корзины после покупки
    }
}