package Lesson3.homeWork;


import Lesson3.homeWork.helpPackeg.MyJButton;
import Lesson3.homeWork.helpPackeg.MyJTextField;
import Lesson3.lesson.components.MyJFrame;
import Lesson3.lesson.components.MyJPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by varenik on 24.10.15.
 */
public class GUI {

    private MyJButton btnAdd;
    private MyJButton btnSubtract;
    private MyJButton btnDivide;
    private MyJButton btnMultiply;

    private JLabel labelNumber1;
    private JLabel labelNumber2;
    private JLabel labelResult;

    private MyJTextField jTextNumber1;
    private MyJTextField jTextNumber2;
    private MyJTextField jTextResult;

    private MyJPanel panel1;
    private MyJPanel panel2;
    private MyJPanel panel3;

    private MyJFrame frame;


    public static void main(String[] args) {
        GUI gui = new GUI();

        gui.createLables();
        gui.createTextFields();
        gui.createButtons();
        gui.createPanels();
        gui.createFrame();
    }

    private void createLables() {
        labelNumber1 = new JLabel("number 1 ");
        labelNumber2 = new JLabel("number 2 ");
        labelResult = new JLabel("Result: ");

    }

    private void createFrame() {
        frame = new MyJFrame("Calculation", 430, 200 , new BorderLayout(2,2));
        frame.setMinimumSize(new Dimension(430, 200));
        frame.setResizable(false);

        frame.getContentPane().add(panel1, BorderLayout.NORTH);
        frame.getContentPane().add(panel2, BorderLayout.CENTER);
        frame.getContentPane().add(panel3, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    private void createPanels() {
        panel1 = new MyJPanel("panel1", 100, 100);
        panel1.setPreferredSize(new Dimension(200, 50));  // minimal static size
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel2 = new MyJPanel("panel1", 100, 100);
        panel2.setPreferredSize(new Dimension(200, 50));
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel3 = new MyJPanel("panel1", 100, 100);
        panel3.setPreferredSize(new Dimension(200, 50));
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel1.add(labelNumber1);
        panel1.add(jTextNumber1);
        panel1.add(labelNumber2);
        panel1.add(jTextNumber2);


        panel2.add(btnAdd);
        panel2.add(btnDivide);
        panel2.add(btnMultiply);
        panel2.add(btnSubtract);

        panel3.add(labelResult);
        panel3.add(jTextResult);

    }

    private void createButtons() {
        btnAdd = new MyJButton(" + ");
        btnDivide = new MyJButton(" / ");
        btnMultiply = new MyJButton(" * ");
        btnSubtract = new MyJButton(" = ");

    }

    private void createTextFields() {
        jTextNumber1 = new MyJTextField(10);
        jTextNumber2 = new MyJTextField(10);

        jTextResult = new MyJTextField(40, Color.red);
        jTextResult.setEditable(false);   //
        jTextResult.setFocusable(false);
    }
}
