import java.util.ArrayList;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String musicAuthor, String librettoText, String title, double duration, Director director, ArrayList<Actor> listOfActor, int choirSize) {
        super(musicAuthor, librettoText, title, duration, director, listOfActor);
        this.choirSize = choirSize;
    }
}
