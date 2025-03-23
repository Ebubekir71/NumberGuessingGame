package com.example.numberguessinggame;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import java.util.ArrayList;

public class GuessController {
    @FXML
    private TextField textField;
    @FXML
    private Label guessShow;
    @FXML
    private TextArea guesses;

    private int ourNumber = 20;

    private ArrayList<Integer> guessesInt = new ArrayList<>();


    public void buttonOnAction(javafx.event.ActionEvent actionEvent) {
        String guess = textField.getText();
        int guessInt = Integer.parseInt(guess);

        guessesInt.add(guessInt);

        String allGuesses = "";
        for (Integer i : guessesInt) {
            allGuesses += i + "\n";
        }
        guesses.setText("Guesses: \n" + allGuesses + "\n");


        if(guessInt > ourNumber){
            guessShow.setText("Your number is greater than our number" );
            } else if (guessInt < ourNumber) {
            guessShow.setText("Your number is less than our number" );
        } else {
            guessShow.setText("Your guess is true" );
        }




    }
}