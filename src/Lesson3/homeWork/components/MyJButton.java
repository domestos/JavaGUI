package Lesson3.homeWork.components;

import javax.swing.*;

/**
 * Created by v.pelenskyi on 20.10.2015.
 */
public class MyJButton extends JButton {
    public MyJButton (String title ){
        super.setText(title);
    }

    public MyJButton(String title,  int width, int height){
        this(title);
        super.setSize(width,height);
    }
}
