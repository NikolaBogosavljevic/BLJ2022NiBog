import java.util.Arrays;
import java.util.Random;
import java.util.*;

public class Aquarium {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    int[][] aquarium = new int[15][15];



    public void addFish(String name, int positionX, int positionY) {
       /* int randomNum;
        while (true) {
            randomNum = rand.nextInt(5);
            if (randomNum != 0) {
                break;
            }
        }*/
        Fish fish = new Fish(name, positionX, positionY);
        if (aquarium[positionY - 1][positionX - 1] == 0) {
            aquarium[positionY - 1][positionX - 1] = 1;
        }
        System.out.println("\n\n1: View aquarium   2: Add fish   3: Kill fish   4: Move fish          5: exit");
    }

    public void deleteFish(int deleteX, int deleteY) {
        if (aquarium[deleteY - 1][deleteX - 1] != 0) {
            aquarium[deleteY - 1][deleteX - 1] = 5;
        }
        System.out.println("\n\n1: View aquarium   2: Add fish   3: Kill fish   4: Move fish          5: exit");
    }

    public void moveFish(String direct, int moveChoiceX, int moveChoiceY) {

        if (aquarium[moveChoiceY - 1][moveChoiceX - 1] == 5){
            System.out.println("Sadly this fish cant move since its dead");
            return;
        }else if (aquarium[moveChoiceY - 1][moveChoiceX - 1] == 0){
            System.out.println("No can do boss! It no fish");
            return;
        }
        aquarium[moveChoiceY - 1][moveChoiceX - 1] = 0;

        if (direct.equals("up")) {
            for(int i = 0; i < 15; i++){
                aquarium[0][i] = 3;
            }
            if (aquarium[moveChoiceY - 2][moveChoiceX - 1] == 1) {
                fishFight();
            }else if(aquarium[moveChoiceY - 2][moveChoiceX - 1] == 3){
                NewLife newlife = new NewLife();
                for (int i = 0; i < 50; ++i) System.out.println();
                newlife.Escaped();
            }else {
                aquarium[moveChoiceY - 2][moveChoiceX - 1] = 1;
                printAquarium();
                System.out.println("\n\n1: View aquarium   2: Add fish   3: Kill fish   4: Move fish          5: exit");
            }

        } else if (direct.equals("down")) {
            if (aquarium[moveChoiceY][moveChoiceX - 1] == 1) {
                fishFight();
            }
            aquarium[moveChoiceY][moveChoiceX - 1] = 1;
            printAquarium();
            System.out.println("\n\n1: View aquarium   2: Add fish   3: Kill fish   4: Move fish          5: exit");
        } else if (direct.equals("right")) {
            if (aquarium[moveChoiceY - 1][moveChoiceX] == 1) {
                fishFight();
            }
            aquarium[moveChoiceY - 1][moveChoiceX] = 1;
            printAquarium();
            System.out.println("\n\n1: View aquarium   2: Add fish   3: Kill fish   4: Move fish          5: exit");


        } else if (direct.equals("left")) {
            if (aquarium[moveChoiceY - 1][moveChoiceX - 2] == 1) {
                fishFight();
            }
            aquarium[moveChoiceY - 1][moveChoiceX - 2] = 1;
            printAquarium();
            System.out.println("\n\n1: View aquarium   2: Add fish   3: Kill fish   4: Move fish          5: exit");
        }

    }

    public void fishFight() {
        int choice;
        System.out.println("\n\nOh no! It seems like there is already a fish there. You need to fight for this spot!");
        System.out.println("\n🐒 🐒\n");
        System.out.println("Press 1 to punch   2 to kick   3 to shoot   4 to Water pulse");
        choice = scan.nextInt();
        if (choice ==1) {
            System.out.println("\n🐒🤛🐒                                 Enter to continue\n");
            scan.nextLine();
            scan.nextLine();
            System.out.println("You WON!                               Enter to continue");
            scan.nextLine();
        }else if (choice == 2){
            System.out.println("\n🐒🦵🐒");
            scan.nextLine();
            scan.nextLine();
            System.out.println("You WON!                               Enter to continue");
            scan.nextLine();
        } else if (choice == 3) {
            System.out.println("🐒  💣  🔫🐒");
            scan.nextLine();
            scan.nextLine();
            System.out.println("You WON!                               Enter to continue");
            scan.nextLine();
        } else if (choice == 4) {
            System.out.println("🐒 🌊🌊🌊🐒");
            scan.nextLine();
            scan.nextLine();
            System.out.println("You WON!                               Enter to continue");
            scan.nextLine();
        }
        System.out.println("\n\n1: View aquarium   2: Add fish   3: Kill fish   4: Move fish          5: exit");
    }

    public void printAquarium() {
        for (int i = 0; i < 24; i++) {
            System.out.print("");
        }
        System.out.println("");
        String aquariumAsString = Arrays.deepToString(aquarium);
        aquariumAsString = aquariumAsString.replace("[[", "▓").replace("], [", "▓\n▓").replace(", ", " ").replace("]]",
                "▓").replace("0", "\uD83D\uDFE6").replace("1", "🐒").replace("5", "☠").replace("3", "\uD83D\uDFE6");
        System.out.println(aquariumAsString);

        for (int i = 0; i < 24; i++) {
            System.out.print("▓▓");
        }
        System.out.println("▓▓");
    }
}