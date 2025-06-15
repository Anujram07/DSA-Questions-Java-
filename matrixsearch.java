public class matrixsearch {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {
            int current = matrix[row][col];
            if (current == target) {
                System.out.println("Element found at (" + row + ", " + col + ")");
                return true;
            } else if (current > target) {
                col--; 
            } else {
                row++; 
            }
        }

        System.out.println("Element not found");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int target = 10;
        searchMatrix(matrix, target);
    }
}

