package com.twu.biblioteca;


public class BibliotecaApp {

    public static String welcomeMessage() {
        String message = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        System.out.println(message);
        return message;
    }

    public static Library bookLibrary = new Library(
            new Book("Lord of the Rings", "J.R.R. Tolkien", 1954),
            new Book("The Hobbit", "J.R.R. Tolkien", 1937),
            new Book("The 6th extinction", "Elizabeth Kolbert", 2014),
            new Book("A crack in creation", "Jennifer Doudna", 2017)
    );

    public static MovieLibrary movieLibrary = new MovieLibrary(
            new Movie("The Fellowship of the Ring", 2001, "Peter Jackson", 10),
            new Movie("The Two Towers", 2002, "Peter Jackson", 8),
            new Movie("The Return of the King", 2003, "Peter Jackson", 10),
            new Movie("The Chorus", 2004, "Christophe Barratier", 9)
    );


    public static void main(String[] args) {
        welcomeMessage();

        while (true) {
            String menuOption = Menu.selectMenu();
            if (menuOption.equals("List of Books")) {
                bookLibrary.printNewBookList();
            } else if (menuOption.equals("Quit Biblioteca")) {
                System.exit(0);
            } else if (menuOption.equals("Checkout Book")) {
                bookLibrary.showNewBookListWithAvailableBooks();
            } else if (menuOption.equals("Return Book")) {
                bookLibrary.returnBookToBookLists();
            } else if (menuOption.equals("List of Movies")) {
                movieLibrary.printNewMovieList();
            } else {
                System.out.println(menuOption);
            }

            System.out.println();
        }
    }
}
