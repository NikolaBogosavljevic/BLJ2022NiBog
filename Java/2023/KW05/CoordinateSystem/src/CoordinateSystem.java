public class CoordinateSystem {
    private int coordinateSystemSize;
    private Shape[] allShapes;

    public CoordinateSystem(int coordinateSystemSize, Shape[] shapes) {
        if (coordinateSystemSize < 0 || coordinateSystemSize % 20 != 0){
            throw new IllegalArgumentException();
        }
        this.coordinateSystemSize = coordinateSystemSize;
        this.allShapes = shapes;
    }

    public int getCoordinateSystemSize() {
        return coordinateSystemSize;
    }

    public Shape[] getAllShapes() {
        return allShapes;
    }
}
