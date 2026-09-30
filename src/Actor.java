public class Actor extends Person {
    private String name;
    private String surname;

    Actor (Gender gender, double height, String name, String surname) {
        super(gender, height);
        this.name = name;
        this.surname = surname;
    }
}
