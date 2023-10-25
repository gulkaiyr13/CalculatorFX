package com.example.calculatorfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
    Float data = 0f;
    int operation = -1;

    @FXML
    private Button Clear;

    @FXML
    private TextField Display;

    @FXML
    private Button Div;

    @FXML
    private Button Eight;

    @FXML
    private Button Equals;

    @FXML
    private Button Five;

    @FXML
    private Button Four;

    @FXML
    private Button Minus;

    @FXML
    private Button Mul;

    @FXML
    private Button Nine;

    @FXML
    private Button One;

    @FXML
    private Button Plus;

    @FXML
    private Button Seven;

    @FXML
    private Button Six;

    @FXML
    private Button Three;

    @FXML
    private Button Two;

    @FXML
    private Button Zero;

    @FXML
    void onButtonClick(ActionEvent event) {
        if (event.getSource() == One){
            Display.setText(Display.getText() + "1");
        }else if (event.getSource() == Two){
            Display.setText(Display.getText() + "2");
        }else if (event.getSource() == Three){
            Display.setText(Display.getText() + "3");
        }else if (event.getSource() == Four){
            Display.setText(Display.getText() + "4");
        }else if (event.getSource() == Five){
            Display.setText(Display.getText() + "5");
        }else if (event.getSource() == Six){
            Display.setText(Display.getText() + "6");
        }else if (event.getSource() == Seven){
            Display.setText(Display.getText() + "7");
        }else if (event.getSource() == Eight){
            Display.setText(Display.getText() + "8");
        }else if (event.getSource() == Nine){
            Display.setText(Display.getText() + "9");
        }else if (event.getSource() == Zero){
            Display.setText(Display.getText() + "0");
        }else if (event.getSource() == Clear){
            Display.setText(" ");
        }else if (event.getSource() == Plus){
            data = Float.parseFloat(Display.getText());
            operation = 1;
            Display.setText("");
        }else if (event.getSource() == Minus){
            data = Float.parseFloat(Display.getText());
            operation = 2;
            Display.setText("");
        }else if (event.getSource() == Mul){
            data = Float.parseFloat(Display.getText());
            operation = 3;
            Display.setText("");
        }else if (event.getSource() == Div){
            data = Float.parseFloat(Display.getText());
            operation = 4;
            Display.setText("");
        }else if (event.getSource() == Equals){
            Float secondOperand = Float.parseFloat(Display.getText());
            switch (operation){
                case 1:
                    Float ans = data + secondOperand;
                    Display.setText(String.valueOf(ans));break;
                case 2:
                    ans = data - secondOperand;
                    Display.setText(String.valueOf(ans));break;
                case 3:
                    ans = data * secondOperand;
                    Display.setText(String.valueOf(ans));break;
                case 4:
                    ans = 0f;
                    try {
                        ans = data / secondOperand;
                    }catch (Exception e){Display.setText("Error");}
                    Display.setText(String.valueOf(ans));break;
            }
        }

    }

}
