public class Starter {
    public static void main(String args[]) {

        Shape shapes[] = new Shape[7];
        shapes[0] = new CSPoint(-100, -100);
        shapes[1] = new CSPoint(-100, 100);
        shapes[2] = new CSPoint(100, -100);
        shapes[3] = new CSPoint(100, 100);
        shapes[4] = new CSLineSegment(new CSPoint(-100, -100), new CSPoint(-100, 100));
        shapes[5] = new CSLineSegment(new CSPoint(-100, 100), new CSPoint(100, -100));
        shapes[6] = new CSLineSegment(new CSPoint(100, -100), new CSPoint(100, 100));
        CoordinateSystem cs = new CoordinateSystem(500, shapes);
        new CSRenderer(cs, 2, 15);
    }
}