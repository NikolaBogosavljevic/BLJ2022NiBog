import java.util.*;

public class Starter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("" +
                "  /$$$$$$                                          /$$                                          /`·.¸                                        \n" +
                " /$$__  $$                                        |__/                                         /¸...¸`:·                                  \n" +
                "| $$  \\ $$  /$$$$$$  /$$   /$$  /$$$$$$   /$$$$$$  /$$ /$$   /$$ /$$$$$$/$$$$             ¸.·´  ¸   `·.¸.·´)                                  \n" +
                "| $$$$$$$$ /$$__  $$| $$  | $$ |____  $$ /$$__  $$| $$| $$  | $$| $$_  $$_  $$           : © ):´;      ¸  {                                  \n" +
                "| $$__  $$| $$  \\ $$| $$  | $$  /$$$$$$$| $$  \\__/| $$| $$  | $$| $$ \\ $$ \\ $$            `·.¸ `·  ¸.·´\\`·¸)                              \n" +
                "| $$  | $$| $$  | $$| $$  | $$ /$$__  $$| $$      | $$| $$  | $$| $$ | $$ | $$                `\\\\´´\\¸.·´                                  \n" +
                "| $$  | $$|  $$$$$$$|  $$$$$$/|  $$$$$$$| $$      | $$|  $$$$$$/| $$ | $$ | $$                                                         \n" +
                "|__/  |__/ \\____  $$ \\______/  \\_______/|__/      |__/ \\______/ |__/ |__/ |__/                                                     \n" +
                "                | $$                                                                                                                   \n" +
                "                | $$                                                                                                                   \n" +
                "                |__/          ");



        Aquarium aquarium = new Aquarium();

        while (true) {
            System.out.println("\n\n1: View aquarium   2: Add fish   3: Kill fish   4: Move fish   5: exit");
            int choice = scan.nextInt();

            if (choice == 1) {
                aquarium.printAquarium();
            } else if (choice == 2) {
                System.out.print("X: ");
                int positionX = scan.nextInt();
                System.out.print("Y: ");
                int positionY = scan.nextInt();
                System.out.print("Name: ");
                String name = scan.nextLine();
                scan.nextLine();
                aquarium.addFish(name, positionX, positionY);

            } else if (choice == 3) {
                System.out.print("X: ");
                int deleteX = scan.nextInt();
                System.out.print("Y: ");
                int deleteY = scan.nextInt();
                aquarium.deleteFish(deleteX, deleteY);
            } else if (choice == 4) {

            } else if (choice == 5) {
                break;
            }
        }
    }


}
