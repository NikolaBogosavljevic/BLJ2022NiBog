import java.awt.*;

public class CSPoint extends Point {
    private static int count = 0;

    private int pointId = 1;


    public CSPoint(int x, int y) {
        super(x, y);
        setPointId(count++);
    }

    @Override
    public String toString(){
        return "x: "+ x+"  y: "+y+"   ID: "+pointId;
    }

    public void setPointId(int pointId) {
        this.pointId = pointId;
    }
}
