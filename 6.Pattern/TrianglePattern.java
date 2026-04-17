import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        triangle1(n);
        System.out.println();
        triangle2(n);
         System.out.println();
        triangle3(n);
         System.out.println();
        triangle4(n);
      sc.close();
    }
    public static void triangle1(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
             System.out.println();
        }
    }
    public static void triangle2(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
             System.out.println();
        }
    }
    public static void triangle3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
               System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
             System.out.println();
        }
    }
    public static void triangle4(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                 System.out.print("*");
            }
             System.out.println();
        }
    }
}
