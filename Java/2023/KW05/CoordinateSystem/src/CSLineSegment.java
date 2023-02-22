import java.awt.*;

public class CSLineSegment implements Shape{
    private CSPoint lineStart;
    private CSPoint lineEnd;

    public CSLineSegment(CSPoint lineStart, CSPoint lineEnd){
        this.lineStart = lineStart;
        this.lineEnd = lineEnd;
    }

    public CSPoint getLineStart() {
        return lineStart;
    }

    public CSPoint getLineEnd() {
        return lineEnd;
    }

    @Override
    public void draw(Graphics2D g2d, CoordinateSystem cs, int fieldScale) {
        CSPoint translatedPoint1 = getLineStart().translatePoint(cs, fieldScale, this.lineStart.x, this.lineStart.y);
        CSPoint translatedPoint2 = getLineEnd().translatePoint(cs, fieldScale, this.lineEnd.x, this.lineEnd.y);
        g2d.setColor(Color.green);
        g2d.drawLine(translatedPoint1.x, translatedPoint1.y, translatedPoint2.x, translatedPoint2.y);
    }

}
