public class Director extends Actor {

    private int numberOfShows;

    public Director(String name, String surname, String gender, String height, int numberOfShows) {
        super(name, surname, gender, height);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }
}
