import java.io.File; 
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Represents a theater that manages a collection of movies. 
 * Provides functionality to load movies from a file and play them.
 */
public class Theater {
   private String name;
   private ArrayList<Movie> collection;

   /**
    * Constructs a Theater object with a given name and initializes an empty movie collection.
    * 
    * @param nm The name of the theater.
    */
   public Theater(String nm) {
      name = nm;
      collection = new ArrayList<Movie>();
      loadMovies();
   }

   /**
    * Loads movies from the file "movies.txt" and adds them to the theater's collection.
    * The expected format in the file is:
    * (Movie Name) durationInMinutes yearReleased [Director1, Director2]
    * If the file is not found, an error message is displayed.
    */
   public void loadMovies() {
      String filepath = "movies.txt";
      try {
         Scanner fileReader = new Scanner(new File(filepath));
         while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine().trim();
            if (line.isEmpty()) 
               continue;
         
            // Extract movie details from line
            String movieData = line.substring(1, line.indexOf(")"));
            String rest = line.substring(line.indexOf(")") + 2); // Skip ") "
         
            Scanner restScanner = new Scanner(rest);
            int duration = restScanner.nextInt();
            int year = restScanner.nextInt();
            String directorData = restScanner.nextLine().trim();
            restScanner.close();
         
            // Extract directors (remove brackets and split by comma)
            directorData = directorData.substring(1, directorData.length() - 1);
            String[] directors = directorData.split(", ");
         
            // Create a Movie object and add it to the collection
            Movie movie = new Movie(movieData, duration, year, directors);
            collection.add(movie);
         }
         fileReader.close();
      } catch (IOException e) {
         System.out.println("Error loading movies: " + e.getMessage());
      }
   }

   /**
    * Plays a specific movie by name by reading and printing its script.
    * If the movie is not found in the collection, no action is taken.
    * 
    * @param movieName The name of the movie to play.
    */
   public void playMovie(String movieName) {
     //  TO BE IMPLEMENTED BY YOU
   }

   /**
    * Plays a random movie from the collection by reading and printing its script.
    * If no movies are available, a message is displayed.
    */
   public void playRandomMovie() {
      if (!collection.isEmpty()) {
         Movie movieToPlay = collection.get((int) (Math.random() * collection.size()));
         System.out.println("Now playing: " + movieToPlay.getName());
         movieToPlay.loadScript();
      } else {
         System.out.println("No movies available");
      }
   }
   
}
