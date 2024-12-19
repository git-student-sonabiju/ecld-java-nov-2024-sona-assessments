package com.ecld.java.assessment3;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //create tracks
        Track track1 = new Track(1L, "FirstSong", 4, false);
        Track track2 = new Track(2L, "SecondSong", 5, true);
        Track track3 = new Track(3L, "ThirdSong", 3, false);
        Track track4 = new Track(4L, "FourthSong", 4, true);
        Track track5 = new Track(5L, "FifthSong", 3, false);

        SmartPlayList playList = new SmartPlayList();

        playList.addTrack(track1);
        playList.addTrack(track2);
        playList.addTrack(track3);
        playList.addTrack(track4);
        playList.addTrack(track5);

        System.out.println("Current Queue:");
        for (Track track : playList.currentQueue) {
            System.out.println(track.getTitle());
        }

        System.out.println("\nShuffled Queue:");//shuffled queue
        Iterator<Track> shuffleIterator = playList.shuffleIterator();
        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next().getTitle());
        }

        playList.updateRating(1L, 2); //update rating
        System.out.println("\nUpdated Rating for 'Song One': " + track1.getRating());
        System.out.println("Queue after update rating:");
        for (Track track : playList.currentQueue) {
            System.out.println(track.getRating());
        }

        playList.removeTrack(2L); //remove track
        System.out.println("\nQueue after removing 'Song Two':");
        for (Track track : playList.currentQueue) {
            System.out.println(track.getTitle());
        }

        playList.moveTrack(0, 2); //move track
        System.out.println("\nQueue after moving track:");
        for (Track track : playList.currentQueue) {
            System.out.println(track.getTitle());
        }

        Track track6 = new Track(5L, "SixthSong", 4, true); //add premium
        playList.addPriority(track6);
        System.out.println("\nQueue after adding a premium track with priority:");
        for (Track track : playList.currentQueue) {
            System.out.println(track.getTitle());
        }
    }
}
