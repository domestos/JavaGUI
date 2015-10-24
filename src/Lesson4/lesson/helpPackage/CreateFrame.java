package Lesson4.lesson.helpPackage;

import javax.swing.*;
import java.awt.*;

/**
 * Created by varenik on 24.10.15.
 */
public class CreateFrame extends JFrame {
    public CreateFrame(String nameJFrame, int width, int height){
        super.setTitle(nameJFrame);
        super.setSize(width, height);
        super.setVisible(true);
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public CreateFrame(String nameJFrame, int width, int height,LayoutManager layoutManager){
        this(nameJFrame, width, height );
        this.setLayout(layoutManager);
    }

}
