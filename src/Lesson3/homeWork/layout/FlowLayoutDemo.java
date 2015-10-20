package Lesson3.homeWork.layout;

import Lesson1.homeWork.MyJFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by v.pelenskyi on 20.10.2015.
 */
public class FlowLayoutDemo extends LayoutButton{

    @Override
    public String setName() {
        return "FlowLayoutDemo";
    }

    @Override
    public void useLayout(JPanel jPanel) {
        jPanel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        jPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5,5));
    }
}
