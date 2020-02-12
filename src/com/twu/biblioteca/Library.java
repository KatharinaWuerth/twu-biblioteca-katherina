package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Library {

    private List<Book> newBookList;
    private List<Book> checkedOutBooks;


    public Library(Book... books) {

        newBookList = new ArrayList<Book>(Arrays.asList(books));
        checkedOutBooks = new ArrayList<Book>();
    }

    public Library(List<Book> books) {
        newBookList = books;
        checkedOutBooks = new ArrayList<Book>();
    }

    public void printBookList(List<Book> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ". " + list.get(i).displayBook());
        }
    }

    public void printNewBookList() {
        printBookList(newBookList);
    }

    public Book checkoutTheSelectedBook(int selectedNumber) {
        for (int i = 0; i < newBookList.size(); i++) {
            if (selectedNumber < 0 || selectedNumber > newBookList.size()) {
                System.out.println("Sorry, that book is not available");
                return null;
            }
            System.out.println("Thank you! Enjoy the book");
            Book selectedBook = newBookList.get(selectedNumber - 1);
            checkedOutBooks.add(selectedBook);
            newBookList.remove(selectedNumber - 1);
            return selectedBook;
        }
        return null;
    }

    public Book showNewBookListWithAvailableBooks() {
        Scanner sc = new Scanner(System.in);
        BibliotecaApp.library.printBookList(newBookList);
        System.out.println("To select a book for checkout please enter the book nr.");
        int inputNumber = sc.nextInt();
        return checkoutTheSelectedBook(inputNumber);
    }

    public void returnBookToBookLists() {
        Scanner sc = new Scanner(System.in);
        BibliotecaApp.library.printBookList(checkedOutBooks);
        System.out.println("To return a book type in the number");
        int inputNumber = sc.nextInt();
        Book selectedBook = newBookList.get(inputNumber - 1);
        checkedOutBooks.remove(selectedBook);
        newBookList.add(selectedBook);
        System.out.println("Thank you for returning the book!");
    }
}

