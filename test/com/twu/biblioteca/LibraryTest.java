package com.twu.biblioteca;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library books;

    private ByteArrayOutputStream outputStream;
    private PrintStream actual = System.out;

    @Before
    public void shouldHappenBeforeEveryTest() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void shouldPrintListOfBooks() {
        Library books = new Library(new Book("Lord of the Rings", "J.R.R. Tolkien", 1954),
                new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        books.printBookList();
        assertEquals("1. Lord of the Rings | J.R.R. Tolkien | 1954\n2. The Hobbit | J.R.R. Tolkien | 1937\n", outputStream.toString());
    }


}