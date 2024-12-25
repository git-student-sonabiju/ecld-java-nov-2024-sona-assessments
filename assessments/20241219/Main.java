package com.ecld.java.assess;
import java.util.Iterator;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            SmartPlaylist userPlaylist = new SmartPlaylist(PlaylistType.USER_CREATED);

            // Pre-defined Tracks
            Track track1 = new Track(1L, "Hello", false);
            Track track2 = new Track(2L, "Mood", true);
            Track track3 = new Track(3L, "Goodbyes", false);

            // Adding Tracks
            userPlaylist.addTrack(track1);
            userPlaylist.addTrack(track2);
            userPlaylist.addTrack(track3);

            // Adding via User Input
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the track name to be added: ");
            String trackName = sc.nextLine();
            System.out.print("Enter the track ID for the above track: ");
            Long trackId = Long.parseLong(sc.nextLine());
            System.out.print("Enter the Premium status (true/false): ");
            boolean isPremium = Boolean.parseBoolean(sc.nextLine());
            Track userTrack = new Track(trackId, trackName, isPremium);
            userPlaylist.addTrack(userTrack);

            // Display Current Queue
            System.out.println("\nCurrent Queue:");
            for (Track track : userPlaylist.getCurrentQueue()) {
                System.out.println(track.getTitle() + " (Premium: " + track.isPremium() + ")");
            }

            // Update Ratings
            userPlaylist.updateRating(1L, 4);
            userPlaylist.updateRating(2L, 5);

            System.out.println("\nQueue after Rating Updates:");
            for (Track track : userPlaylist.getCurrentQueue()) {
                System.out.println(track.getTitle() + " - Rating: " + track.getRating());
            }

            // Shuffle
            System.out.println("\nShuffle Queue:");
            Iterator<Track> shuffleIterator = userPlaylist.shuffleIterator();
            while (shuffleIterator.hasNext()) {
                Track track = shuffleIterator.next();
                System.out.println(track.getTitle());
            }

            // Remove a Track
            System.out.println("\nRemoving Track with ID 1...");
            userPlaylist.removeTrack(1L);

            System.out.println("\nQueue after Removal:");
            for (Track track : userPlaylist.getCurrentQueue()) {
                System.out.println(track.getTitle());
            }

            sc.close();
        }
    }
