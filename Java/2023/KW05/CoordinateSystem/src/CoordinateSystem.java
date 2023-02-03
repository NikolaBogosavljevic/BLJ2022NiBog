public class CoordinateSystem {
    private int coordinateSystemSize;
    private CSPoint[] allPoints;
    private CSLineSegment[] allLines;

    public CoordinateSystem(int coordinateSystemSize, CSPoint[] point, CSLineSegment[] lineSegment) {
        if (coordinateSystemSize < 0 || coordinateSystemSize % 20 != 0){
            throw new IllegalArgumentException();
        }
        this.coordinateSystemSize = coordinateSystemSize;
        this.allPoints = point;
        this.allLines = lineSegment;
    }

    public int getCoordinateSystemSize() {
        return coordinateSystemSize;
    }

    public CSPoint[] getAllPoints() {
        return allPoints;
    }

    public CSLineSegment[] getAllLines() {
        return allLines;
    }
}
