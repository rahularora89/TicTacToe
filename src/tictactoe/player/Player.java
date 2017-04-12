/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.player;

import java.util.Stack;

/**
 *
 * @author z001v9p
 */
public class Player {
    
    //Track playerMoves of each player
    private Stack<Integer> playerMoves;

    public Stack<Integer> getPlayerMoves() {
        return playerMoves;
    }

    public void setPlayerMoves(Stack<Integer> playerMoves) {
        this.playerMoves = playerMoves;
    }
    
    
}
