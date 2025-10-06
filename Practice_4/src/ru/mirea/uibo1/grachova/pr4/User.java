package ru.mirea.uibo1.grachova.pr4;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    // Метод для проверки пароля
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }
}
