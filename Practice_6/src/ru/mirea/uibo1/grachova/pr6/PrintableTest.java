package ru.mirea.uibo1.grachova.pr6;

public class PrintableTest {
    public static void main(String[] args) {
        Printable[] printables = new Printable[4];
        printables[0] = new Book("Война и мир");
        printables[1] = new Magazine("Хакер");
        printables[2] = new Book("Преступление и наказание");
        printables[3] = new Magazine("Наука и жизнь");


        Magazine.printMagazines(printables);

        Book.printBooks(printables);
    }
}
