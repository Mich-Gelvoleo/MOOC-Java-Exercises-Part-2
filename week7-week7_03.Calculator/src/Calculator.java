/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michele Gelvoleo
 */
public class Calculator {
    private Reader reader;
    private int count = 0;
    
    public Calculator(){
        this.reader = new Reader();  
    }
    
    public void start(){
        while(true){
            System.out.print("command: ");
            String command = reader.readString();
            
            if(command.equals("end")){
                statistics();
                break;
            }
            
            if(command.equals("sum")){
                sum();
            }
            else if(command.equals("difference")){
                difference();
            }
            else if(command.equals("product")){
                product();
            }
        }

    }
    
    private void sum(){
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        
        int sum = value1 + value2;
        
        System.out.println("sum of the values: " + sum);
        
        this.count++;
    }
    
    private void difference(){
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        
        int difference = value1 - value2;
        
        System.out.println("difference of the values: " + difference);
        
        this.count++;
    }
    
    private void product(){
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        
        int product = value1 * value2;
        
        System.out.println("product of the values: " + product);
        
        this.count++;
    }
    
    private void statistics(){
        System.out.println("Calculations done " + this.count);
    }
}
