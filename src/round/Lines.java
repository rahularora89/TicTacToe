/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package round;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author z001v9p
 */
public class Lines {
    
    public List<List<String>> winningLines(int size){
        int[][] matrix=new int[size][size];
        List<List<String>> list=new ArrayList<>();
        for(int i=0;i<size;i++){
            List<String> row=new ArrayList<>();
            List<String> col=new ArrayList<>();
            for(int j=0;j<size;j++) {
                String r=String.valueOf(i)+String.valueOf(j);
                String c=String.valueOf(j)+String.valueOf(i);
                row.add(r);
                col.add(c);
            }
            list.add(row);
            list.add(col);
        }
    
        List<String> diag1=new ArrayList<>();
        List<String> diag2=new ArrayList<>();
        
        for(int i=0;i<size;i++) {
            String r=String.valueOf(i)+String.valueOf(i);
            diag1.add(r);
        }
        
        list.add(diag1);
        for(int i=0,j=size-1;i<size;i++,j--) {
            String r=String.valueOf(i)+String.valueOf(j);
            diag2.add(r);
        }
        list.add(diag2);

        return list;
}
    
public List<List<String>> possibleWinningLines(int size, String position){
    List<List<String>> list=new ArrayList<>();
    String[] rc = position.split("");
    int i = Integer.parseInt(rc[0]);
    int j = Integer.parseInt(rc[1]);
    if(i==0 && j==0){
        //find winninLines with this i & j
    } else if(i==0 && j==(size-1)){
        //find winninLines with this i & j
    } else if(i==size-1 && j==0){
        //find winninLines with this i & j
    } else if(i==size-1 && j==size-1){
        //find winninLines with this i & j
    } else{
        //find winninLines with this i & j
    }
    return list;
}

public void diplayTicTacToe(int size){
    int[][] matrix=new int[size][size];
    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
                System.out.print(matrix[i][j]);
                if(j<size-1)
                System.out.print(" | ");
        }
        System.out.println();
    }
}

}
