package org.example;

import java.time.LocalDate;

public class Book {
    private String name;
    private int sNo;
    private String author;
    private LocalDate publicationDate;

    public Book(String name,int sNo,String author,LocalDate publicationDate) {
        this.publicationDate = publicationDate;
        this.sNo=sNo;
        this.name=name;
        this.author=author;
    }
    public  String getName(){
        return this.name;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getsNo(){
        return this.sNo;
    }
    public LocalDate getPublicationDate(){
        return this.publicationDate;
    }
    public String kitapDetay(){
        return "Kitap:"+getName()+
                "\nSayfa sayısı:"+getsNo()+
                "\nYazar:"+getAuthor()+
                "\nYayın tarihi:"+getPublicationDate()+
                "\n********************";

    }
    public String toString(){
        return kitapDetay();
    }

}
