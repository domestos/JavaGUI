package Lesson3.homeWork.components;

import javax.swing.*;
import java.awt.*;

/**
 * Created by v.pelenskyi on 20.10.2015.
 */
public class MyJPanel extends JPanel {

    public MyJPanel(String name, int width, int height){
        super.setSize(width,height);
        super.setName(name);
        super.setBorder(BorderFactory.createEtchedBorder());
    }

    public MyJPanel(String name, int width, int height, Component component){
        this(name, width, height);
        super.add(component);
    }


    public MyJPanel(String name, int width, int height, LayoutManager layoutManager){
        this(name, width, height);
        super.setLayout(layoutManager);
    }

    public MyJPanel(String name, int width, int height, LayoutManager layoutManager, Component component){
        this(name, width, height);
        super.setLayout(layoutManager);
        super.add(component);
    }


    public MyJPanel(String name, int width, int height, LayoutManager layoutManager, Component component, int amount){
        this(name, width, height);
        super.setLayout(layoutManager);
        for(int i = 0; i<amount; i++){
            super.add(component);
        }


    }
}
