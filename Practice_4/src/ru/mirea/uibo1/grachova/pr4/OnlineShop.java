package ru.mirea.uibo1.grachova.pr4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OnlineShop {
    private List<User> registeredUsers;
    private List<Catalog> catalogs;
    private ShoppingCart cart = new ShoppingCart();
    private Scanner scanner = new Scanner(System.in);
    private User currentUser = null; // Для хранения авторизованного пользователя

    public OnlineShop() {
        // Инициализация данных (пользователи, продукты, каталоги)
        registeredUsers = new ArrayList<>(Arrays.asList(
                new User("test", "111"),
                new User("admin", "root")
        ));

        // Создание продуктов
        Product tv = new Product("Smart TV Samsung", 45000.0);
        Product phone = new Product("iPhone 15", 105000.0);
        Product mouse = new Product("Logitech MX Master", 5000.0);
        Product keyboard = new Product("Механическая клавиатура", 8000.0);

        // Создание и наполнение каталогов
        Catalog electronics = new Catalog("Электроника");
        electronics.addProduct(tv);
        electronics.addProduct(phone);

        Catalog accessories = new Catalog("Аксессуары");
        accessories.addProduct(mouse);
        accessories.addProduct(keyboard);

        catalogs = new ArrayList<>(Arrays.asList(electronics, accessories));
    }

    // Метод авторизации
    public boolean authenticate() {
        System.out.println("\nАВТОРИЗАЦИЯ");
        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        for (User user : registeredUsers) {
            if (user.getLogin().equals(login) && user.checkPassword(password)) {
                currentUser = user;
                System.out.println("Авторизация успешна. Добро пожаловать, " + login + "!");
                return true;
            }
        }

        System.out.println("Ошибка: Неверный логин или пароль.");
        return false;
    }

    // Главный цикл приложения
    public void run() {
        if (!authenticate()) {
            return; // Выходим, если авторизация не удалась
        }

        boolean running = true;
        while (running) {
            System.out.println("\nГЛАВНОЕ МЕНЮ");
            System.out.println("1. Просмотреть каталоги");
            System.out.printf("2. Просмотреть корзину (Итого: %.2f руб.)\n", cart.getTotalPrice());
            System.out.println("3. Оформить заказ");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    selectCatalog();
                    break;
                case "2":
                    System.out.printf("\nОбщая стоимость товаров в корзине: %.2f руб.\n", cart.getTotalPrice());
                    break;
                case "3":
                    cart.checkout();
                    break;
                case "0":
                    running = false;
                    System.out.println("Спасибо за использование. До свидания!");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
        scanner.close();
    }

    // Логика выбора каталога
    private void selectCatalog() {
        boolean choosingCatalog = true;
        while (choosingCatalog) {
            System.out.println("\nДОСТУПНЫЕ КАТАЛОГИ");
            for (int i = 0; i < catalogs.size(); i++) {
                System.out.println((i + 1) + ". " + catalogs.get(i).getName());
            }
            System.out.println("0. Назад");
            System.out.print("Выберите номер каталога: ");
            try {
                int catalogIndex = Integer.parseInt(scanner.nextLine());
                if (catalogIndex == 0) {
                    choosingCatalog = false;
                } else if (catalogIndex > 0 && catalogIndex <= catalogs.size()) {
                    selectProduct(catalogs.get(catalogIndex - 1));
                } else {
                    System.out.println("Неверный номер каталога.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Введите число.");
            }
        }
    }

    // Логика выбора товара и добавления его в корзину
    private void selectProduct(Catalog catalog) {
        boolean choosingProduct = true;
        while (choosingProduct) {
            System.out.println("\nТОВАРЫ В КАТАЛОГЕ: " + catalog.getName());
            List<Product> products = catalog.getProducts();
            for (int i = 0; i < products.size(); i++) {
                System.out.println((i + 1) + ". " + products.get(i).toString());
            }
            System.out.println("0. Назад");
            System.out.print("Выберите номер товара для добавления в корзину (или 0 для возврата): ");
            try {
                int productIndex = Integer.parseInt(scanner.nextLine());
                if (productIndex == 0) {
                    choosingProduct = false;
                } else if (productIndex > 0 && productIndex <= products.size()) {
                    Product selectedProduct = products.get(productIndex - 1);
                    cart.addItem(selectedProduct);
                } else {
                    System.out.println("Неверный номер товара.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Введите число.");
            }
        }
    }

    public static void main(String[] args) {
        OnlineShop shop = new OnlineShop();
        shop.run(); // Запуск приложения
    }
}
