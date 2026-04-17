import java.util.Scanner;

public class FullPrime1 {    //a num is full prime -->if all its digits(individually) are prime -->235 is prime as 2,3,5 all r prime
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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
      sc.close();
    }
}
