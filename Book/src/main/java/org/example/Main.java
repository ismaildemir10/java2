package org.example;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> treeSet = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublicationDate().compareTo(o2.getPublicationDate());
            }
        });
        treeSet.add(new Book("Nutuk",543,"Mustafa Kemal ATATÜRK", LocalDate.of(1927,10,20)));
        treeSet.add(new Book("Geometri",44,"Mustafa Kemal ATATÜRK", LocalDate.of(1937,1,10)));
        for (Book b:treeSet) {
            System.out.println(b);

        }
    }

}