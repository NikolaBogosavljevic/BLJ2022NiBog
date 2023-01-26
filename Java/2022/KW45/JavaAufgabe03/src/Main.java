import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double m;
        double l;
        double t;

        System.out.println("Enter your Weight in kg: ");
        m = scan.nextDouble();
        System.out.println("Enter your Height in cm: ");
        l = scan.nextDouble();
        System.out.println("Enter your age: ");
        t = scan.nextDouble();

        double GM = 66.47 + 13.7 * m + 5 * l - 6.8 * t;
        double GF = 655.1 + 9.6 * m + 1.8 * l - 4.7 * t;
        System.out.println("Mann: " + GM + " Kalorien pro Tag");
        System.out.println("Mann: " + GF + " Kalorien pro Tag");
    }
}