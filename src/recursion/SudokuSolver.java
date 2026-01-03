package recursion;

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
        sudokuSolver(board,0,0);
        printBoard(board);
    }

    public static boolean sudokuSolver(char[][] board, int r, int c) {
        if (c == board.length) {
            c = 0;
            r++;
        }
        if (r == board.length) {

            return true;
        }
        if (board[r][c] == '.') {
            for (char i = '1'; i <= '9'; i++) {
                if (isSafe(board, r, c, i)) {
                    board[r][c]=i;
                    if(sudokuSolver(board,r,c+1)) return true;
                    board[r][c]='.';
                }
            }
            return false;
        } else {
            return sudokuSolver(board, r, c + 1);
        }
    }

    public static boolean isSafe(char[][] board, int row, int col, char num) {
        //checking row
        for (int c = 0; c < board.length - 1; c++) {
            if (board[row][c] == num) return false;
        }

        //checking col
        for (int r = 0; r < board.length; r++) {
            if (board[r][col] == num) return false;
        }
        //checking grid
        int gr = (row / 3) * 3;
        int gc = (col / 3) * 3;
        for (int r = gr; r < gr + 3; r++) {
            for (int c = gc; c < gc + 3; c++) {
                if (board[r][c] == num) return false;
            }
        }

        return true;
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print("\t" + board[i][j]);
            }
            System.out.println();
        }
    }
}
