import java.util.*;
public class Armstrongno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int sum = 0;
        int dc = 0;
        int dummy = n;
        int copy = n;
        while(n > 0){
            dc++;
             n = n/10;
        }
        while(dummy > 0){
            int rem = dummy % 10;
            sum = sum + (int)Math.pow(rem , dc);
            dummy = dummy/10;
        }
        if(sum == copy){
            System.out.println("Armstrong Number");
        }
        else{
             System.out.println("Not a Armstrong Number");
        }
     sc.close();
    }
}
