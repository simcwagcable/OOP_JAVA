package ru.mirea.uibo1.grachova.pr6;

public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Журнал: " + name);
    }

    public static void printMagazines(Printable[] printables) {
        System.out.println("\nПечать только Журналов");
        for (Printable p : printables) {
            if (p instanceof Magazine) {
                p.print();
            }
        }
    }
}
