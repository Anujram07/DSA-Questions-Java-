// Union of two Array
public class Array_5 {
       public static void main(String[] args) {
        int[] arr1={1,2,};
        int[] arr2={3,4,4};
        int[] arr3= new int[arr1.length + arr2.length];

        int k = 0;
        for(int i=0;i<arr1.length;i++)
        {
             arr3[i]=arr1[i];
        }

        for(int i=0;i<arr1.length;i++)
        {
             arr3[arr1.length+i]=arr2[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    // Check if already added (to avoid duplicates)
                    boolean Added = false;
                    for (int m = 0; m < k; m++) {
                        if (arr3[m] == arr1[i]) {
                            Added = true;
                            break;
                        }
                    }
                    if (!Added) {
                        arr3[k++] = arr1[i];
                    }
                }
            }
        }
        System.out.println("Union of Two array is:-");
        for ( int i=0;i<arr1.length+arr2.length;i++)
        System.out.println(arr3[i]);
    }
}
