/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.*;

import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author Michele Gelvoleo
 */
public class Packer {
    private int boxVol;
    
    public Packer(int boxesVolume){
        this.boxVol = boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things){
        List<Box> boxes = new ArrayList<Box>();
        
        Box box = new Box(this.boxVol);
        
        for(Thing thing : things){
            if(box.addThing(thing)==true){
                
            }else{
                boxes.add(box);
                box = new Box(this.boxVol);
                box.addThing(thing);
            }
        }
        
        boxes.add(box);
        
        return boxes;
    }
}
