package Lesson4.homeWork.listners;

import Lesson4.homeWork.calc.CalcOperations;
import Lesson4.homeWork.gui.MyJTextField;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by varenik on 24.10.15.
 */
public class CalcButtonActionListners implements ActionListener {

    private MyJTextField jTextNumber1;
    private MyJTextField jTextNumber2;
    private MyJTextField jTextResult;

    public  CalcButtonActionListners( MyJTextField jTextNumber1, MyJTextField jTextNumber2, MyJTextField jTextResult){
        this.jTextNumber1 = jTextNumber1;
        this.jTextNumber2 = jTextNumber2;
        this.jTextResult = jTextResult;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!(e.getSource() instanceof JButton)){
            return;
        }

        JButton btn = (JButton) e.getSource();
        final double a = Double.parseDouble(jTextNumber1.getText());
        final double b = Double.parseDouble(jTextNumber2.getText());


        if(btn.getActionCommand().equals("+")){

            jTextResult.setText(String.valueOf(CalcOperations.add(a, b)));
        } else if(btn.getActionCommand().equals("/")){
            jTextResult.setText(String.valueOf(CalcOperations.divide(a,b)));
        }else if(btn.getActionCommand().equals("*")){
            jTextResult.setText(String.valueOf(CalcOperations.multiply(a,b)));
        }else if(btn.getActionCommand().equals("-")){
            jTextResult.setText(String.valueOf(CalcOperations.subtract(a,b)));

        }

    }
}
