package com.company;

import java.util.HashSet;
import java.util.Set;

public class Book {
    private int isbn;
    private Set<String> authorNames=new HashSet<>();
    private String bookName;
    private String keywords;
    private BookStatus bookStatus;
    private int rating=0;
    private User users;
       public Book(){

       }

    public Book(int isbn, Set<String> authorNames, String bookName, String keywords,int rating, User users) {
        this.isbn = isbn;
        this.authorNames = authorNames;
        this.bookName = bookName;
        this.keywords = keywords;
        this.bookStatus =BookStatus.AVAILABLE;
        this.rating = rating;
        this.users = users;
    }
    public int getIsbn() {
        return isbn;
    }
    public Set<String> getAuthorNames() {
        return authorNames;
    }
    public String getBookName() {
        return bookName;
    }
    public String getKeywords() {
        return keywords;
    }
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public User getUsers() {
        return users;
    }
    public void setUsers(User users) {
        this.users = users;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }
    public void borrowStatus(){
           this.bookStatus=BookStatus.DISCONTINUE;
    }
    public void returnStatus(){
           this.bookStatus=BookStatus.AVAILABLE;
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
                ", users=" + users +
                '}';
    }
}





