package Lesson1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by v.pelenskyi on 20.10.2015.
 *  JFrame
 *  JButton
 *  FlowLayout
 */
public class Lesson1 {
    public static void main(String[] args) {

        //Buttons
        JButton buttonOK = new JButton("OK");
        JButton buttonClose = new JButton("Close");

        //FlowLayout
        FlowLayout flowLayout = new FlowLayout();

        //JFrame
        JFrame jFrame = new JFrame("Lesson1"); // created
        jFrame.setSize(500, 700); // set size window
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE); // close all process after closed window
        jFrame.setVisible(true); // show window

        //Add Manager views
        jFrame.setLayout(flowLayout);

        // Add Button
        jFrame.add(buttonOK);
        jFrame.add(buttonClose);



    }



}
