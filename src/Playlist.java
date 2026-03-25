import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {
    public static void main(String[] args) {
        // Step 1: Create your ArrayList to hold song titles
        ArrayList<String> playlist = new ArrayList<String>();

        // Step 2: Add your 6 song titles using .add()
        // Example: playlist.add("Song Title Here");
        playlist.add("");
        playlist.add("Run for the hills");
        playlist.add("Kiss it better");
        playlist.add("Never be like you");
        playlist.add("Ultraviolet");
        playlist.add("You da one");
        playlist.add("Trance");


        // Step 3: Print the full playlist with track numbers
        // Track numbers should start at 1, not 0
        System.out.println("My playlist");
        System.out.println(playlist.get(1));
        System.out.println(playlist.get(2));
        System.out.println(playlist.get(3));
        System.out.println(playlist.get(4));
        System.out.println(playlist.get(5));
        System.out.println(playlist.get(6));


        // Step 4: Print the first song in the playlist
        System.out.println("First song: " + playlist.get(1));


        // Step 5: Print the last song in the playlist
        System.out.println("First song: " + playlist.get(6));
        

    }
}
