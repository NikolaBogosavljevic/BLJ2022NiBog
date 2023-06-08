package ch.noseryoung.main;

import java.util.Comparator;

public class TriangleComparator implements Comparator<Triangle> {
    @Override
    public int compare(Triangle t1, Triangle t2) {
        return Double.compare(t1.getShortestSide(t1), t2.getShortestSide(t2));
    }

}
