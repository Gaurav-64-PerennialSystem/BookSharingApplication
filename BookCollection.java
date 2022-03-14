package com.company;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookCollection {

    private static Logger logger = MyLoggerClass.getLOGGER();
    private final HashMap<String, List<Book>> catalogue;
    private final List<Book> bookList = new ArrayList<Book>();
    private static final List<User> users = new ArrayList<>();
    private final List<Author> author=new ArrayList<Author>();
    public BookCollection() {
        catalogue = new HashMap<String, List<Book>>();
    }

    ///////////////////////////add book/////////////////////////////////////
    public Book addBook(int isbn, Set<String> authorNames, String bookName, String keywords, String bookStatus, String rating, Owner owner) {
        Book book = new Book(isbn, authorNames, bookName, keywords, bookStatus, rating, owner);
        bookList.add(book);
        return book;
    }

    public List<Book> getBooklist() {
        return bookList;
    }

    public void viewBookList() {
        logger.log(Level.INFO,"-------------------------------------------------------------");
        Iterator<Book> i=bookList.iterator();
        while (i.hasNext()){
            Book book=i.next();
            logger.log(Level.INFO,""+book);
        }
        logger.log(Level.INFO,"-------------------------------------------------------------");
        /*logger.log(Level.INFO, "You have " + bookList.size() + " user present in the booklist");
        for (int i = 0; i < bookList.size(); i++) {
            logger.log(Level.INFO, (i + 1) + ".  " + bookList.get(i));
        }*/
    }
    ////////////////////////add book/////////////////


    ////////////////////////////// Add User/////////////////////////
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

    public List<User> getUserList() {
        return users;
    }

    public void viewAllUsers() {
        logger.log(Level.INFO, "You have " + users.size() + " user present in the userlist");

        for (int i = 0; i < users.size(); i++) {
            logger.log(Level.INFO, (i + 1) + ".  " + users.get(i));
        }
    }
/////////////////////////Add User////////////////////////////////
///////////////////////   Search by bookName    ////////////////////////
public  void searchbybookName( String bookName){
    boolean found=false;
    logger.log(Level.INFO,"-------------------------------------------------------------");
    Iterator<Book> i=bookList.iterator();
    while (i.hasNext()){
        Book book=i.next();
        if(book.getBookName().equals(bookName))
            logger.log(Level.INFO,""+book);
        found=true;
    }
    if(!found){
        logger.log(Level.INFO,"book not found");
    }
    logger.log(Level.INFO,"-------------------------------------------------------------");
}

////////////////////////     Search by bookname      /////////////////////

///////////////////////  Search by Authorname    ///////////////////

    public  void searchbyAuthorName(Set<String> authorName){
        boolean found=false;
        logger.log(Level.INFO,"-------------------------------------------------------------");
        Iterator<Book> i=bookList.iterator();
        while (i.hasNext()){
            Book book=i.next();
            if(book.getAuthorNames().equals(authorName))
                logger.log(Level.INFO,"found Author:"+book);
            found=true;
        }
        if(!found){
            logger.log(Level.INFO,"Author not found");
        }
        logger.log(Level.INFO,"-------------------------------------------------------------");
    }
////////////////////////////////////  Search by AuthorName  ////////////////////////////////////




/////////////////////////////////  Search by Keyword   /////////////////////////////////////

    public  void searchByKeyword( String keyword){
        boolean found=false;
        logger.log(Level.INFO,"-------------------------------------------------------------");
        Iterator<Book> i=bookList.iterator();
        while (i.hasNext()){
            Book book=i.next();
            if(book.getKeywords().equals(keyword))
                logger.log(Level.INFO,""+book);
            found=true;
        }
        if(!found){
            logger.log(Level.INFO,"book not found");
        }
        logger.log(Level.INFO,"-------------------------------------------------------------");
    }
    ///////////////////////////////  Search by keyword  /////////////////////////////////////////


    }









