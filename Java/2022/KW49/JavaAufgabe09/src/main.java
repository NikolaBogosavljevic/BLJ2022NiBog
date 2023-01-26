import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Year: ");
            int year = scan.nextInt();

            if (year % 400 == 0) {
                System.out.println("true");
            } else if (year % 100 == 0) {
                System.out.println("false");
            } else if (year % 4 == 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

    }
}
