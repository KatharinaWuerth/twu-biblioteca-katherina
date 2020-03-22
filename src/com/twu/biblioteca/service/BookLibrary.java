package com.twu.biblioteca.service;

import com.twu.biblioteca.BibliotecaApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class BookLibrary {

    private List<Book> newBookList;
    private List<Book> checkedOutBooks;

    public BookLibrary(Book... books) {
        newBookList = new ArrayList<Book>(Arrays.asList(books));
        checkedOutBooks = new ArrayList<Book>();
    }

    public BookLibrary(List<Book> books) {
        newBookList = books;
        checkedOutBooks = new ArrayList<Book>();
    }

    public Book checkoutTheSelectedBook(int selectedNumber) {
        if (selectedNumber < 1 || selectedNumber > newBookList.size()) {
            return null;
        }

        Book selectedBook = newBookList.get(selectedNumber - 1);
        checkedOutBooks.add(selectedBook);
        newBookList.remove(selectedNumber - 1);
        return selectedBook;
    }

    public List<Book> getAvailableBooks() {
        return newBookList;
    }

    public List<Book> getCheckedOutBooks() {
        return checkedOutBooks;
    }

    public Book returnBookToBookLists(int selectedNumber) {
        Book selectedBook = checkedOutBooks.get(selectedNumber - 1);
        checkedOutBooks.remove(selectedBook);
        newBookList.add(selectedBook);
        return null;
    }

}

