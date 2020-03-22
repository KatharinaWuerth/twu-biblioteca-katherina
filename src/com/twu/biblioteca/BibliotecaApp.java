package com.twu.biblioteca;


import com.twu.biblioteca.service.Book;
import com.twu.biblioteca.service.BookLibrary;
import com.twu.biblioteca.service.Movie;
import com.twu.biblioteca.service.MovieLibrary;
import com.twu.biblioteca.textui.MenuItemNotAvailableException;
import com.twu.biblioteca.textui.MenuState;
import com.twu.biblioteca.textui.TextUIState;
import com.twu.biblioteca.textui.WelcomeState;

import java.util.Scanner;

public class BibliotecaApp {


    public static BookLibrary bookLibrary = new BookLibrary(
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
        Scanner sc = new Scanner(System.in);
        TextUIState currentState = new WelcomeState();
        while (currentState != null) {
            currentState.onEnterState();
            String input = currentState.takesInput() ? sc.next() : "";
            try {
            currentState = currentState.interpret(input);
            }
            catch (MenuItemNotAvailableException e) {
                System.out.println("Please select a existing number");
            }
            System.out.println();
        }
        System.out.println("Tschuess");
    }
}
