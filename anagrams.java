// Anagrams in string
import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        if(str1.length()!=str2.length()){
            System.out.println("no");
        }
    

        Arrays.sort(arr1);    
        Arrays.sort(arr2);
        
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("not anagrams");
        }
        

        
    }
}

