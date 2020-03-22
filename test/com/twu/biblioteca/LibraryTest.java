package com.twu.biblioteca;

import com.twu.biblioteca.service.Book;
import com.twu.biblioteca.service.BookLibrary;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private BookLibrary books;

    private ByteArrayOutputStream outputStream;
    private PrintStream actual = System.out;

    @Before
    public void shouldHappenBeforeEveryTest() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

//    @Test
//    public void shouldPrintListOfBooks() {
//        List<Book> expectedBooks = Arrays.asList(new Book("Lord of the Rings", "J.R.R. Tolkien", 1954),
//                new Book("The Hobbit", "J.R.R. Tolkien", 1937));
//
//        BookLibrary library = new BookLibrary(expectedBooks);
//        library.printNewBookList();
//        assertEquals("1. Lord of the Rings | J.R.R. Tolkien | 1954\n2. The Hobbit | J.R.R. Tolkien | 1937\n", outputStream.toString());
//    }

//    @Test
//    public void shouldRemoveSelectedBookFromBookListAndReturnUpdatedBookListAndReturnMessageForSuccess(){
//        List<Book> expectedBooks = Arrays.asList(new Book("Lord of the Rings", "J.R.R. Tolkien", 1954),
//                new Book("The Hobbit", "J.R.R. Tolkien", 1937));
//        Library library = new Library(expectedBooks);
//        Library.checkoutTheSelectedBook(2, library);
//        library.printNewBookList();
//        assertEquals("Thank you! Enjoy the book\n1. Lord of the Rings | J.R.R. Tolkien | 1954\n", outputStream.toString());
//    }

    @Test
    public void shouldTellTheCustomerThatHisChoiceForCheckoutIsInvalid(){
        BookLibrary books = new BookLibrary(new Book("Lord of the Rings", "J.R.R. Tolkien", 1954),
                new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        books.checkoutTheSelectedBook(5);
        assertEquals("Sorry, that book is not available\n", outputStream.toString());
    }

    @Test
    public void shouldTellTheCustomerThatHisCheckoutWasSucessfull(){
        BookLibrary books = new BookLibrary(new Book("Lord of the Rings", "J.R.R. Tolkien", 1954),
                new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        books.checkoutTheSelectedBook(2);
        assertEquals("Thank you! Enjoy the book\n", outputStream.toString());
    }

}
