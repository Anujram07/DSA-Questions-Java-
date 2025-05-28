// to rotate matrix by 90 degree
public class Rotatematrix90 {
    public static void main(String[] args) {
         int[][] mat = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int rows = mat.length;
        int cols = mat[0].length;

        int[][] trans = new int[cols][rows];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = mat[i][j];
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length/ 2; j++) {
                // Swap matrix[i][j] and matrix[i][n-1-j]
                int temp = mat[i][j];
                mat[i][j] = mat[i][mat.length - 1 - j];
                mat[i][mat.length - 1 - j] = temp;
            }
        }
         System.out.println("Rotated Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
