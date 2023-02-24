import java.time.LocalDate;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        VehicleRentalManager vrm = new VehicleRentalManager();
        Person pers1 = new Person(Year.of(2009), "Oscar", "Doelly");
        Plane plane = new Plane(18473, "blue", 334, 315, Year.of(2005), 40);
        vrm.addToCustomerList(pers1);
        vrm.addVehicle(plane);
        vrm.createContract(pers1, plane, LocalDate.of(2023, 02, 24), LocalDate.of(2023, 04, 6));

    }
}