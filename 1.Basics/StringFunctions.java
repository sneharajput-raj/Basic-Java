public class StringFunctions {
    public static void main(String[] args) {
        String s = "Think Positive";
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.charAt(8));
        System.out.println(s.replace("i" , "U"));
        System.out.println(s.contains("ink Po"));
        System.out.println(s.substring(3,9));

        String s1 = "   Be Patience   ";
        System.out.println(s1.trim());

        String a = "Java";
        String b = new String("Java");   
        System.out.println(a == b);        //false
        System.out.println(a.equals(b));   //true


        System.out.println(swapFirstLast(s));
    }
    public static String swapFirstLast(String s){
        char c1 = s.charAt(0);
        char c2 = s.charAt(s.length() -1);
        String ans = c2 + s.substring(1 , s.length()-1) + c1;
        return ans; 
   }
}
