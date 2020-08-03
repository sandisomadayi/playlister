import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrackTest {

    @Test
    void shouldDisplayTrackName() {
        Track track = new Track("Orbion", "Armin van Buuren", "WAV", "Extended Mix");

        assertEquals("Orbion", track.getTitle());
    }

    @Test
    void shouldDisplayArtistName() {
        Track track = new Track("Orbion", "Armin van Buuren", "WAV", "Extended Mix");

        assertEquals("Armin van Buuren", track.getArtist());
    }

    @Test
    void shouldDisplayTrackType() {
        Track track = new Track("Orbion", "Armin van Buuren", "WAV", "Extended Mix");

        assertEquals("WAV", track.getTrackType());
    }

    @Test
    void shouldDisplayMixType() {
        Track track = new Track("Orbion", "Armin van Buuren", "WAV", "Extended Mix");

        assertEquals("Extended Mix", track.getMixType());
    }
}
