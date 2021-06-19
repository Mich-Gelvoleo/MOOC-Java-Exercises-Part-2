/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

/**
 *
 * @author Michele Gelvoleo
 */
import java.util.*;

public class Group implements Movable{
    
    private List<Movable> organisms;
    
    public Group(){
        this.organisms = new ArrayList<Movable>();
    }
    
    public void addToGroup(Movable movable){
        this.organisms.add(movable);
    }
    
    @Override
    public String toString(){
        String buffer = "";
        
        for(Movable organism : this.organisms){
            buffer += organism.toString();
            buffer += "\n";
        }
        
        return buffer;
    }
    
    @Override
    public void move(int dx, int dy){
        for(Movable organism : this.organisms){
            organism.move(dx, dy);
        }
    }
}
