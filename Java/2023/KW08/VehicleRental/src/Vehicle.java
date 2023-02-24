import java.time.Year;

public class Vehicle {
    private int price;
    private String color;
    private int maxSpeed;
    private int capacity;
    private Year ageRestriction;

    public Vehicle(int price, String color, int maxGeschw, int capacity, Year ageRestriction){
        this.price = price;
        this.color = color;
        this.maxSpeed = maxGeschw;
        this.capacity = capacity;
        this.ageRestriction = ageRestriction;
    }


    public Year getAgeRestriction() {
        return ageRestriction;
    }
}
