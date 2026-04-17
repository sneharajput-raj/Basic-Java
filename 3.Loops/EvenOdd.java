import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         printEOuptoN(n);             //print all even/odd upto N
         System.out.println();
         sumOfEOuptoN(n);             //sum of all even/odd nos. upto N
        sc.close();
    }
    public static void printEOuptoN(int n){
         for(int i=2; i<=n; i=i+2){        //even
            System.out.print(i + " ");
         }
    }
    public static void  sumOfEOuptoN(int n){
        int sum = 0;                       //odd
        for(int i=1; i<=n; i=i+2){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
