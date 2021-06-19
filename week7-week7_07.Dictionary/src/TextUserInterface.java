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

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dict;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dict = dictionary;
    }
    
    public void start(){
        System.out.println("Statement: ");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quit the user interface");
        
        while(true){
        System.out.println("");
        System.out.print("Statement: ");
        String choice = reader.nextLine();
        
        if(choice.equals("quit")){
            System.out.println("Cheers!");
            break;
        }else if(choice.equals("add")){
            System.out.print("In Finnish: ");
            String fin = reader.nextLine();
            System.out.print("Translation: ");
            String eng = reader.nextLine();
            dict.add(fin, eng);
        }else if(choice.equals("translate")){
            System.out.print("Give a word: ");
            String word = reader.nextLine();
            System.out.print("Translation: " + dict.translate(word));
        }else{
            System.out.println("Unknown statement");
            System.out.println("");
        }
        
        }
    }
}
