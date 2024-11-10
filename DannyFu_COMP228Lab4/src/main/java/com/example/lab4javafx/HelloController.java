package com.example.lab4javafx;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.*;

import javax.swing.*;

public class HelloController {
    //Radio buttons
    @FXML
    public RadioButton compSciButton;
    public RadioButton businessButton;

    // Checkboxes
    public CheckBox studentCouncil;
    public CheckBox volunteerWork;

    //public ChoiceBox<String> courses;
    public ComboBox<String> courses;
    public TextArea courseBox;

    // Text fields from user input
    public TextField myName;
    public TextField address;
    public TextField province;
    public TextField city;
    public TextField postalCode;
    public TextField phoneNumber;
    public TextField email;

    //display (submit) button and the text to be displayed
    public Button displayButton;
    public TextArea displayArea;

    public void initialize() {
        compSciButton.setOnAction(event -> {
            System.out.println("Computer Science button clicked!");
            //Reset the text for both courseBox and drop down menu in case the radio button changed.
            courses.setValue(" ");
            courseBox.clear();
            courses.getItems().setAll("Java", "C#", "C++", "Python");
        });

        businessButton.setOnAction(event -> {
            System.out.println("Business button clicked!");
            //Reset the text for both courseBox and drop down menu in case the radio button changed.
            courses.setValue(" ");
            courseBox.clear();
            courses.getItems().setAll("Accounting", "Management", "Marketing");
        });

        courses.setOnAction(event -> {
            String selectedCourse = courses.getValue();
                if (!courseBox.getText().contains(selectedCourse + "\n")) {
                    courseBox.appendText(selectedCourse + "\n");
                } else {
                    System.out.println("Course already added: " + selectedCourse);
                }
        });

        displayButton.setOnAction(event -> {
            //System.out.println(myName.getText());
            //Clears it out before re-displaying
            displayArea.clear();
            String displayText = myName.getText() + ", " + address.getText()  + ", " + province.getText()
                    + ", " + city.getText()  + ", " + postalCode.getText()  + ", " + phoneNumber.getText()
                    + ", " + email.getText()
                    + "\nCourses: "
                    + "\n" + courseBox.getText();

            // Check if checkboxes are selected
            if (studentCouncil.isSelected()) {
                displayText += "\nStudent Council: Yes";
            } else {
                displayText += "\nStudent Council: No";
            }

            if (volunteerWork.isSelected()) {
                displayText += "\nVolunteer Work: Yes";
            } else {
                displayText += "\nVolunteer Work: No";
            }

            displayArea.setText(displayText);


        });



    }
}