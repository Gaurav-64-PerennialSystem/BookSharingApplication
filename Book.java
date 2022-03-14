package com.company;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Book {
    private int isbn;
    public Set<String> authorNames=new HashSet<>();
    private String bookName;
    private String keywords;
    private String bookStatus;
    private String rating;
    public Owner owner;
       public Book(){

       }

    public Book(int isbn, Set<String> authorNames, String bookName, String keywords, String bookStatus,String rating, Owner owner) {
        this.isbn = isbn;
        this.authorNames = authorNames;
        this.bookName = bookName;
        this.keywords = keywords;
        this.bookStatus = "Available";
        this.rating = rating;
        this.owner = owner;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Set<String> getAuthorNames() {
        return authorNames;
    }

    public void setAuthorNames(Set<String> authorNames) {
        this.authorNames = authorNames;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", authorNames=" + authorNames +
                ", bookName='" + bookName + '\'' +
                ", keywords='" + keywords + '\'' +
                ", bookStatus='" + bookStatus + '\'' +
                ", rating='" + rating + '\'' +
                ", owner=" + owner +
                '}';
    }
}





