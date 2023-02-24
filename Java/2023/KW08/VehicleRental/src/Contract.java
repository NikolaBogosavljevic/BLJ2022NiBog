import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {
    private Person person;
    private Vehicle vehicle;
    private LocalDate startDate;
    private LocalDate endDate;

    public Contract(Person person, Vehicle vehicle, LocalDate startDate, LocalDate endDate, ArrayList<Person> denyList, ArrayList<Contract> contracts){
        try {
            for (Person p : denyList){
                if (p.equals(person)){
                    throw new DenyListException();
                }
            }
            for (Contract c : contracts) {
                if (startDate.isAfter(c.getStartDate()) && startDate.isBefore(c.getEndDate()) ||
                        endDate.isAfter(c.getStartDate()) && endDate.isBefore(c.getEndDate())){
                    throw new LeaseLengthCollisionException();
                }
            }
            if (vehicle.getAgeRestriction().isBefore(person.getBirthYear())){
                throw new MinorAgeException();
            }
            this.person = person;
            this.vehicle = vehicle;
            this.startDate = startDate;
            this.endDate= endDate;

        }catch (Exception e){
            System.out.println("No contract for ya: "+e.getMessage());
        }
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
}
