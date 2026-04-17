
import java.util.Scanner;

public class PatternFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        squarePattern(n);
        System.out.println();
        trianglePattern(n);
        System.out.println();
        binaryPattern(n);
        System.out.println();
        numberPattern(n);
        System.out.println();
        alphabetPattern(n);
        System.out.println();
        floydsTrianglePattern(n);
        System.out.println();
        hollowPattern(n);
        System.out.println();
        diamondPattern(n);
        System.out.println();
        mountainPattern(n);
        System.out.println();
        damruPattern(n);
        System.out.println();
        numPattern(n);
        System.out.println();
        mPattern(n);
        System.out.println();
        hollowTrianglePattern(n);
      sc.close(); 
    }
    public static void  squarePattern(int n){
           for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void trianglePattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void binaryPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i % 2 == 0){
                    if(j % 2 == 0){
                        System.out.print(1);
                    }
                    else{
                        System.out.print(0);
                    }
                }
                else{
                    if(j % 2 == 0){
                        System.out.print(0);
                    }
                    else{
                        System.out.print(1);
                    }
                }
            }
            System.out.println();
        }
    }
    public static void  numberPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void alphabetPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                char ch = (char)('A' + i-1);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void floydsTrianglePattern(int n){
        int k=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
               System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
    public static void hollowPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i == 1 || i == n){
                    System.out.print("*");
                }
                else{
                    if(j == 1 || j == n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void diamondPattern(int n){
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
         for(int i=2; i<=n; i++){
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
    public static void mountainPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void damruPattern(int n){
          for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void numPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void mPattern(int n){
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
    }
    public static void hollowTrianglePattern(int n){
        for(int i=1; i<=n; i++){
           for(int j=1; j<=n-i; j++){
                 System.out.print(" ");
           }
           for(int j=1; j<=i; j++){
               if(j==1 || j==i || i==n){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
    }
}
