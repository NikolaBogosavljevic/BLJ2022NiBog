import java.util.Arrays;
import java.util.Random;

public class Aquarium {
    Random rand = new Random();
    private int[][] aquarium = new int[15][15];
    ;


    public void addFish(String name, int positionX, int positionY) {
        int randomNum;
        while (true) {
            randomNum = rand.nextInt(5);
            if (randomNum != 0) {
                break;
            }
        }
        Fish fish = new Fish(name, positionX, positionY);
        if (aquarium[positionY - 1][positionX - 1] == 0) {
            aquarium[positionY - 1][positionX - 1] = randomNum;
        }

    }

    public void deleteFish(int deleteX, int deleteY) {

    }

    public void printAquarium() {
        for (int i = 0; i < 24; i++) {
            System.out.print("▓▓");
        }
        System.out.println("▓▓");
        String aquariumAsString = Arrays.deepToString(aquarium);
        aquariumAsString = aquariumAsString.replace("[[", "▓").replace("], [", "▓\n▓").replace(", ", " ").replace("]]",
                "▓").replace("0", "\uD83D\uDFE6").replace("1", "🐟").replace("2", "🐡").replace("3", "🐳").replace("4", "🐙");
        System.out.println(aquariumAsString);

        for (int i = 0; i < 24; i++) {
            System.out.print("▓▓");
        }
        System.out.println("▓▓");
    }
}
