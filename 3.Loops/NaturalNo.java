import java.util.Scanner;

public class NaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNnoOfInteger(n);
        System.out.println();
        sumNnoOfInteger(n);
     sc.close();
    }
    public static void printNnoOfInteger(int n){
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
    public static void sumNnoOfInteger(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
