import java.util.Scanner;

public class Tribonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(triboNoAtN(n));
        triboSeriesUptoN(n);
      sc.close();
    }
    public static int triboNoAtN(int n){
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
            b = sum;
        }
        return sum;
    }
    public static void triboSeriesUptoN(int n){
        int a = 0;
        int b = 1;
        int c = 1;
        int sum = 0;
        for(int i=0; i<=n; i++){
            System.out.print(a + " ");
            sum = a+b+c;
            a = b;
            b = c;
            c = sum;
        }
    }
}
