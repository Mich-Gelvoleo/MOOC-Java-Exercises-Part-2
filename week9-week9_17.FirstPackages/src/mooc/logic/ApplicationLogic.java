/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;

/**
 *
 * @author Michele Gelvoleo
 */
import mooc.ui.UserInterface;
        
public class ApplicationLogic {
    private UserInterface user;
    
    public ApplicationLogic(UserInterface ui){
        this.user = ui;
    } 
    
    public void execute(int howManyTimes){
        int i = 0;
        
        while(i < howManyTimes){
            System.out.println("The application logic works");
            this.user.update();
            i++;
        }
    }
}
