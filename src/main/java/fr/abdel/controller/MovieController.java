package fr.abdel.controller;

import fr.abdel.entity.Movie;
import fr.abdel.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.Scanner;

@Controller
public class MovieController {

    @Autowired
    private MovieServiceInterface movieService;

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    public void addUsingConsole() throws IOException {

        Scanner sc = new Scanner(System.in);
        Movie movie = new Movie();
        System.out.println( "Veuillez faire votre séléction." );
        System.out.println( "Entrez le genre du film" );
        String genre = sc.nextLine();
        movie.setGenre(genre);
        System.out.println( "Entrez le titre du film" );
        String title = sc.nextLine();
        movie.setTitle(title);
        movieService.registerMovieLive(movie);
    }
}
