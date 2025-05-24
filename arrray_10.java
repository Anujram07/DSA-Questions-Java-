// number of times Elements Repeates in an array
import java.util.Scanner;

public class arrray_10 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,4,1,3,2};
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter a number:-");
        int n = in.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n){
                count++;
            }
        }

        System.out.println(n+" "+"Repeates"+" "+count+" "+"times");
    }
}
