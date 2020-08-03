public class Track {
    String title;
    String artist;
    String trackType;
    String mixType;
    public Track(String title, String artist, String trackType, String mixType) {
        this.title = title;
        this.artist = artist;
        this.trackType = trackType;
        this.mixType = mixType;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getTrackType() {
        return trackType;
    }

    public String getMixType() {
        return mixType;
    }
}
