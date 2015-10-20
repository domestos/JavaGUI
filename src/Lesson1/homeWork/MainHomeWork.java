package Lesson1.homeWork;

import javax.swing.*;
import java.awt.*;

/**
 * Created by v.pelenskyi on 20.10.2015.
 */
public class MainHomeWork {
    public static void main(String[] args) {


        MyJButton buttonOk = new MyJButton("ok");


        MyJPanel panel = new MyJPanel("first Panel", 500, 200, buttonOk );


        MyJFrame frame = new MyJFrame("Home work lesson1 GUI", 500, 800, panel);






    }



}
