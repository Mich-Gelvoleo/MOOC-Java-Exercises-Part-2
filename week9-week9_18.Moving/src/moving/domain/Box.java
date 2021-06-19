/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;
import java.util.*;
/**
 *
 * @author Michele Gelvoleo
 */
public class Box implements Thing{
    private int maxCap;
    private List<Thing> things;
    
    public Box(int maximumCapacity){
        this.maxCap = maximumCapacity;
        things = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing){
        if(thing.getVolume() + getVolume() <= this.maxCap){
            things.add(thing);
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public int getVolume(){
        int buffer = 0;
        
        for(Thing thing : things){
            buffer += thing.getVolume();
        }
        
        return buffer;
    }
    
    
}
