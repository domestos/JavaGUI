package Lesson4.lesson.helpPackage;

import javax.swing.*;
import java.awt.*;

/**
 * Created by varenik on 24.10.15.
 */
public class CreatePanel extends JPanel {

    public CreatePanel(String namePanel, int width, int heigth){
        super.setToolTipText(namePanel);
        super.setSize(width, heigth);
    }

    public CreatePanel(String namePanel, int width,int heigth, Component component, int amountComponent){
        this(namePanel , width , heigth);
        for (int i = 0; i<amountComponent; i++){
            this.add(new CreateButton("button"+i));
        }
    }

}
