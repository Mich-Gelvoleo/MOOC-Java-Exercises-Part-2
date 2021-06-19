/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michele Gelvoleo
 */
public class Change {
    private String helper;
    private char initialChar;
    private char finalChar;
    
   public Change(char fromCharacter, char toCharacter){
       this.initialChar = fromCharacter;
       this.finalChar = toCharacter;
   } 
   public String change(String characterString){
       helper = characterString.replace(initialChar, finalChar);
       return helper;
   }
}
