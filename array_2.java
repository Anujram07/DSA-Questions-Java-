
import java.util.Scanner;

public class array_2 {
    public static void main(String[] args) {
       Scanner in  = new Scanner(System.in);
       System.out.println("Enter size of an array:-");
       int n = in.nextInt();
       int[] arr = new int[n];
       System.out.println("Enter elements of an Array:-");
       for (int i = 0; i < n; i++) {
           arr[i]=in.nextInt();
       }


       for(int i=arr.length-1;i>=0;i--){
        System.out.println("Reversed Array:-"+arr[i]);
       }
    }
}
