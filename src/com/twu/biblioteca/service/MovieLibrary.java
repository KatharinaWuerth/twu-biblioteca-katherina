package com.twu.biblioteca.service;

import com.twu.biblioteca.BibliotecaApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MovieLibrary {

    private List<Movie> newMovieList;
    private List<Movie> checkedOutMovies;

    public MovieLibrary(Movie... movies) {
        newMovieList = new ArrayList<Movie>(Arrays.asList(movies));
        checkedOutMovies = new ArrayList<Movie>();
    }

    public MovieLibrary(List<Movie> movies) {
        newMovieList = movies;
    }

    public Movie checkoutTheSelectedMovie(int selectedNumber) {
        if (selectedNumber < 0 || selectedNumber > newMovieList.size()) {
            return null;
        }

        Movie selectedMovie = newMovieList.get(selectedNumber - 1);
        checkedOutMovies.add(selectedMovie);
        newMovieList.remove(selectedNumber - 1);
        return selectedMovie;
    }

    public List<Movie> getAvailableMovies() {
        return newMovieList;
    }

}