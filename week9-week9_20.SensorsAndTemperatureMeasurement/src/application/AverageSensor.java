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
public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor(){
        sensors = new ArrayList<Sensor>();
        readings = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional){
        this.sensors.add(additional);
    }
    
    @Override
    public void on(){
        for(Sensor sensor : sensors){
            sensor.on();
        }
    }
    
    @Override
    public void off(){
        for(Sensor sensor : sensors){
            sensor.off();
        }
    }
    
    @Override
    public boolean isOn(){
        for(Sensor sensor : sensors){
            if(sensor.isOn() == true){
                return true;
            }
        }
        
        return false;
    }
    
    @Override
    public int measure(){
        if(isOn() == false){
            throw new IllegalArgumentException("The average sensor is off.");
        }
        
        int totalTemperature = 0;
        
        for(Sensor sensor : sensors){
            totalTemperature += sensor.measure();
        }
        
        int average = totalTemperature / sensors.size();
        
        this.readings.add(average);
        
        return average;
    }
    
    public List<Integer> readings(){
        return this.readings;
    }
    
}
