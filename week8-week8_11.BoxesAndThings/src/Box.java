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
public class Box implements ToBeStored{
    private double totalWeight;
    private double maxWeight;
    private ArrayList<ToBeStored> items;
    
    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
        this.items = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored stored){
        if(this.totalWeight + stored.weight() <= this.maxWeight){
            this.items.add(stored);
            this.totalWeight += stored.weight();
        }
    }
    
    @Override
    public String toString(){
        return "Box: " + items.size() + " things, total weight " + this.totalWeight + " kg";
    }
    
    @Override
    public double weight(){
        double weight = 0;
        
        for(ToBeStored item : items){
            weight += item.weight();
        }
        
        return weight;
    }
}
