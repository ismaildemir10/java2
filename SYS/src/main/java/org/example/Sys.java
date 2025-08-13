package org.example;

public class Sys {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();

        // Örnek kullanıcı ve hesap
        User user = new User("Ali", "Yılmaz", "ali@example.com", "1234", "Mühendis", 30);
        Account account = new Indivadual(user);
        manager.addAccount(account);

        // Login ekranı başlatılıyor
        LoginS screen = new LoginS(manager);
        screen.start();
    }
}
