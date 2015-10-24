package Lesson2.homeWork;

//import com.jtattoo.plaf.acryl.AcrylLookAndFeel;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;

/**
 * Created by v.pelenskyi on 20.10.2015.
    download new  skin JTattoo-1.6.11.jar
    import this *.jar
    set tis skin JTattoo-1.6.11.jar //->  UIManager.setLookAndFeel(new AcrylLookAndFeel() );
 */
public class MainHomeWork {
    public static void main(String[] args) throws MalformedURLException {
        //Set Skin
//        try {
//            UIManager.setLookAndFeel(new AcrylLookAndFeel() );
//        } catch (UnsupportedLookAndFeelException e) {
//            e.printStackTrace();
//        }
        // Chang views window + Skin
        JFrame.setDefaultLookAndFeelDecorated(true);


        //Buttons
        JButton buttonOK = new JButton("OK");
        JButton buttonClose = new JButton("Close");


        //JFrame
        JFrame jFrame = new JFrame("Lesson1"); // created
        jFrame.setIconImage(new ImageIcon("c:\\icon.png").getImage()); //set ImageIcon
        jFrame.setSize(500, 700); // set size window
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE); // close all process after closed window
        jFrame.setVisible(true); // show window
        jFrame.setLocationRelativeTo(null); // open window in the center monitor


        //JPanels
        JPanel panel = new JPanel(); // create panel and set method view(FlowLayout) components in this panel
        panel.setBorder(BorderFactory.createEtchedBorder());
        jFrame.setContentPane(panel); // add Penal


        //Add Button
        jFrame.getContentPane().add(buttonOK);
        jFrame.getContentPane().add(buttonClose);



    }



}
