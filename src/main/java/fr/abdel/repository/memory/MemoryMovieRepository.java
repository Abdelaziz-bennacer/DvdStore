package fr.abdel.repository.memory;

import fr.abdel.entity.Movie;
import fr.abdel.repository.MovieRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {

    private static List<Movie> movies = new ArrayList<>();

    public void add(Movie movie){
        movies.add(movie);
        System.out.println("Le film: " + movie.getTitle() + " a été ajouté.");
    }
}
