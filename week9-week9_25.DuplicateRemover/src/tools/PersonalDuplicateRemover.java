/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;
import java.util.*;

/**
 *
 * @author Michele Gelvoleo
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    private Set<String> set;
    private int dupe = 0;
    
    public PersonalDuplicateRemover(){
        this.set = new HashSet<String>();
    }
    
    @Override
    public void add(String characterString){
        if(!this.set.contains(characterString)){
            this.set.add(characterString);
        }else{
            this.dupe++;
        }
    }
    
    @Override
    public int getNumberOfDetectedDuplicates(){
        return this.dupe;
    }
    
    @Override
     public Set<String> getUniqueCharacterStrings(){
         return this.set;
     }
     
     @Override
     public void empty(){
         this.set.clear();
         this.dupe = 0;
     }
    
    
}
