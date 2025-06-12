import java.util.Scanner;

public class array_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of Array:");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter values of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // Initialize min and max to the first element
        int max = arr[0];
        int min = arr[0];

        // Traverse the array to find max and min
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}

