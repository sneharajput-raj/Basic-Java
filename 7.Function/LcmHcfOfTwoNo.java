import java.util.Scanner;

public class LcmHcfOfTwoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(hcf(a,b));
        System.out.println(lcm(a,b));
        sc.close();
    }
    public static int hcf(int a , int b){
        int min = Math.min(a,b);
        int hcf = 1;
        for(int i=min; i>=1; i--){
            if(a % i == 0 && b % i == 0){
                hcf = i;
                break;
            }
        }
        return hcf;
    }
    public static int lcm(int a , int b){
        int max = Math.max(a,b);
        while (max <= a*b) {
            if(max % a == 0 && max % b == 0){
                  return max;
          }
          max++;
        }
        return 0;
    }
}
