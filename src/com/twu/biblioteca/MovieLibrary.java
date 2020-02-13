package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieLibrary {

    private List<Movie> newMovieList;

    public MovieLibrary(Movie... movies) {
        newMovieList = new ArrayList<Movie>(Arrays.asList(movies));
    }

    public MovieLibrary(List<Movie> movies) {
        newMovieList = movies;
    }


    public void printMovieList(List<Movie> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ". " + list.get(i).displayMovie());
        }
    }

    public void printNewMovieList() {
        printMovieList(newMovieList);
    }
}