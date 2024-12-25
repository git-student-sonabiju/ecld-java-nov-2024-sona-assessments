package com.ecld.java.assess;
public class Track {
    private final Long trackId;
    private final String title;
    private int rating;
    private final boolean isPremium;

    public Track(Long trackId, String title, boolean isPremium) {
        this.trackId = trackId;
        this.title = title;
        this.isPremium = isPremium;
    }

    public Long getTrackId() {
        return trackId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        } else {
            throw new IllegalArgumentException("Rating must be between 1 and 5");
        }
    }
}
