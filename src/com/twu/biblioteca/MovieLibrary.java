package com.twu.biblioteca;

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


    public void printMovieList(List<Movie> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ". " + list.get(i).displayMovie());
        }
    }

    public void printNewMovieList() {
        printMovieList(newMovieList);
    }

    public Movie checkoutTheSelectedMovie(int selectedNumber) {
        for (int i = 0; i < newMovieList.size(); i++) {
            if (selectedNumber < 0 || selectedNumber > newMovieList.size()) {
                System.out.println("Sorry, that movie is not available");
                return null;
            }
            System.out.println("Thank you! Enjoy the movie");
            Movie selectedMovie = newMovieList.get(selectedNumber - 1);
            checkedOutMovies.add(selectedMovie);
            newMovieList.remove(selectedNumber - 1);
            return selectedMovie;
        }
        return null;
    }

    public Movie showNewMovieListWithAvailableMovies() {
        Scanner sc = new Scanner(System.in);
        BibliotecaApp.movieLibrary.printMovieList(newMovieList);
        System.out.println("To select a movie for checkout please enter the movie nr.");
        int inputNumber = sc.nextInt();
        return checkoutTheSelectedMovie(inputNumber);
    }
}