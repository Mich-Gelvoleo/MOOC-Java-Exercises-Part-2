/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import wormgame.Direction;

import java.util.*;

/**
 *
 * @author Michele Gelvoleo
 */
public class Worm {
    private List<Piece> pieces;
    private Direction originalDirection;
    private boolean willGrow;
    
    public Worm(int originalX, int originalY, Direction originalDirection){
        this.originalDirection = originalDirection;
        this.pieces = new ArrayList<Piece>();
        this.pieces.add(new Piece(originalX, originalY));
    }
    
    public Direction getDirection(){
        return this.originalDirection;
    }
    
    public void setDirection(Direction dir){
        this.originalDirection = dir;
    }
    
    public int getLength(){
        return this.pieces.size();
    }
    
    public List<Piece> getPieces(){
        return this.pieces;
    }
    
    public void move(){
        
        if(this.pieces.size() < 3){
            this.grow();
        }
        
        Piece newPiece = new Piece(this.pieces.get(this.pieces.size()-1).getX(), this.pieces.get(this.pieces.size()-1).getY());
        if(this.originalDirection == Direction.UP){
            newPiece.move(0, -1);
        }
        if(this.originalDirection == Direction.DOWN){
            newPiece.move(0, 1);
        }
        if(this.originalDirection == Direction.RIGHT){
            newPiece.move(1, 0);
        }
        if(this.originalDirection == Direction.LEFT){
            newPiece.move(-1, 0);
        }
        
        this.pieces.add(newPiece);
        
        if(!this.willGrow){
            this.pieces.remove(0);
        }else{
            this.willGrow = false;
        }
    }
    
    public void grow(){
        this.willGrow = true;
    }
    
    public boolean runsInto(Piece piece){
        for(Piece piece1 : this.pieces){
            if(piece1.getX() == piece.getX() && piece1.getY() == piece.getY()){
                return true;
            }
        }
        
        return false;
    }
    
    public boolean runsIntoItself(){
        for(Piece piece : this.pieces){
            for(Piece piece1 : this.pieces){
                if(piece == piece1){
                    continue;
                }
                
                if(piece.getX() == piece1.getX() && piece.getY() == piece1.getY()){
                    return true;
                }
            }
        }
        
        return false;
    }
    
}
