public class MusicalShow extends Show {
    private MusicAuthor musicAuthor;
    private LibrettoText librettoText;

    MusicalShow(MusicAuthor musicAuthor, LibrettoText librettoText, String title, double duration, Director director) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

public String printLibrettoText() {
        return librettoText.text;
}
}
