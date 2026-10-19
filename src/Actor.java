public class Actor extends Person {

    Actor (Gender gender, double height, String name, String surname) {
        super(gender, height, name, surname);
    }

    @Override
    public String toString() {
        return "Актёр " + name + " " + surname + " (рост: " + height + ")";
    }
}
