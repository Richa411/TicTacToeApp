public class TicTacToe6 {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {

        int row = 1;
        int col = 1;
        char symbol = 'X';

        // Place move only if valid (UC5 logic assumed true here)
        if (isValidMove(row, col)) {
            placeMove(row, col, symbol);
            System.out.println("Move placed successfully");
        } else {
            System.out.println("Invalid move! Cannot place symbol");
        }

        // Check output
        System.out.println("Updated Cell: " + board[row][col]);
    }

    // UC6: Place move on board
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Simple validation (from UC5 concept)
    static boolean isValidMove(int row, int col) {

        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}