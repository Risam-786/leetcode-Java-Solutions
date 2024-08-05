class Solution {
    public boolean solve(char[][] board, int n, int m, int row, int col, String word, int i) {
        if (i == word.length()) {
            return true;
        }
        if (row < 0 || col < 0 || row >= n || col >= m || board[row][col] != word.charAt(i)) {
            return false;
        }
        char temp = board[row][col];
        board[row][col] = '*';
        boolean res = solve(board, n, m, row - 1, col, word, i + 1) ||
                      solve(board, n, m, row, col - 1, word, i + 1) ||
                      solve(board, n, m, row + 1, col, word, i + 1) ||
                      solve(board, n, m, row, col + 1, word, i + 1);
        board[row][col] = temp;
        return res;
    }

    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (solve(board, n, m, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
