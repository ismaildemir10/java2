package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class PatikaStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sabit ürün listeleri
        ArrayList<Notebook> notebookList = new ArrayList<>();
        ArrayList<Telefon> telefonList = new ArrayList<>();

        // 📦 Notebook ürünleri
        notebookList.add(new Notebook(101, "Lenovo ThinkPad", 32000, "Lenovo", 512, 14.0, 16));
        notebookList.add(new Notebook(102, "Apple MacBook Air", 45000, "Apple", 256, 13.3, 8));
        notebookList.add(new Notebook(103, "Monster Tulpar", 39000, "Monster", 1024, 15.6, 32));

        // 📱 Telefon ürünleri
        telefonList.add(new Telefon(201, "Samsung Galaxy S23", 38000, "Samsung", 128, 6.1, 4500, 8, "Siyah"));
        telefonList.add(new Telefon(202, "iPhone 14", 52000, "Apple", 256, 6.1, 3200, 6, "Mavi"));
        telefonList.add(new Telefon(203, "Xiaomi Redmi Note", 21000, "Xiaomi", 128, 6.5, 5000, 6, "Kırmızı"));

        while (true) {
            System.out.println("\n📦 PatikaStore");
            System.out.println("1 - Notebookları Listele");
            System.out.println("2 - Telefonları Listele");
            System.out.println("3 - Çıkış");
            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1 -> {
                    System.out.println("\n--- Notebook Markaları ---");
                    Notebook.markaSiralama();

                    System.out.println("\n--- Notebook Listesi ---");
                    notebookList.forEach(Notebook::yazdir);

                    System.out.println("\n--- Apple Markalı Notebooklar ---");
                    notebookList.stream()
                            .filter(n -> n.getMarka().equalsIgnoreCase("Apple"))
                            .forEach(Notebook::yazdir);
                }

                case 2 -> {
                    System.out.println("\n--- Telefon Markaları ---");
                    Telefon.markaSiralama();

                    System.out.println("\n--- Telefon Listesi ---");
                    telefonList.forEach(Telefon::yazdir);

                    System.out.println("\n--- Apple Markalı Telefonlar ---");
                    telefonList.stream()
                            .filter(t -> t.getMarka().equalsIgnoreCase("Apple"))
                            .forEach(Telefon::yazdir);

                    telefonList.removeIf(t -> t.getId() == 202);
                    System.out.println("\n--- Telefon Listesi (iPhone 14 silindi) ---");
                    telefonList.forEach(Telefon::yazdir);
                }

                case 3 -> {
                    System.out.println("Çıkılıyor...");
                    return;
                }

                default -> System.out.println("Geçersiz seçim.");
            }
        }
    }
}