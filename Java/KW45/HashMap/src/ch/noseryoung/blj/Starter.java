package ch.noseryoung.blj;
import java.util.HashMap;

public class Starter {
    public static void main(String[] args) {
        HashMap <String, String> morseCode = new HashMap<String,String>();

        morseCode.put("A", ".-");
        morseCode.put("B", "-...");
        morseCode.put("C", "-.-.");
        morseCode.put("D", "-..");
        morseCode.put("E", ".");
        morseCode.put("F", "..-.");
        morseCode.put("G", "--.");
        morseCode.put("H", "....");
        morseCode.put("I", "..");
        morseCode.put("J", ".---");
        morseCode.put("K", "-.-");
        morseCode.put("L", ".-..");
        morseCode.put("M", "--");
        morseCode.put("N", "-.");
        morseCode.put("O", "---");
        morseCode.put("P", ".--.");
        morseCode.put("Q", "--.-");
        morseCode.put("R", ".-.");
        morseCode.put("S", "...");
        morseCode.put("T", "-");
        morseCode.put("U", "..-");
        morseCode.put("V", "...-");
        morseCode.put("W", ".--");
        morseCode.put("X", "-..-");
        morseCode.put("Y", "-.--");
        morseCode.put("Z", "--..");

        Translator translator = new Translator(morseCode);

    }
}
