package org.example;

import java.util.ArrayList;
import java.util.Date;

public class User {
    private String isim;
    private String soyad;
    private String email;
    private String pasword;
    private String meslek;
    private int age;
    private ArrayList<Address> addressArrayList;
    private Date lastlogin;

    public User(String isim, String soyad, String email, String pasword, String meslek, int age) {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email boş olamaz.");
        }

        this.isim = isim;
        this.soyad = soyad;
        this.email = email;
        this.pasword = pasword;
        this.meslek = meslek;
        this.age = age;
        this.addressArrayList = new ArrayList<>();
        this.lastlogin = lastlogin;
    }
    public String getIsim() {
        return isim;
    }


    public String getSoyad() {
        return soyad;
    }


    public String getEmail() {
        return email;
    }


    public String getPasword() {
        return pasword;
    }


    public String getMeslek() {
        return meslek;
    }


    public int getAge() {
        return age;
    }

    public ArrayList<Address> getAddressArrayList() {
        return addressArrayList;
    }

    public Date getLastlogin() {
        return lastlogin;
    }
}
