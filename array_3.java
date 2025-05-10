// to find kth min  and max number

import java.util.Scanner;

public class array_3 {
        public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
               System.out.println("Enter size of Array:");
               int n=in.nextInt();
               int[] arr=new int[n];
               System.out.println("enter value of array");
               for(int i=0;i<n;i++)
               {
                arr[i]=in.nextInt();
               }

               System.out.println("Enter value of K:-");
              int k = in.nextInt();
              for (int i = 0; i < arr.length-1; i++) {
                for (int j = 0; j < arr.length-i-1; j++) {
                    if(arr[j]>arr[j+1]){
                       int temp = arr[j];
                       arr[j]=arr[j+1];
                       arr[j+1]=temp;
                    }
                }
            }



             System.out.println("Kth minimum:-" + arr[k-1]);
             System.out.println("Kth maximum:-" + arr[arr.length-k]);

    }



}
