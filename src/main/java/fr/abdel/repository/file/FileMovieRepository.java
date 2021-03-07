package fr.abdel.repository.file;

import fr.abdel.entity.Movie;
import fr.abdel.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Repository
public class FileMovieRepository implements MovieRepositoryInterface {

    @Value("${movies.file.location}")
    private File file;

    public File getFile() {
        return file;
    }

    public FileMovieRepository setFile(File file) {
        this.file = file;
        return this;
    }

    public void add(Movie movie) throws IOException {


        try{
            FileWriter writer = new FileWriter(file, true);
            writer.write(movie.getTitle() + " ; " + movie.getGenre() + "\n");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("le film " + movie.getTitle() + " a été ajouté.");
    }
}
