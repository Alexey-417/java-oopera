import java.util.ArrayList;

public class MusicalShow extends Show {
    private String musicAuthor;
    private String librettoText;

    MusicalShow(String musicAuthor, String librettoText, String title, double duration, Director director) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

public String printLibrettoText() {
        return librettoText;
}
}
