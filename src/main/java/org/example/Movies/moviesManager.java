package org.example.Movies;

public class moviesManager {
    private String[] movies = new String[0];
    private int limit;

    public moviesManager() {
        this.limit = 5;
    }

    public moviesManager(int limit) {
        this.limit = limit;
    }

    public void addMovie(String moviesNew) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = moviesNew;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            tmp[i] = movies[movies.length - 1 - i];

        }
        return tmp;

    }


}
