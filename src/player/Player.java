/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import java.util.Stack;

/**
 *
 * @author z001v9p
 */
public class Player {
    
    //Track playerMoves of each player
    private Stack<Integer> playerMoves;
    
    private Boolean isComputer;

    public Stack<Integer> getPlayerMoves() {
        return playerMoves;
    }

    public void setPlayerMoves(Stack<Integer> playerMoves) {
        this.playerMoves = playerMoves;
    }

    public Boolean getIsComputer() {
        return isComputer;
    }

    public void setIsComputer(Boolean isComputer) {
        this.isComputer = isComputer;
    }
    
    
}
