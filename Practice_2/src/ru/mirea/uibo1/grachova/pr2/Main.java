package ru.mirea.uibo1.grachova.pr2;

public class Main {
    public static void main(String[] args) {
        Author author = new Author();
        System.out.println("hrt u.d su " + author);

        Author author1 = new Author("Толстой Лев Николаевич", "tolstoy@mail.ru", 'M', 82);
        Author author2 = new Author("Пушкин Александр Сергеевич", "pushkin@mail.ru", 'M', 37);

        System.out.println("Автор " + author1);
        System.out.println("Автор " + author2);

        author.setName("Марк Твен");
        author.setEmail("twen@mail.ru");
        author.setAge(50);
        author.setGender('m');

        System.out.println("\nАвтор " + author);
        System.out.println("Мой любимый автор это " + author.getName());
    }
}

