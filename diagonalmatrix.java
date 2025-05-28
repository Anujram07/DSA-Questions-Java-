//to print diagonal of a matrix
public class diagonalmatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};

            System.err.println("Primary:-");
            for (int i = 0; i < mat.length; i++) {
                System.out.println(mat[i][i]+" ");
            }


            System.out.println("Secondry:-");
            for (int i = 0; i < mat.length; i++) {
                System.err.println(mat[i][mat.length-1-i]);
            }
    }
}
