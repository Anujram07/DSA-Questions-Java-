// To find Wheter String is paloindrome or not  
public class String_2 {
    public static void main(String[] args) {
        String str = "mam";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}

    

