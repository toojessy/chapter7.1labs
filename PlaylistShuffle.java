/*
Name: Jessica
Date: Kamienski
Description:  Prints the shuffled playlist to the console.
*/

import java.util.Random;

public class PlaylistShuffle {
    public static void main(String[] args) {
        String[] playlist = {
            "Shake It Off – Taylor Swift",
            "I Love You – Barney",
            "Baby Shark – Pinkfong",
            "Never Gonna Give You Up – Rick Astley",
            "Axel F (Crazy Frog) – Crazy Frog",
            "Gangnam Style – PSY",
            "What Does the Fox Say? - Ylvis"
        };

        shuffle(playlist); 

        System.out.println("Shuffled Playlist:\n");
        for (String song : playlist) {
            System.out.println(song);
        }
    }

    public static void shuffle(String[] playlist) {
        Random rand = new Random();

        for (int i = playlist.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); 

            String temp = playlist[i];
            playlist[i] = playlist[j];
            playlist[j] = temp;
        }
    }
}
