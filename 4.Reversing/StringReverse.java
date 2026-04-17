public class StringReverse {
    public static void main(String[] args) {
        String s = "Thank God";
        int n = s.length();
        String rev = "";
        
        for(int i=n-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }
        System.out.print(rev);
    }
}
