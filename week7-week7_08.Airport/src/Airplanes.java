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

public class Airplanes {
    private HashMap<String, Integer> planes;
    
    public Airplanes(){
        planes = new HashMap<String, Integer>();
    }
    
    public void addPlanes(String id, int cap){
        this.planes.put(id, cap);
    }
    
    public String getPlane(String id){
        return "" + id + " (" + this.planes.get(id) + " ppl)";
    }
    
    @Override
    public String toString(){
        String buffer = "";
        for(String i : planes.keySet()){
            buffer += "" + i + " (" + this.planes.get(i) + " ppl)\n";
        }
        
        return buffer;
    }
    
}
