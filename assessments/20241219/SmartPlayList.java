package com.ecld.java.assessment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SmartPlayList implements PlaylistManager {
    private final List<Track> playedTracks;
    public List<Track> currentQueue;

    public SmartPlayList()  //constructor
    {
        this.currentQueue = new ArrayList<>();
        this.playedTracks = new ArrayList<>();
    }

    @Override
    public void addTrack(Track track) {
        currentQueue.add(track);
    }

    @Override
    public void removeTrack(Long trackId) {
        currentQueue.removeIf(track -> track.getTrackId().equals(trackId));
    }

    @Override
    public void moveTrack(int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex >= currentQueue.size() || toIndex < 0 || toIndex >= currentQueue.size()) {
            System.out.println("invalid index");
        }
        Track track = currentQueue.remove(fromIndex);
        currentQueue.add(toIndex, track);
    }

    @Override
    public Iterator<Track> shuffleIterator() {
        List<Track> shuffledList = new ArrayList<>(currentQueue);
        Collections.shuffle(shuffledList);
        return shuffledList.iterator();
    }

    @Override
    public void updateRating(Long trackId, Integer newRating) {
        for (Track track : currentQueue) {
            if (track.getTrackId().equals(trackId)) {
                track.setRating(newRating);
                break;
            }
        }
    }
    public void addPriority(Track track) {
        if (track.isPremium()) {
            currentQueue.add(0, track);

        } else {
            currentQueue.add(track);
        }
    }
}