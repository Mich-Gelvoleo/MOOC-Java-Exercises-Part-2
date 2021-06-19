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
public class Flights {
    private ArrayList<String> flights;
    
    public Flights(){
        flights = new ArrayList<String>();
    }
    
    public void addFlight(String entry){
        this.flights.add(entry);
    }
    
    @Override
    public String toString(){
        String buffer = "";
        
        for(String i : this.flights){
            buffer += i + "\n";
        }
        
        return buffer;
    }
}
