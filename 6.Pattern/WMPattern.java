import java.util.Scanner;

public class WMPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Wpattern(n);
        System.out.println();
        System.out.println();
        Mpattern(n);
        System.out.println();
        System.out.println();
        combo1(n);
        System.out.println();
        System.out.println();
        combo2(n);
      sc.close();
    }
    public static void Wpattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){     //star
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){   //space
                 System.out.print(" ");     
            }
            for(int j=1; j<=i; j++){      //star
                 System.out.print("*");
            }
             System.out.println();
        }
    }
    public static void Mpattern(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){     //star
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){   //space
                 System.out.print(" ");     
            }
            for(int j=1; j<=i; j++){      //star
                 System.out.print("*");
            }
             System.out.println();
        }
    }
    public static void combo1(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
             for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void combo2(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++){
             for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
