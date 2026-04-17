import java.util.Scanner;

public class AlphabetPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        alpha1(n);
        System.out.println();
        alpha2(n);
        System.out.println();
        alpha3(n);
        System.out.println();
        alpha4(n);
      sc.close();
    }
    public static void alpha1(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                char ch = (char)('A' + i-1);
                System.out.print(ch);
            }
             System.out.println();
        }
    }
    public static void alpha2(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                char ch = (char)('A' + i-1);
                System.out.print(ch);
            }
             System.out.println();
        }
    }
    public static void alpha3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                char ch = (char)('A' + j-1);
                System.out.print(ch);
            }
             System.out.println();
        }
    }
    public static void alpha4(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                char ch = (char)('A' + j-1);
                System.out.print(ch);
            }
             System.out.println();
        }
    }
}
