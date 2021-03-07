package fr.abdel.service;

import fr.abdel.entity.Movie;

import java.io.IOException;

public interface MovieServiceInterface {

    void registerMovie(Movie movie) throws IOException;
    void registerMovieLive(Movie movie) throws IOException;
}
