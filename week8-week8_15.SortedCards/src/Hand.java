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

public class Hand implements Comparable <Hand>{
    private ArrayList<Card> cards;
    
    public Hand(){
        this.cards = new ArrayList<Card>();
    }
    
    public void add(Card card){
        this.cards.add(card);
    }
    
    public void print(){
        for(Card card : this.cards){
            System.out.println(card);
        }
    }
    
    public void sort(){
        Collections.sort(cards);
    }
    
    @Override
    public int compareTo(Hand hand){
        int sum1 = 0,
            sum2 = 0;
        
        for(Card card : this.cards){
            sum1 += card.getValue();
        }
        
        for(Card card : hand.cards){
            sum2 += card.getValue();
        }
        
        return sum1 - sum2;
    }
    
    public void sortAgainstSuit(){
        SortAgainstSuitAndValue sorter = new SortAgainstSuitAndValue();
        
        Collections.sort(cards, sorter);
    }
}
