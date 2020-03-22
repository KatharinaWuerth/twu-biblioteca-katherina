package com.twu.biblioteca.textui.views;

import com.twu.biblioteca.service.Book;

import java.util.List;

public class BookView {

    public void printBookList(List<Book> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ". " + list.get(i).displayBook());
        }
    }

}
