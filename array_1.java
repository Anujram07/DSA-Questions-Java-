import java.util.Scanner;
public class array_1{
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


              int  max = 0;
            for(int i = 0; i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    max=arr[i];
                }

            else{
                max=arr[i+1];
            }
       }
            System.out.println("maximum:-"+max);


    int min = 1;
    for(int j=0;j<arr.length-1;j++){
      if(arr[j]<arr[j+1]){
        min = arr[j];
      }
    }
    System.out.println("minimum:-"+min);
    }
}
