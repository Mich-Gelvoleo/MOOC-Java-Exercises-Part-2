/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michele Gelvoleo
 */
public class MindfulDictionary {
    
    private Map<String, String> dbA;
    private Map<String, String> dbB;
    private File file;
    private Scanner reader;
    private FileWriter writer;
    
    public MindfulDictionary(){
        this.dbA = new HashMap<String, String>();
        this.dbB = new HashMap<String, String>();
    }
    
    public MindfulDictionary(String file) throws Exception{
        this.dbA = new HashMap<String, String>();
        this.dbB = new HashMap<String, String>();
        this.file = new File(file);
        try{
            this.reader = new Scanner(this.file);
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
        }
    }

    public void add(String word, String translation){
        if(!this.dbA.containsKey(word) && !this.dbB.containsValue(translation)){
            this.dbA.put(word, translation);
            this.dbB.put(translation, word);
        }
    }
    
    public String translate(String word){
        if(this.dbA.containsKey(word)){
            return this.dbA.get(word);
        }else if(this.dbB.containsKey(word)){
            return this.dbB.get(word);
        }else{
            return null;
        }
    }
    
    public void remove(String word){
        String translation = "";
        if(this.dbA.containsKey(word)){
            translation = this.dbA.get(word);
            this.dbA.remove(word);
            this.dbB.remove(translation);
        }
        
        if(this.dbB.containsKey(word)){
            translation = this.dbB.get(word);
            this.dbB.remove(word);
            this.dbA.remove(translation);
        }
    }
    
    public boolean load(){
        if(this.file.exists()){
            this.dbA.clear();
            this.dbB.clear();
            
            String text = "";
            String[] parts = null;
            
            while(this.reader.hasNextLine()){
                text = this.reader.nextLine();
                parts = text.split(":");
                
                if(!this.dbA.containsKey(parts[0]) && !this.dbB.containsValue(parts[0])){
                    this.dbA.put(parts[0], parts[1]);
                    this.dbB.put(parts[1], parts[0]);
                }
                
            }
            return true;
        }else{
            return false;
        }
    }
    
    public boolean save(){
        try{
            this.writer = new FileWriter(this.file);
            for(String a : this.dbA.keySet()){
                String line = a + ":" + this.dbA.get(a) + "\n";
                this.writer.write(line);
            }
            this.writer.close();
        }catch (IOException e){
            return false;
        }
        return true;
    }
}
