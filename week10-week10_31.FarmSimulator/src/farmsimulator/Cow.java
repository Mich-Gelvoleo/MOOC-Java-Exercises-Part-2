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

public class Cow implements Milkable, Alive{
    private String name;
    private double udderCap;
    private double currVolume;
    private Random random = new Random();
    private String[] names = new String[]{
        "Gale", "Shadow", "Bosco", "Bambam", "Mooffin",
        "Grand", "Froghurt", "Butters", "Sable", "Bigfoot",
        "Dolly", "Dutchess", "Buttons", "Snow", "Booboo", 
        "Princess", "Viola", "Princess", "Bernice"
    };
    
    public Cow(){
        this.udderCap = 15 + new Random().nextInt(26);
        this.currVolume = 0;
        
        int i = new Random().nextInt(names.length);
        this.name = names[i];
        
    }
    
    public Cow(String name){
        this.udderCap = 15 + new Random().nextInt(26);
        this.currVolume = 0;
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCapacity(){
        return this.udderCap;
    }
    
    public double getAmount(){
        return this.currVolume;
    }
    
    @Override
    public String toString(){
        return "" + this.name + " " + this.currVolume + "/" + this.udderCap;
    }
    
    @Override
    public double milk(){
        double temp = this.currVolume;
        this.currVolume = 0;
        return temp;
    }
    
    @Override
    public void liveHour(){
        double milkProduced = Math.ceil(0.7 + (2 - 0.7) * random.nextDouble());
        if(this.currVolume + milkProduced <= this.udderCap){
            this.currVolume += milkProduced;
        }
    }
}
