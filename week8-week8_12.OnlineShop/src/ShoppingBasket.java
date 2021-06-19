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
public class ShoppingBasket {
    private Map<String, Purchase> items;
    
    public ShoppingBasket(){
        this.items = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price){
        if(this.items.containsKey(product)){
            this.items.get(product).increaseAmount();
        }else{
            Purchase item = new Purchase(product, 1, price);
            this.items.put(product, item);
        }
    }
    
    public int price(){
        int totalPrice = 0;
        for(String product : this.items.keySet()){
            totalPrice += this.items.get(product).price();
        }
        
        return totalPrice;
    }
    
    public void print(){
        for(String product : this.items.keySet()){
            System.out.println(this.items.get(product));
        }
    }
}
