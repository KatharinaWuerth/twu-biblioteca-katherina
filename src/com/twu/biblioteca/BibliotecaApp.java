package com.twu.biblioteca;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class BibliotecaApp {

    public static String welcomeMessage(){
        String message = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        System.out.println(message);
        return message;
    }

    public static List getListOfBooks() throws IOException {
        List<String> books = Files.readAllLines(Paths.get("/Users/katharinawuerth/Desktop/TWU_Biblioteca-master/src/com/twu/biblioteca/listOfBooks.txt"), StandardCharsets.UTF_8);
        return books;
    }

    public static void main(String[] args) throws IOException {
        welcomeMessage();
        List<String> books  = getListOfBooks();
        System.out.println(books);
    }
}
