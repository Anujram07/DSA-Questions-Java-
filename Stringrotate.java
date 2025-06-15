public class Stringrotate{
    public static boolean solve(String a, String b){
        if(a.length()==b.length()){
            return false;
          }  

          int length = a.length();
          String temp = a+a;

          for (int i = 0; i<=length;i++){
            boolean found = true;
            for (int j= 0; j < length; j++) {
                if(temp.charAt(i+j)!= b.charAt(j)){
                    found = false ;
                    break;
                }
                
            }
            if(found){
                return true;
            }
          }
return false;
     }










    public static void main(String[] args) {
        String a = "abcd";
        String b = "dcba";
        System.out.println(solve(a, b));
    }
}