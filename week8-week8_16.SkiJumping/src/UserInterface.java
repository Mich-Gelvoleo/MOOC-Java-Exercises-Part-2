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
public class UserInterface {
     private Scanner reader;
     private Record record;
     
     public UserInterface(){
         this.reader = new Scanner(System.in);
         this.record = new Record();
     }
     
     public void menu(){
         System.out.println("Kumpula ski jumping week");
         System.out.println("");
         System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
         
         boolean check = true;
         
         while(check){
            System.out.print("  Participant name: ");
            String name = reader.nextLine();
            if(name.isEmpty()){
                check = false;
            }else{
                record.add(name);
            }
         }
         
         System.out.println("");
         System.out.println("The tournament begins!");
         
         int count = 1;
         while(true){
             System.out.println("");
             System.out.print("Write \"jump\" to jump; otherwise you quit: ");
             String choice = reader.nextLine();
             System.out.println("");
             
             if(choice.equals("jump")){
                 System.out.println("Round " + count + "\n");
                 record.printOrder();
                 record.printRoundResults(count);
                 count++;
             }else if(choice.equals("quit")){
                 System.out.println("Thanks!\n");
                 record.printTournamentResults();
                 return;
             }
             
             
         }
         
     }
}
