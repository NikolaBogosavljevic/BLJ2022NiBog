

public class ColorGuess {
    public static final String RESET = "\033[0m";
    public static final String GREEN = "\033[1;32m";
    public static final String YELLOW = "\033[1;33m";

    public void correctGuess(String guess) {

        System.out.println(GREEN + guess + RESET);
        System.out.println("EPIC!");

    }

    public void checkChar(String word, String guess) {
        for (int i = 0; i < word.length(); i++) {
            char ch = guess.charAt(i);
            
            if (ch == word.charAt(i)) {
                System.out.print(GREEN + ch + RESET);
            } else if (yellowChar(ch, word)) {
                System.out.print(YELLOW + ch + RESET);
            } else {
                System.out.print(ch);
            }


        }
        System.out.println(" ");
    }

    public boolean yellowChar(char ch, String word) {
        for (int j = 0; j < word.length(); j++) {
            if (ch == word.charAt(j)) {
                return true;
            }
        }
        return false;
    }
}
