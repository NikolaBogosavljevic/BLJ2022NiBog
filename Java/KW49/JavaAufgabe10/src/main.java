import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Stunden: ");
            int hour = scan.nextInt();
            System.out.print("Minuten: ");
            int min = scan.nextInt();

            System.out.println("Stundenzeiger: " + computeHourHandAngle(hour, min));
            System.out.println("Minutenzeiger: " + computeMinuteHandAngle(min));
        }
    }

    public static int computeHourHandAngle(int hour, int min) {
        int temp = 60 * hour + min;
        int hourAngle = temp / 2;

        return hourAngle;
    }

    public static int computeMinuteHandAngle(int min) {
        int minAngle = min * 6;
        return minAngle;
    }
}
