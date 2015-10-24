package Lesson4.lesson.helpPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by varenik on 24.10.15.
 */
public class ButtenListner implements ActionListener {
    public ButtenListner(JPanel panel, String s){
        this.panel = panel;
        this.s =s;
    };

    private JPanel panel;
    private String s;


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton){
            JButton tempButton = (JButton) e.getSource();

            JOptionPane.showMessageDialog(panel, s+tempButton.getText() );
        }
    }
}
