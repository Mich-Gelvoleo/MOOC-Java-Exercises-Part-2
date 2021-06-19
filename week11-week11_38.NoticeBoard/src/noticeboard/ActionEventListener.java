/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticeboard;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Michele Gelvoleo
 */
public class ActionEventListener implements ActionListener{
    private JTextField up;
    private JLabel down;
    
    public ActionEventListener(JTextField origin, JLabel dest){
        this.up = origin;
        this.down = dest;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        this.down.setText(this.up.getText());
        this.up.setText("");
    }
}
