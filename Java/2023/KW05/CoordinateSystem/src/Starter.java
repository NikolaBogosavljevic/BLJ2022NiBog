public class Starter {
    public static void main(String[] args) {
        CSPoint point[] = new CSPoint[2];
        point[0] = new CSPoint(0, 0);
        point[1] = new CSPoint(-156, 65);
        CSLineSegment lineSegment[] = new CSLineSegment[1];
        lineSegment[0] = new CSLineSegment(point[0], point[1]);

        CoordinateSystem cs = new CoordinateSystem(500, point, lineSegment);
        new CSRenderer(cs, 2, 138);
    }
}