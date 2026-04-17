public class IntegerReverse {
    public static void main(String[] args) {
        int n = 9543072;
       integerReverse(n);
       countNoOfDigits(n);
       primeReverse(n);
    }
    public static void integerReverse(int n){
         int rev = 0;
        while(n > 0){
            int rem = n % 10;
            rev = rev*10 +rem;
            n = n/10;
        }
        System.out.println(rev);
    }
    public static void countNoOfDigits(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n/10;
        }
        System.out.println(count);
    }
    public static void primeReverse(int n){
        int primeRev = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == 2 || rem == 3 || rem == 5 || rem == 7){
                primeRev = primeRev*10 + rem;
            }
            n = n/10;
        }
        System.out.println(primeRev);
    }
}
