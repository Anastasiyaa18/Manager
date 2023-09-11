package ru.netology.javaqa;

public class FilmManager {
    private String[] movies = new String[0];
    private int limit;

    public FilmManager() {
        this.limit = 5;

    }

    public FilmManager(int limit) {
        this.limit = limit;

    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        this.movies = tmp;
    }

    public String[] findAll() {
        return movies;

    }

    public String[] findLast() {
        int quantityLength;
        if (movies.length < limit) {
            quantityLength = movies.length;
        } else {
            quantityLength = limit;
        }
        String[] mov = new String[quantityLength];
        for (int i = 0; i < mov.length; i++) {
            mov[i] = movies[movies.length - 1 - i];
        }
        return mov;
    }

}
