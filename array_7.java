// To rotate an array circularly by one 

import java.util.Scanner;
public class array_7 {
    public static void main(String[] args) {
         Scanner in  = new Scanner(System.in);
       System.out.println("Enter size of an array:-");
       int n = in.nextInt();
       int[] arr = new int[n];
       System.out.println("Enter elements of an Array:-");
       for (int i = 0; i < n; i++) {
           arr[i]=in.nextInt();
       }
       int last = arr[n-1];
       for( int i=n-1;i>0;i--){
        arr[i] = arr[i-1];
       }
       arr[0] =last;

       System.out.println("Rotated Array:-");
      for (int num : arr) {
            System.out.print(num + " ");
       }
    }
}
