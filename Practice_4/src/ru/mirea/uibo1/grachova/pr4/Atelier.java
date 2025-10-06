package ru.mirea.uibo1.grachova.pr4;

public class Atelier {

    // Метод для одевания женщин
    public void dressWomen(Clothes[] allClothes) {
        System.out.println("\nОДЕЖДА ДЛЯ ЖЕНЩИНЫ");
        for (Clothes item : allClothes) {
            // Проверяем, реализует ли объект интерфейс WomenClothing
            if (item instanceof WomenClothing) {
                // Приводим тип к WomenClothing (downcast) и вызываем метод
                ((WomenClothing) item).dressWomen();
            }
        }
    }

    // Метод для одевания мужчин
    public void dressMan(Clothes[] allClothes) {
        System.out.println("\nОДЕЖДА ДЛЯ МУЖЧИНЫ");
        for (Clothes item : allClothes) {
            // Проверяем, реализует ли объект интерфейс MenClothing
            if (item instanceof MenClothing) {
                // Приводим тип к MenClothing (downcast) и вызываем метод
                ((MenClothing) item).dressMan();
            }
        }
    }

    public static void main(String[] args) {
        // Создаем массив объектов типа Clothes (Upcasting)
        Clothes[] assortment = {
                new TShirt(Size.M, 1500.0, "Белый"),
                new Pants(Size.L, 3500.0, "Синий"),
                new Skirt(Size.S, 2000.0, "Красный"),
                new Tie(Size.XXS, 800.0, "Черный"),
                new TShirt(Size.XXS, 1000.0, "Зеленый")
        };

        Atelier atelier = new Atelier();
        atelier.dressWomen(assortment);
        atelier.dressMan(assortment);
    }
}
