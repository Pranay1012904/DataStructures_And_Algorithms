package recursion;

public class SudokuSolver_2 {

    public static void main(String[] args) {
        char[][] board = {
                {'9', '1', '.', '.', '.', '.', '.', '7', '.'},
                {'.', '.', '.', '8', '3', '.', '.', '.', '.'},
                {'3', '5', '.', '.', '.', '1', '.', '9', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '5', '4'},
                {'7', '.', '4', '5', '8', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '8', '.', '.'},
                {'.', '6', '5', '.', '.', '.', '.', '.', '3'},
                {'8', '.', '.', '.', '9', '.', '.', '.', '5'},
                {'.', '.', '.', '.', '1', '.', '7', '.', '.'}

        };

        sudokuSolver(board,0,0);
        printBoard(board);
    }

    public static boolean sudokuSolver(char[][] board, int row,int col){
        if(col==board.length){
            col=0;row++;
        }
        if(row== board.length){
//            printBoard(board);
            return true;
        }

        if(board[row][col]=='.'){
            for(char i='1';i<='9';i++){
                if(isSafe(board,row,col,i)){
                    board[row][col]=i;
                    if(sudokuSolver(board,row,col+1)) return true;
                    board[row][col]='.';
                }
            }
            return false;
        }return sudokuSolver(board,row, col+1);
    }

    public static boolean isSafe(char[][] board, int row, int col, int num) {
        //vertical check
        for (int c = 0; c < board.length; c++) {
            if (board[row][c] == num) return false;
        }

        //horizantal check
        for (int r = 0; r < board.length; r++) {
            if (board[r][col] == num) return false;
        }

        //grid check
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
