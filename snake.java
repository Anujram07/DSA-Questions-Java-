// snake pattern printing
public class snake {
   public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4,13},
            {5, 6, 7, 8,14},
            {9, 10, 11, 12,15}
        };
        System.out.println("Snake Pattern Output:");
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                // Left to Right
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
     }
}
