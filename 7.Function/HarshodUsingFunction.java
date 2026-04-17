import java.util.Scanner;

public class HarshodUsingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(harshodNo(n) == true){
            System.out.print("Harshad Number");
        }
        else{
             System.out.print("Not Harshad Number");
        }
      sc.close();
    }
    public static boolean harshodNo(int n){
        int dummy = n; 
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum = sum + rem;
            n = n/10;
        }
        if(dummy % sum == 0) return true;
        return false;
    }
}
