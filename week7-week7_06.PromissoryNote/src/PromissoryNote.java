/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michele Gelvoleo
 */

import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> notes;
    
    public PromissoryNote(){
        this.notes = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value){
        this.notes.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose){
        if(this.notes.containsKey(whose)){
            return notes.get(whose);
        }
        
        return 0;
    }
}
