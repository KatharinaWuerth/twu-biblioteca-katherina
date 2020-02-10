package com.twu.biblioteca;
import com.twu.biblioteca.Book;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private ArrayList<Book> bookLists;
    public Library(Book... books) {
        bookLists = new ArrayList<Book>(Arrays.asList(books));
    }

    public void printBookList() {
        for(int i = 0; i<bookLists.size(); i++) {
            System.out.println(i+1 + ". " + bookLists.get(i).displayBook());
        }
    }
};