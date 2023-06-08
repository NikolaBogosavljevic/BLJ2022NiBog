import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final String re = "\033[0m";
    public static final String pu = "\033[1;35m";
    public static final String bl = "\033[1;34m";

    static Scanner scan = new Scanner(System.in);
    static String[][] board = new String[4][4];
    static String[][] cards = {
            {"🍕", "😛", "🍜", "🦵"},
            {"🎀", "🤙", "🤙", "☠"},
            {"🤞", "🍕", "🤞", "😛"},
            {"🍜", "☠", "🎀", "🦵"},
    };
    static boolean isRunning = true;
    static Properties language = new Properties();

    public static void main(String[] args) throws IOException {
        language.load(new FileInputStream("config/english.properties"));
        for (String[] d: board){
            Arrays.fill(d, "⬜");
        }
        System.out.println( language.get("welcome") +" "+ language.get("play") + " or " + language.get("quit"));
        String start = scan.nextLine();
        if (start.equals("p")){
            printBoard(board);
            memGuess();
        } else if (start.equals("q")) {
            System.out.println(language.get("goodbye"));
        }else {
            System.out.println(language.get("incorrectInput"));
            printBoard(board);
            memGuess();
        }
    }

    public static void printBoard(String[][] board){
        System.out.println(bl+"    1    2    3    4 "+re);
        for (int i = 0; i < 4; i++){
            System.out.print(pu+(i+1)+re+"| ");
            for (int j = 0; j < 4; j++){
                System.out.print(board[i][j]+" | ");

            }
            System.out.println();
        }
    }

    public static void memGuess() throws IOException {
        language.load(new FileInputStream("config/english.properties"));
        while(isRunning) {
            System.out.print(pu+language.get("row")+": "+re);
            int row1 = scan.nextInt();
            System.out.print(bl+language.get("column")+": "+re);
            int col1 = scan.nextInt();
            if (!board[row1-1][col1-1].equals("⬜")){
                System.out.println(language.get("notpossible"));
                printBoard(board);
                continue;
            }else {
                board[row1-1][col1-1] = cards[row1-1][col1-1];
                printBoard(board);
            }

            System.out.print(pu+language.get("row")+": "+re);
            int row2 = scan.nextInt();
            System.out.print(bl+language.get("column")+": "+re);
            int col2 = scan.nextInt();
            if (!board[row2-1][col2-1].equals("⬜")){
                System.out.println(language.get("notpossible"));
                printBoard(board);
                continue;
            }else {
                board[row2-1][col2-1] = cards[row2-1][col2-1];
                printBoard(board);
            }

            if (board[row1-1][col1-1] != board[row2-1][col2-1]){
                System.out.println(language.get("wrong"));
                board[row1-1][col1-1] = "⬜";
                board[row2-1][col2-1] = "⬜";
                printBoard(board);
            }else{
                System.out.println(language.get("correct"));
            }
        }
    }
}