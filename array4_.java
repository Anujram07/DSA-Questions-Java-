// to move all negative numbers at starting of an Array

import java.util.Scanner;

public class array4_ {
    public static void main(String[] args) {
         Scanner in  = new Scanner(System.in);
       System.out.println("Enter size of an array:-");
       int n = in.nextInt();
       int[] arr = new int[n];
       System.out.println("Enter elements of an Array:-");
       for (int i = 0; i < n; i++) {
           arr[i]=in.nextInt();
       }


       int j = 0;
       for (int i = 0; i < arr.length; i++) {
           if(arr[i]<0){
            if(i!=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
            j++;
           }
       }
       System.out.println("Edited Array");
        for (int k = 0; k < arr.length; k++) {
            
          System.out.println( +arr[k]);
      }

    }
}


