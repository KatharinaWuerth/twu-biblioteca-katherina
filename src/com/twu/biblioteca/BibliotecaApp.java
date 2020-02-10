package com.twu.biblioteca;



public class BibliotecaApp {

    public static String welcomeMessage() {
        String message = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        System.out.println(message);
        return message;
    }

    public static Library bookLists = new Library(
            new Book("Lord of the Rings", "J.R.R. Tolkien", 1954),
            new Book("The Hobbit", "J.R.R. Tolkien", 1937),
            new Book("The 6th extinction", "Elizabeth Kolbert", 2014),
            new Book("A crack in creation", "Jennifer Doudna", 2017)
    );


    public static void main(String[] args) {
        welcomeMessage();
        String menuOption = Menu.selectMenu();
        if (menuOption.equals("List of Books")) {
            bookLists.printBookList();
        }
    }
}
