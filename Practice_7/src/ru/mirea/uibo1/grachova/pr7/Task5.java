package ru.mirea.uibo1.grachova.pr7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task5 {

    private static final int COLLECTION_SIZE = 100000;
    private static final int SEARCH_ITERATIONS = 50000;

    public static void main(String[] args) {
        System.out.println("Задание 5: Сравнение производительности ArrayList и LinkedList");
        System.out.printf("Размер коллекции: %,d\n", COLLECTION_SIZE);

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("\n| Операция           | ArrayList (мс) | LinkedList (мс) | Вывод                   |");
        System.out.println("|--------------------|----------------|-----------------|-------------------------|");

        // 1. Сравнение операции ДОБАВЛЕНИЯ в конец (Add)
        compareOperation("Добавление (конец)", () -> addElements(arrayList), () -> addElements(linkedList));

        // 2. Сравнение операции ВСТАВКИ в начало (Insert)
        // Для демонстрации слабости ArrayList (сдвиг элементов)
        compareOperation("Вставка (начало)", () -> insertElements(new ArrayList<>()), () -> insertElements(new LinkedList<>()));

        // 3. Сравнение операции ПОИСКА (Get/Search) по индексу
        // Сначала заполняем коллекции
        addElements(arrayList);
        addElements(linkedList);
        compareOperation("Поиск по индексу (Get)", () -> getElements(arrayList), () -> getElements(linkedList));

        // 4. Сравнение операции УДАЛЕНИЯ из середины
        // Для демонстрации слабости LinkedList (нужен поиск индекса)
        compareOperation("Удаление (середина)", () -> removeMiddle(arrayList), () -> removeMiddle(linkedList));
    }

    // Вспомогательный метод для добавления элементов
    private static void addElements(List<Integer> list) {
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            list.add(i);
        }
    }

    // Вспомогательный метод для вставки элементов в начало
    private static void insertElements(List<Integer> list) {
        for (int i = 0; i < COLLECTION_SIZE; i++) {
            list.add(0, i); // Вставка в позицию 0
        }
    }

    // Вспомогательный метод для поиска по индексу
    private static void getElements(List<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < SEARCH_ITERATIONS; i++) {
            list.get(rand.nextInt(COLLECTION_SIZE));
        }
    }

    // Вспомогательный метод для удаления элемента из середины
    private static void removeMiddle(List<Integer> list) {
        for (int i = 0; i < 1000; i++) { // Удаляем 1000 элементов из середины
            if (!list.isEmpty()) {
                list.remove(list.size() / 2);
            }
        }
    }

    // Главный метод для сравнения и вывода
    private static void compareOperation(String operationName, Runnable arrayListOp, Runnable linkedListOp) {
        long startTime;
        long arrayListTime;
        long linkedListTime;
        String conclusion;

        // Измерение времени для ArrayList
        startTime = System.currentTimeMillis(); // Текущее время в мс
        arrayListOp.run();
        arrayListTime = System.currentTimeMillis() - startTime; // Прошедшее время

        // Измерение времени для LinkedList
        startTime = System.currentTimeMillis();
        linkedListOp.run();
        linkedListTime = System.currentTimeMillis() - startTime;

        // Вывод заключения
        if (arrayListTime < linkedListTime) {
            conclusion = "**ArrayList** быстрее";
        } else if (linkedListTime < arrayListTime) {
            conclusion = "**LinkedList** быстрее";
        } else {
            conclusion = "Время одинаковое";
        }

        System.out.printf("| %-18s | %-14d | %-15d | %-23s |\n",
                operationName, arrayListTime, linkedListTime, conclusion);
    }
}
