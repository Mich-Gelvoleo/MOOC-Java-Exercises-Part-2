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
public class Record{
    private ArrayList<Jumper> jumpers;
    
    public Record(){
        this.jumpers = new ArrayList<Jumper>();
    }
    
    public void add(String name){
        this.jumpers.add(new Jumper(name, 0));
    }
    
    public void printOrder(){
        Collections.sort(jumpers);
        Collections.reverse(jumpers);
        int count = 1;
        System.out.println("Jumping order: ");
        for(Jumper jumper : this.jumpers){
            System.out.println("  " + count + ". " + jumper);
            count++;
        }
        System.out.println("");
    }
    
    public void printRoundResults(int num){
        System.out.println("Results of round " + num);
        for(Jumper jumper : this.jumpers){
            jumper.jump();
            jumper.judgeVotes();
            System.out.println("  " + jumper.getName());
            System.out.println("    length: " + jumper.getLength(num));
            System.out.println("    judge votes: " + jumper.getVotes());
            jumper.calculatePoints();
        }
    }
    
    public void printTournamentResults(){
        System.out.println("Tournament results: ");
        System.out.println("Position    Name");
        
        int count = 1;
        
        Collections.sort(jumpers);
        for(Jumper jumper : this.jumpers){
            System.out.println(count + "           " + jumper);
            System.out.print("            jump lengths: ");
            jumper.getLengths().remove(0);
            for(int num = 0; num < jumper.getLengths().size(); num++){
                if(num == jumper.getLengths().size() - 1){
                    System.out.print(jumper.getLengths().get(num) + " m");
                }else{
                    System.out.print(jumper.getLengths().get(num) + " m, ");
                }
            }
            System.out.println("");
    
            count++;
        }
    }
}
