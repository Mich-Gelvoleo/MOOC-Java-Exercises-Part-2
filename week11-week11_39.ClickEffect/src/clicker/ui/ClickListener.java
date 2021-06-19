/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Michele Gelvoleo
 */
public class ClickListener implements ActionListener{
    private JLabel num;
    private Calculator calc;
    
    public ClickListener(Calculator calculator, JLabel num){
        this.num = num;
        this.calc = calculator;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        this.calc.increase();
        this.num.setText(String.valueOf(this.calc.giveValue()));
    }
}
