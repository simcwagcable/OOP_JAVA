package ru.mirea.uibo1.grachova.pr14;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyArrayList<E> {

    private E[] data;
    private int size = 0; // Фактическое количество элементов
    private static final int DEFAULT_CAPACITY = 10; // Емкость по умолчанию

    // Конструктор по умолчанию
    public MyArrayList() {
        this.data = (E[]) new Object[DEFAULT_CAPACITY];
    }

    // Конструктор с начальной емкостью
    public MyArrayList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Недопустимая емкость: " + capacity);
        }
        this.data = (E[]) new Object[capacity];
    }

    public boolean add(E element) {
        ensureCapacity(size + 1);
        data[size++] = element;
        return true;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", Размер: " + size);
        }
        return data[index];
    }


    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", Размер: " + size);
        }
        E oldValue = data[index];
        data[index] = element;
        return oldValue;
    }


    public int size() {
        return size;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > data.length) {
            int newCapacity = data.length * 2; // Увеличиваем вдвое
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }

            data = Arrays.copyOf(data, newCapacity);
        }
    }

    public static void main(String[] args) {
        System.out.println("3. Тестирование MyArrayList");
        MyArrayList<String> myStates = new MyArrayList<>();

        // Тестирование добавления (должно вызвать перераспределение, если превысит 10 элементов)
        for (int i = 0; i < 12; i++) {
            myStates.add("State " + (i + 1));
        }

        System.out.printf("В списке %d элементов\n", myStates.size());


        System.out.println("Элемент по индексу 5: " + myStates.get(5));
        myStates.set(5, "NEW STATE 6");
        System.out.println("Элемент по индексу 5 после set: " + myStates.get(5));

        System.out.println("\nВсе элементы:");
        for (int i = 0; i < myStates.size(); i++) {
            System.out.println("-> " + myStates.get(i));
        }
    }
}