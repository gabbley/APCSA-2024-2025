import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Represents a movie with details such as name, duration, release year, 
 * directors, and a script file. Provides functionality to load and print the movie script.
 */
public class Movie {

   private String name;
   private String scriptFileName;
   private int durationMins, releaseYear;
   private String[] directors;
   private ArrayList<Movie> similarMovies; // starts empty, can be added to (TODO)

   /**
    * Constructs a Movie object with the given parameters.
    * 
    * @param nm   The name of the movie.
    * @param dur  The duration of the movie in minutes.
    * @param year The release year of the movie.
    * @param ds   An array of director names.
    */
   public Movie(String nm, int dur, int year, String[] ds) {
      name = nm;
      releaseYear = year;
      directors = ds;
      scriptFileName = "scripts/" + nm.toLowerCase().trim() + ".txt";
   }

   /**
    * Returns the name of the movie.
    * 
    * @return The name of the movie.
    */
   public String getName() {
      return name;
   }

   /**
    * Loads and prints the script of the movie from the associated script file.
    * If the script file is not found, an error message is displayed.
    */
   public void loadScript() {
      try {
         Scanner fileReader = new Scanner(new File(scriptFileName));

         while (fileReader.hasNextLine()) {
            System.out.println(fileReader.nextLine()); // Print each line directly
         }

         fileReader.close();
      } catch (IOException e) {
         System.out.println("File not found: " + scriptFileName);
      }
   }
}
