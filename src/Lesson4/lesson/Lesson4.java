package Lesson4.lesson;

import Lesson4.lesson.helpPackage.ButtenListner;
import Lesson4.lesson.helpPackage.CreateButton;
import Lesson4.lesson.helpPackage.CreateFrame;
import Lesson4.lesson.helpPackage.CreatePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by varenik on 24.10.15.
 */
public class Lesson4 {
    public static void main(String[] args) {

        JFrame frame = new CreateFrame("Lesson4", 600, 400, new FlowLayout());
        JButton button1 = new CreateButton("Show text");
        JButton button2 = new CreateButton("Show text from Class Listner");
        JButton button3 = new CreateButton("Show text from in Class Listner");

        final JPanel panel = new CreatePanel("root Panel", 600, 200);
        // realization through an anonymous class
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showConfirmDialog(panel, "My Text ");
                JOptionPane.showMessageDialog(panel, "My text");
            }
        });   // ActionListener it is interface and we must implenemts this class

        // realization through an another class
        button2.addActionListener(new ButtenListner(panel, "YOU click in this button: "));

        // realization through in class
        button3.addActionListener(new  InClassButtonListner());

        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);
        frame.getContentPane().add(button3);



    }


      static class InClassButtonListner implements ActionListener{
          static JPanel panel;
         @Override
         public void actionPerformed(ActionEvent e) {


             JOptionPane.showMessageDialog(panel, "Show message text from IN class ");
         }
     }


  }
