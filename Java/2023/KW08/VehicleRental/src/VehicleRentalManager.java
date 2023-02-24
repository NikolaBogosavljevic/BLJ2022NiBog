import java.time.LocalDate;
import java.util.ArrayList;

public class VehicleRentalManager {
    private ArrayList<Person> customerList = new ArrayList<>();
    private ArrayList<Person> denyList = new ArrayList<>();
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private ArrayList<Contract> contracts = new ArrayList<>();

    public void createContract(Person person, Vehicle vehicle, LocalDate startDate, LocalDate endDate) {
        contracts.add(new Contract(person, vehicle, startDate, endDate, denyList, contracts));
    }

    public void addToCustomerList(Person person) {
        customerList.add(person);
    }

    public void addToDenyList(Person person){
        denyList.add(person);
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }
}
