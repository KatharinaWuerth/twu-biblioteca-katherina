package com.twu.biblioteca;

import com.twu.biblioteca.service.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book books;
    @Before
    public void shouldHappenBeforeEveryTest() {
    books =  new Book ("Lord of the Rings", "J.R.R. Tolkien", 1954);
    }

    @Test
    public void shouldGetTheTitleOfTheBook(){
        assertEquals("Lord of the Rings", books.getTitle());

    }

    @Test
    public void shouldGetTheAuthorOfTheBook(){
        assertEquals("J.R.R. Tolkien", books.getAuthor());

    }

    @Test
    public void shouldGetTheYearOfTheBook(){
        assertEquals(1954, books.getYear());

    }

    @Test
    public void shouldDisplayABook(){
       assertEquals("Lord of the Rings | J.R.R. Tolkien | 1954", books.displayBook());
    }
}
