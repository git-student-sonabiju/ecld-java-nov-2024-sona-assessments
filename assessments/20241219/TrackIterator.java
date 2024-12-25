package com.ecld.java.assess;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

    public class TrackIterator implements Iterator<Track> {
        private final List<Track> tracks;
        private int currentIndex = 0;

        public TrackIterator(List<Track> tracks) {
            this.tracks = tracks;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < tracks.size();
        }

        @Override
        public Track next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more tracks to iterate");
            }
            return tracks.get(currentIndex++);
        }
    }
