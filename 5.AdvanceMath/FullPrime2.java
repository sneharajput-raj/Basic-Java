import java.util.Scanner;

public class FullPrime2 {   //a num is full prime--> if a number and its all digits(individually) r prime
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factCount = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                factCount++;
            }
        }
        if(factCount == 2){
            boolean check = true;
            while(n > 0){
                int rem = n % 10;
                if(rem == 2 || rem == 3 || rem == 5 || rem == 7){
                    n = n/10;
                }
                else{
                    check = false;
                    break;
                }
            }
            if(check == true){
                 System.out.println(true);
            }
            else{
                 System.out.println(false);
            }
        }
        else{
            System.out.println(false);
        }
      sc.close();
    }
}
