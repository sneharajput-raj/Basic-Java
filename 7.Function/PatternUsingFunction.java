import java.util.Scanner;

public class PatternUsingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printRow(n);
      sc.close();
    }
    public static void printRow(int n){
        if(n == 0) return;
        printCol(n);
        System.out.println();
        printRow(n-1);
    }
    public static void printCol(int n){
        if(n == 0) return; 
        System.out.print("*");
        printCol(n-1);
    }
}
