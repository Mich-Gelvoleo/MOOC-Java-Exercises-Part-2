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

public class Barn {
    private BulkTank tank;
    private MilkingRobot robot;
    
    public Barn(BulkTank tank){
        this.tank = tank;
    }
    
    public BulkTank getBulkTank(){
        return this.tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.robot = milkingRobot;
        this.robot.setBulkTank(this.tank);
    }
    
    public void takeCareOf(Cow cow){
        if(this.robot == null){
            throw new IllegalStateException("No milking robot installed.");
        }
        
        this.robot.milk(cow);
    }
    
    public void takeCareOf(Collection<Cow> cows){
        if(this.robot == null){
            throw new IllegalStateException("No milking robot installed.");
        }
        
        for(Cow cow : cows){
            this.robot.milk(cow);
        }
    }
    
    @Override
    public String toString(){
        return "" + this.tank.getVolume() + "/" + this.tank.getCapacity();
    } 
}
