package com.twu.biblioteca.textui;

import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.service.Book;
import com.twu.biblioteca.textui.views.BookView;

import java.util.List;

public class ReturnBookState extends NumberSelectionState {

    private BookView bookView = new BookView();

    @Override
    public String name() {
        return "Return Book";
    }

    @Override
    public void onEnterState() {
        List<Book> checkedOutBooks = BibliotecaApp.bookLibrary.getCheckedOutBooks();
        bookView.printBookList(checkedOutBooks);
        System.out.println("To return a book type in the number");

    }

    @Override
    public boolean takesInput() {
        return true;
    }

    @Override
    protected int getSizeOfArray() {
        return BibliotecaApp.bookLibrary.getCheckedOutBooks().size();
    }

    @Override
    protected TextUIState interpret(int selectedIndex) {
        BibliotecaApp.bookLibrary.returnBookToBookLists(selectedIndex);

        System.out.println("Thank you for returning the book!");

        return new MenuState();
    }


}
