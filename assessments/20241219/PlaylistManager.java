package com.ecld.java.assess;
import java.util.Iterator;
import java.util.List;

    public interface PlaylistManager {
        void addTrack(Track track);
        void removeTrack(Long trackId);
        void moveTrack(int fromIndex, int toIndex);
        Iterator<Track> shuffleIterator();
        void updateRating(Long trackId, Integer newRating);
        List<Track> getCurrentQueue();
    }
