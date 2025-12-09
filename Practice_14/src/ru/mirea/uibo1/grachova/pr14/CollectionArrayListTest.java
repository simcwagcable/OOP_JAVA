package ru.mirea.uibo1.grachova.pr14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionArrayListTest {

    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<>(5);
        System.out.println("1. Тестирование ArrayList");

        states.add("Германия");
        states.add("Франция");
        states.add("Великобритания");
        states.add("Испания");
        states.add(1, "Италия");

        System.out.printf("В списке %d элементов (после добавлений)\n", states.size());

        System.out.println("Элементы списка:");
        for(String state: states) {
            System.out.println("-> " + state);
        }

        System.out.println("\n2-й объект (индекс 1): " + states.get(1));

        states.set(1, "Дания");
        System.out.println("2-й объект после states.set(1, \"Дания\"): " + states.get(1));

        if(states.contains("Германия")){
            System.out.println("\nСписок содержит государство Германия");
        }

        states.remove("Германия");
        states.remove(0);

        System.out.printf("\nВ списке %d элементов (после удалений)\n", states.size());
        System.out.println("Оставшиеся элементы:");
        for(String state: states) {
            System.out.println("-> " + state);
        }
    }
}
