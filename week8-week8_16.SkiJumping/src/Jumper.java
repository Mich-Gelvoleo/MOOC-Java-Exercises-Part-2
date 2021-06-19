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

public class Jumper implements Comparable<Jumper>{
    private String name;
    private ArrayList<Integer> length;
    private ArrayList<Integer> votes;
    private ArrayList<Integer> buffer;
    private Random rand;
    private int total;
    
    public Jumper(String name, int point){
        this.name = name;
        this.length = new ArrayList<Integer>();
        this.length.add(point);
        this.votes = new ArrayList<Integer>();
        this.buffer = new ArrayList<Integer>();
        
        this.rand = new Random();
    }
    
    public void jump(){
        int minJump = 60;
        int maxJump = 120;
        
        int jump = rand.nextInt((maxJump - minJump) + 1) + minJump;
        this.length.add(jump);
    }
    
    public void resetVotes(){
        this.votes.clear();
    }
    
    public void judgeVotes(){
        int minVote = 10;
        int maxVote = 20;
        int count = 0;
        int vote;
       
        resetVotes();
        
        while(count < 5){
            vote = rand.nextInt((maxVote - minVote) + 1) + minVote;
            this.votes.add(vote);
            count++;
        } 
    }
    
    public String getName(){
        return this.name;
    }
    
    public ArrayList<Integer> getLengths(){
        return this.length;
    }
    
    public ArrayList<Integer> getVotes(){
        return this.votes;
    }
     
    public  void calculatePoints(){
        int lengthSum = 0;
        for(int jumpLength : this.length){
            lengthSum += jumpLength;
        }
        
        Collections.sort(this.votes);
        
        int voteTotal = 0;
        for(int i = 0; i < this.votes.size(); i++){
            if(i == 1 || i == 2 || i == 3){
                this.buffer.add(this.votes.get(i));
            }
        }
        
        for(int num : this.buffer){
            voteTotal += num;
        }
        
        this.total = lengthSum + voteTotal;
    }
    
    public int getPoints(){
        return this.total;
    }
    
    public int getLength(int num){
        return this.length.get(num);
    }
    
    @Override
    public int compareTo(Jumper jumper){
        if(this.getPoints() > jumper.getPoints()){
            return -1;
        }else if(this.getPoints() == jumper.getPoints()){
            return 0;
        }else{
            return 1;
        }
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.getPoints() + " points)";
    }
}
