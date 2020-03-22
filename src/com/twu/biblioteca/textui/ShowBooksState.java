package com.twu.biblioteca.textui;


import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.service.Book;
import com.twu.biblioteca.textui.views.BookView;

import java.util.List;

public class ShowBooksState implements TextUIState {

    private BookView bookView = new BookView();

    @Override
    public String name() {
        return "List of Books";
    }

    @Override
    public void onEnterState() {
        List<Book> books = BibliotecaApp.bookLibrary.getAvailableBooks();
        bookView.printBookList(books);
    }

    @Override
    public boolean takesInput() {
        return false;
    }

    @Override
    public TextUIState interpret(String input) {
        return new MenuState();
    }

}
