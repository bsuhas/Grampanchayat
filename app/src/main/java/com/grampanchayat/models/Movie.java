package com.grampanchayat.models;

/**
 * @ Firstcry
 * Created by suhasbachewar on 2/6/16.
 */
public class Movie {


    private String title, genre, year,price,time;

    public Movie() {
    }

    public Movie(String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }
    public Movie(String title, String genre, String year, String price ,String time) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.price = price;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
