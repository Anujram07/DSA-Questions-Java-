//intersection of two Array
 public class Array_6 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3};
        int[] arr2 = {3, 4};

        // Result array, maximum size = min(arr1.length, arr2.length)
        int[] intersection = new int[Math.min(arr1.length, arr2.length)];
        int k = 0; // index for intersection array

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    // Check if already added (to avoid duplicates)
                    boolean Added = false;
                    for (int m = 0; m < k; m++) {
                        if (intersection[m] == arr1[i]) {
                            Added = true;
                            break;
                        }
                    }
                    if (!Added) {
                        intersection[k++] = arr1[i];
                    }
                }
            }
        }

        // Print the intersection elements
        for (int i = 0; i < k; i++) {
            System.out.println(intersection[i]);
        }
    }
}
