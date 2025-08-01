package org.generic;

public class MyList<T> {

    private T[] array;
    private int size;


    @SuppressWarnings("unchecked")
    public MyList() {  // 1. Varsayılan constructor (kapasite 10)
        array = (T[]) new Object[10];
        size = 0;
    }


    @SuppressWarnings("unchecked")
    public MyList(int capacity) { // 2. Parametreli constructor
        array = (T[]) new Object[capacity];
        size = 0;
    }


    public void add(T data) { // Eleman ekleme
        if (size >= array.length) expandCapacity();
        array[size++] = data;
    }


    @SuppressWarnings("unchecked")
    private void expandCapacity() {// Kapasiteyi 2 katına çıkar
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }


    public int size() {// Eleman sayısı
        return size;
    }


    public int getCapacity() {// Kapasite değeri
        return array.length;
    }


    public T get(int index) {// get(index): Elemanı döndürür, geçersizse null
        if (index < 0 || index >= size) return null;
        return array[index];
    }


    public T set(int index, T data) { // set(index, data): Elemanı değiştirir, geçersizse null
        if (index < 0 || index >= size)
            return null;
        T old = array[index];
        array[index] = data;
        return old;
    }


    public T remove(int index) {// remove(index): Elemanı siler ve sola kaydırır, geçersizse null
        if (index < 0 || index >= size) return null;
        T removed = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = null;
        return removed;
    }


    @Override
    public String toString() { // toString(): Elemanları listeleyen metot
        if (size == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }


    public int indexOf(T data) {// indexOf(data): İlk eşleşen indeks
        for (int i = 0; i < size; i++) {
            if (array[i] != null && array[i].equals(data)) return i;
        }
        return -1;
    }


    public int lastIndexOf(T data) {  // lastIndexOf(data): Son eşleşen indeks
        for (int i = size - 1; i >= 0; i--) {
            if (array[i] != null && array[i].equals(data)) return i;
        }
        return -1;
    }


    public boolean isEmpty() {// isEmpty(): Liste boş mu?
        return size == 0;
    }


    public T[] toArray() {// toArray(): Elemanları array olarak döndürür
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            result[i] = array[i];
        }
        return result;
    }


    public void clear() {// clear(): Tüm elemanları siler
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    // sublist(start, finish): Belirli aralıktaki elemanları içeren yeni liste
    public MyList<T> sublist(int start, int finish) {
        if (start < 0 || finish > size || start > finish) return null;
        MyList<T> sub = new MyList<>(finish - start);
        for (int i = start; i < finish; i++) {
            sub.add(array[i]);
        }
        return sub;
    }


    public boolean contains(T data) {  // contains(data): Veri listede var mı?
        return indexOf(data) != -1;
    }
}
