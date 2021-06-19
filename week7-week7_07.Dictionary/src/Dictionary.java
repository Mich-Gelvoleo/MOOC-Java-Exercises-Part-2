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

public class Dictionary {
    private HashMap<String, String> words = new HashMap<String, String>();
    
    public String translate(String word){
        if(words.containsKey(word)){
            return words.get(word);
        }
        else{
            return null;
        }
    }
    
    public void add(String word, String translation){
        words.put(word, translation);
    }
    
    public int amountOfWords(){
        return words.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> wordPairs = new ArrayList<String>();
        for(String i : words.keySet()){
            wordPairs.add(i + " = " + words.get(i));
        }
        
        return wordPairs;
    }
}
