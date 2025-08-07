package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Telefon {
    private int id;
    private String urunAdi;
    private int fiyat;
    private String marka;
    private int hafiza;
    private double ekran;
    private int pil;
    private int ram;
    private String renk;

    public Telefon(int id, String urunAdi, int fiyat, String marka, int hafiza,
                   double ekran, int pil, int ram, String renk) {
        this.id = id;
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
        this.marka = marka;
        this.hafiza = hafiza;
        this.ekran = ekran;
        this.pil = pil;
        this.ram = ram;
        this.renk = renk;
    }

    public void yazdir() {
        System.out.format("| %-4d | %-15s | %-10s | %-6d TL | %-4d GB Hafıza | %.1f inç | %-5d mAh | %-4d GB RAM | %-10s |\n",
                id, urunAdi, marka, fiyat, hafiza, ekran, pil, ram, renk);
    }

    public int getId() { return id; }
    public String getMarka() { return marka; }

    public static void markaSiralama() {
        ArrayList<String> markalar = new ArrayList<>();
        Collections.addAll(markalar, "Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster");
        Collections.sort(markalar, String::compareToIgnoreCase);
        System.out.println("📱 Telefon Markaları:");
        markalar.forEach(m -> System.out.println("- " + m));
    }
}