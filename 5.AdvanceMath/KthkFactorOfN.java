public class KthkFactorOfN {
    public static void main(String[] args) {
        int n = 24;
        int k = 9;
        int count = 0;
        int ans = -1;
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                count++;
            }
            if(count == k){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
