import java.util.*;

public class InputHandler {
    public String inputHandler(){
        String guess;
        Scanner scan = new Scanner(System.in);
        while (true) {
            guess = scan.nextLine();
            if (guess.length() == 5){
                break;
            }else {
                System.out.println("Enter a 5 letter word.");
            }
        }

        return guess;
    }
}
