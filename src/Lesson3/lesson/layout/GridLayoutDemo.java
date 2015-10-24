package Lesson3.lesson.layout;

import javax.swing.*;
import java.awt.*;

/**
 * Created by v.pelenskyi on 20.10.2015.
 */
public class GridLayoutDemo extends LayoutButton {
    @Override
    public String setName() {
        return "GridLayoutDemo";
    }

    @Override
    public void useLayout(JPanel jPanel) {
        jPanel.setLayout(new GridLayout(2,5,10,10));
    }


}
