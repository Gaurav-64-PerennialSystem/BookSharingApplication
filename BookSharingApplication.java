package com.company;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookSharingApplication {
    private static Logger logger = MyLoggerClass.getLOGGER();

    private static BookCollection bookCollection = new BookCollection();
    public static List<String> authorName = new ArrayList<>();
    private static List<Book> bookList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static User user = new User();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        menu();
        while (!quit) {
            logger.log(Level.INFO, "Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    menu();
                    break;
                case 1:
                    addUser();
                    break;
                case 2:
                    bookCollection.viewAllUsers();

                    break;
                case 3:
                    addBOOK();
                    break;

                case 4:
                    bookCollection.viewBookList();
                    break;
                case 5:
                    searchByBookName();

                    break;
                case 6:
                    searchbyAuthorName();
                    break;
                case 7:
                    searchByKeyword();
                    break;
                case 8:
                    quit = true;
                    break;
            }
        }
    }

    public static void menu() {
        logger.log(Level.INFO, "\nPress");
        logger.log(Level.INFO, "\t 1 - Add User Information:");
        logger.log(Level.INFO, "\t 1 - Add User Information:");
        logger.log(Level.INFO, "\t 2 - View All users:");
        logger.log(Level.INFO, "\t 3 - Add book information:");
        logger.log(Level.INFO, "\t 4 - View All Books:");
        logger.log(Level.INFO, "\t 5 - search book by  bookName:");
        logger.log(Level.INFO, "\t 6 - search book by AuthorName:");
        logger.log(Level.INFO, "\t 7 - search book by Keyword:");
        logger.log(Level.INFO, "\t 8 - to quit the application .");

    }

    public static void addUser() {
        logger.log(Level.INFO, "Enter the email:");
        String email = scanner.next();
        logger.log(Level.INFO, "Enter the Name:");
        String name = scanner.next();
        bookCollection.addUser(email, name);
    }

    /////////////////////////////////addBOOK////////////////////////////////////
    public static void addBOOK() {
        Book book = new Book();
        Owner owner = new Owner();
        Author author = new Author();

        logger.log(Level.INFO, "Enter the ISBN:");
        int ISBN = scanner.nextInt();

        logger.log(Level.INFO, "Enter the Authornames:");
        Set<String> authorName= Collections.singleton(scanner.next());

        logger.log(Level.INFO, "Enter the bookname:");
        String bookName = scanner.next();

        logger.log(Level.INFO, "Enter the Keyword:");
        String keywords = scanner.next();


        logger.log(Level.INFO, "Enter the rating:");
        String rating = scanner.next();


        logger.log(Level.INFO, "Enter the Ownername:");
        owner.setOwnerName(scanner.next());

        logger.log(Level.INFO, "Enter the emailId:");
        owner.setEmailId(scanner.next());
        bookCollection.addBook(ISBN, authorName, bookName, keywords, "Available", rating, owner);


    }
 /////////////////////////////////////Search by book name////////////////////////////////////////////
    public static void searchByBookName(){
        logger.log(Level.INFO,"Enter the BookName to be search:");
        String bookName=scanner.next();
        bookCollection.searchbybookName(bookName);
    }
    public static void searchbyAuthorName(){
        logger.log(Level.INFO,"Enter the AuthorName to be search:");
        Set<String> authorName= Collections.singleton(scanner.next());
        bookCollection.searchbyAuthorName(authorName);
    }
    public static void searchByKeyword(){
        logger.log(Level.INFO,"Enter the keyword:");
        String keyword=scanner.next();
        bookCollection.searchByKeyword(keyword);
    }


    }


