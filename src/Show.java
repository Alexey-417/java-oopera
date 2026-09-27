import java.util.ArrayList;

public class Show {
    private String title;
    private double duration;
    private Director director;
    private ArrayList<Actor> listOfActor;

    public Show(String title, double duration, Director director, ArrayList<Actor> listOfActor) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActor = listOfActor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getListOfActor() {
        return listOfActor;
    }

    public void setListOfActor(ArrayList<Actor> listOfActor) {
        this.listOfActor = listOfActor;
    }
}
