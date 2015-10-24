package Lesson3.lesson.layout;

import gui.MyJPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by v.pelenskyi on 20.10.2015.
 */
public class AbsoluteLayoutDemo extends LayoutButton {
    @Override
    public String setName() {
        return "AbsoluteLayoutDemo ";
    }

    @Override
    public void useLayout(JPanel jPanel) {
        jPanel.setLayout(null);

    }


    @Override
    public MyJPanel returnFinishedPanel(String name, int amountButton){
        MyJPanel panel = new MyJPanel(name, 600,500);
        JButton button = new JButton("TEST Button1");
        button.setSize(100,100);
        button.setBounds(new Rectangle(50, 100, 180, 40));

        JButton button2 = new JButton("TEST Button2");
        button2.setBounds(new Rectangle(100,150,130,60));

        panel.add(button);
        panel.add(button2);

        return panel;
    }


}
