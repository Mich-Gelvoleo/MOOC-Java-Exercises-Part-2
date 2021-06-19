/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.*;

/**
 *
 * @author Michele Gelvoleo
 */
public class Thermometer implements Sensor{
    private Random random;
    private boolean status;
    
    public Thermometer(){
        random = new Random();
    }
    
    @Override
    public void on(){
        this.status = true;
    }
    
    @Override
    public void off(){
        this.status = false;
    }
    
    @Override
    public boolean isOn(){
        return this.status;
    }
    
    @Override
    public int measure(){
        if(isOn() == false){
            throw new IllegalArgumentException("The device is off.");
        }else{
            return random.nextInt(30 + 1 + 30) - 30;
        }   
    }
}
