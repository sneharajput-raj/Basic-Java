public class PowerUsingLoop {
    public static void main(String[] args) {
        int a = 15;
        int b = 3;
        int power = 1;
        for(int i=1; i<=b; i++){    //power
            power = power * a;      //base
        }
        System.out.println(power);
    }
}
