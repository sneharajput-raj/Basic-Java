public class CheckPrime {
    public static void main(String[] args) {
        int n = 33;
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Number is Prime");
        }
        else{
             System.out.println("Number is Not Prime");
        }
    }
}
