/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Michele Gelvoleo
 */
public class calculateNumberOfLivingNeighbors {
    public int corners(int x, int y, boolean[][] table){
        int count = 0;
       if (x == 0 && y == 0) {
            if (table[x][y + 1] == true) {
                count++;
            }
            if (table[x + 1][y] == true) {
                count++;
            }
            if (table[x + 1][y + 1] == true) {
                count++;
            }
        } else if (x == table.length - 1 && y == table[x].length - 1) {
            if (table[x][y - 1] == true) {
                count++;
            }
            if (table[x - 1][y] == true) {
                count++;
            }
            if (table[x - 1][y - 1] == true) {
                count++;
            }
        } else if (x == 0 && y == table[x].length - 1) {
            if (table[x][y - 1] == true) {
                count++;
            }
            if (table[x + 1][y] == true) {
                count++;
            }
            if (table[x + 1][y - 1] == true) {
                count++;
            }
        } else if (x == table.length - 1 && y == 0) {
            if (table[x][y + 1] == true) {
                count++;
            }
            if (table[x - 1][y] == true) {
                count++;
            }
            if (table[x - 1][y + 1] == true) {
                count++;
            }
        }
        return count;
    }
    
    public int sides(int x, int y, boolean[][] table){
        int count = 0;
        if(y > 0 && y < table[x].length - 1){
            if(x == 0){
                if(table[x][y - 1] == true){
                    count++;
                }
                if(table[x + 1][y + 1] == true){
                    count++;
                }
                if(table[x + 1][y] == true){
                    count++;
                } 
                if(table[x + 1][y + 1] == true){
                    count++;
                }
                if(table[x][y + 1] == true){
                    count++;
                }
            }else if(x == table.length - 1){
                if(table[x - 1][y - 1] == true){
                    count++;
                }
                if(table[x][y - 1] == true){
                    count++;
                }
                if(table[x - 1][y] == true){
                    count++;
                }
                if(table[x - 1][y + 1] == true){
                    count++;
                }
                if(table[x][y + 1] == true){
                    count++;
                }
            }
        }else if(x > 0 && x < table.length - 1){
            if(y == 0){
                if(table[x - 1][y] == true){
                    count++;
                }
                if(table[x - 1][y + 1] == true){
                    count++;
                }
                if(table[x][y + 1] == true){
                    count++;
                }
                if(table[x + 1][y] == true){
                    count++;
                }
                if(table[x + 1][y + 1] == true){
                    count++;
                }
            }else if(y == table[x].length - 1){
                if(table[x - 1][y - 1] == true){
                    count++;
                }
                if(table[x - 1][y] == true){
                    count++;
                }
                if(table[x][y - 1] == true){
                    count++;
                }
                if(table[x + 1][y - 1] == true){
                    count++;
                }
                if(table[x + 1][y] == true){
                    count++;
                }
            }
        }
        return count;
    }
    
    public int central(int x, int y, boolean[][] table){
        int count = 0;
        if((x > 0 && x < table.length - 1) && (y > 0 && y < table[x].length - 1)){
            if(table[x - 1][y - 1] == true){
                count++;
            }
            if(table[x][y - 1] == true){
                count++;
            }
            if(table[x + 1][y - 1] == true){
                count++;
            }
            if(table[x - 1][y] == true){
                count++;
            }
            if(table[x + 1][y] == true){
                count++;
            }
            if(table[x - 1][y + 1] == true){
                count++;
            }
            if(table[x][y + 1] == true){
                count++;
            }
            if(table[x + 1][y + 1] == true){
                count++;
            }
        }
        
        return count;
    }
}
