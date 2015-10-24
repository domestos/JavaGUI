package Lesson4.homeWork.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by v.pelenskyi on 20.10.2015.
 */
public class MyJFrame extends JFrame {

    public MyJFrame(String title, int width, int height){
        super(title);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }

    public MyJFrame(String title, int width, int height, Component component ){
        this(title, width, height);
        super.getContentPane().add(component);
    }

    public MyJFrame(String title, int width, int height,Component component , LayoutManager lm){
        this(title ,width, height);
        super.getContentPane().add(component);
        super.setLayout(lm);
        super.setVisible(true);
    }


}
