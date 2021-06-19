/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.*;
import javax.swing.JPanel;
import wormgame.game.WormGame;
import wormgame.domain.Piece;
import wormgame.domain.Apple;

/**
 *
 * @author Michele Gelvoleo
 */
public class DrawingBoard extends JPanel implements Updatable{
    private WormGame wg;
    private int pieceLength;
    
    public DrawingBoard(WormGame wg, int pieceLength){
        this.wg = wg;
        this.pieceLength = pieceLength;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.BLACK);
        for(Piece piece : this.wg.getWorm().getPieces()){
            g.fill3DRect(piece.getX()*this.pieceLength, piece.getY()*this.pieceLength, this.pieceLength, this.pieceLength, true);
        }
        
        g.setColor(Color.RED);
        Apple apple = this.wg.getApple();
        g.fillOval(apple.getX()*this.pieceLength, apple.getY()*this.pieceLength, this.pieceLength, this.pieceLength);
        
    }

    @Override
    public void update() {
       super.repaint();
    }
}
