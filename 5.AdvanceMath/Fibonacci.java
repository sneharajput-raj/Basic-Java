import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacciNoAtN(n));
        fibonacciSeriesUptoN(n);
    sc.close();
    }
    public static int fibonacciNoAtN(int n){
        if(n == 0 || n == 1) return n;
           int a = 0;
           int b = 1;
           int sum = 0;
           for(int i=2; i<=n; i++){
            sum = a+b;
            a = b;
            b = sum;
        }
           return sum;
    }
    public static void fibonacciSeriesUptoN(int n){
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i=0; i<=n; i++){
            System.out.print(a + " ");
            sum = a+b;
            a = b;
            b = sum;
        }
    }
}
