public class Starter {
    public static void main(String args[]) {
        CSPoint point[] = new CSPoint[4];
        point[0] = new CSPoint(-100, -100);
        point[1] = new CSPoint(-100, 100);
        point[2] = new CSPoint(100, -100);
        point[3] = new CSPoint(100, 100);

        CSLineSegment lineSegment[] = new CSLineSegment[3];
        lineSegment[0] = new CSLineSegment(point[0], point[1]);
        lineSegment[1] = new CSLineSegment(point[0], point[3]);
        lineSegment[2] = new CSLineSegment(point[2], point[3]);
        CoordinateSystem cs = new CoordinateSystem(500, point, lineSegment);
        new CSRenderer(cs, 2, 250);
    }
}