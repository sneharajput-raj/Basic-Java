public class BreakFunction {
    public static void main(String[] args) {
        int n = 10;
        for(int i=1; i<=n; i++){
            if(i==5){
                break;
            }
            System.out.println("Hello");
        }
        System.out.println();
        System.out.println();
           
        for(int i=1; i<=n; i++){
            System.out.println("hyy");
            if(i == 5){
                break;
            }
        }
    }
}
