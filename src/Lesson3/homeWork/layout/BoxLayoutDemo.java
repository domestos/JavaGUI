package Lesson3.homeWork.layout;

import javax.swing.*;

/**
 * Created by v.pelenskyi on 20.10.2015.
 */
public class BoxLayoutDemo extends LayoutButton {


    @Override
    public String setName() {
        return "BoxLayoutDemo";
    }

    @Override
    public void useLayout(JPanel jPanel) {
        BoxLayout boxLayout = new BoxLayout(jPanel, BoxLayout.Y_AXIS);
        jPanel.setLayout(boxLayout);
    }
}
