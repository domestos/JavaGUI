package Lesson2;

import sun.swing.ImageIconUIResource;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by v.pelenskyi on 20.10.2015.
 *  JFrame
 *  JPanel
 *  JButton
 *  FlowLayout
 *  UIManager
 *
 */
public class Lesson2 {
    public static void main(String[] args) throws MalformedURLException {
        //Set Skin

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }


        //Buttons
        JButton buttonOK = new JButton("OK");
        JButton buttonClose = new JButton("Close");

        //FlowLayout
        FlowLayout flowLayout = new FlowLayout();

        //JPanels
        JPanel panel = new JPanel(flowLayout); // create panel and set method view(FlowLayout) components in this panel
        panel.setSize(250,250);
        panel.setBorder(BorderFactory.createLineBorder(Color.blue, 2));

        // Chang views window
        JFrame.setDefaultLookAndFeelDecorated(true);

        //JFrame
        JFrame jFrame = new JFrame("Lesson1"); // created
        jFrame.setIconImage(new ImageIcon("c:\\icon.png").getImage()); //set ImageIcon
        jFrame.setSize(500, 700); // set size window
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE); // close all process after closed window
        jFrame.setVisible(true); // show window
        jFrame.setLocationRelativeTo(null); // open window in the center monitor
        jFrame.setContentPane(panel); // add Penal

        //Add Button
        jFrame.getContentPane().add(buttonOK);
        jFrame.getContentPane().add(buttonClose);



    }



}
