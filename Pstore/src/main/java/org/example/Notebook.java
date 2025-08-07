package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Notebook {
    private int id;
    private String urunAdi;
    private int fiyat;
    private String marka;
    private int depolama;
    private double ekran;
    private int ram;

    public Notebook(int id, String urunAdi, int fiyat, String marka, int depolama, double ekran, int ram) {
        this.id = id;
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
        this.marka = marka;
        this.depolama = depolama;
        this.ekran = ekran;
        this.ram = ram;
    }

    public void yazdir() {
        System.out.format("| %-4d | %-15s | %-10s | %-6d TL | %-4d GB RAM | %-5d GB SSD | %.1f inç |\n",
                id, urunAdi, marka, fiyat, ram, depolama, ekran);
    }

    public int getId() { return id; }
    public String getMarka() { return marka; }

    public static void markaSiralama() {
        ArrayList<String> markalar = new ArrayList<>();
        Collections.addAll(markalar, "Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster");
        Collections.sort(markalar, String::compareToIgnoreCase);
        System.out.println("💻 Notebook Markaları:");
        markalar.forEach(m -> System.out.println("- " + m));
    }
}