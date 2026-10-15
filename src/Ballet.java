import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private String choreographer;


    public Ballet(String musicAuthor, String librettoText, String title, double duration, Director director, String choreographer) {
        super(musicAuthor, librettoText, title, duration, director);
        this.choreographer = choreographer;
    }
}
