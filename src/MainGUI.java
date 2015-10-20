import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by v.pelenskyi on 20.10.2015.
 */
public class MainGUI {
    public static void main(String[] args) {





        //JPanels
        final JPanel panel = new JPanel();

        //JButtons
        JButton buttonOk = new JButton("Ok");
        JButton buttonClose = new JButton("Close");
        buttonClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // JOptionPane.showConfirmDialog(panel,"Are You want close this window ");
                 JOptionPane.showMessageDialog(panel,"this is my massage!");
            }
        });

        //FlowLayout
        FlowLayout flowLayout = new FlowLayout();

        //JFrame
        JFrame jFrame = new JFrame("my GUI soft");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setSize(500, 700);
        jFrame.setContentPane(panel);
        jFrame.setLayout(flowLayout);

        jFrame.getContentPane().add(buttonOk);
        jFrame.getContentPane().add(buttonClose);





    }
}
