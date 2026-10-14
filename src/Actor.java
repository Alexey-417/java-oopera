import java.util.Objects;

public class Actor extends Person {
    protected String name;
    protected String surname;

    Actor (Gender gender, double height, String name, String surname) {
        super(gender, height);
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Актёр " + name + " " + surname + " (рост: " + height + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Actor otherActor = (Actor) obj;
        return Objects.equals(name, otherActor.name) &&
                Objects.equals(surname, otherActor.surname) &&
                (height == otherActor.height);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (name != null) {
            hash += name.hashCode();
        }
        hash = hash * 31;
        if (surname != null) {
            hash += surname.hashCode();
        }
        return hash;
    }
}
