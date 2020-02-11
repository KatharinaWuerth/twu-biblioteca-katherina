package com.twu.biblioteca;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;


public class Library {
    private static ArrayList<Book> books;
    private static ArrayList<Book> checkedOutBooks;

    public Library(Book... books) {
        Library.books = new ArrayList<Book>(Arrays.asList(books));
        checkedOutBooks = new ArrayList<Book>();
    }

    public void printBookList() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(i + 1 + ". " + books.get(i).displayBook());
        }
    }


    public void printCheckedOutBooks() {
        if (checkedOutBooks.size() > -1) {
            for (int i = 0; i < checkedOutBooks.size(); i++) {
                System.out.println(i + 1 + ". " + checkedOutBooks.get(i).displayBook());
            }
        } else
            System.out.println("There a no checked-out Books");

    }

    public static Book checkoutTheSelectedBook(int selectedNumber, Library lib) {
        for (int i = 0; i < books.size(); i++) {
            if (selectedNumber < 0 || selectedNumber > books.size()) {
                System.out.println("Sorry, that book is not available");
                return null;
            }
            System.out.println("Thank you! Enjoy the book");
            Book selectedBook = books.get(selectedNumber - 1);
            checkedOutBooks.add(selectedBook);
            return books.remove(selectedNumber - 1);
        }
        return null;
    }

    public static Book showNewBookListWithAvailableBooks(Library lib) {
        Scanner sc = new Scanner(System.in);
        BibliotecaApp.bookLists.printBookList();
        System.out.println("To select a book for checkout please enter the book nr.");
        int inputNumber = sc.nextInt();
        return checkoutTheSelectedBook(inputNumber, lib);
    }

    public static void returnBookToBookLists() {
        Scanner sc = new Scanner(System.in);
        BibliotecaApp.bookLists.printCheckedOutBooks();
        System.out.println("To return a book type in the title");
        int inputNumber = sc.nextInt();
        Book selectedBook = books.get(inputNumber - 1);
        checkedOutBooks.remove(selectedBook);
        books.add(selectedBook);
        System.out.println("Thank you for returning the book!");
    }


}

;
