class waveMatrix {
    public void wave_view(int[][] matrix) {
        // Get the size
        int row = matrix.length;
        int col = matrix[0].length;
        int i = 0, j = 0, c = 0;
        for (i = 0; i < col && c < col; ++i) {
            // Display top to bottom element
            for (j = 0; j < row; ++j) {
                System.out.print(" " + matrix[j][c]);
            }
            c++;
            // Display bottom to top element
            for (j = row - 1; j >= 0 && c < col; --j) {
                System.out.print(" " + matrix[j][c]);
            }
            c++;
        }
    }

    public static void main(String[] args) {
        waveMatrix obj = new waveMatrix();
        // Define matrix elements
        int[][] matrix = {
                { 60, 40, 39, 16, 15, 1 },
                { 58, 41, 38, 18, 14, 2 },
                { 55, 42, 37, 19, 13, 3 },

        };
        obj.wave_view(matrix);
    }
}
