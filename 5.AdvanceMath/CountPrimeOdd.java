import java.util.Scanner;

public class CountPrimeOdd {  //count no. of digits which are prime as well as odd
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == 3 || rem == 5 || rem == 7){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
      sc.close();
    }
}
