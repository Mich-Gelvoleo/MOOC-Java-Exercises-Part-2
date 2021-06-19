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

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister(){
        this.owners = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner){
        if(!this.owners.containsKey(plate)){
            owners.put(plate, owner);
            return true;
        }else{
            return false;
        }
    }
    
    public String get(RegistrationPlate plate){
        if(!this.owners.containsKey(plate)){
            return null;
        }
        
        return this.owners.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate){
        if(!this.owners.containsKey(plate)){
            return false;
        }
        
        this.owners.remove(plate);
        return true;
    }
    
    public void printRegistrationPlates(){
        for(RegistrationPlate plate : this.owners.keySet()){
            System.out.println(plate);
        }
    }
    
    public void printOwners(){
        ArrayList<String> people = new ArrayList<String>();
        String buffer = "";
        for(RegistrationPlate i : this.owners.keySet()){
            buffer = this.owners.get(i);
            
            if(!people.contains(this.owners.get(i))){
                people.add(buffer);
            }
        }
        
        for(String person : people){
            System.out.println(person);
        }
    }
    
    
}
