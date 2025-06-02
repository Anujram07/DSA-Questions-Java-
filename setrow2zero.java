// set rows to zero
public class setrow2zero {
    public static void main(String[] args) {
        int[][] mat = {{1,2,1},
                       {3,0,7},
                       {4,8,9}};

        int rows = mat.length;
        int cols = mat[0].length;

        boolean[] rowzero = new boolean[rows];
        boolean[] colzero = new boolean[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(mat[i][j]==0){
                    rowzero[i] = true;
                    colzero[j] = true;
                }
            }
        }
         for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(rowzero[i] ||colzero[j] ){
                    mat[i][j]=0;
                }
            }
        }
         for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
         }
        }
    }
