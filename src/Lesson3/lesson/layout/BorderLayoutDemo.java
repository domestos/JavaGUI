package Lesson3.lesson.layout;

import gui.MyJPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by v.pelenskyi on 20.10.2015.
 */
public class BorderLayoutDemo extends LayoutButton {
    @Override
    public String setName() {
        return "BorderLayoutDemo -i don't know why he doesn't work";
    }

    @Override
    public void useLayout(JPanel jPanel) {
        jPanel.setLayout(new BorderLayout());

    }

    @Override
    public MyJPanel returnFinishedPanel(String name, int amountButton){
        MyJPanel panel = new MyJPanel(name, 600,500);

        JButton button =new JButton("NORTH");
        panel.add(button, BorderLayout.NORTH);

        button = new JButton("CENTER");
        panel.add(button, BorderLayout.CENTER);

        button = new JButton("SOUTH");
        button.setPreferredSize(new Dimension(600, 200));
        panel.add(button, BorderLayout.SOUTH);

        button = new JButton("WEST");
        panel.add(button, BorderLayout.WEST);

        button  = new JButton("EAST");
        panel.add(button, BorderLayout.EAST);

        return panel;
    }
}
