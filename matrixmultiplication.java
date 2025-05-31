// matrix multiplication
public class matrixmultiplication {
    public static void main(String[] args) {
        int[][] mat1 = {{1,5,9},
                        {4,8,2},
                        {8,9,2}};
                        
        int[][] mat2 = {{1,0,0},
                        {5,7,4},
                        {3,8,7}};


        int [][] result =  new int[mat1.length][mat2[0].length];
        
        
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2[0].length; j++) {
                for (int k = 0; k < mat1[0].length; k++) {
                    result[i][j] += mat1[i][k]*mat2[k][j]; 
                     }
                }
           }
    

           for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]+" ");
                
            }
            System.out.println();

               
           }
        }
    }
