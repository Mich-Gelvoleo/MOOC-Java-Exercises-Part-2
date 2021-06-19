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

public class OneThingBox extends Box{
    private Collection<Thing> one;
    
    public OneThingBox(){
        this.one = new ArrayList<Thing>();
    }
    
    @Override
    public void add(Thing thing){
        if(this.one.isEmpty()){
            one.add(thing);
        }
    }
    
    @Override
    public boolean isInTheBox(Thing thing){
        if(this.one.contains(thing)){
            return true;
        }else{
            return false;
        }
    }
}
