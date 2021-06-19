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

public class Suitcase {
    private int weightLimit;
    private int curWeight = 0;
    private ArrayList<Thing> things;
    
    public Suitcase(int weightLimit){
        this.weightLimit = weightLimit;
        this.things = new ArrayList<Thing>();
    }
    
    public void addThing(Thing thing){
        if(curWeight + thing.getWeight() <= this.weightLimit){
            things.add(thing);
            this.curWeight += thing.getWeight();
        }
    }
    
    public void printThings(){
        for(Thing item : things){
            System.out.println(item);
        }
    }
    
    public Thing heaviestThing(){
        if(things.isEmpty()){
            return null;
        }
        
        int temp = things.get(0).getWeight();
        int index = 0;
        
        for(int i = 0; i < things.size(); i++){
            if(things.get(i).getWeight() >= temp){
                temp = things.get(i).getWeight();
                index = i;
            }
        }
        
        return things.get(index);
    }
    
    public int totalWeight(){
        return this.curWeight;
    }
    
    @Override
    public String toString(){
        if(things.isEmpty()){
            return "empty (" + this.curWeight + " kg)";
        }else if(things.size() == 1){
            return "" + things.size() + " thing (" + this.curWeight + " kg)";
        }else{
            return "" + things.size() + " things (" + this.curWeight + " kg)";
        }
        
        
    }
}
