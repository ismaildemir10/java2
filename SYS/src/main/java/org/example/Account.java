package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Account implements Comparable<Account> {
    protected User user;
    protected AuthenticationStatus authStatus = AuthenticationStatus.FAIL;
    protected List<Insurance> insuranceList =new ArrayList<>();


    public Account(User user) {
        this.user = user;
    }

    public final void showUserInfo() {
        System.out.println(" Müşteri Bilgileri:");
        System.out.println("Adı Soyadı : " + user.getIsim() + " " + user.getSoyad());
        System.out.println("E-posta    : " + user.getEmail());
        System.out.println("Meslek     : " + user.getMeslek());
        System.out.println("Yaş        : " + user.getAge());
        System.out.println("Son Giriş  : " + user.getLastlogin());
        System.out.println(" Adresler:" + user.getAddressArrayList());
        for (Address address : user.getAddressArrayList()) {
            System.out.println("- " + address);
        }
    }
    public void login(String email, String password) throws InvalidAuthenticationException {
        if (email == null || password == null || user == null ||
                user.getEmail() == null || user.getPasword() == null) {
            throw new InvalidAuthenticationException("Email veya şifre boş olamaz!");
        }

        if (user.getEmail().equals(email) && user.getPasword().equals(password)) {
            authStatus = AuthenticationStatus.SUCCESS;
        } else {
            throw new InvalidAuthenticationException("Email veya şifre hatalı!");
        }
    }

    public void addAddress(Address address) {
        AddressManager.addAdress(user, address);
    }

    public void removeAddress(Address address) {
        AddressManager.removeAdress(user, address);
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authStatus;
    }

    public abstract void addInsurance(Insurance insurance);

    public void showInsurances() {
        for (Insurance insurance : insuranceList) {
            System.out.println(insurance + " | Hesaplanan: " + insurance.calculate());
        }
    }

    @Override
    public int compareTo(Account other) {
        String thisEmail = (this.user != null) ? this.user.getEmail() : null;
        String otherEmail = (other.user != null) ? other.user.getEmail() : null;

        if (thisEmail == null && otherEmail == null) return 0;
        if (thisEmail == null) return -1;
        if (otherEmail == null) return 1;

        return thisEmail.compareTo(otherEmail);
    }

    @Override
    public int hashCode() {
        return (user != null && user.getEmail() != null) ? user.getEmail().hashCode() : 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Account)) return false;
        Account other = (Account) obj;

        String thisEmail = (this.user != null) ? this.user.getEmail() : null;
        String otherEmail = (other.user != null) ? other.user.getEmail() : null;

        if (thisEmail == null || otherEmail == null) return false;

        return thisEmail.equals(otherEmail);
    }
}


