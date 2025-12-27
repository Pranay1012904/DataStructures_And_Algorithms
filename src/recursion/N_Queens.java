package recursion;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class N_Queens {

    public static void main(String[] args) {
        int n=4;
        int[][] board=new int[n][n];
        nQueens(board,0);
    }

    public static void nQueens(int[][] board, int row) {
        if (row == board.length) {
            printNQueen(board);
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=1;
                nQueens(board,row+1);
                board[row][col]=0;
            }
        }
    }

    public static boolean isSafe(int[][] board, int row, int col) {
        //check vertically
        for (int r = row; r >= 0; r--) {
            if (board[r][col] == 1) return false;
        }
        //check positive vertical

        for (int r = row, c = col; r >= 0 && c >= 0; r--,c--) {

            if(board[r][c]==1) return false;
        }
        //check digonal negetive
        for(int r=row, c=col ; r>=0&& c<board.length; r--,c++){
            if(board[r][c]==1) return false;
        }
        return true;
    }

    public static void printNQueen(int[][] board){
        System.out.println("---------------------------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
