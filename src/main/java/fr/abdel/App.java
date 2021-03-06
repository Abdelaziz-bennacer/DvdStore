package fr.abdel;

import fr.abdel.controller.MovieController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;

@SpringBootApplication
//@Configuration
//@ComponentScan(basePackages = {"fr.abdel.controller", "fr.abdel.repository.file", "fr.abdel.service"})
//@PropertySource("classpath:application.properties")
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, IOException {

        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        ApplicationContext context = SpringApplication.run(App.class, args);
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
