package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Library {

    private static List<Book> newBookList;
    private static List<Book> checkedOutBooks;


    public Library(Book... books) {

        newBookList = new ArrayList<Book>(Arrays.asList(books));
        checkedOutBooks = new ArrayList<Book>();

    }

    public void printBookList() {
        for (int i = 0; i < newBookList.size(); i++) {
            System.out.println(i + 1 + ". " + newBookList.get(i).displayBook());
        }
    }

    public void printCheckedOutBooks() {
        for (int i = 0; i < checkedOutBooks.size(); i++) {
            System.out.println(i + 1 + ". " + checkedOutBooks.get(i).displayBook());
        }
    }


    public static Book checkoutTheSelectedBook(int selectedNumber, Library lib) {
        for (int i = 0; i < newBookList.size(); i++) {
            if (selectedNumber < 0 || selectedNumber > newBookList.size()) {
                System.out.println("Sorry, that book is not available");
                return null;
            }
            System.out.println("Thank you! Enjoy the book");
            Book selectedBook = newBookList.get(selectedNumber - 1);
            checkedOutBooks.add(selectedBook);
            return newBookList.remove(selectedNumber - 1);
        }
        return null;
    }

    public static Book showNewBookListWithAvailableBooks(Library lib) {
        Scanner sc = new Scanner(System.in);
        BibliotecaApp.library.printBookList();
        System.out.println("To select a book for checkout please enter the book nr.");
        int inputNumber = sc.nextInt();
        return checkoutTheSelectedBook(inputNumber, lib);
    }

    public static void returnBookToBookLists() {
        Scanner sc = new Scanner(System.in);
        BibliotecaApp.library.printCheckedOutBooks();
        System.out.println("To return a book type in the number");
        int inputNumber = sc.nextInt();
        Book selectedBook = newBookList.get(inputNumber - 1);
        checkedOutBooks.remove(selectedBook);
        newBookList.add(selectedBook);
        System.out.println("Thank you for returning the book!");
    }


}

;
