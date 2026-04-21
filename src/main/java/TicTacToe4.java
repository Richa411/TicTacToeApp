import java.util.Scanner;

public class TicTacToe4 {

    static Scanner sc = new Scanner(System.in);

    // Position class
    static class Position {
        int row;
        int col;

        Position(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static int getPlayerMove() {
        System.out.print("Enter slot number (1-9): ");
        return sc.nextInt();
    }

    public static Position convertSlot(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        return new Position(row, col);
    }

    public static void main(String[] args) {

        System.out.println("=== Tic-Tac-Toe UC4 ===");

        int slot = getPlayerMove();

        Position pos = convertSlot(slot);

        System.out.println("Row Index: " + pos.row);
        System.out.println("Column Index: " + pos.col);
    }
}