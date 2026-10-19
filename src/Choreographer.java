public class Choreographer extends Person {

    public Choreographer(Gender gender, double height, String name, String surname) {
        super(gender, height, name, surname);
    }

    @Override
    public String toString() {
        return "Choreographer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
