/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package round;

import player.Player;

/**
 *
 * @author z001v9p
 */
public class Round {

    /*
        If any of the winning lines are filled by either "O" or "X" completely
        then return true for current player else return false.
    */
    public Boolean playerWon(String[][] inputMatrix) {
        return false;
    }

    /*
        If all cells are occupied with either "O" or "X" and none of the 
        winning lines have one of them filled then return true else false.
    */
    public Boolean checkTie(String[][] inputMatrix) {
        return false;
    }

    //Update inputMatrix with Computer/AI move
    public void inputMove(String[][] inputMatrix) {

    }

    //Update user's move
    public void inputMove(int position) {

    }
    
    // Just to display the current board.
    public void displayBoard(int size) {
        String[][] matrix=new String[size][size];
	for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]);
                if(j<matrix.length-1)
                System.out.print(" | ");
            }
            System.out.println();
        }
        
    }
    
    /*
        Just a function to keep track of current player.
    */
    public void switchPlayer(Player currentPlayer){
        
    }
}
