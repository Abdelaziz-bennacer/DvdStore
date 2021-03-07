package fr.abdel.repository;

import fr.abdel.entity.Movie;

import java.io.IOException;

public interface MovieRepositoryInterface {

    void add(Movie movie) throws IOException;
}
