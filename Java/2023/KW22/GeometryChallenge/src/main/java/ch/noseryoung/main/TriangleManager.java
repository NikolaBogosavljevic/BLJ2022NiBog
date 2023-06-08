package ch.noseryoung.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TriangleManager {

    private ShapeSideCreator generator;
    private TriangleValidator triangleValidator;
    private ArrayList<Triangle> triangles;

    public TriangleManager(ShapeSideCreator generator) {
        this.generator = generator;
        triangleValidator = new TriangleValidator();
        triangles = new ArrayList<>();
    }

    /**
     * This method is the entry point for the triangle manager.
     * It creates at least one triangle with the <code>ShapeSideCreator</code> instance
     * and prints the triangle with its information.
     */
    public void run() {

        printWelcomeText();

        Triangle triangle = generateTriangle();
        printTriangleInfo(triangle);

        Triangle triangle1 = generateTriangle();
        printTriangleInfo(triangle1);

        Triangle triangle2 = generateTriangle();
        printTriangleInfo(triangle2);

        Triangle triangle3 = generateTriangle();
        printTriangleInfo(triangle3);

    }

    /**
     * This method calls an implementation from the <code>ShapeSideCreator</code> Interface
     * to get three sides for a new triangle.
     *
     * @return created triangle
     */
    private Triangle generateTriangle() {
        return new Triangle(generator.createSide(), generator.createSide(), generator.createSide());
    }

    /**
     * This Method prints out the Triangle Information with the result form the validation.
     *
     * @param t
     * @param isEquilateral
     * @param isIsoceles
     * @param isScalene
     */
    private void printTriangleInfo(Triangle t) {
        if (triangleValidator.isValidTriangle(t)) {
            triangles.add(t);
            System.out.println("\n\nSIDES\nA:" + t.getA() + "  B:" + t.getB() + "  C:" + t.getC());
            System.out.println("\nTRIANGLE TYPE\nEquilateral: " + triangleValidator.isEquilateral(t) + "\nIsoceles: " + triangleValidator.isIsosceles(t) + "\nScalene: " + triangleValidator.isScalene(t)+"\n");
       }
    }

    /**
     * This method returns out all generated Triangles, which are sorted by side.
     * The Triangles are compared with its shortest side. The longest "shortest Side" is listed first.
     *
     * @return sorted triangle list
     */
    public ArrayList<Triangle> getAllTrianglesSortedByShortestSide() {
        Collections.sort(triangles, new TriangleComparator());
        return triangles;
    }

    /**
     * This method returns out all generated Triangles, which are sorted by side.
     * The Triangles are compared with its longest side. The longest "longest Side" is listed first.
     *
     * @return sorted triangle list
     */
    public ArrayList<Triangle> getAllTrianglesSortedByLongestSide() {
        Collections.sort(triangles);
        return triangles;
    }

    /**
     * This method prints a welcome text for the triangle manager.
     */
    private void printWelcomeText() {
        System.out.println("Hi. Selam. Ni hǎo. Salut. Hola. Anyoung.");
    }
}
