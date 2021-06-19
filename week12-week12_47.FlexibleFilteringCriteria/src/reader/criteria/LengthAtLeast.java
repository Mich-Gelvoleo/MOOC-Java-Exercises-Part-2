/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Michele Gelvoleo
 */
public class LengthAtLeast implements Criterion{
    private int value;
    
    public LengthAtLeast(int value){
        this.value = value;
    }
    @Override
    public boolean complies(String line) {
        if(line.length() >= this.value){
            return true;
        }
        
        return false;
    }
    
}
