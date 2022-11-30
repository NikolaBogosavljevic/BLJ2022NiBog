package ch.noseryoung.blj;
import java.util.*;

public class Translator {
    public Translator(HashMap<String, String> morseCode) {
    Scanner scan = new Scanner(System.in);

        while (true) {
            String input = scan.nextLine();
            System.out.println(morseCode.get(input.toUpperCase()));
        }
    }

}

