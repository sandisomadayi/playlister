import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Storing {
    Track track;
    public Storing(Track track) {
        this.track = track;
    }
    File file = new File("play.txt");

    public void putDetails() {
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.append(track.getArtist() + " " + track.getTitle());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
