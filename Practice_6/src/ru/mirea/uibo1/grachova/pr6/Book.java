package ru.mirea.uibo1.grachova.pr6;

public class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Книга: " + title);
    }

    public static void printBooks(Printable[] printables) {
        System.out.println("\nПечать только Книг");
        for (Printable p : printables) {
            if (p instanceof Book) {
                p.print();
            }
        }
    }
}
