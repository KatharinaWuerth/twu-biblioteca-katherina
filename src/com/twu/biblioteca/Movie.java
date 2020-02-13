package com.twu.biblioteca;

public class Movie {
    private String title;
    private int year;
    private String director;
    private int rating;

    public Movie(String title, int year, String director, int rating){
        this.title= title;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public String displayMovie(){
        return this.title + " | " + this.year + " | " + this.director + " | " + this.rating;
    }
}
