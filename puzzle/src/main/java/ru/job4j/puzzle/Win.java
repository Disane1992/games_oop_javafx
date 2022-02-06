package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && checkCell(board, i) || checkRow(board, i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkCell(int[][] board, int cell) {
        for (int i = 0; i < board.length; i++) {
            if (board[cell][i] != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkRow(int[][] board, int row) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][row] != 1) {
                return false;
            }
        }
        return true;
    }
}
