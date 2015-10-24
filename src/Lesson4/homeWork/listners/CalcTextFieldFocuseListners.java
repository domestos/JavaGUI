package Lesson4.homeWork.listners;

import Lesson4.homeWork.GUI;
import Lesson4.homeWork.gui.MyJTextField;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Created by varenik on 24.10.15.
 */
public class CalcTextFieldFocuseListners implements FocusListener{
    private MyJTextField field;

    public CalcTextFieldFocuseListners(MyJTextField field){
        this.field = field;
    }
    @Override
    public void focusGained(FocusEvent e) {
       if(field.getText().trim().equals(GUI.INPUT_NUMBER)){
           field.setText("");
           field.setForeground(Color.BLACK);
       }

    }

    @Override
    public void focusLost(FocusEvent e) {
        if(field.getText().trim().equals("")){
            field.setText(GUI.INPUT_NUMBER);
            field.setForeground(Color.GRAY);
        }

    }
}
