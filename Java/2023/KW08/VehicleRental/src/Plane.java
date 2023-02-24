import java.time.Year;

public class Plane extends Vehicle{
    private int wingSpan;

    public Plane(int price, String color, int maxGeschw, int capacity, Year ageRestriction, int wingSpan){
        super(price,  color,  maxGeschw,  capacity,  ageRestriction);
        this.wingSpan = wingSpan;
    }
}
