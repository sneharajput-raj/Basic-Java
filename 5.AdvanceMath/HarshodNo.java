import java.util.Scanner;

public class HarshodNo {       //when the no. is divisible by its digits sum
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dummy = n;
         int sum = 0;
         while(n > 0){
            int rem = n % 10;
            sum = sum + rem;
            n = n/10;
         }
         if(dummy % sum == 0){
            System.out.println("Harshod Number");
         }
         else{
            System.out.println("Not a Harshod Number");
         }
      sc.close();
    }
}
