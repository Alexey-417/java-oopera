import java.util.Objects;

public class Director extends Actor {
    protected int numberOfShows;

    public Director(Gender gender, double height, String name, String surname, int numberOfShows) {
        super(gender, height, name, surname);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Режиссёр спектакля: " + name + " " + surname;
    }
}
