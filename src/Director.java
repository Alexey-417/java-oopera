public class Director extends Actor {
    int numberOfShows;

    public Director(Gender gender, double height, String name, String surname, int numberOfShows) {
        super(gender, height, name, surname);
        this.numberOfShows = numberOfShows;
    }
}
