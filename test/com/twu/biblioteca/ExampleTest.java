package com.twu.biblioteca;


import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTest {
    @Test
    public void shouldReturnWelcomeMessage() {
        String greeting = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        assertEquals(BibliotecaApp.welcomeMessage(), greeting);
    }
}
