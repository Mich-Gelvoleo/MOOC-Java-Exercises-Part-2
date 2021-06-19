/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Michele Gelvoleo
 */
import java.util.*;

public class Farm implements Alive{
    private String owner;
    private Barn barn;
    private List<Cow> cows;
    
    public Farm(String name, Barn barn){
        this.owner = name;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }
    
    public String getOwner(){
        return this.owner;
    }
    
    public void addCow(Cow cow){
        this.cows.add(cow);
    }
    
    public void installMilkingRobot(MilkingRobot robot){
        this.barn.installMilkingRobot(robot);
    }
    
    public void manageCows(){
        this.barn.takeCareOf(cows);
    }
    
    @Override
    public String toString(){
        String ownership = "Farm Owner: " + this.owner;
        String barnTank = "Barn bulk tank: " + this.barn.toString();
        
        String cowsState = "";
        
        if(cows.isEmpty()){
            cowsState = "No cows.";
        }else{
            cowsState = "Animals: \n";
            for(Cow cow : this.cows){
                cowsState += "        " + cow.toString() + "\n";
            }
        }
        
        return ownership + "\n" + barnTank + "\n" + cowsState;
    }
    
    @Override
    public void liveHour(){
        for(Cow cow : this.cows){
            cow.liveHour();
        }
    }
}
