/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import gameoflife.GameOfLifeBoard;
import java.util.Random;

/**
 *
 * @author Michele Gelvoleo
 */
public class PersonalBoard extends GameOfLifeBoard{
    private Random random;
    private calculateNumberOfLivingNeighbors calculate;
    
    public PersonalBoard(int width, int height){
        super(width, height);
        this.random = new Random();
        this.calculate = new calculateNumberOfLivingNeighbors();
    }
    
    @Override
    public void turnToLiving(int x, int y){
        if((x >= 0 && x < super.getWidth()) && (y >= 0 && y < super.getHeight())){
            super.getBoard()[x][y] = true;
        }
    }
    
    @Override
    public void turnToDead(int x, int y) {
        if(x >= 0 && x < super.getWidth() && y >= 0 && y < super.getHeight()){
            super.getBoard()[x][y] = false;
        }   
    }
  
    @Override
    public boolean isAlive(int x, int y) {
        if(x >= 0 && x < super.getWidth() && y >= 0 && y < super.getHeight()){
            if(super.getBoard()[x][y] == true){
                return true;
            }
        }
        return false;
    }

    @Override
    public void initiateRandomCells(double probabilityForEachCell) {
        for(int i = 0; i < super.getWidth(); i++){
            for(int j = 0; j < super.getHeight(); j++){
                double probability = random.nextDouble();
                if(probability <= probabilityForEachCell && probabilityForEachCell != 0){
                    super.getBoard()[i][j] = true;
                }else{
                    super.getBoard()[i][j] = false;
                }
            }
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int count = 0;
        if((x >= 0 && x < super.getWidth()) && (y >= 0 && y < super.getHeight())){
            int corners = calculate.corners(x, y, super.getBoard());
            int sides = calculate.sides(x, y, super.getBoard());
            int central = calculate.central(x, y, super.getBoard());
            count = corners + sides + central;
        }
        return count;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbors) {
        if(super.getBoard()[x][y] == true){
            if(livingNeighbors < 2){
                super.getBoard()[x][y] = false;
            }else if(livingNeighbors == 2 || livingNeighbors == 3){
                super.getBoard()[x][y] = true;
            }else if(livingNeighbors > 3){
                super.getBoard()[x][y] = false;
            }
        }else if(super.getBoard()[x][y] == false){
            if(livingNeighbors == 3){
                super.getBoard()[x][y] = true;
            }
        }
    }
}
