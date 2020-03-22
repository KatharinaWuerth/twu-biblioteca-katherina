package com.twu.biblioteca.textui.views;


import com.twu.biblioteca.service.Movie;

import java.util.List;

public class MovieView {

    public void printMovieList(List<Movie> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ". " + list.get(i).displayMovie());
        }
    }
}
