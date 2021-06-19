package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.gui.Updatable;

import wormgame.domain.Worm;
import wormgame.domain.Apple;
import wormgame.domain.Piece;

import java.util.*;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    
    private Worm worm;
    private Apple apple;
    private Random random;
    

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;
        
        this.random = new Random();

        addActionListener(this);
        setInitialDelay(2000);

        this.worm = new Worm(width/2, height/2, Direction.DOWN);
        this.apple = new Apple(this.random.nextInt(width), this.random.nextInt(height));
        
        while(true){
            this.apple.setXY(this.random.nextInt(width), this.random.nextInt(height));
            if(!this.worm.runsInto(apple)){
                break;
            }
        }
    }


    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    
    public Worm getWorm(){
        return this.worm;
    }
    
    public void setWorm(Worm worm){
        this.worm = worm;
    }
    
    public Apple getApple(){
        return this.apple;
    }
    
    public void setApple(Apple apple){
        this.apple = apple;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        
        this.worm.move();
        
        if(this.worm.runsInto(apple)){
            this.worm.grow();
            
            while(true){
                this.apple.setXY(this.random.nextInt(width), this.random.nextInt(height));
                if(!this.worm.runsInto(apple)){
                    break;
                }
            }
        }
        
        if(this.worm.runsIntoItself()){
            this.continues = false;
        }
        
        for(Piece piece : this.worm.getPieces()){
            if(piece.getX() >= this.width || piece.getX() <= 0 || piece.getY() >= height || piece.getY() <= 0){
                this.continues = false;
            }
        }
        
        this.updatable.update();
        this.setDelay(1000 / worm.getLength());

    }

}
