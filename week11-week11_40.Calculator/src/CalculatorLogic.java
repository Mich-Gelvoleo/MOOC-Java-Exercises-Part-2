/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michele Gelvoleo
 */
public class CalculatorLogic {
    private int result;
    
    public CalculatorLogic(){
        this.result = 0;
    }
    
    public int getValue(){
        return this.result;
    }
    
    public void add(int value){
        this.result += value;
    }
    
    public void subtract(int value){
        this.result -= value;
    }
    
    public void reset(){
        this.result = 0;
    }
}
