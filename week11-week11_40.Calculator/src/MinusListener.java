/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Michele Gelvoleo
 */
public class MinusListener implements ActionListener{
    private JTextField value;
    private JTextField output;
    private JButton clear;
    private CalculatorLogic calc;
    
    public MinusListener(CalculatorLogic calc, JTextField output, JTextField value, JButton clear){
        this.value = value;
        this.output = output;
        this.calc = calc;
        this.clear = clear;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        String dummy = this.value.getText();
        try{
            int num = Integer.parseInt(dummy);
            this.calc.subtract(num);
            this.value.setText("");
            this.clear.setEnabled(true);
            this.output.setText(String.valueOf(this.calc.getValue()));
        }catch(NumberFormatException e){
            this.value.setText("");
        }
    }
}
