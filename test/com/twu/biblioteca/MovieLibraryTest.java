package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MovieLibraryTest {

    private MovieLibrary movies;

    private ByteArrayOutputStream outputStream;
    private PrintStream actual = System.out;

    @Before
    public void shouldHappenBeforeEveryTest() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void shouldPrintListOfMovies() {
        List<Movie> expectedMovies = Arrays.asList(new Movie("The Fellowship of the Ring", 2001, "Peter Jackson", 10),
                new Movie("The Two Towers", 2002, "Peter Jackson", 8));

        MovieLibrary movieLibrary = new MovieLibrary(expectedMovies);
        movieLibrary.printNewMovieList();
        assertEquals("1. The Fellowship of the Ring | 2001 | Peter Jackson | 10\n2. The Two Towers | 2002 | Peter Jackson | 8\n", outputStream.toString());
    }
}
