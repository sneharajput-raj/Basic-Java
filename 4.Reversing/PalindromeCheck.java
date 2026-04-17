public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "naman";
        int n = 121;
        stringPalindrome(s);
        numberPalindrome(n);
    }
    public static void stringPalindrome(String s){
        int n = s.length();
        String rev = "";
        for(int i=n-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
             System.out.println("Not Palindrome");
        }
    }
    public static void numberPalindrome(int n){
        int rev = 0;
        int dummy = n;
        while(n > 0){
            int rem = n % 10;
            rev = rev*10 + rem;
            n = n/10;
        }
        if(dummy == rev){
             System.out.println(true);
        }
        else{
             System.out.println(false);
        }
    }
}
