//https://leetcode.com/problems/valid-sudoku/submissions/986738279/
class Solution {
    // ... existing code ...

    public boolean isValidSudoku(char[][] board) {
        // Check rows
        for (int row = 0; row < board.length; row++) {
            if (!isValidRow(board, row)) {
                return false;
            }
        }

        // Check columns
        for (int col = 0; col < board.length; col++) {
            if (!isValidColumn(board, col)) {
                return false;
            }
        }

        // Check subgrids
        for (int row = 0; row < board.length; row += 3) {
            for (int col = 0; col < board.length; col += 3) {
                if (!isValidSubgrid(board, row, col)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isValidRow(char[][] board, int row) {
        boolean[] used = new boolean[10];
        for (int col = 0; col < board.length; col++) {
            char cell = board[row][col];
            if (cell != '.') {
                int number = cell - '0';
                if (used[number]) {
                    return false;
                }
                used[number] = true;
            }
        }
        return true;
    }

    private boolean isValidColumn(char[][] board, int col) {
        boolean[] used = new boolean[10];
        for (int row = 0; row < board.length; row++) {
            char cell = board[row][col];
            if (cell != '.') {
                int number = cell - '0';
                if (used[number]) {
                    return false;
                }
                used[number] = true;
            }
        }
        return true;
    }

    private boolean isValidSubgrid(char[][] board, int startRow, int startCol) {
        boolean[] used = new boolean[10];
        for (int row = startRow; row < startRow + 3; row++) {
            for (int col = startCol; col < startCol + 3; col++) {
                char cell = board[row][col];
                if (cell != '.') {
                    int number = cell - '0';
                    if (used[number]) {
                        return false;
                    }
                    used[number] = true;
                }
            }
        }
        return true;
    }
}