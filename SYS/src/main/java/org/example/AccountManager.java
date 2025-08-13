package org.example;

import java.util.TreeSet;

public class AccountManager {
    private TreeSet<Account> accounts = new TreeSet<>();

    // Hesap ekleme
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Login işlemi
    public Account login(String email, String password) {
        for (Account account : accounts) {
            try {
                account.login(email, password); // Account sınıfındaki login metodu
                return account; // Başarılı giriş
            } catch (InvalidAuthenticationException e) {
                // Giriş başarısız, diğer hesaplara bakmaya devam
            }
        }
        return null; // Hiçbir hesapla giriş yapılamadı
    }

    // Tüm hesapları döndür
    public TreeSet<Account> getAccounts() {
        return accounts;
    }
}

