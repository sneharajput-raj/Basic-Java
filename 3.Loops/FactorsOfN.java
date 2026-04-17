import java.util.Scanner;

public class FactorsOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         
        printNoOfFactors(n);
        System.out.println();
        printAllFactors(n);
      sc.close();
    }
    public static void printNoOfFactors(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void printAllFactors(int n){
        for(int i=1; i<=n ; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }
}
