package fr.abdel;

import fr.abdel.controller.MovieController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;


public class App 
{
    public static void main( String[] args ) throws IOException {

        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MovieController movieController = context.getBean(MovieController.class);
        movieController.addUsingConsole();


       /* MovieController movieController = new MovieController();
        FileMovieRepository movieRepository = new FileMovieRepository();
        DefaultMovieService movieService = new DefaultMovieService();
        movieController.setMovieService(movieService);
        movieService.setMovieRepository(movieRepository);
        movieController.addUsingConsole();*/
    }
}
