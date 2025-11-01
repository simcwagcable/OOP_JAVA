package ru.mirea.uibo1.grachova.pr5;

public class NameableTest {
    public static void main(String[] args) {
        Nameable venus = new Planet("Венера");
        Nameable bmw = new Car("BMW X5");

        System.out.println("Имя объекта: " + venus.getName()); // Венера
        System.out.println("Имя объекта: " + bmw.getName());   // BMW X5
    }
}
