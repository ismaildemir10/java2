package org.example;

import java.util.ArrayList;
import java.util.Collections;


public class Takimlar {
    public static void match(){

    ArrayList<String> hashSet =new ArrayList<>();
    ArrayList<String> hashSet1 = new ArrayList<>();
        hashSet.add("Galatasaray");
        hashSet.add("Fener");
        hashSet.add("Bjk");
        hashSet.add("Trabzon");
        hashSet.add("Bursa");
        hashSet.add("Başakşehir");
        hashSet.add("Bay");
        System.out.println("Takimlar: "+hashSet);
        for(int i = 0;i<hashSet.size();i++){
            for (int j =i+1;j<hashSet.size();j++){
                hashSet1.add(hashSet.get(i)+" vs "+hashSet.get(j));
            }
        }
        Collections.shuffle(hashSet1);
        System.out.println(hashSet1);
        for (int i= 1; i<hashSet1.size();i++){
            System.out.println(i+". hafta "+hashSet1.get(i));
        }
    }
    public static void main(String[] args) {
        match();
    }
}