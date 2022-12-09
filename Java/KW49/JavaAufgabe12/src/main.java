import java.util.*;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        while(true) {
            System.out.println("How many rows?");
            int rows = scan.nextInt();

            createArena(rows);
        }
    }
    public static char[][] createArena(int rows){
        Random rand = new Random();
        char[][] arena = new char[rows][20];
        for (int i = 0; i < rows; i++ ){
            for (int j = 0; j < 2 + rows - i; j++){
                int randNum = rand.nextInt(10);
                if (randNum <= 5) {
                    arena[i][j] = '-';
                } else if (randNum >= 6) {
                    arena[i][j] = '#';
                }
                System.out.print(arena[i][j]);
            }
            System.out.println("");
        }
        return arena;
    }
}
