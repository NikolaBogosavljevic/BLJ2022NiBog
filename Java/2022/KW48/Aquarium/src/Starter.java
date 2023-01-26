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
        System.out.println("\n\n1: View aquarium   2: Add fish   3: Kill fish   4: Move fish          5: exit");
        while (true) {


            int choice = scan.nextInt();


            if (choice == 1) {
                aquarium.printAquarium();
                System.out.println("\n\n1: View aquarium   2: Add fish   3: Kill fish   4: Move fish          5: exit");
            } else if (choice == 2) {
                System.out.print("X: ");
                int positionX = scan.nextInt();
                System.out.print("Y: ");
                int positionY = scan.nextInt();
                System.out.print("Name: ");
                scan.nextLine();
                String name = scan.nextLine();
                aquarium.addFish(name, positionX, positionY);
                aquarium.printAquarium();
            } else if (choice == 3) {
                System.out.print("X: ");
                int deleteX = scan.nextInt();
                System.out.print("Y: ");
                int deleteY = scan.nextInt();
                aquarium.deleteFish(deleteX, deleteY);
                aquarium.printAquarium();
            } else if (choice == 4) {
                System.out.println("Which fish?");
                System.out.print("X: ");
                int moveChoiceX = scan.nextInt();
                System.out.print("Y: ");
                int moveChoiceY = scan.nextInt();
                System.out.println("In what Direction do you want to move it?   (up, down, left, right)");
                scan.nextLine();
                String direct = scan.nextLine();
                aquarium.moveFish(direct, moveChoiceX, moveChoiceY);
            } else if (choice == 5) {
                break;
            }
        }
    }


}
