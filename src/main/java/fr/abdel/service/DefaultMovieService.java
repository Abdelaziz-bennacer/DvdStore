package fr.abdel.service;

import fr.abdel.entity.Movie;
import fr.abdel.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DefaultMovieService implements MovieServiceInterface {

    @Autowired
    private MovieRepositoryInterface movieRepository;

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void registerMovie(Movie movie) throws IOException {
        movieRepository.add(movie);
    }

    public void registerMovieLive(Movie movie) throws IOException {
        movieRepository.add(movie);
    }


}
