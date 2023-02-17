import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class Wordle {
    BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Nikola/Downloads/wordList.txt"));
    ArrayList<String> words = new ArrayList<String>();
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    ColorGuess color = new ColorGuess();
    InputHandler input = new InputHandler();

    public Wordle() throws FileNotFoundException {
    }

    public void createWordList() throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            words.add(line.toLowerCase());
        }
        reader.close();
    }

    public void guessWord() throws IOException {
        createWordList();
        String word = words.get(rand.nextInt(words.size()));
        for (int i = 0; i < 6; i++) {
            String guess = input.inputHandler();;

            if (guess.equals(word)) {
                color.correctGuess(guess);
                return;
            } else {
                color.checkChar(word, guess);
            }
        }
        System.out.println("L. Word was " + word);
    }
}
