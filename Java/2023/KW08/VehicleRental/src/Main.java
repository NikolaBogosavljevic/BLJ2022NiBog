import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        VehicleRentalManager vrm = new VehicleRentalManager();
        Car car = new Car(23949, "Blue", 3, 4, Year.of(2004));
        Plane plane = new Plane(50020, "Pink", 3023, 5, Year.of(2005), 40);
        Boat boat = new Boat(1248739, "White", 12, 6, Year.of(2004));
        while (true) {
            System.out.println("\nContract creation");
            System.out.println("PERSON");
            System.out.print("First name: ");
            String firstName = scan.nextLine();
            System.out.print("Last name: ");
            String lastName = scan.nextLine();
            System.out.print("Birthyear: ");
            int birthyear = scan.nextInt();
            Person pers = new Person(Year.of(birthyear), firstName, lastName);
            vrm.addToCustomerList(pers);
            System.out.println("Add person to denylist?     y or n");
            scan.nextLine();
            String denyChoice = scan.nextLine();
            if (denyChoice.equals("y")){
                vrm.addToDenyList(pers);
                System.out.println("ADDED TO DENYLIST");
            }
            System.out.println("PERSON ADDED");
            System.out.println("\nVEHICLE");
            System.out.println("Choose a vehicle");
            System.out.println("1: Car    2: Plane    3: Boat");
            int vehicleChoice = scan.nextInt();
            System.out.println("VEHICLE ADDED");
            System.out.println("\nLEASE LENGTH");
            vrm.createContract(pers, chooseVehicle(vehicleChoice, vrm, plane, car, boat), chooseStartDate(scan), chooseEndDate(scan));
        }

    }

    public static LocalDate chooseStartDate(Scanner scan) {
        System.out.println("Start date");
        System.out.print("Year: ");
        int year = scan.nextInt();
        System.out.print("Month: ");
        int month = scan.nextInt();
        System.out.print("Day: ");
        int day = scan.nextInt();
        LocalDate startDate = LocalDate.of(year, month, day);
        return startDate;
    }

    public static LocalDate chooseEndDate(Scanner scan) {
        System.out.println("\nEnd date");
        System.out.print("Year: ");
        int year = scan.nextInt();
        System.out.print("Month: ");
        int month = scan.nextInt();
        System.out.print("Day: ");
        int day = scan.nextInt();
        LocalDate endDate = LocalDate.of(year, month, day);
        scan.nextLine();
        return endDate;
    }

    public static Vehicle chooseVehicle(int vehicleChoice, VehicleRentalManager vrm, Plane plane, Car car, Boat boat) {
        if (vehicleChoice == 1) {
            vrm.addVehicle(car);
            return car;
        } else if (vehicleChoice == 2) {
            vrm.addVehicle(plane);
            return plane;

        } else if (vehicleChoice == 3) {
            vrm.addVehicle(boat);
            return boat;
        }
        return null;
    }

}