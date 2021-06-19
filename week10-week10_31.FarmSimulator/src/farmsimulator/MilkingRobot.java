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
public class MilkingRobot{
    
    private BulkTank tank;
    
    public MilkingRobot(){
    
    }
    
    public BulkTank getBulkTank(){
        if(tank == null){
            return null;
        }else{
            return tank;
        }
    }
    
    public void setBulkTank(BulkTank tank){
        this.tank = tank;
    }
    
    public void milk(Milkable milkable){
        if(this.getBulkTank() == null){
            throw new IllegalStateException("No milking robot installed!");
        }else{
            this.tank.addToTank(milkable.milk());
        }
    }
}
