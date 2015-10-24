package Lesson4.lesson.helpPackage;

import javax.swing.*;

/**
 * Created by varenik on 24.10.15.
 */
public class CreateButton extends JButton {

    public  CreateButton (String nameButton){
        super.setText(nameButton);
    }

    public  CreateButton(JPanel panel, String nameButton, int amountButton){
        this(nameButton);
        for (int i = 0; i<amountButton; i++){
            panel.add(new JButton(nameButton+i));
        }
    }

}
