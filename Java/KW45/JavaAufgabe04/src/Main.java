import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double PI = 3.14159265358979;
        double L;
        double D;

        System.out.println("Länge: ");
        L = scan.nextDouble();
        System.out.println("Durchmesser: ");
        D= scan.nextDouble();

        double V = PI / 4 * (D * D) * L / 10000;

        System.out.println(V);
    }
}