public class Ballet extends MusicalShow {
    private Choreographer choreographer;


    public Ballet(MusicAuthor musicAuthor, LibrettoText librettoText, String title, double duration, Director director,
                  Choreographer choreographer) {
        super(musicAuthor, librettoText, title, duration, director);
        this.choreographer = choreographer;
    }
}
