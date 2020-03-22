package com.twu.biblioteca.textui;

import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.service.Book;
import com.twu.biblioteca.service.Movie;
import com.twu.biblioteca.textui.views.MovieView;

import java.util.List;

public class CheckoutMovieState extends NumberSelectionState {

    private MovieView movieView = new MovieView();

    @Override
    public String name() {
        return "Checkout Movie";
    }

    @Override
    public void onEnterState() {
        List<Movie> availableMovies = BibliotecaApp.movieLibrary.getAvailableMovies();
        movieView.printMovieList(availableMovies);

        System.out.println("To select a movie for checkout please enter the movie nr.");
    }

    @Override
    public boolean takesInput() {
        return true;
    }

    @Override
    protected int getSizeOfArray() {
        return BibliotecaApp.movieLibrary.getAvailableMovies().size();
    }

    @Override
    protected TextUIState interpret(int selectedIndex) {
        Movie checkedOutMovie = BibliotecaApp.movieLibrary.checkoutTheSelectedMovie(selectedIndex);

        if (checkedOutMovie != null) {
            System.out.println("Thank you! Enjoy the movie");
        } else {
            System.out.println("Sorry, that movie is not available");
        }
        return new MenuState();
    }


}
