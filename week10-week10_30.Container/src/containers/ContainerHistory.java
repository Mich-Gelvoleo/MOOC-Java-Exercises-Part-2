/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Michele Gelvoleo
 */
import java.util.*;

public class ContainerHistory {
    private List<Double> history;
    
    public ContainerHistory(){
        this.history = new ArrayList<Double>();
    }
    
    public void add(double situation){
        this.history.add(situation);
    }
    
    public void reset(){
        this.history.removeAll(history);
    }
    
    public double maxValue(){
        if(!this.history.isEmpty()){
            double maxValue = Collections.max(history);
            return maxValue;
        }else{
            return 0.0;
        }
    }
    
    public double minValue(){
        if(!this.history.isEmpty()){
            double minValue = Collections.min(history);
            return minValue;
        }else{
            return 0.0;
        }
    }
    
    public double average(){
        double average = 0.0;
        
        if(!this.history.isEmpty()){
            double sum = 0;
            for(double num : this.history){
                sum += num;
            }

            average = sum /  this.history.size();

            return average;
        }else{
            return average;
        }  
    }
    
    public double greatestFluctuation(){
        if(this.history.isEmpty() || this.history.size() == 1){
            return 0.0;
        }else{
            double maxValue = 0.0;
            int i = 0;
            
            for(double temp : this.history){
                double temp1 = this.history.get(i + 1);
                double maxTemp = Math.abs(temp - temp1);
                
                if(maxTemp > maxValue){
                    maxValue = maxTemp;
                }
                
                i++;
                
                if(i >= this.history.size() - 1){
                    break;
                }
            }
            
            return maxValue;
        }
    }
    
    public double variance(){
        if(this.history.isEmpty() || this.history.size() == 1){
            return 0.0;
        }else{
            double mean = average();
            double sum = 0.0;
            
            for(double num : this.history){
                sum += Math.pow((num - mean), 2);
            }
            
            double variance = sum / (this.history.size() - 1);
            
            return variance;
        }
    }
    
    @Override
    public String toString(){
        return "" + this.history;
    }
}
