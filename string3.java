// to convert string to integer

public class string3 {
    public static void main(String[] args) {
        String str = "45627";
        int n = 0;
        for(int i = 0; i<str.length();i++){
            n = n * 10 + (str.charAt(i) - '0');
        }
        System.out.println(n);
    }
}
