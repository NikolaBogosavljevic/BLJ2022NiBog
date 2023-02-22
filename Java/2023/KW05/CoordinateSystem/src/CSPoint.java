import java.awt.*;

public class CSPoint extends Point implements Shape {
    private static int count = 0;

    private int pointId = 1;


    public CSPoint(int x, int y) {
        super(x, y);

    }

    @Override
    public String toString(){
        return "x: "+ x+"  y: "+y+"   ID: "+pointId;
    }

    public void setPointId(int pointId) {
        this.pointId = pointId;
    }

    @Override
    public void draw(Graphics2D g2d, CoordinateSystem cs, int fieldScale) {
        CSPoint translatedPoint = translatePoint(cs, fieldScale, this.x, this.y);
        g2d.setColor(Color.magenta);
        g2d.drawLine(translatedPoint.x, translatedPoint.y, translatedPoint.x, translatedPoint.y);
    }


}
