package com.ecld.java.assessment3;

import java.util.Iterator;

public interface PlaylistManager {
    void addTrack(Track track);

    void removeTrack(Long trackId);

    void moveTrack(int fromIndex, int toIndex);

    Iterator<Track> shuffleIterator();

    void updateRating(Long trackId, Integer newRating);
}
