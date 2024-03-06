package org.example.Movies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class moviesManagerTest {

    @Test
    public void AddNullMovies() {
        moviesManager manager = new moviesManager();
        manager.addMovie("");

        String[] expected = {""};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void AddThreeMovies() {
        moviesManager manager = new moviesManager();
        manager.addMovie("Форсаж 1");
        manager.addMovie("Форсаж 2");
        manager.addMovie("Форсаж 3");

        String[] expected = {"Форсаж 1", "Форсаж 2", "Форсаж 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddSixMovies() {
        moviesManager manager = new moviesManager();
        manager.addMovie("Форсаж 1");
        manager.addMovie("Форсаж 2");
        manager.addMovie("Форсаж 3");
        manager.addMovie("Форсаж 4");
        manager.addMovie("Форсаж 5");
        manager.addMovie("Форсаж 6");


        String[] expected = {"Форсаж 1", "Форсаж 2", "Форсаж 3", "Форсаж 4", "Форсаж 5", "Форсаж 6"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddFindLastMovies() {
        moviesManager manager = new moviesManager();

        manager.addMovie("Форсаж 1");
        manager.addMovie("Форсаж 2");
        manager.addMovie("Форсаж 3");
        manager.addMovie("Форсаж 4");
        manager.addMovie("Форсаж 5");

        String[] expected = {"Форсаж 5", "Форсаж 4", "Форсаж 3", "Форсаж 2", "Форсаж 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddFindLastSixMovies() {
        moviesManager manager = new moviesManager();
        manager.addMovie("Форсаж 1");
        manager.addMovie("Форсаж 2");
        manager.addMovie("Форсаж 3");
        manager.addMovie("Форсаж 4");
        manager.addMovie("Форсаж 5");
        manager.addMovie("Форсаж 6");

        String[] expected = {"Форсаж 6", "Форсаж 5", "Форсаж 4", "Форсаж 3", "Форсаж 2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddFindLastSixLimitMovies() {
        moviesManager manager = new moviesManager(6);
        manager.addMovie("Форсаж 1");
        manager.addMovie("Форсаж 2");
        manager.addMovie("Форсаж 3");
        manager.addMovie("Форсаж 4");
        manager.addMovie("Форсаж 5");
        manager.addMovie("Форсаж 6");

        String[] expected = {"Форсаж 6", "Форсаж 5", "Форсаж 4", "Форсаж 3", "Форсаж 2", "Форсаж 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddFindLastSevenMovies() {
        moviesManager manager = new moviesManager(6);
        manager.addMovie("Форсаж 1");
        manager.addMovie("Форсаж 2");
        manager.addMovie("Форсаж 3");
        manager.addMovie("Форсаж 4");
        manager.addMovie("Форсаж 5");
        manager.addMovie("Форсаж 6");
        manager.addMovie("Форсаж 7");

        String[] expected = {"Форсаж 7", "Форсаж 6", "Форсаж 5", "Форсаж 4", "Форсаж 3", "Форсаж 2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddFindLastLimitMovies() {
        moviesManager manager = new moviesManager(6);

        manager.addMovie("Форсаж 1");
        manager.addMovie("Форсаж 2");
        manager.addMovie("Форсаж 3");
        manager.addMovie("Форсаж 4");
        manager.addMovie("Форсаж 5");

        String[] expected = {"Форсаж 5", "Форсаж 4", "Форсаж 3", "Форсаж 2", "Форсаж 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}




