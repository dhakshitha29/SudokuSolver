package game;
import board.Board;
import player.Player;

public class Game {
    Board b;
    Player p;

    public Game(Board b,Player p){
        this.b=b;
        this.p=p;
    }

    private boolean validNum(int[][] m,int row,int col,int val){
        for(int i=0;i<9;i++){
            if(m[row][i] == val) return false; 
        }

        for(int i=0;i<9;i++){
            if(m[i][col] == val ) return false;
        }
        int tempr=row/3*3;
        int tempc=col/3*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(m[tempr+i][tempc+j] == val) return false;
            }
        }
        return true;
    }

    public void solveSudoku(int row,int col){
        if(row == 9){
            System.out.println("Solved Sudoku :");
            b.printBoard();
            return;
        }
        int nrow=0,ncol=0;
        if(col == 8){
            nrow=row+1;
            ncol=0;
        }else{
            nrow=row;
            ncol=col+1;
        }

        if(b.matrix[row][col]!=0){
            solveSudoku(nrow, ncol);
        }else{
            for(int i=1;i<=9;i++){
                if(validNum(b.matrix,row,col,i)){
                    b.matrix[row][col]=i;
                    solveSudoku(nrow, ncol);
                    b.matrix[row][col]=0;
                }
            }
        }
    }

    public void play(){
        solveSudoku(0,0);
    }
}
