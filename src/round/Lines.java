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
    
    /*
        Each matrix will have n rows, n columns and two diagonals as winningLines
        for a 'n' sized matrix to play tic-tac-toe. This functions returns a List
        of all those elements in each winning line.
    */
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
    
/*
    Each position will have a list of winning lines from where we mark. These possible
    winning lines are a subset of the above winningLines. AI needs this information
    to mark next move accordingly.
*/    
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

}
