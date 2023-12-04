package basicProgramming.inputOutput;

import java.util.HashMap;
import java.util.Scanner;

public class FavoriteSinger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the number of songs in the playlist
        int n = scanner.nextInt();

        // HashMap to store the count of songs for each singer, using long for large
        // numbers
        HashMap<Long, Integer> singerCount = new HashMap<>();

        // Reading the singer for each song and updating the count
        for (int i = 0; i < n; i++) {
            long singer = scanner.nextLong();
            singerCount.put(singer, singerCount.getOrDefault(singer, 0) + 1);
        }

        // Finding the maximum number of songs by any singer
        int maxSongs = 0;
        for (int count : singerCount.values()) {
            if (count > maxSongs) {
                maxSongs = count;
            }
        }

        // Counting how many singers have the maximum number of songs
        int favouriteSingers = 0;
        for (int count : singerCount.values()) {
            if (count == maxSongs) {
                favouriteSingers++;
            }
        }

        // Outputting the number of favourite singers
        System.out.println(favouriteSingers);
        scanner.close();
    }
}
