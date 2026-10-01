import java.util.ArrayList;

public class MusicalShow extends Show {
    private String musicAuthor;
    private String librettoText;

    MusicalShow(String musicAuthor, String librettoText, String title, double duration, Director director, ArrayList<Actor> listOfActor) {
        super(title, duration, director, listOfActor);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }
}
