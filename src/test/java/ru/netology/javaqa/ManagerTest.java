package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    @Test
    public void noFilm() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findOneFilm() {
        FilmManager manager = new FilmManager();
        manager.add("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findFiveFilm() {
        FilmManager manager = new FilmManager();
        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");

        String[] expected = {"Бладшот", "Вперёд", "Отель Белград", "Джентельмены", "Человек-невидимка"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findFilmEqualsLimit() {
        FilmManager manager = new FilmManager(5);

        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");

        String[] expected = {"Человек-невидимка", "Джентельмены", "Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findFilmLessLimit() {
        FilmManager manager = new FilmManager(5);

        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");


        String[] expected = {"Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void findFilmMoreLimit() {
        FilmManager manager = new FilmManager(5);

        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");
        manager.add("Гарри Поттер");

        String[] expected = {"Гарри Поттер","Человек-невидимка", "Джентельмены", "Отель Белград", "Вперёд"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
