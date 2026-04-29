import java.util.Random;

public class TicTacToe7 {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static char computerSymbol = 'O';

    // Print Board
    static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Convert slot to row & column
    static int[] convertSlot(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    // Check if move is valid
    static boolean isValidMove(int row, int col) {
        return board[row][col] == '-';
    }

    // Computer random move
    static void computerMove() {
        Random rand = new Random();
        int slot;
        int row, col;

        while (true) {
            slot = rand.nextInt(9) + 1; // 1–9
            int[] pos = convertSlot(slot);
            row = pos[0];
            col = pos[1];

            if (isValidMove(row, col)) {
                board[row][col] = computerSymbol;
                System.out.println("Computer chose slot: " + slot);
                break;
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC7: Computer Move ===");

        printBoard();

        computerMove();

        System.out.println("\nAfter Computer Move:");
        printBoard();
    }
}