package com.twu.biblioteca;


import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {
    @Test
    public void shouldReturnWelcomeMessage() {
        String greeting = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        assertEquals(BibliotecaApp.welcomeMessage(), greeting);
    }

}
