package board;

import java.util.List;

import triple.Triple;

public class Board {
    public int[][] matrix=new int[9][9];
    public void printBoard(){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void setUpBoardConfig(int row,int col,int val){
        this.matrix[row][col]=val;
    }

    public void setColumnWiseVlaues(int row,List<Integer> col,List<Integer> val){
        for(int i=0;i<col.size();i++){
            this.matrix[row][col.get(i)]=val.get(i);
        }
    }

    public void setUpBoard(List<Triple> triple){
        for(int i=0;i<triple.size();i++){
            matrix[triple.get(i).row][triple.get(i).col]=triple.get(i).val;
        }
    }
}
