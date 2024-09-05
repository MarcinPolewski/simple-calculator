package com.example.simplecalulatorproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainSceneController {
    @FXML
    Label mainScreenLabel;

    @FXML
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonPlus, buttonMinus, buttonDivision, buttonMultiplication, buttonDot, buttonEquals;

    MathEngine mathEngine = new MathEngine();

    private void updateScreen()
    {
        mainScreenLabel.setText(mathEngine.getScreenValue());
    }

    public void numberButtonPressed(ActionEvent event)
    {
        if(event.getSource() == button0)
        {
            mathEngine.numberPressed(0);
        }
        else if(event.getSource() == button1)
        {
            mathEngine.numberPressed(1);
        }
        else if(event.getSource() == button2)
        {
            mathEngine.numberPressed(2);
        }
        else if(event.getSource() == button3)
        {
            mathEngine.numberPressed(3);
        }
        else if(event.getSource() == button4)
        {
            mathEngine.numberPressed(4);
        }
        else if(event.getSource() == button5)
        {
            mathEngine.numberPressed(5);
        }
        else if(event.getSource() == button6)
        {
            mathEngine.numberPressed(6);
        }
        else if(event.getSource() == button7)
        {
            mathEngine.numberPressed(7);
        }
        else if(event.getSource() == button8)
        {
            mathEngine.numberPressed(8);
        }
        else if(event.getSource() == button9)
        {
            mathEngine.numberPressed(9);
        }
        updateScreen();
    }
    public void plusButtonPressed(ActionEvent event)
    {
        mathEngine.plusPressed();
        updateScreen();
    }
    public void minusButtonPressed(ActionEvent event)
    {
        mathEngine.minusPressed();
        updateScreen();

    }
    public void multiplyButtonPressed(ActionEvent event)
    {
        mathEngine.muliplyPressed();
        updateScreen();

    }
    public void divideButtonPressed(ActionEvent event)
    {
        mathEngine.dividePressed();
        updateScreen();
    }
    public void equalsButtonPressed(ActionEvent event)
    {
        mathEngine.equalsPressed();
        updateScreen();
    }
    public void dotButtonPressed(ActionEvent event)
    {
        mathEngine.dotPressed();
        updateScreen();
    }


}