/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.applicationlogic;

/**
 *
 * @author Michele Gelvoleo
 */
public class PersonalCalculator implements Calculator{
    private int value;
    
    @Override
    public int giveValue(){
        if(this.value > 0){
            return this.value;
        }else{
            return this.value = 0;
        }
    }
    
    @Override
    public void increase(){
        this.value++;
    }
}
