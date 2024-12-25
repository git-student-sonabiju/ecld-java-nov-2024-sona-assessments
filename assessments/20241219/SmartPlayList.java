package com.ecld.java.assess;
import java.util.*;

    public class SmartPlaylist implements PlaylistManager {
        private final PlaylistType playlistType;
        private final LinkedList<Track> currentQueue;
        private final List<Track> playedTracks;
        private final Random random;

        public SmartPlaylist(PlaylistType playlistType) {
            this.playlistType = playlistType;
            this.currentQueue = new LinkedList<>();
            this.playedTracks = new ArrayList<>();
            this.random = new Random();
        }

        @Override
        public void addTrack(Track track) {
            if (track.isPremium()) {
                currentQueue.addFirst(track); // Premium tracks get priority
            } else {
                currentQueue.addLast(track);
            }
        }

        @Override
        public void removeTrack(Long trackId) {
            currentQueue.removeIf(track -> track.getTrackId().equals(trackId));
        }

        @Override
        public void moveTrack(int fromIndex, int toIndex) {
            if (fromIndex < 0 || fromIndex >= currentQueue.size() || toIndex < 0 || toIndex >= currentQueue.size()) {
                throw new IndexOutOfBoundsException("Invalid Index");
            }
            Track track = currentQueue.remove(fromIndex);
            currentQueue.add(toIndex, track);
        }

        @Override
        public Iterator<Track> shuffleIterator() {
            if (playedTracks.containsAll(currentQueue)) {
                playedTracks.clear(); // Reset memory when all tracks have been played
            }
            List<Track> unplayedTracks = new ArrayList<>(currentQueue);
            unplayedTracks.removeAll(playedTracks);

            Collections.shuffle(unplayedTracks, random);
            playedTracks.addAll(unplayedTracks);

            return new TrackIterator(unplayedTracks);
        }

        @Override
        public void updateRating(Long trackId, Integer newRating) {
            for (Track track : currentQueue) {
                if (track.getTrackId().equals(trackId)) {
                    track.setRating(newRating);
                    return;
                }
            }
            throw new NoSuchElementException("Track with ID " + trackId + " not found");
        }

        @Override
        public List<Track> getCurrentQueue() {
            return new ArrayList<>(currentQueue);
        }
    }
