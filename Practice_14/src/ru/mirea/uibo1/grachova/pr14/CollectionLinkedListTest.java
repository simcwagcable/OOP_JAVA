package ru.mirea.uibo1.grachova.pr14;

import java.util.LinkedList;

public class CollectionLinkedListTest {

        static class Person {
        private String name;
        public Person(String value){ name = value; }
        String getName() { return name; }
    }

    public static void main(String[] args) {
        System.out.println("2. Тестирование LinkedList (String)");
        LinkedList<String> states = new LinkedList<>();

        states.add("Германия");
        states.add("Франция");
        states.addLast("Великобритания");
        states.addFirst("Испания");
        states.add(1, "Италия");

        System.out.printf("В списке %d элементов:\n", states.size());
        for(String state: states) {
            System.out.println("-> " + state);
        }

        System.out.println("\nПервый элемент: " + states.getFirst());
        System.out.println("Последний элемент: " + states.getLast());

        states.remove("Германия");
        states.removeFirst();
        states.removeLast();

        System.out.printf("\nВ списке %d элементов (после удалений):\n", states.size());
        for(String state: states) {
            System.out.println("-> " + state);
        }

        System.out.println("\n2. Тестирование LinkedList (Person)");
        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));

        people.remove(1);

        System.out.println("Оставшиеся объекты Person:");
        for(Person p: people) {
            System.out.println("-> " + p.getName());
        }
    }
}
