import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    Scanner scan = new Scanner(System.in);
    static String[][] board = new String[4][4];
    static String[][] cards = {
            {"A", "D", "H", "C"},
            {"F", "G", "G", "B"},
            {"E", "A", "E", "D"},
            {"H", "B", "F", "C"},
    };

    public static void main(String[] args) {
        for (String[] d: board){
            Arrays.fill(d, "-");
        }

        printBoard(board);

    }

    public static void printBoard(String[][] board){
        System.out.println("   0 | 1 | 2 | 3 ");
        for (int i = 0; i < 4; i++){
            System.out.print(i+"| ");
            for (int j = 0; j < 4; j++){
                System.out.print(board[i][j]+" | ");

            }
            System.out.println();
        }
    }

    public static void memGuess(){
        while(true) {
            printBoard(board);
            System.out.println("Row: ");
        }
    }
}