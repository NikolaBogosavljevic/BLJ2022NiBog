import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static final String CYAN = "\033[0;36m";
    public static final String RESET = "\033[0m";

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println(CYAN+"██╗    ██╗ ██████╗ ██████╗ ██████╗ ██╗     ███████╗\n" +
                                "██║    ██║██╔═══██╗██╔══██╗██╔══██╗██║     ██╔════╝\n" +
                                "██║ █╗ ██║██║   ██║██████╔╝██║  ██║██║     █████╗  \n" +
                                "██║███╗██║██║   ██║██╔══██╗██║  ██║██║     ██╔══╝  \n" +
                                "╚███╔███╔╝╚██████╔╝██║  ██║██████╔╝███████╗███████╗\n" +
                                " ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═╝╚═════╝ ╚══════╝╚══════╝"+RESET);
        while (true) {
            Wordle wordle = new Wordle();
            wordle.guessWord();
            System.out.println("\nDo you want to go again?");
            String again = scan.nextLine();
            if (again.contains("n")){
                break;
            }
        }
    }
}
