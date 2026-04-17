import java.util.Scanner;

public class SieveOfEratosthenes {   //it is an algo to find all primes nums upto N
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        countAllPrimeUptoN(n);
        printAllPrimeUptoN(n);
      sc.close();
    }
    public static void countAllPrimeUptoN(int n){
        int totalcount = 0;
        for(int i=1; i<=n; i++){
            int element = i;
            int count =  0;
            for(int j=1; j<=element; j++){
                if(element % j == 0){
                    count++;
                }
            }
            if(count == 2){
                totalcount++;
            }
        }
        System.out.println(totalcount);
    }
    public static void printAllPrimeUptoN(int n){
        for(int i=1; i<=n; i++){
            int element = i;
            int count = 0;
            for(int j=1; j<=element; j++){
                if(element % j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.print(element + " ");
            }
        }
    }
}
