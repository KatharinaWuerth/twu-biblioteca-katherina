package com.twu.biblioteca.textui;

import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.service.Book;
import com.twu.biblioteca.service.Movie;
import com.twu.biblioteca.textui.views.BookView;
import com.twu.biblioteca.textui.views.MovieView;

import java.util.List;

public class ShowMoviesState implements TextUIState {

    private MovieView movieView = new MovieView();

    @Override
    public String name() {
        return "List of Movies";
    }

    @Override
    public void onEnterState() {
        List<Movie> movies = BibliotecaApp.movieLibrary.getAvailableMovies();
        movieView.printMovieList(movies);    }

    @Override
    public boolean takesInput() {
        return false;
    }

    @Override
    public TextUIState interpret(String input) {
        return new MenuState();
    }

}
