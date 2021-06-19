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
public class ProductContainerRecorder extends ProductContainer{
    private ContainerHistory record;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume){
        super(productName, capacity);
        this.record = new ContainerHistory();
        this.record.add(initialVolume);
        super.addToTheContainer(initialVolume);
    }
    
    @Override
    public void addToTheContainer(double amount){
        super.addToTheContainer(amount);
        this.record.add(super.getVolume());
    }
    
    @Override
    public double takeFromTheContainer(double amount){
        double temp = super.takeFromTheContainer(amount);
        this.record.add(super.getVolume());
        return temp;
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history());
        System.out.println("Greatest product amount: " + this.record.maxValue());
        System.out.println("Smallest product amount: " + this.record.minValue());
        System.out.println("Average: " + this.record.average());
        System.out.println("Greatest change: " + this.record.greatestFluctuation());
        System.out.println("Variance: " + this.record.variance());
    }
    
    public String history(){
        return this.record.toString();
    }
}
