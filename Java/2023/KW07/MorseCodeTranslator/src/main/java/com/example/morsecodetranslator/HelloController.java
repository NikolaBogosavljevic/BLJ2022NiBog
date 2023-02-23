package com.example.morsecodetranslator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.HashMap;

public class HelloController {
    @FXML
    private TextField userInput;

    @FXML
    private TextField translation;

    @FXML
    private Button translateButton;

    @FXML
    protected void onTranslate() {
        codeTranslator(userInput.getText());
    }

    @FXML
    public void codeTranslator(String userinput) {
            for (int i = 0; i < userinput.length(); i++) {
                HashMap<Character, String> morse = new HashMap<Character, String>();
                morse.put('a', "∙- ");
                morse.put('b', "-∙∙∙ ");
                morse.put('c', "-∙- ");
                morse.put('d', "-∙∙ ");
                morse.put('e', "∙ ");
                morse.put('f', "∙∙-∙ ");
                morse.put('g', "--∙ ");
                morse.put('h', "∙∙∙∙ ");
                morse.put('i', "∙∙ ");
                morse.put('j', "∙--- ");
                morse.put('k', "-∙ ");
                morse.put('l', "∙-∙∙ ");
                morse.put('m', "-- ");
                morse.put('n', "-∙ ");
                morse.put('o', "--- ");
                morse.put('p', "∙--∙ ");
                morse.put('q', "--∙- ");
                morse.put('r', "∙-∙ ");
                morse.put('s', "∙∙∙ ");
                morse.put('t', "- ");
                morse.put('u', "∙∙- ");
                morse.put('v', "∙∙∙- ");
                morse.put('w', "∙-- ");
                morse.put('x', "-∙∙- ");
                morse.put('y', "-∙-- ");
                morse.put('z', "--∙∙ ");
                morse.put(' ', " / ");
                translation.setText(morse.get(userinput.charAt(i)));
            }



    }
}