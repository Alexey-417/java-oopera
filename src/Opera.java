public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(MusicAuthor musicAuthor, LibrettoText librettoText, String title, double duration, Director director,
                 int choirSize) {
        super(musicAuthor, librettoText, title, duration, director);
        this.choirSize = choirSize;
    }
}
