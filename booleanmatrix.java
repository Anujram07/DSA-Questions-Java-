// boolean matrix
public class booleanmatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 1, 0}
        };

       int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] rowFlags = new boolean[rows];
        boolean[] colFlags = new boolean[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    rowFlags[i] = true;
                    colFlags[j] = true;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowFlags[i] || colFlags[j]) {
                    matrix[i][j] = 1;
                }
            }
        }
         for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
 }

