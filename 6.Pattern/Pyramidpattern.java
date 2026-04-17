import java.util.Scanner;

public class Pyramidpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pyramid(n);
          System.out.println();
          System.out.println();
        reversePyramid(n);
          System.out.println();
          System.out.println();
        diamond(n);
          System.out.println();
          System.out.println();
        damru(n);
      sc.close();
    }
    public static void pyramid(int n){
        for(int i=1; i<=n; i++){            //row
            for(int j=1; j<=(n-i); j++){    //column -->space
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){    //star
                System.out.print("*");
            }
             System.out.println();
        }
    }
    public static void reversePyramid(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
             System.out.println();
        }
    }
    public static void diamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
             System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
             System.out.println();
        }
    }
    public static void damru(int n){
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
}
