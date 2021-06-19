/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

/**
 *
 * @author Michele Gelvoleo
 */
public class Piece {
    private int x;
    private int y;
    
    public Piece(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void move(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    
    public boolean runsInto(Piece piece){
        if(piece.x == this.x && piece.y == this.y){
            return true;
        }
        
        return false;
    }
    
    @Override
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }
}
