import java.util.Scanner;

public class HollowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        starHollow(n);
        System.out.println();
        numberHollow(n);
      sc.close();
    }
    public static void starHollow(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i == 1 || i == n){
                    System.out.print("*");
                }
                else{
                    if(j==1 || j==n){
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
    public static void numberHollow(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n){
                    System.out.print(n);
                }
                else{
                    if(j==1 || j==n){
                        System.out.print(n);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
