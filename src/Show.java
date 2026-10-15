import java.util.ArrayList;

public class Show {
    private String title;
    private double duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, double duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printListOfActors() { // печатаем список актёров.
        System.out.println(listOfActors);
    }

    public void addAnActor(Actor actor) { // добавляем актёра.
       if (listOfActors.isEmpty()) {
           listOfActors.add(actor);
       } else {
           if (listOfActors.contains(actor)) {
               System.out.println("Такой актёр уже есть в списке.");
           } else {
               listOfActors.add(actor);
               System.out.println("Актёр добавлен в список");
           }
       }
    }

    public void replaceActor(Actor actor, String lastName) { //заменяем актёра в списке на другого.
        for (Actor i:listOfActors) {
            if (lastName.equals(i.getSurname())) {
                listOfActors.remove(i);
                listOfActors.add(actor);
                System.out.println("Актёр " + lastName + " был заменён на актёра " + actor);
            } else {
                System.out.println(lastName + " - -такого актёра нет в списке.");
            }
        }
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

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActor(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }
}
