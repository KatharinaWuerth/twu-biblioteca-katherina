package com.twu.biblioteca;

public class BibliotecaApp {

    public static String welcomeMessage(){
        String message = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        System.out.println(message);
        return message;
    }

    public static void main(String[] args) {
        welcomeMessage();
    }
}
