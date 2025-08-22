package org.example;

public class Book {
    private String title;
    private int pageCount;
    private String author;
    private int publishYear;

    public Book(String title, int pageCount, String author, int publishYear) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getTitle() { return title; }
    public int getPageCount() { return pageCount; }
    public String getAuthor() { return author; }
    public int getPublishYear() { return publishYear; }

    @Override
    public String toString() {
        return title + " by " + author + " (" + pageCount + " pages, " + publishYear + ")";
    }
}
