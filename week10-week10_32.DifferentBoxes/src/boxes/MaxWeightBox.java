/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author Michele Gelvoleo
 */

import java.util.*;

public class MaxWeightBox extends Box{
    private int maxWeight;
    private Collection<Thing> things;
    
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
        
    }
    
    @Override
    public void add(Thing thing){
        int currWeight = 0;
        
        for(Thing item: things){
            currWeight += item.getWeight();
        }
        
        if(thing.getWeight() + currWeight <= this.maxWeight){
            things.add(thing);
        }
    }
    
    @Override
    public boolean isInTheBox(Thing thing){
        if(things.contains(thing)){
            return true;
        }else{
            return false;
        }
    }
}
