package com.company;


import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookCollection {

    private  static Logger logger = Logger.getLogger(BookCollection.class.getName());

    private final List<Book> bookList = new ArrayList<>();
    private static final List<User> users = new ArrayList<>();



    ///////////////////////////add book/////////////////////////////////////
    public Book addBook(int isbn, Set<String> authorNames, String bookName, String keywords, int rating, User users) {
        Book book = new Book(isbn, authorNames, bookName, keywords, rating, users);
        bookList.add(book);
        return book;
    }

    public List<Book> getBooklist() {
        return bookList;
    }

    public void viewBookList() {
        Iterator<Book> i=bookList.iterator();
        while (i.hasNext()){
            Book book=i.next();
            logger.log(Level.SEVERE,()->"Book Name :"+book);
        }
    }
    /*********************************add book***************************************/


    /********************************Add User**************************************/
    public User addUser(String email, String name) {

        if (getUserFromEmail(email) != null) {
            logger.log(Level.INFO, "This emailId is Already exists");
            return null;
        } else if (getUserFromName(name) != null) {
            logger.log(Level.INFO, "This name is Already exists");
            return null;
        } else {
            User user = new User(email, name);
            users.add(user);
            return user;
        }
    }

    public static User getUserFromEmail(String email) {


        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    public static User getUserFromName(String name) {


        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }
    /*******************************Add User*********************************/
/*****************************   Search by bookName  ************************/
public  void searchByBookName( String bookName){
    boolean found=false;
    Iterator<Book> i=bookList.iterator();
    while (i.hasNext()){
        Book book=i.next();
        if(book.getBookName().equals(bookName))
            logger.log(Level.INFO,()->" bookname: "+book);
        found=true;
    }
    if(!found){
        logger.log(Level.INFO,"book not found");
    }
}

 /********************************Search by bookname*****************************/

/*********************************  Search by Authorname  ***********************/

    public  void searchByAuthorName(Set<String> authorName){
        boolean found=false;
        logger.log(Level.INFO,"-------------------------------------------------------------");
        Iterator<Book> i=bookList.iterator();
        while (i.hasNext()){
            Book book=i.next();
            if(book.getAuthorNames().equals(authorName))
                logger.log(Level.INFO,()->"found Author:"+book);
            found=true;
        }
        if(!found){
            logger.log(Level.INFO,"Author not found");
        }
        logger.log(Level.INFO,"-------------------------------------------------------------");
    }
/******************************************  Search by AuthorName  *********************************/




/**************************  Search by Keyword   ***********************************/

    public  void searchByKeyword( String keyword){
        boolean found=false;
        Iterator<Book> i=bookList.iterator();
        while (i.hasNext()){
            Book book=i.next();
            if(book.getKeywords().equals(keyword))
                logger.log(Level.SEVERE,()->"BookName:"+book);
            found=true;
        }
        if(!found){
            logger.log(Level.INFO,"book not found");
        }
    }
    /********************************  Search by keyword  **********************************/


    }









