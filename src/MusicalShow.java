public class MusicalShow extends Show {
    private MusicAuthor musicAuthor;
    private String librettoText;

    MusicalShow(MusicAuthor musicAuthor, String librettoText, String title, double duration, Director director) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

public String printLibrettoText() {
        return librettoText;
}
}
