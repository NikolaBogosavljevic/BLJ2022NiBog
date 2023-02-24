import java.time.LocalDate;
import java.time.Year;

public class Person {
    private Year birthYear;
    private String firstName;
    private String lastName;

    public Person(Year birthYear, String firstName, String lastName) {
        this.birthYear = birthYear;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Year getBirthYear() {
        return birthYear;
    }
}
