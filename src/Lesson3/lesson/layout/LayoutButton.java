package Lesson3.lesson.layout;
import Lesson1.homeWork.MyJFrame;
import gui.MyJButton;
import gui.MyJPanel;
import javax.swing.*;


/**
 * Created by v.pelenskyi on 20.10.2015.
 */
public abstract class LayoutButton {

    public  LayoutButton(){
        this.name =setName();
        returnJFame();
    }
    private String name;

    abstract  public  String setName();

    abstract public void useLayout(JPanel jPanel);

    public JFrame returnJFame(){
        MyJFrame frame = new MyJFrame(name, 600, 800); // created JFrame
        JPanel panel =returnFinishedPanel(name, 10);  // created JPanel
        useLayout(panel);  // Set LayoutManager
        frame.setContentPane(panel);
        return frame;
    }

    public MyJPanel returnFinishedPanel(String name, int amountButton){
        MyJPanel panel = new MyJPanel(name, 600,500);
        for (int i = 0; i <amountButton ; i++) {
            panel.add(new MyJButton("button"+(i+1)));
        }
        return panel;
    }

}
