import java.util.Scanner;

public class functionCreate {
    public static void main(String[] args) {
        //in java function is called a method
        //a method is a block of code that performs a specific task and runs only when we call it
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
        System.out.println(tribonnaci(n));
        System.out.println(checkPrime(n));
      sc.close();
    }
    public static int fibonacci(int n){
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
    public static int tribonnaci(int n){
        if(n == 0 || n == 1) return n; 
        if(n == 2) return 1;
        int a = 0;
        int b = 1; 
        int c = 1; 
        int sum = 0;
        for(int i=3; i<=n; i++){
            sum = a+b+c;
            a = b;
            b = c; 
            c = sum;
        }
        return sum;
    }
    public static boolean checkPrime(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0) count++;
        }
        if(count == 2) return true;
        return false;
    }
}
