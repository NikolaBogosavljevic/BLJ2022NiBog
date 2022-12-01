import java.util.Arrays;
import java.util.Random;
import java.util.*;

public class Aquarium {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    private int[][] aquarium = new int[15][15];
    ;


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

    }

    public void deleteFish(int deleteX, int deleteY) {
        if (aquarium[deleteY - 1][deleteX - 1] != 0) {
            aquarium[deleteY - 1][deleteX - 1] = 5;
        }
    }

    public void moveFish(String direct, int moveChoiceX, int moveChoiceY) {
        if (aquarium[moveChoiceY - 1][moveChoiceX - 1] == 5){
            System.out.println("Sadly this fish cant move since its dead");
            return;
        }
        aquarium[moveChoiceY - 1][moveChoiceX - 1] = 0;
        if (direct.equals("up")) {
            if (aquarium[moveChoiceY - 2][moveChoiceX - 1] == 1) {
                fishFight();
            }
            aquarium[moveChoiceY - 2][moveChoiceX - 1] = 1;
        } else if (direct.equals("down")) {
            if (aquarium[moveChoiceY][moveChoiceX - 1] == 1) {
                fishFight();
            }
            aquarium[moveChoiceY][moveChoiceX - 1] = 1;
        } else if (direct.equals("right")) {
            if (aquarium[moveChoiceY - 1][moveChoiceX] == 1) {
                fishFight();
            }
            aquarium[moveChoiceY - 1][moveChoiceX] = 1;
        } else if (direct.equals("left")) {
            if (aquarium[moveChoiceY - 1][moveChoiceX - 2] == 1) {
                fishFight();
            }
            aquarium[moveChoiceY - 1][moveChoiceX - 2] = 1;
        }
    }

    public void fishFight() {
        System.out.println("\n\nOh no! It seems like there is already a fish there. You need to fight for this spot!");
        System.out.println("\n🐒 🐒\n");
        System.out.println("Press 1 to punch");
        scan.nextInt();
        System.out.println("\n🐒🤛🐒                                 Enter to continue\n");
        scan.nextLine(); scan.nextLine();
        System.out.println("You WON!                               Enter to continue");
        scan.nextLine();
    }

    public void printAquarium() {
        for (int i = 0; i < 24; i++) {
            System.out.print("▓▓");
        }
        System.out.println("▓▓");
        String aquariumAsString = Arrays.deepToString(aquarium);
        aquariumAsString = aquariumAsString.replace("[[", "▓").replace("], [", "▓\n▓").replace(", ", " ").replace("]]",
                "▓").replace("0", "\uD83D\uDFE6").replace("1", "🐒").replace("5", "☠");
        System.out.println(aquariumAsString);

        for (int i = 0; i < 24; i++) {
            System.out.print("▓▓");
        }
        System.out.println("▓▓");
    }
}
