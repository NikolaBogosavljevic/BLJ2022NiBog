import java.util.Scanner;

public class InputHandler {
    static Scanner scanner = new Scanner(System.in);

    public static int intHandler(int min, int max) {
        int x = -1;


        do {
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
            } else {
                System.out.println("Please enter a correct number");
                scanner.nextLine();
                continue;
            }
            if (x < min || x > max) {
                System.out.println("Please enter a correct number");
            }
        } while (x < min || x > max);
        return x;
    }
}
