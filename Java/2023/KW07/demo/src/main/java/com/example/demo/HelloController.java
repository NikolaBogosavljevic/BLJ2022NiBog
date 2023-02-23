package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    PersonManager mgr = new PersonManager();

    @FXML
    private Label showName;

    @FXML
    private Label showFirstName;

    @FXML
    private Label showAge;

    @FXML
    private Label showFavFood;

    @FXML
    private TextField nameField;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField ageField;

    @FXML
    private TextField favFoodField;

    @FXML
    private Button prevButton;

    @FXML
    private Button newButton;

    @FXML
    private Button saveButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button nextButton;


    @FXML
    protected void onSaveButtonClick() {
        mgr.editPerson(firstNameField.getText(), nameField.getText(), ageField.getText(), favFoodField.getText());
    }

    @FXML
    protected void onDeleteButtonClick(){
        mgr.getPeople().remove(mgr.getIndex());
        mgr.setIndex(mgr.getIndex() - 1);
        firstNameField.setText("");
        nameField.setText("");
        ageField.setText("");
        favFoodField.setText("");
    }

    @FXML
    protected void onNewButtonClick() {
        if (mgr.getPeople().size() != 0) {
            mgr.setIndex(mgr.getIndex() + 1);
        }
        mgr.createPerson(firstNameField.getText(), nameField.getText(), ageField.getText(), favFoodField.getText());

    }

    @FXML
    protected void onPrevButtonClick() {
        mgr.setIndex(mgr.getIndex() - 1);
        if (mgr.getIndex() < 0) {
            mgr.setIndex(0);
        }
        showInfo();
    }
    @FXML
    protected void onNextButtonClick() {

        if (mgr.getIndex() != mgr.getPeople().size()-1){
            mgr.setIndex(mgr.getIndex() + 1);
        }
        showInfo();
    }

    protected void showInfo() {
        if (mgr.getPeople().size() > 0) {
            firstNameField.setText(mgr.getPeople().get(mgr.getIndex()).getFirstName());
            nameField.setText(mgr.getPeople().get(mgr.getIndex()).getLastName());
            ageField.setText(mgr.getPeople().get(mgr.getIndex()).getAge());
            favFoodField.setText(mgr.getPeople().get(mgr.getIndex()).getFavFood());
        }
    }
}