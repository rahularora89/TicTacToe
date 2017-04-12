/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import player.Player;

/**
 *
 * @author z001v9p
 */
public class Game {
    
    private Boolean isCompleted;
    private Player playerWon;
    private String[][] inputMatrix;
    private Integer size;
    private Player player1;
    private Player player2;

    public Boolean getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Player getPlayerWon() {
        return playerWon;
    }

    public void setPlayerWon(Player playerWon) {
        this.playerWon = playerWon;
    }

    public String[][] getInputMatrix() {
        return inputMatrix;
    }

    public void setInputMatrix(String[][] inputMatrix) {
        this.inputMatrix = inputMatrix;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

}
