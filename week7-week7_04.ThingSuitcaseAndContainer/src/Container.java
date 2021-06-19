/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michele Gelvoleo
 */

import java.util.*;

public class Container {
    private int weightLimit;
    private int curWeight = 0;
    private ArrayList<Suitcase> cases;
    
    public Container(int weightLimit){
        this.weightLimit = weightLimit;
        this.cases = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(this.curWeight + suitcase.totalWeight() <= this.weightLimit){
            cases.add(suitcase);
            this.curWeight += suitcase.totalWeight();
        }
    }
    
    public void printThings(){
        for(Suitcase bag : cases){
            bag.printThings();
        }
    }
    
    @Override
    public String toString(){
        return "" + cases.size() + " suitcases (" + this.curWeight + " kg)";
    }
    
}
