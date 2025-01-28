import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> playlist = new ArrayList<>();

        // Adding starter songs
        playlist.add("Denial is a River");
        playlist.add("That's So True");
        playlist.add("Dancing in the Moonlight");

        System.out.println("Current Playlist: " + playlist);

        // TODO 1: Ask the user for a new song and add it to the playlist.
        System.out.print("Enter a new song to add: ");
        String newSong = scanner.nextLine();
        // Add newSong to the playlist

        // TODO 2: Ask the user for a song name to remove.
        System.out.print("Enter a song to remove: ");
        String songToRemove = scanner.nextLine();
        // Remove songToRemove from the playlist if it exists

        // TODO 3: Ask the user for a song to replace and the new song name.
        System.out.print("Enter a song to replace: ");
        String songToReplace = scanner.nextLine();
        System.out.print("Enter the new song: ");
        String replacementSong = scanner.nextLine();
        // Replace songToReplace with replacementSong in the playlist if it exists

        // TODO 4: Print the updated playlist.
        System.out.println("Updated Playlist:");


    }
}
