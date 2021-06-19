/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.util.*;
/**
 *
 * @author Michele Gelvoleo
 */
public class WordInspection {
    private File file;
    
    public WordInspection(File file){
        this.file = file;
    }
    
    public int wordCount() throws Exception{
        Scanner reader = new Scanner(this.file, "UTF-8");
        
        int words = 0;
        
        String buffer = "";
        while(reader.hasNext()){
            buffer = reader.next();
            
            words++;
        }
        
        reader.close();
        return words;
    }
    
    public List<String> wordsContainingZ() throws Exception{
        List<String> list = new ArrayList<String>();
        Scanner reader = new Scanner(this.file, "UTF-8");
        
        while(reader.hasNext()){
            String buffer = reader.next();
            
            if(buffer.contains("z")){
                list.add(buffer);
            }
        }
        
        reader.close();
        return list;
    }
    
    public List<String> wordsEndingInL() throws Exception{
        List<String> list = new ArrayList<String>();
        Scanner reader = new Scanner(this.file, "UTF-8");
        
        while(reader.hasNext()){
            String buffer = reader.next();
            char lastChar = buffer.charAt(buffer.length()-1);
            
            if(lastChar == 'l' || lastChar == 'L'){
                list.add(buffer);
            }
        }
        
        reader.close();
        return list;
    }
    
    public List<String> palindromes() throws Exception{
        List<String> list = new ArrayList<String>();
        Scanner reader = new Scanner(this.file, "UTF-8");
        
        while(reader.hasNext()){
            String buffer = reader.next();
            String word = "";
            int i = buffer.length() - 1;
            
            while(i >= 0){
                word += buffer.charAt(i);
                i--;
            }
            
            if(word.equals(buffer)){
                list.add(buffer);
            }
        }
        
        reader.close();
        return list;
    }
    
    public List<String> wordsWhichContainAllVowels() throws Exception{
        List<String> list = new ArrayList<String>();
        Scanner reader = new Scanner(this.file, "UTF-8");
        
        while(reader.hasNext()){
            String buffer = reader.next();
            
            if(buffer.contains("a") && buffer.contains("e") && buffer.contains("i") && buffer.contains("o") && buffer.contains("u") && buffer.contains("y") && buffer.contains("ä") && buffer.contains("ö")){
                list.add(buffer);
            }
        }
        
        reader.close();
        return list;
    }
}
