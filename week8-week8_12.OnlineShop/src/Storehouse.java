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

public class Storehouse {
    private Map<String, Integer> product_price;
    private Map<String, Integer> product_stock;
    
    public Storehouse(){
        this.product_price = new HashMap<String, Integer>();
        this.product_stock = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.product_price.put(product, price);
        this.product_stock.put(product, stock);
    }
    
    public int price(String product){
        if(this.product_price.containsKey(product)){
            return this.product_price.get(product);
        }else{
            return -99;
        }
    }
    
    public int stock(String product){
        if(this.product_stock.containsKey(product)){
            return this.product_stock.get(product);
        }else{
            return 0;
        }
    }
    
    public boolean take(String product){
        if(this.product_stock.containsKey(product)){
            int buffer = this.product_stock.get(product);
            if(this.product_stock.get(product) > 0){
                buffer--;
                this.product_stock.replace(product, buffer);
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    public Set<String> products(){
        Set<String> product_names = product_price.keySet();
        return product_names;
    }
}
