package org.example;

import java.util.Scanner;

public class LoginS {
    private AccountManager accountManager;

    public LoginS(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("📧 Email: ");
        String email = scanner.nextLine();

        System.out.print("🔑 Şifre: ");
        String password = scanner.nextLine();

        Account account = accountManager.login(email, password);

        if (account != null) {
            System.out.println(" Giriş başarılı!");
            account.showUserInfo();
            account.showInsurances();
        } else {
            System.out.println(" Giriş başarısız. Email veya şifre hatalı.");
        }

        scanner.close();
    }
}

