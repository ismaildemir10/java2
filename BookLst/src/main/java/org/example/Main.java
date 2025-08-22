package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Sefiller", 350, "Victor Hugo", 1862));
        books.add(new Book("Suç ve Ceza", 430, "Dostoyevski", 1866));
        books.add(new Book("Kürk Mantolu Madonna", 160, "Sabahattin Ali", 1943));
        books.add(new Book("Hayvan Çiftliği", 112, "George Orwell", 1945));
        books.add(new Book("1984", 328, "George Orwell", 1949));
        books.add(new Book("Tutunamayanlar", 724, "Oğuz Atay", 1971));
        books.add(new Book("Simyacı", 190, "Paulo Coelho", 1988));
        books.add(new Book("Beyaz Zambaklar Ülkesinde", 96, "Grigory Petrov", 1923));
        books.add(new Book("Uçurtma Avcısı", 371, "Khaled Hosseini", 2003));
        books.add(new Book("Martı", 96, "Richard Bach", 1970));
        Map<String, String> bookAuthorMap = books.stream()
                .collect(Collectors.toMap(Book::getTitle, Book::getAuthor));
        List<Book> longBooks = books.stream()
                .filter(book -> book.getPageCount() > 100)
                .collect(Collectors.toList());
        System.out.println("Kitap-Yazar Map:");
        bookAuthorMap.forEach((title, author) -> System.out.println(title + " → " + author));

        System.out.println("\n100+ Sayfalık Kitaplar:");
        longBooks.forEach(System.out::println);




    }
}