import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        num1(n);
        System.out.println();
        num2(n);
        System.out.println();
        num3(n);
        System.out.println();
        num4(n);
      sc.close();
    }
    public static void num1(int n){
         for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
             System.out.println();
         }
    }
    public static void num2(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
             System.out.println();
        }
    }
    public static void num3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
             System.out.println();
        }
    }
    public static void num4(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
             System.out.println();
        }
    }
}