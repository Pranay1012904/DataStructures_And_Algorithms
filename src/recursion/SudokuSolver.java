package recursion;

import java.util.Arrays;

public class SudokuSolver {

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '.', '.', '.', '.', '3'},
                {'4', '.', '.', '.', '.', '.', '.', '.', '1'},
                {'7', '.', '.', '.', '.', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '.'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}

        };
        sudoKuSolver(board, 0, 0);
        //printBoard(board);

    }

    public static boolean sudoKuSolver(char[][] board, int row, int col) {

        if (col == board[0].length-1) {
            col = 0;
            row++;
        }
        if (row == board.length){
            printBoard(board);
            return true;
        }

        if (board[row][col] == '.') {
            for (char num = '1'; num <= '9'; num++) {
                if (isSafe(board, row, col, num)) {
                    board[row][col] = num;
                    if (sudoKuSolver(board, row, col + 1)) return true;
                    board[row][col] = '.';
                }
            }
            return false;
        } else return sudoKuSolver(board, row, col + 1);
    }


    private static boolean isSafe(char[][] board, int row, int col, char num) {
        //check column
        for (int c = 0; c < board.length; c++) {
            if (board[row][c] == num) return false;
        }
        //check row
        for (int r = 0; r < board.length; r++) {
            if (board[r][col] == num) return false;
        }
        //check grid
        int gr = (row / 3) * 3;
        int gc = (col / 3) * 3;
        for (int r = gr; r < gr + 3; r++) {
            for (int c = gc; c < gc + 3; c++) {
                if (board[r][c] == num)
                    return false;
            }
        }
        return true;
    }

    private static void printBoard(char[][] board) {
        System.out.println("----------------------------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
