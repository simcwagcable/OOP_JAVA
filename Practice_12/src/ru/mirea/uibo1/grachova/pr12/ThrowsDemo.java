package ru.mirea.uibo1.grachova.pr12;

public class ThrowsDemo {
    public void getDetails(String key) {
        try {
            if (key == null) {
                // Генерация (выбрасывание) нового исключения
                throw new NullPointerException("null key in getDetails");
            }
            // do something with the key
            System.out.println("Processing key: " + key);
        } catch (NullPointerException e) {
            // Перехват исключения внутри метода
            System.out.println("Caught inside getDetails: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        // Вызов с null-значением
        demo.getDetails(null);
        // Вызов с корректным значением
        demo.getDetails("test_key");
    }
}