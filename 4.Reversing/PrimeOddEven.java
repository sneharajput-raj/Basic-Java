public class PrimeOddEven {
    public static void main(String[] args) {
        int n = 48075932;
       countAllInOne(n);
       reverseAllInOne(n);
    }
    public static void countAllInOne(int n){
        int pc = 0;
        int ec = 0;
        int oc = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == 2|| rem == 3 || rem == 5 || rem == 7){
                pc++;
            }
            if(rem % 2 == 0){
                ec++;
            }
            else{
                oc++;
            }
            n = n/10;
        }
        System.out.println(pc);
        System.out.println(ec);
        System.out.println(oc);
    }
    public static void reverseAllInOne(int n){
         int pr = 0;
         int er = 0;
         int or = 0;
         while(n > 0){
            int rem = n % 10;
            if(rem == 2|| rem == 3 || rem == 5 || rem == 7){
                pr = pr*10 + rem;
            }
            if(rem % 2 == 0){
                er = er*10 + rem;
            }
            else{
                or = or*10 + rem;
            }
            n = n/10;
         }
        System.out.println(pr);
        System.out.println(er);
        System.out.println(or);
    }
}
