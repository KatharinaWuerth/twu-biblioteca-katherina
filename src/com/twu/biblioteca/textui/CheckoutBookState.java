package com.twu.biblioteca.textui;

import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.service.Book;
import com.twu.biblioteca.textui.views.BookView;

import java.util.List;

public class CheckoutBookState extends NumberSelectionState {

    private BookView bookView = new BookView();

    @Override
    public String name() {
        return "Checkout Book";
    }

    @Override
    public void onEnterState() {
        List<Book> availableBooks = BibliotecaApp.bookLibrary.getAvailableBooks();
        bookView.printBookList(availableBooks);

        System.out.println("To select a book for checkout please enter the book nr.");
    }

    @Override
    public boolean takesInput() {
        return true;
    }

    @Override
    protected int getSizeOfArray() {
        return BibliotecaApp.bookLibrary.getAvailableBooks().size();
    }

    @Override
    protected TextUIState interpret(int selectedIndex) {
        Book checkedOutBook = BibliotecaApp.bookLibrary.checkoutTheSelectedBook(selectedIndex);

        if (checkedOutBook != null) {
            System.out.println("Thank you! Enjoy the book");
        } else {
            System.out.println("Sorry, that book is not available");
        }
        return new MenuState();
    }


}
