//Removes duplicate from strings
public class String_3 {
    public static void main(String[] args) {
         String str = "DATA STRUCTURE";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println("Output: " + result); 
    }
}
