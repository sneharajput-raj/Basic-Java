public class GCD {
    public static void main(String[] args) {
        int a = 125;
        int b = 75;
        int gcd = -1;
        int min = Math.min(a,b);
        for(int i=min; i>=1; i--){
            if(a % i == 0 && b % i == 0){
                  gcd = i;
                  break;
            }
        }
        System.out.println(gcd);
    }
}
