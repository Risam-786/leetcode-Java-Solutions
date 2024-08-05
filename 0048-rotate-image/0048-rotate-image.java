class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // Start from i+1 to avoid swapping twice
                trans(matrix, i, j);
            }
        }
        // Reverse each row
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n - 1;
            while (start < end) {
                swap(matrix, i, start, end);
                start++;
                end--;
            }
        }
    }

    private void trans(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    private void swap(int[][] matrix, int i, int start, int end) {
        int temp = matrix[i][start];
        matrix[i][start] = matrix[i][end];
        matrix[i][end] = temp;
    }
}