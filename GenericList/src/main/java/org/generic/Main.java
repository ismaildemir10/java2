package org.generic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyList<String> list1 = new MyList<>();
        list1.add("Java");
        list1.add("Python");
        list1.add("C++");
        System.out.println(list1);

        MyList<Integer> sayilar = new MyList<>(5);
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        System.out.println(sayilar);
        MyList<String> list = new MyList<>();
        list.add("Java");
        list.add("Python");
        list.add("Rust");
        list.add("Python");

// Eleman sayısı ve kapasite
        System.out.println("Size: " + list.size());           // 4
        System.out.println("Capacity: " + list.getCapacity()); // 10

// Eleman okuma
        System.out.println("get(2): " + list.get(2));         // Rust

// Eleman değiştirme
        list.set(2, "Go");
        System.out.println("After set: " + list);             // [Java, Python, Go, Python]

// Eleman silme
        list.remove(1);
        System.out.println("After remove: " + list);          // [Java, Go, Python]

// Alt liste
        MyList<String> sub = list.sublist(0, 2);
        System.out.println("Sublist: " + sub);                // [Java, Go]

// Arama
        System.out.println("indexOf('Python'): " + list.indexOf("Python"));     // 2
        System.out.println("lastIndexOf('Python'): " + list.lastIndexOf("Python")); // 2
        System.out.println("contains('Go'): " + list.contains("Go"));           // true

// Diziye çevirme
        String[] arr = list.toArray();
        System.out.println("Array: " + Arrays.toString(arr)); // [Java, Go, Python]

// Listeyi temizleme
        list.clear();
        System.out.println("After clear: " + list);           // []
        System.out.println("isEmpty(): " + list.isEmpty());   // true
    }
}